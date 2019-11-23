import org.tools.*

def call(Closure body) {
    Tools.getRequired().each {
        echo "Using ${it['name']} from ${it['image']}"
    }
    podTemplate(containers: Tools.getRequired()) {
        node(POD_LABEL) {
            body()
        }
    }
}