package org.tools

import org.yaml.snakeyaml.Yaml

class Tools implements Serializable {
    private static toolSet = [:]

    private static required = []

    public static setToolSet(Map toolSet) {
        this.toolSet = toolSet
    }

    public static getToolSet() {
        return toolSet
    }

    public static getRequired() {
        return required
    }

    public static getYaml() {
        def ret = [:]
        ret['apiVersion'] = 'v1'
        ret['kind'] = 'Pod'
        ret['spec'] = [:]
        ret['spec']['containers'] = required
        ret['spec']['containers'].each {
            container -> container['command'] = ['foo']
        }
        return new Yaml().dump(ret)
    }

    public static require(tool, version) {
        def req = toolSet[tool]['spec']
        req['image'] += ":${version}"
        required.add req
    }

    public static require(tool, version, image) {
        def req = [ 'name' : "${tool}", "image" : "${image}:${version}", 'ttyEnabled' : true, 'command' : 'cat' ]
        // req['spec']['name'] = tool
        // req['spec']['image'] = "${image}:${version}"
        // req['spec']['ttyEnabled'] = true
        // req['spec']['command'] = 'cat'
        required.add req
    }
} 