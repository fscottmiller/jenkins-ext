@Library('jenkins-ext@dynamicFunctions') _

require 'python'
require 'nodejs'
require 'ruby'
initialize this

kubepipe(serviceAccount: 'jenkins-admin') {
    def version = python "--version"
    echo version

    echo "${npm '--version'}"
    echo "${nodejs '--version'}"
    echo "${ruby '--version'}"
}
