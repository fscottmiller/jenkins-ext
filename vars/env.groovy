def call(Map envVars) {
    envVars.each {
        key, value -> 
            echo "${key}"
            echo "${value}"
            env."${key}" = value
    }
}