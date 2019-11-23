import org.tools.*

def call(Map options=[:], Closure body) {
    Tools.getRequired().each {
        echo "Using ${it['name']} from ${it['image']}"
    }
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}