
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_A10 (ID 0x010A)
**/

object EZS_A10 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EZS_A10
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.EZS_A10)

	/** Gets Pulse ring counter, rear left wheel (48 per revolution)  **/
	fun get_riz_hl() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A10, 0, 8)
	
	/** Sets Pulse ring counter, rear left wheel (48 per revolution)  **/
	fun set_riz_hl(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets Pulse ring counter, rear right wheel (48 per revolution)  **/
	fun get_riz_hr() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A10, 8, 8)
	
	/** Sets Pulse ring counter, rear right wheel (48 per revolution)  **/
	fun set_riz_hr(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets direction of rotation of the rear wheel right **/
	fun get_drtghr() : DRTGHR = when(CanBusNative.getECUParameterB(CanBAddrs.EZS_A10, 16, 2)) {
		 0 -> DRTGHR.PASSIVE
		 1 -> DRTGHR.FORWARD
		 2 -> DRTGHR.REVERSE
		 3 -> DRTGHR.SNV
		 else -> throw Exception("Invalid raw value for DRTGHR")
	}
	
	/** Sets direction of rotation of the rear wheel right **/
	fun set_drtghr(f: CanFrame, p: DRTGHR) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 2, p.raw)
	}
	
	/** Gets wheel speed rear right  **/
	fun get_dhr() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A10, 18, 14)
	
	/** Sets wheel speed rear right  **/
	fun set_dhr(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 14, p)
	}
	
	/** Gets direction of rotation of rear left wheel **/
	fun get_drtghl() : DRTGHL = when(CanBusNative.getECUParameterB(CanBAddrs.EZS_A10, 32, 2)) {
		 0 -> DRTGHL.PASSIVE
		 1 -> DRTGHL.FORWARD
		 2 -> DRTGHL.REVERSE
		 3 -> DRTGHL.SNV
		 else -> throw Exception("Invalid raw value for DRTGHL")
	}
	
	/** Sets direction of rotation of rear left wheel **/
	fun set_drtghl(f: CanFrame, p: DRTGHL) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 2, p.raw)
	}
	
	/** Gets wheel speed rear left  **/
	fun get_dhl() : Int = CanBusNative.getECUParameterB(CanBAddrs.EZS_A10, 34, 14)
	
	/** Sets wheel speed rear left  **/
	fun set_dhl(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 34, 14, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.EZS_A10.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame EZS_A10 (0x010A):
		|	Pulse ring counter, rear left wheel (48 per revolution) : ${get_riz_hl()} Pulse
		|	Pulse ring counter, rear right wheel (48 per revolution) : ${get_riz_hr()} Pulse
		|	direction of rotation of the rear wheel right: ${get_drtghr()}
		|	wheel speed rear right : ${get_dhr()} 1 / min
		|	direction of rotation of rear left wheel: ${get_drtghl()}
		|	wheel speed rear left : ${get_dhl()} 1 / min
	""".trimMargin("|")
}
