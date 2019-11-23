package org.tools

class Tools implements Serializable {
    private static toolSet = [
        kubectl: [name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'],
        helm: [name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat'],
        python: [name: 'python', image: 'python', ttyEnabled: true, command: 'cat'],
        ruby: [name: 'ruby', image: 'ruby', ttyEnabled: true, command: 'cat'],
        nodejs: [name: 'nodejs', image: 'node', ttyEnabled: true, command: 'cat']
    ]
    
    private static required = []

    public static toolSet() {
        return toolSet
    }

    public static getToolSet() {
        String fileContents = new File('../resources/toolSet.yaml').text
        return fileContents
    }

    public static getRequired() {
        return required
    }

    public static require(String tool) {
        required.add toolSet[tool]
    }
} 