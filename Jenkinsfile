@Library('jenkins-ext') _

require 'python'

kubepipe(serviceAccount: 'jenkins-admin') {
    stage('test') {
        using('python') {
            sh script: "python --version"
        }
    }
}


