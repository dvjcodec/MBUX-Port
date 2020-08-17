
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TVL_A3 (ID 0x0018)
**/

object TVL_A3 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TVL_A3
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TVL_A3)

	/** Gets trunk lid remote locking **/
	fun get_hfs_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 4, 1) != 0
	
	/** Sets trunk lid remote locking **/
	fun set_hfs_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets additional left turn signal defective **/
	fun get_zbll_def() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 3, 1) != 0
	
	/** Sets additional left turn signal defective **/
	fun set_zbll_def(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets child lock on **/
	fun get_kisi_ein_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 2, 1) != 0
	
	/** Sets child lock on **/
	fun set_kisi_ein_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Remote trunk lid unlocking **/
	fun get_hfe_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 1, 1) != 0
	
	/** Sets Remote trunk lid unlocking **/
	fun set_hfe_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Mirror adjustment switch. in position. right (not 203) **/
	fun get_spvs_bf_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 0, 1) != 0
	
	/** Sets Mirror adjustment switch. in position. right (not 203) **/
	fun set_spvs_bf_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets Front left window regulator larger short stroke position **/
	fun get_fvl_kzhb() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 11, 1) != 0
	
	/** Sets Front left window regulator larger short stroke position **/
	fun set_fvl_kzhb(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets window open **/
	fun get_fvl_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 10, 1) != 0
	
	/** Sets window open **/
	fun set_fvl_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets Front left window blocked **/
	fun get_fvl_block() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 9, 1) != 0
	
	/** Sets Front left window blocked **/
	fun set_fvl_block(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Front left window normalized **/
	fun get_fvl_norm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 8, 1) != 0
	
	/** Sets Front left window normalized **/
	fun set_fvl_norm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets window position front left  **/
	fun get_feste_vl() : Int = CanBusNative.getECUParameterB(CanBAddrs.TVL_A3, 12, 12)
	
	/** Sets window position front left  **/
	fun set_feste_vl(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 12, 12, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TVL_A3.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TVL_A3 (0x0018):
		|	trunk lid remote locking: ${get_hfs_ll()}
		|	additional left turn signal defective: ${get_zbll_def()}
		|	child lock on: ${get_kisi_ein_ll()}
		|	Remote trunk lid unlocking: ${get_hfe_ll()}
		|	Mirror adjustment switch. in position. right (not 203): ${get_spvs_bf_ll()}
		|	Front left window regulator larger short stroke position: ${get_fvl_kzhb()}
		|	window open: ${get_fvl_auf()}
		|	Front left window blocked: ${get_fvl_block()}
		|	Front left window normalized: ${get_fvl_norm()}
		|	window position front left : ${get_feste_vl()} 1 / anchor turn
	""".trimMargin("|")
}
