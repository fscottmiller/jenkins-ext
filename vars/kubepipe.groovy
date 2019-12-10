import org.tools.*

def call(Map options=[:], Closure body) {
    options['containers'] = Tools.getRequired()
    echo "${options}"
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}