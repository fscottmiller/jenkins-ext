def call(String script, boolean returnStdout = true) {
    container('ruby') {
        sh script: script, returnStdout: returnStdout
    }
}