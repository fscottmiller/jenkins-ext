import org.tools.*

def call(String tool) {
    Tools.require tool
}

def call(Map info) {
    echo info
}