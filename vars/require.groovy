import org.tools.*

def call(String tool) {
    echo "${Tools.getTool(tool)}"
}