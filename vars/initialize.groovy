def call(parent) {
    def commands = ['ruby', 'python', 'nodejs']
    commands.each {
        tool -> parent."${tool}" = { String input -> println tool; println "$input" }
    }
}