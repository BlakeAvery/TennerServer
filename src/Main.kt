import java.io.*; import java.net.*; import java.util.*
import ufoproducts.config.*; import ufoproducts.util.*
fun main(args: Array<String>) {
    val ver = "0.9s"
    val prop = SystemConstants()
    val pos = POS()
    val log = File("logs${prop.SLASH}log.txt")
    if(!log.exists()) { //fun fact, on linux it just makes the file. Odd innit?
        log.createNewFile()
    }
    log.appendText("Started Tenner v$ver at ${Date()}.")
    println("Tenner v$ver started.")
    val serverSocket = ServerSocket(2222)
    while(true) {
        val comms = serverSocket.accept()
        println("Client at ${comms.inetAddress}")
        val hi = DataOutputStream(comms.getOutputStream())
        val bye = DataInputStream(comms.getInputStream())
        val command = bye.readUTF()
        println(command)
        val stringsplit = command.split(" ")
        val ret = pos.commandParse(stringsplit)
        println(ret)
        hi.writeUTF(ret)
    }
}