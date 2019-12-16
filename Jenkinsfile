library "jenkins-ext@${BRANCH_NAME}" 

// require 'ruby'
// require name: 'ubuntu', image: 'ubuntu'
// require name: 'python', version: '3.6.0'
// require 'kubectl', 'latest'

initialize this

// env.foo = "hello world"

kubepipe {
    environment {
        foo = "hello world"
    }
    stage('a') {
        echo "${sh "env"}"
    }
}