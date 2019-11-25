def call(parent) {
    def tools = readYaml(text: libraryResource('org/tools/toolSet.yaml'))
    tools.each {
        tool -> tool.value['commands'].each {
            command -> parent."${command.key}" = { String input -> 
                container(tool.key) {
                    sh script: "${command.value} ${input}", returnStdout: true
                }
            }
        }
    }   
}
