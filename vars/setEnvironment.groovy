def call(Map creds) {
    creds.each { key, value ->
        env."$key" = value
    }
}