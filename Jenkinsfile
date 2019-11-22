@Library('jenkins-ext') _

pipeline {
    agent any

    stages {
        stage('test') {
            steps {
                foo('kubectl') {
                    sh script: "kubectl version"
                }
            }
        }
    }
}