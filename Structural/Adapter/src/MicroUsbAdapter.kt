import mircoUsb.MicroUsbConnector
import nanoUsb.NanoUsb

class MicroUsbAdapter(private val nanoUsb: NanoUsb) : MicroUsbConnector {

    override fun microUsbConnect() {
        nanoUsb.nanoUsbConnect()
    }
}