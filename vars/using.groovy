/*
allow non-default container commands
example:

using('python') {
  sh script: 'pip install tensorflow'  
}
*/
def call(String tool, Closure body) {
    container(tool) {
        body()
    }
}

