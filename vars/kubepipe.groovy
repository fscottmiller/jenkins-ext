import org.tools.*

def call(Map options=[:], Closure body) {
    Tools.getRequired().each {
        echo "Using ${it['name']} from ${it['image']}"
    }
    options['containers'] = Tools.getRequired()
    echo "${options}"
    podTemplate(options) {
        node(POD_LABEL) {
            println "----- ${this.getBinding().getClass()} -----"
            // this.steps.functions.each {
            //     println it.value.getFunctionName()
            // }
            def toolSet = Tools.getToolSet()
            def binding = new Binding()
            this.getBinding().variables.each { k, v ->
                binding.setVariable(k, v)
            }
            toolSet.keySet().each {
                container -> toolSet[container]['commands'].keySet().each {
                    el -> this.getBinding().setVariable("${el}", {
                        String cmd -> 
                            // insert function code here
                            println "${toolSet[container]['commands'][el]} ${cmd}"
                    })
                }
            }
            this.setBinding(binding)
            println "===== Binding Variables ======"
            this.getBinding().variables.each {
                println it
                println it.value
            }
            body()
        }
    }
}