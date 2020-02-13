def call(List params) {
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


