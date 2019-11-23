def call(String script, boolean returnStdout = true) {
    container('node') {
        sh script: script, returnStdout: returnStdout
    }
}