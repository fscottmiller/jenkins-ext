import org.tools.Tools

def call(parent) {
    def tools = readYaml(text: libraryResource('org/tools/toolSet.yaml'))
    tools.each {
        tool -> tool.value['commands'].each {
            command -> parent."${command.key}" = { String input -> 
                container(tool.key) {
                    sh script: "${command.value} ${input}", 
                        label: "${command.value} ${input}",
                        returnStdout: true
                }
            }
        }
    }
    def toolSet = Tools.getRequired()
    toolSet.each {
        tool -> if ( !tools.keySet().contains(tool['name']) ) {
            parent."${tool['name']}" = { String input -> 
                container(tool['name']) {
                    sh script: "${tool['name']} ${input}",
                        label: "${tool['name']} ${input}",
                        returnStdout: true
                }
            }
        }
    }
}
