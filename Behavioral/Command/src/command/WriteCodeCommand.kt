package command

import ProgrammerReceiver


class WriteCodeCommand (private val programmerReceiver: ProgrammerReceiver) : Command {
    override fun execute() {
        programmerReceiver.writesCode()
    }
}