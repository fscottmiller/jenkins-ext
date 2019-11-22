@Library('jenkins-ext') _

pipeline {
    agent any

    stages {
        stage('test') {
            steps {
                sh script: "ls -la"
                require 'kubectl'
                // tool('kubectl') {
                //     sh script: "kubectl version"
                //     sh script: "ls -la"
                // }
            }
        }
    }
}