def call(Map vars) {
    // echo "${vars}"
    vars.each {
        key, value -> 
            env."${key}" = value
    }
}