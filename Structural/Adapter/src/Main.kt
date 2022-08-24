import mircoUsb.MicroUsb
import nanoUsb.NanoUsb

fun main(){

    val microUsbConnector = MicroUsbAdapter(NanoUsb())
    val nanoUsbConnector = NanoUsbAdapter(MicroUsb())

    microUsbConnector.microUsbConnect()
    nanoUsbConnector.nanoUsbConnect()

}