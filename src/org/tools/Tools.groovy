package org.tools

class Tools implements Serializable {
    private static toolset = [
        kubectl: [name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'],
        helm: [name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat']
    ]
    private static required = []

    public static get() {
        return required
    }

    public static set(String tool) {
        required.add(tools[tool])
    }
} 