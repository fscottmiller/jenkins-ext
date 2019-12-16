library "jenkins-ext@${BRANCH_NAME}" 

require 'ruby'

pipeline {
    agent {
        kubernetes {
      yaml """
spec:
  containers:
  - name: golang
    image: golang:1.6.3-alpine
    command:
    - cat
    tty: true
"""
        }
    }
    stages {
        stage('a') {
            steps {
                sh "ruby --version"
            }
        }
    }
}