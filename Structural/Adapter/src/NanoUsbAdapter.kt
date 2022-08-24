import mircoUsb.MicroUsb
import nanoUsb.NanoUsbConnector

class NanoUsbAdapter(_microUsb: MicroUsb) : NanoUsbConnector {

    private val microUsb: MicroUsb
    init {
        microUsb = _microUsb
    }

    override fun nanoUsbConnect() {
        microUsb.microUsbConnect()
    }
}