@Library('jenkins-ext') _
import org.tools.*

// require 'python'
require name: 'ruby', version: 'latest'
require 'nodejs'
// require name: 'ruby', version: '2.5'

kubepipe {
    // stage('test') {
    //     def tmp = Tools.getToolSet()
    //     echo tmp
    // }
    // stage('hello python') {
    //     def version = python "python --version"
    //     echo version
    // }
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