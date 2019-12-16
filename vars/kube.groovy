import org.tools.*
import org.yaml.snakeyaml.Yaml

def call(Map options=[:]) {
    options['apiVersion'] = 'v1'
    options['kind'] = 'Pod'
    options['spec'] = [:]
    options['spec']['containers'] = Tools.getRequired()
    // echo "${options.getClass()}"
    // echo "${options}"
    def yaml = new Yaml().dump(options)

    return yaml
}
