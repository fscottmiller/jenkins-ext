import org.tools.*

def call(tool) {
    if (tool.getClass() == String) {
        Tools.require tool
    } else {
        echo tool
    }
}