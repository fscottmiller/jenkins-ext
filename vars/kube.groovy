import org.tools.*
import org.yaml.snakeyaml.Yaml

def call(Map options=[:]) {
    options['containers'] = Tools.getRequired()
    // echo "${options.getClass()}"
    // echo "${options}"
    def yaml = new Yaml().dump(options)

    return yaml
}