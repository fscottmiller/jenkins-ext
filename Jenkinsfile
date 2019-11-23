@Library('jenkins-ext') _

require 'helm'
require 'kubectl'

echo "${pipeline {}.getClass()}"

kubepipe {
    stages {
        stage('hello kubectl') {
            container('kubectl') {
                sh script: "kubectl version"
            }
        }
    }
}