@Library('jenkins-ext') _

require 'python'
require name: 'ruby', version: '2.4'

kubepipe(serviceAccount: 'jenkins-admin') {
    stage('python test') {
        using('python') {
            sh script: 'python --version'
        }
    }
    stage('ruby test') {
        using('ruby') {
            sh script: 'ruby --version'
        }
    }
}


