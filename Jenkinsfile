@Library('jenkins-ext') _
import org.tools.*

require 'helm'
require 'kubectl'

kubepipe {
    stage('hello kubectl') {
       kubectl "kubectl version"
    }
    stage('hello helm') {
        helm "helm version"
    }
}