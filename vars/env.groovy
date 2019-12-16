def call(Map vars) {
    vars.each {
        key, value -> 
            echo "${key}"
            echo "${value}"
            env."${key}" = value
    }
}