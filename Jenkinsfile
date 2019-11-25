@Library('jenkins-ext@dynamicFunctions') _

// require 'helm'
// require 'kubectl'
require 'python'
initialize this

kubepipe(serviceAccount: 'jenkins-admin') {
    def version = python "--version"
    echo version
}
