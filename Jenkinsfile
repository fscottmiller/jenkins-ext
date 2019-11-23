@Library('jenkins-ext') _

// require 'python'
require name: 'ruby', version: 'latest'
require 'nodejs'
require 'python'
// require name: 'ruby', version: '2.5'

kubepipe(serviceAccount: 'jenkins-admin') {
    stage('test') {
        echo tmp
    }
    stage('hello python') {
        def version = python "python --version"
        echo version
    }
    stage('hello ruby') {
        def version = ruby "ruby --version"
        echo version
    }
    stage('hello node') {
        def version = nodejs "node --version"
        echo version
    }
}

/*
require 'kubectl'
require 'helm'
kubepipe(serviceAccount: 'jenkins-admin') {

}

*/