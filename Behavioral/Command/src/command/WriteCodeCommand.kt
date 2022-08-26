package command

import Programmer

class WriteCodeCommand (private val programmer: Programmer) : Command {
    override fun execute() {
        programmer.writesCode()
    }
}