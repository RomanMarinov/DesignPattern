import mircoUsb.MicroUsb
import nanoUsb.NanoUsbConnector

class NanoUsbAdapter(private val microUsb: MicroUsb) : NanoUsbConnector {

    override fun nanoUsbConnect() {
        microUsb.microUsbConnect()
    }
}