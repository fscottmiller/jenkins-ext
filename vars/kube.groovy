import org.tools.*

def call(Map options=[:]) {
    options['containers'] = Tools.getRequired()
    echo "${options.getClass()}"
    echo "${options}"
}