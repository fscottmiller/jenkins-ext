def call(String script, boolean returnStdout = true) {
    container('helm') {
        sh script: script, returnStdout: returnStdout
    }
}