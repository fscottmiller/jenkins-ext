@Library('jenkins-ext') _
import org.tools.*

require 'helm'
require 'kubectl'

kubepipe {
    stage('hello kubectl') {
       def version = kubectl "kubectl version"
       echo version
    }
    stage('hello helm') {
        def version = helm "helm version"
        echo version
    }
}