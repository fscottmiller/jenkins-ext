library "jenkins-ext@${BRANCH_NAME}" 

require name: 'ubuntu', image: 'ubuntu'
initialize this

setEnvironment foo: 'bar', creds: credentials('gcp')

kubepipe {
    ubuntu "echo ${foo}"
}