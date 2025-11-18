package org.example

class Utils implements Serializable {
    static String getFormattedDate() {
        return new Date().format("yyyy-MM-dd HH:mm:ss")
    }

    static void runCommand(String cmd) {
        println "Running command: ${cmd}"
        def proc = cmd.execute()
        proc.waitFor()
        println proc.text
    }
}
