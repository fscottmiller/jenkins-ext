import org.tools.*

def call(Map options=[:], Closure body) {
    println this.getBinding()
    this.getBinding().variables.each {
        println "${it}"
    }
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}