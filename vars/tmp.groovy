import org.tools.*

def call() {
    echo Tools.getYaml().getClass()
    return Tools.getYaml()
}