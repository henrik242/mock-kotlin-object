@Open class MyLogger {
    fun warn(message: String) : String {
        println(message)
        return "logged"
    }
}