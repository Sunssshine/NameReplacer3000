import java.io.File

fun main() {
    println("Введите путь")
    val path = readLine()
    File(path).walk().forEach {
        if(it.extension in arrayOf("java", "kt")) {
            val new = File("${it.absolutePath}.2019")
            it.renameTo(new)
            println(new)
        }
    }
}
