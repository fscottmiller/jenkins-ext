import org.tools.*

def call(String tool) {
    if (Tools.toolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    Tools.require tool
}

def call(Map tool) {
    if (Tools.toolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    tool.keySet.each {
        it = it.toLowerCase()
        if (!['name', 'version'].contains(it)) {
            throw new Exception("Please only specify name and version")
        }
    }
    Tools.require tool['name']
}

