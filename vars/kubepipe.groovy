import org.tools.*

def call(Map options=[:], Closure body) {
    println this.delegate
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}