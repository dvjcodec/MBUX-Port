
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MSS_A3 (ID 0x01CE)
**/

object MSS_A3 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MSS_A3
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.MSS_A3)

	/** Gets GPS Latitude, South = [-]; North = [+]  **/
	fun get_dest_lat() : Int = CanBusNative.getECUParameterB(CanBAddrs.MSS_A3, 0, 32)
	
	/** Sets GPS Latitude, South = [-]; North = [+]  **/
	fun set_dest_lat(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 0, 32, p)
	}
	
	/** Gets GPS Longitude, West = [-]; East = [+]  **/
	fun get_dest_long() : Int = CanBusNative.getECUParameterB(CanBAddrs.MSS_A3, 32, 32)
	
	/** Sets GPS Longitude, West = [-]; East = [+]  **/
	fun set_dest_long(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 32, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.MSS_A3.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MSS_A3 (0x01CE):
		|	GPS Latitude, South = [-]; North = [+] : ${get_dest_lat()} ms
		|	GPS Longitude, West = [-]; East = [+] : ${get_dest_long()} ms
	""".trimMargin("|")
}
