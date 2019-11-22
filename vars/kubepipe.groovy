import org.tools.*

def call(Closure body) {
    pipeline {
        agent {
            kubernetes {
                podTemplate(containers: Tools.get())
            }
        }
        body()
    }
}