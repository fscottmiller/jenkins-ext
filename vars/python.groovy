def call(String script, boolean returnStdout = true) {
    container('python') {
        sh script: script, returnStdout: returnStdout
    }
}