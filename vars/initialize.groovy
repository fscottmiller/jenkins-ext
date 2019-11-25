def call(parent) {
    def tools = readYaml(text: libraryResource('org/tools/toolSet.yaml'))
    tools.each {
        tool -> tool.value['commands'].each {
            command -> parent."${command.key}" = { String input -> 
                container(tool) {
                    sh script: "${command} ${input}", returnStdout: true
                }
            }
        }
    }   
}