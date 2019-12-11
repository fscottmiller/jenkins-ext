library "jenkins-ext@${BRANCH_NAME}" 

require 'ruby'
require name: 'ubuntu', image: 'ubuntu'
require name: 'python', version: '3.6.0'
require 'kubectl', 'latest'

initialize this

kubepipe {
    stage('a') {
        echo "${ruby '--version'}"
    }
    stage('b') {
        echo "${ubuntu 'cat /etc/os-release'}"
    }
    stage('c') { 
        echo "${python '--version'}"
    }
    stage('d') {
        echo "${kubectl 'version'}"
    }
}