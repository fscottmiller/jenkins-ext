package org.tools

class Tools implements Serializable {
    private static toolSet = [:]
    //     kubectl: [name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'],
    //     helm: [name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat'],
    //     python: [name: 'python', image: 'python', ttyEnabled: true, command: 'cat'],
    //     ruby: [name: 'ruby', image: 'ruby', ttyEnabled: true, command: 'cat'],
    //     nodejs: [name: 'nodejs', image: 'node', ttyEnabled: true, command: 'cat']
    // ]
    
    private static required = []

    public static setToolSet(Map toolSet) {
        this.toolSet = toolSet
    }

    public static toolSet() {
        return toolSet
    }

    public static getRequired() {
        return required
    }

    public static require(tool, version) {
        def req = toolSet[tool]
        req['image'] += version
        required.add req
    }
} 