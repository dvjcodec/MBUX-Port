
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for GS_HS2 (ID 0x0502)
**/

object GS_HS2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of GS_HS2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.GS_HS2)

	/** Gets manual control on the test bench **/
	fun get_hs2() : Int = CanBusNative.getECUParameterC(CanCAddrs.GS_HS2, 0, 64)
	
	/** Sets manual control on the test bench **/
	fun set_hs2(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 64, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.GS_HS2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame GS_HS2 (0x0502):
		|	manual control on the test bench: ${get_hs2()}
	""".trimMargin("|")
}
