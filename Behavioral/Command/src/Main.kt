import command.Command
import command.ThinksCommand
import command.WriteCodeCommand

fun main(){

    val thinks: Command = ThinksCommand(programmerReceiver = ProgrammerReceiver())
    val writeCode: Command = WriteCodeCommand(programmerReceiver = ProgrammerReceiver())

    val programmerInvoker = ProgrammerInvoker(startThinkCommand = thinks, startWriteCodeCommand = writeCode)

    programmerInvoker.startThink()
    programmerInvoker.startWriteCode()
}