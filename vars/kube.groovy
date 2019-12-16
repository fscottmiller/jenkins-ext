import org.tools.*
import org.yaml.snakeyaml.Yaml

def call(Map options=[:]) {
    options['apiVersion'] = 'v1'
    options['kind'] = 'Pod'
    def tmp = [:]
    tmp['containers'] = Tools.getRequired()
    options['spec'] = tmp
    // options['spec']['containers'] = Tools.getRequired()
    // echo "${options.getClass()}"
    // echo "${options}"
    def yaml = new Yaml().dump(options)
    echo "${yaml.getClass()}"
    return yaml
}
