import org.tools.*

def call(Map options=[:], Closure body) {
    Tools.getRequired().each {
        echo "Using ${it['name']} from ${it['image']}"
    }
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            Tools.getToolSet().keySet().each {
                container -> toolSet[container]['commands'].keySet().each {
                    el -> this.metaClass."${el}" {
                        String cmd -> 
                            // insert function code here
                            println "${toolSet[container]['commands'][el]} ${cmd}"
                    }
                }
            }
            body()
        }
    }
}