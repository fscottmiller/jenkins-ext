@Library('jenkins-ext@dynamicFunctions') _

require 'python'
initialize this

kubepipe(serviceAccount: 'jenkins-admin') {
    def version = python "--version"
    echo version
}
