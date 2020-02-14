def call(params) {
    node {
        properties([
            parameters(
                params
            )
        ])
    }
}
/*
def call(param) {
    node {
        properties([
            parameters([
                param
            ])
        ])
    }
}*/


