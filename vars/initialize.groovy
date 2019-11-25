def call(parent) {
    def tools = readYaml(text: libraryResource('org/tools/toolSet.yaml'))
    tools.each {
        tool -> tool['commands'].each {
            command -> parent."${command}" = { String input -> 
                container(tool) {
                    sh script: "${command} ${input}", returnStdout: true
                }
            }
        }
    }   
}