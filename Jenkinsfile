library "jenkins-ext@${BRANCH_NAME}" 

pipeline {
    agent {
        kubernetes {
            yaml tmp()
        }
    }
}