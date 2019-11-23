import org.tools.*

def stages(Closure body) {
    body()
}

def steps(Closure body) {
    body()
}

def call(Closure body) {
    podTemplate(containers: Tools.get()) {
        node(POD_LABEL) {
            body()
        }
    }
}