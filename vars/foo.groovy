def call(String tool, Closure body) {
    def containers = [
        kubectl: containerTemplate(name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'),
        helm: containerTemplate(name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat')
    ]

    if (!containers.keys().contains(tool)) {
        throw new Exception("${tool} is not a supported tool choice at this time. Please choose from ${containers.keys()}")
    }
    podTemplate(containers: [containers[tool]]) {
        node(POD_LABEL) {
            body()
        }
    }
}

