def call(String tool, Closure body) {
    container(tool) {
        body()
    }
}