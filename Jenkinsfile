library "jenkins-ext@${BRANCH_NAME}" 

require 'ruby'

pipeline {
    agent any
//         kubernetes {
//       yaml """
// spec:
//   containers:
//   - name: golang
//     image: golang:1.6.3-alpine
//     command:
//     - cat
//     tty: true
// """
//         }
//     }
    stages {
        stage('a') {
            steps {
                echo """
spec:
  containers:
  - name: golang
    image: golang:1.6.3-alpine
    command:
    - cat
    tty: true
""".getClass().toString()
            }
        }
    }
}