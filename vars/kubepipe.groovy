import org.tools.*

def call(Closure body) {
    podTemplate(containers: Tools.get()) {
        node(POD_LABEL) {
            body()
        }
    }
}