import command.Command

class ProgrammerInvoker(
    private val startThinkCommand: Command,
    private val startWriteCodeCommand: Command
) {
    fun startThink(){ startThinkCommand.execute() }
    fun startWriteCode(){ startWriteCodeCommand.execute() }
}