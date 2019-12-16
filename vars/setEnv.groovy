def call(Map vars) {
    // echo "${vars}"
    vars.each {
        key, value -> 
            echo "${key}"
            echo "${value}"
            env."${key}" = value
    }
}