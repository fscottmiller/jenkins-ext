def call(files) {
    echo "Merging configuration"
    def config = [:]
    files.each {
        def content = readYaml(file: it)
        if (!content.isEmpty()) {
            config << content
        }
    }
    return config
}