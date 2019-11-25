def call(parent) {
    def commands = [
        ruby: ['ruby'], 
        python: ['python'],
        nodejs: ['node', 'npm']
    ]
    commands.each {
        tool -> commands[tool].each {
            command -> parent."${command}" = {
                println command
            }
        }
    }
}