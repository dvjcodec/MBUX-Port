
@file:Suppress("unused", "FunctionName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TVL_A4 (ID 0x00E8)
**/

object TVL_A4 {

    	/** Gets code access authorization **/
	fun get_zbc_tvl() : Int = CanBusNative.getECUParameterB(CanBAddrs.TVL_A4, 0, 64)
	
	/** Sets code access authorization **/
	fun set_zbc_tvl(f: CanFrame, p: Int) = CanBusNative.setFrameParameter(f, 0, 64, p)
	
	
}