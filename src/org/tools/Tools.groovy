package org.tools

class Tools implements Serializable {
    private static toolset = [
        kubectl: [name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'],
        helm: [name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat']
    ]
    private static required = []

    public static getRequired() {
        return required
    }

    public static require(String tool) {
        required.add toolset[tool]
    }
} 