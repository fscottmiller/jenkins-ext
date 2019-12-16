import org.tools.*
import org.yaml.snakeyaml.Yaml

def call(Map options=[:]) {
    options['apiVersion'] = 'v1'
    options['kind'] = 'Pod'
    def tmp = [:]
    tmp['containers'] = Tools.getRequired()
    options['spec'] = tmp
    options['containers'].each { 
        con -> con['spec']['command'] = ['cat']
    }
    // options['spec']['containers'] = Tools.getRequired()
    // echo "${options.getClass()}"
    // echo "${options}"
    String yaml = new Yaml().dump(options)
    echo "${yaml.getClass()}"
    return yaml
}
