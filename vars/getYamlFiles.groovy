def call(directory) {
    def files = sh(script: "ls ${directory}",
        label: "Get Files",
        returnStdout: true).split()
    yamlFiles = []
    files.each {
        if (it.toLowerCase().contains(".yml") || it.toLowerCase().contains(".yaml")) {
            yamlFiles.add "${directory}/${it}"
        } 
    }
    return yamlFiles
}