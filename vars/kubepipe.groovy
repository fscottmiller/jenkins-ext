import org.tools.*

def call(Closure body) {
    echo "${readYaml text: (libraryResource 'org/tools/toolSet.yaml')}"
    podTemplate(containers: Tools.getRequired()) {
        node(POD_LABEL) {
            body()
        }
    }
}