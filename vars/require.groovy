import org.tools.*

def call(String tool) {
    Tools.require tool
}



def call(Map tool) {
    tool.keySet.each {
        it = it.toLowerCase()
        if (!['name', 'version'].contains(it)) {
            throw new Exception("Please only specify name and version")
        }
    }
    Tools.require tool['name']
}

