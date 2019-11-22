package org.tools

import org.csanchez.jenkins.plugins.kubernetes

class Tools implements Serializable {
    private static toolset = [
        kubectl: containerTemplate(name: 'kubectl', image: 'fscottmiller/kubectl', ttyEnabled: true, command: 'cat'),
        helm: containerTemplate(name: 'helm', image: 'fscottmiller/helm', ttyEnabled: true, command: 'cat')
    ]

    public static getTool(String tool) {
        return this.toolset[tool]
    }
} 