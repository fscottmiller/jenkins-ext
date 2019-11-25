def call(parent) {
    def commands = ['ruby', 'python', 'nodejs']
    commands.each {
        tool -> parent."${tool}" = { println tool }
    }
}