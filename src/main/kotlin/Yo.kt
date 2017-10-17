class Yo(var str: String) {

    companion object {
        @JvmStatic var log = MyLogger()
    }
    fun doStuff() : String {
        return log.warn("stuff: $str")
    }
}
