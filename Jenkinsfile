@Library('jenkins-ext') _

require 'helm'
require 'kubectl'
intitialize this 
 def namespace = BRANCH_NAME

kubepipe(serviceAccount: 'jenkins-admin') {
    stage('Create Namespace') {
            def namespaces = kubectl "get ns --no-headers -o custom-columns=':metadata.name'" 
            if (namespaces.contains(namespace)) {
                echo "Namespace ${namespace} already exists"
            } 
        
            else {
                sh script: "kubectl create ns ${namespace}",
                label: "Creating namespace ${namespace}"
            }
    }

    stage('Create Service Account') {
            def serviceAccounts = kubectl "get sa -n ${namespace} --no-headers -o custom-columns=':metadata.name'"
            if (serviceAccounts.contains(name)) {
                echo "Service Account ${name} already exists"
            }   
        
            else {
                sh script: "kubectl create sa ${name} -n ${namespace}",
                label: "Creating service account ${name}"
                sh script: "kubectl create clusterrolebinding ${namespace}-${name} --clusterrole=cluster-admin --serviceaccount=${namespace}:${name}",
                label: "Creating cluster role binding ${namespace}-${name}"
            }
    }

    stage('Create ConfigMap') {
            def configMaps = kubectl "get configmaps -n ${namespace} --no-headers -o custom-columns=':metadata.name'"
            def config = mergeYaml(files) 
            def fileName = "${name}-tmp-file"
                writeYaml file: fileName, data: config
                sh script: "cat ${fileName}", label: "debug"
            
            if (configMaps.contains(name)) {
                sh script: "kubectl create configmap ${name} -n ${namespace} --from-file ${fileName} -o yaml --dry-run | kubectl replace -f -",
                label: "Updating ConfigMap ${name}"
            } 
    
            else {
                sh script: "kubectl create configmap ${name} -n ${namespace} --from-file ${fileName}",
                label: "Creating ConfigMap ${name}"
            }
    } 

    stage('Deploy Application') {
                if (fileExists(dir)) {
                    def instances = sh script: "ls ${dir}", 
                    label: "Get Instances", 
                    returnStdout: true
                    instances.each {
                        deploy(it)
                    }
                } 
                else {
                    deploy()
                }

           
                def appName = "jenkins" 
                if (instance != "") {
                namespace += instance
                }
        
                createNamespace(namespace)
                createServiceAccount(appName, namespace)
                createSecret(secretName, secretFile, namespace)
                createConfigMap(configMapName, instance, namespace)
                install(appName, instance, namespace)
            }
    
}

