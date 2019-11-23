@Library('jenkins-ext') _

require 'python'
require 'ruby'
// require 'nodejs'

kubepipe {
    stage('hello python') {
        def version = python "python --version"
        echo version
    }
    stage('hello ruby') {
        def version = python "ruby --version"
        echo version
    }
    // stage('hello node') {
    //     def version = nodejs "node --version"
    //     echo version
    // }
}