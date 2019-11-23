import org.tools.*

def call(String tool) {
    if (Tools.toolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    Tools.require tool, 'latest'
}

def call(Map tool) {
    if (Tools.toolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    Tools.require tool['name'], tool['version']
}

