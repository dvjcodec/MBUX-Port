
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TELEAID_POS4 (ID 0x03E8)
**/

object TELEAID_POS4 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TELEAID_POS4
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TELEAID_POS4)

	/** Gets Dead reckoning / map matching latitude (- means south)  **/
	fun get_dr_mm_lat() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS4, 0, 32)
	
	/** Sets Dead reckoning / map matching latitude (- means south)  **/
	fun set_dr_mm_lat(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 32, p)
	}
	
	/** Gets Dead reckoning / map matching longtitude (- means west)  **/
	fun get_dr_mm_long() : Int = CanBusNative.getECUParameterB(CanBAddrs.TELEAID_POS4, 32, 32)
	
	/** Sets Dead reckoning / map matching longtitude (- means west)  **/
	fun set_dr_mm_long(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 32, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TELEAID_POS4.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TELEAID_POS4 (0x03E8):
		|	Dead reckoning / map matching latitude (- means south) : ${get_dr_mm_lat()} mas
		|	Dead reckoning / map matching longtitude (- means west) : ${get_dr_mm_long()} mas
	""".trimMargin("|")
}
