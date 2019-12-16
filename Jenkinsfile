library "jenkins-ext@${BRANCH_NAME}" 

require 'ruby'
// require name: 'ubuntu', image: 'ubuntu'
require name: 'python', version: '3.6.0'
require 'kubectl', 'latest'

initialize this

pipeline {
    agent {
        kubernetes {
            yaml kube()
        }
    }
    stages {
        stage('test') {
            steps {
                echo "${kube()}"
                python "--version"
            }
        }
    }
}