import mircoUsb.MicroUsbConnector
import nanoUsb.NanoUsb

class MicroUsbAdapter(_nanoUsb: NanoUsb) : MicroUsbConnector {

    private val nanoUsb: NanoUsb
    init {
        nanoUsb = _nanoUsb
    }

    override fun microUsbConnect() {
        nanoUsb.nanoUsbConnect()
    }
}