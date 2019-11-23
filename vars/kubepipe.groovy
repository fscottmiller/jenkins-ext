import org.tools.*

def call(Closure body) {
    podTemplate(containers: Tools.getRequired()) {
        node(POD_LABEL) {
            body()
        }
    }
}