import org.tools.*

def call(Closure body) {
    echo "Using toolset ${Tools.getRequired()}"
    podTemplate(containers: Tools.getRequired()) {
        node(POD_LABEL) {
            body()
        }
    }
}