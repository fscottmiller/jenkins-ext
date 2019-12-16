library "jenkins-ext@${BRANCH_NAME}" 

import org.tools.Tools;

def out = Tools.getYaml().toString()

kubepipe {
    stage('a') {
        echo "${out}"
    }
}