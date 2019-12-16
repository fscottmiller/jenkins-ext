import org.tools.*
import org.yaml.snakeyaml.Yaml

def call(Map options=[:]) {
    options['spec'] = [:]
    options['spec']['containers'] = Tools.getRequired()
    options['apiVersion'] = 'v1'
    options['kind'] = 'Pod'
    // echo "${options.getClass()}"
    // echo "${options}"
    def yaml = new Yaml().dump(options)

    return yaml
}
