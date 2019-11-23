@Library('jenkins-ext') _
import org.tools.*

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

// require 'python'

kubepipe {
    stage('test') {
        python '--version'
    }
}


