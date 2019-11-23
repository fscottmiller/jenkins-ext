@Library('jenkins-ext') _
import org.tools.*

require 'python'

println this.getClass()

kubepipe(idleMinutes: 5, podRetention: always()) {
    stage('test') {
        println this.getClass()
        python '--version'
    }
}


