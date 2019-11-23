import org.tools.*
import org.jenkinsci.plugins.pipeline.modeldefinition.model.Stages

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