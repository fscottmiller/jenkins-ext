library "jenkins-ext@${BRANCH_NAME}" 
import org.tools.*

// require 'ruby'
// require name: 'ubuntu', image: 'ubuntu'
// require name: 'python', version: '3.6.0'
// require 'kubectl', 'latest'

// initialize this

def out = Tools.getYaml().toString()

kubepipe {
    stage('a') {
        echo "${out}"
    }
}