@Library('jenkins-ext') _

require 'helm'
require 'kubectl'

kubepipe {
    stage('hello kubectl') {
        container('kubectl') {
            sh script: "kubectl version"
        }
    }
}