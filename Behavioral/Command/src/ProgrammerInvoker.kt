import command.Command

class ProgrammerInvoker(
    val startThinkCommand: Command,
    val startWriteCodeCommand: Command
) {
    fun startThink(){ startThinkCommand.execute() }
    fun startWriteCode(){ startWriteCodeCommand.execute() }
}