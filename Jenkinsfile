library "jenkins-ext@${BRANCH_NAME}" 

require 'ruby'

pipeline {
    agent {
        kubernetes {
            yaml tmp()
        }
    }
    stages {
        stage('a') {
            steps {
                container('ruby') {
                    sh "ruby --version"
                }
            }
        }
    }
}