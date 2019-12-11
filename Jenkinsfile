@Library('jenkins-ext@allowCustomTools') _

require 'ruby'
require name: 'ubuntu', image: 'ubuntu', version: 'latest'

initialize this

kubepipe {
    stage('a') {
        ruby '--version'
    }
    stage('b') {
        ubuntu 'cat /etc/os-release'
    }
}