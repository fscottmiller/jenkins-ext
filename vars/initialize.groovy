def call(parent) {
    def commands = ['ruby', 'python', 'nodejs']
    commands.each {
        tool -> parent."${tool}" = { String in -> println tool; println "$in" }
    }
}