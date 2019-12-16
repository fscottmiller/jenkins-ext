def call(Map vars) {
    vars.each {
        key, value -> 
            env."${key}" = value
    }
}