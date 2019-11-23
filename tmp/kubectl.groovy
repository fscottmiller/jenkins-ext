def call(String script, boolean returnStdout = true) {
    container('kubectl') {
        sh script: script, returnStdout: returnStdout
    }
}