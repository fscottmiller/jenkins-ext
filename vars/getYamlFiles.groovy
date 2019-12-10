// returns a list of yaml files present in a directory 
def call(directory="${pwd}") {
    def files = sh(script: "ls ${directory}",
        label: "Get Files",
        returnStdout: true).split()
    yamlFiles = []
    files.each {
        if (it.toLowerCase().endsWith(".yml") || it.toLowerCase().endsWith(".yaml")) {
            yamlFiles.add "${directory}/${it}"
        } 
    }
    return yamlFiles
}