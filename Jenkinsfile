@Library('jenkins-ext') _
import org.tools.*

// require 'python'

println this.getClass()

kubepipe(idleMinutes: 5) {
    def toolSet = Tools.getToolSet()
    toolSet.keySet().each {
        container -> toolSet[container]['commands'].keySet().each {
            el -> this.metaClass."${el}" {
                String cmd -> 
                    // insert function code here
                    println "${toolSet[container]['commands'][el]} ${cmd}"
            }
        }
    }

    stage('test') {
        println this.getClass()
        python '--version'
    }
}


