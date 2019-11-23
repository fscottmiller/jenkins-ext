import org.tools.*
import org.jenkinsci.plugins.pipeline.modeldefinition.model.Stages

def call(Closure body) {
    pipeline { 
        agent {
            kubernetes {
                podTemplate(containers: Tools.get()) {
                }
            }
        }
        body()
    }
}