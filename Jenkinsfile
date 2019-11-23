@Library('jenkins-ext') _
import org.tools.*

require 'helm'
require 'kubectl'

kubepipe {
    stages {
        stage('hello kubectl') {
            steps {
                container('kubectl') {
                    sh script: "kubectl version"
                }
            }
        }
        stage('hello helm') {
            steps {
                container('helm') {
                    sh script: "helm version"
                }
            }
        }
    }
}