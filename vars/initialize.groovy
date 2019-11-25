def call(parent) {
    def commands = ['ruby', 'python', 'nodejs']
    commands.each {
        tool -> this."${tool}" = { println tool }
    }
}