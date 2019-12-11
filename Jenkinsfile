@Library('jenkins-ext@allowCustomTools') _

require 'ruby'
require name: 'ubuntu', image: 'ubuntu', version: 'latest'

initialize this

kubepipe {
    stage('a') {
        echo "${ruby '--version'}"
    }
    stage('b') {
        echo "${ubuntu 'cat /etc/os-release'}"
    }
}