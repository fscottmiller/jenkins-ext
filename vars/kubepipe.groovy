import org.tools.*

def call(Map options=[:], Closure body) {
    def toolSet = Tools.getToolSet()
    toolSet.keySet().each {
        container -> toolSet[container]['commands'].keySet().each {
            el -> def "${el}" = {
                String cmd -> 
                    // insert function code here
                    println "${toolSet[container]['commands'][el]} ${cmd}"
            }
        }
    }
    
    Tools.getRequired().each {
        echo "Using ${it['name']} from ${it['image']}"
    }
    options['containers'] = Tools.getRequired()
    echo "${options}"
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}