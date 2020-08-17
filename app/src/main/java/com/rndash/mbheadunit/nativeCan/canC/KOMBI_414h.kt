
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_414h (ID 0x0414)
**/

object KOMBI_414h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KOMBI_414h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.KOMBI_414h)

	/** Gets filtered outside temperature combi **/
	fun get_t_aussen_k() : Int = CanBusNative.getECUParameterC(CanCAddrs.KOMBI_414h, 0, 8)
	
	/** Sets filtered outside temperature combi **/
	fun set_t_aussen_k(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.KOMBI_414h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KOMBI_414h (0x0414):
		|	filtered outside temperature combi: ${get_t_aussen_k()}
	""".trimMargin("|")
}
