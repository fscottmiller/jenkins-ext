@Library('jenkins-ext') _
import org.tools.*

// require 'python'
// require 'ruby'
// require 'nodejs'
// require name: 'ruby', version: '2.5'

kubepipe {
    require 'ruby'
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
    // stage('hello node') {
    //     def version = nodejs "node --version"
    //     echo version
    // }
}