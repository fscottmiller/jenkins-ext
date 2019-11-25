@Library('jenkins-ext') _

require 'python'
require name: 'ruby', version: '2.4'



kubepipe(serviceAccount: 'jenkins-admin', nodeLabel: 'windows') {
    stage('python test') {
        container('python') {
            sh script: 'python --version'
        }
    }
    stage('ruby test') {
        container('ruby') {
            sh script: 'ruby --version'
        }
    }
}


