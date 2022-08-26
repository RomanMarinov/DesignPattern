import command.Command
import command.ThinksCommand
import command.WriteCodeCommand

fun main(){

    val thinks: Command = ThinksCommand(programmer = Programmer())
    val writeCode: Command = WriteCodeCommand(programmer = Programmer())

    val invoker = Invoker(thinkLongCommand = thinks, writeCodeFastCommand = writeCode)

    invoker.thinkLong()
    invoker.writeCodeFast()
}