def call(Map vars) {
    echo "${vars}"
    // envVars.each {
    //     key, value -> 
    //         echo "${key}"
    //         echo "${value}"
    //         env."${key}" = value
    // }
}