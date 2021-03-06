import org.tools.*

def call(String tool) {
    if (Tools.getToolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    Tools.require tool, 'latest'
}

def call(String tool, String version) {
    if (Tools.getToolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    Tools.require tool, version
}

def call(Map tool) {
    if (Tools.getToolSet().isEmpty()) {
            Tools.setToolSet(readYaml(text: libraryResource('org/tools/toolSet.yaml')))
    }
    if ( tool.keySet().contains('image') ) {
        if ( !tool.keySet().contains('version') ) {
            tool['version'] = 'latest'
        }
        Tools.require tool['name'], tool['version'], tool['image']
    } else {
        Tools.require tool['name'], tool['version']
    }
}

