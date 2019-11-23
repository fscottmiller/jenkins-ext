import org.tools.*

def call(Map options=[:], Closure body) {
    Tools.getRequired().each {
        echo "Using ${it['name']} from ${it['image']}"
    }
    podTemplate(options, containers: Tools.getRequired()) {
        node(POD_LABEL) {
            body()
        }
    }
}