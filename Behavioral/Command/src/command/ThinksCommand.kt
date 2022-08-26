package command

import Programmer

class ThinksCommand(private val programmer: Programmer) : Command {
    override fun execute() {
        programmer.thinks()
    }
}