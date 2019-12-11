library "jenkins-ext@${BRANCH_NAME}" 

require 'ruby'
require name: 'ubuntu', image: 'ubuntu'

initialize this

kubepipe {
    stage('a') {
        echo "${ruby '--version'}"
    }
    stage('b') {
        echo "${ubuntu 'cat /etc/os-release'}"
    }
}