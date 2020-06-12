fun main() {
    val url = readLine()!!

    val info: Map<String, String> = url.split("html?")[1].
    split('&').
    map { it.split("=") }.
    associateBy({it[0]}, {if(it[1].isEmpty()) "not found" else it[1]})

    info.forEach { (key, value) -> println("$key : $value") }

    if (info.keys.contains("pass")) {
        println("password : ${info["pass"]}")
    }
}