import org.tools.*

def call(Map options=[:], Closure body) {
    def commands = ['ruby', 'python', 'nodejs']
    commands.each {
        tool -> this."${tool}" = { println tool }
    }
    println this
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            body()
        }
    }
}