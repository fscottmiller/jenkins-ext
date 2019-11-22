@Library('jenkins-ext') _

require 'helm'
require 'kubectl'

kubepipe {
    stages {
        stage('hello kubectl') {
            steps {
                container('kubectl') {
                    sh script: "kubectl version"
                }
            }
        }
    }
}