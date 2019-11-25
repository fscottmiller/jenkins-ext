import org.tools.*

def call(Map options=[:], Closure body) {
    new Throwable().stackTrace.each {
        println it
    }
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}