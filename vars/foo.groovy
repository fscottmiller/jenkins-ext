def containers = [
    kubectl: containerTemplate(name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'),
    helm: containerTemplate(name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat')
]

def call(Closure body) {
    body()
}

def require(String requirement) {
    if (containers.keys().contains(requirement)) {
        echo requirement
    } else {
        echo "Sorry, ${requirement} is not a supported dependency."
    }
}