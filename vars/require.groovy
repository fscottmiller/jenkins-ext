import org.tools.*

def call(String tool) {
    Tools.require tool
}

def call(Map tool) {
    echo "${tool}"
}

// if (tool.getClass() == String) {
//         Tools.require tool
//     } else {
//         echo "${tool}"
//     }