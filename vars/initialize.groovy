def call(parent) {
    def commands = ['ruby', 'python', 'nodejs']
    commands.each {
        tool -> parent."${tool}" = { String input -> 
            container(tool) {
                sh string: "${tool} ${input}" 
            }
        }
    }
}