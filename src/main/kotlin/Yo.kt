class Yo(var str: String) {

    companion object {
        @JvmStatic var log = MyLogger()
    }
    fun doStuff() {
        log.warn("stuff: $str")
    }
}
