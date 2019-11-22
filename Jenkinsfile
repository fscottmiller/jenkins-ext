@Library('jenkins-ext') _

pipeline {
    agent any

    stages {
        stage('test') {
            steps {
                foo {
                    require 'kubectl'
                }
            }
        }
    }
}