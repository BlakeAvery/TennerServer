package ufoproducts.util

class SystemConstants {
    val OS: String
    val ARCH: String
    val VER: String
    val SLASH: String
    init {
        OS = System.getProperty("os.name")
        ARCH = System.getProperty("os.arch")
        VER = System.getProperty("os.version")
        SLASH = System.getProperty("file.separator")
    }
}