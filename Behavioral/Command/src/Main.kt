import command.Command
import command.ThinksCommand
import command.WriteCodeCommand

fun main(){

    val thinks: Command = ThinksCommand(programmerReceiver = ProgrammerReceiver())
    val writeCode: Command = WriteCodeCommand(programmerReceiver = ProgrammerReceiver())

    val invoker = ProgrammerInvoker(startThinkCommand = thinks, startWriteCodeCommand = writeCode)

    invoker.startThink()
    invoker.startWriteCode()
}