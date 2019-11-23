@Library('jenkins-ext') _

require 'python'
require 'ruby'
require 'node'

kubepipe {
    stage('hello python') {
        def version = python "python --version"
        echo version
    }
    stage('hello ruby') {
        def version = python "ruby --version"
        echo version
    }
    stage('hello node') {
        def version = node "node --version"
        echo version
    }
}