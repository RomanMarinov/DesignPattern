import command.Command

class Invoker(
    val thinkLongCommand: Command,
    val writeCodeFastCommand: Command) {

    fun thinkLong(){
        thinkLongCommand.execute()
    }
    fun writeCodeFast(){
        writeCodeFastCommand.execute()
    }
}