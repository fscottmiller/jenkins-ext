@Library('jenkins-ext') _
import org.tools.*

require 'helm'
require 'kubectl'

kubepipe {
    stages {
        stage('hello kubectl') {
            container('kubectl') {
                sh script: "kubectl version"
            }
        }
    }
}