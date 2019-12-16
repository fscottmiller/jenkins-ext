def call(Closure body) {
    echo body.metaClass.classNode.getDeclaredMethods("doCall")[0].code.text
}