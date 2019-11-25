@Library('jenkins-ext@dynamicFunctions') _

require 'helm'
require 'kubectl'
initialize this

println "${this} ----- ${this.getClass()}"

kubepipe(serviceAccount: 'jenkins-admin') {
    python "hello world"
}
