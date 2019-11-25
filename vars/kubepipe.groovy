import org.tools.*

def call(Map options=[:], Closure body) {
    // println getDelegate()
    // println getOwner()
    options['containers'] = Tools.getRequired()
    podTemplate(options) {
        node(POD_LABEL) {
            def commands = ['ruby', 'python', 'nodejs']
            commands.each {
                tool -> this."${tool}" = { println tool }
            }
            body()
        }
    }
}