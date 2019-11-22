package org.tools

class Tools implements Serializable {
    private static toolset = [
        kubectl: [name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'],
        helm: [name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat']
    ]

    public static get(String tool) {
        return this.toolset[tool]
    }
} 