package command

import ProgrammerReceiver

class ThinksCommand(private val programmerReceiver: ProgrammerReceiver) : Command {
    override fun execute() {
        programmerReceiver.thinks()
    }
}