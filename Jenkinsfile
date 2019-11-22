@Library('jenkins-ext') _

require 'helm'
require 'kubectl'

kubepipe {
    stage('hello kubectl') {
        steps {
            container('kubectl') {
                sh script: "kubectl version"
            }
        }
    }
}