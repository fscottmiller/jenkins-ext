def call(String script, boolean returnStdout = true) {
    container('nodejs') {
        sh script: script, returnStdout: returnStdout
    }
}