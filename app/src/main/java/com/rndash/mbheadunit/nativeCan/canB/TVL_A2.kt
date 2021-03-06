
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TVL_A2 (ID 0x0044)
**/

object TVL_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TVL_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TVL_A2)

	/** Gets Comfort control mode **/
	fun get_kb_mod_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 14, 1) != 0
	
	/** Sets Comfort control mode **/
	fun set_kb_mod_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	}
	
	/** Gets direction of comfort actuation **/
	fun get_kb_ri_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 13, 1) != 0
	
	/** Sets direction of comfort actuation **/
	fun set_kb_ri_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets SHD / open / close convertible top **/
	fun get_shd_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 12, 1) != 0
	
	/** Sets SHD / open / close convertible top **/
	fun set_shd_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close front left window **/
	fun get_fvl_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 11, 1) != 0
	
	/** Sets Open / close front left window **/
	fun set_fvl_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close front right window **/
	fun get_fvr_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 10, 1) != 0
	
	/** Sets Open / close front right window **/
	fun set_fvr_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close rear left window **/
	fun get_fhl_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 9, 1) != 0
	
	/** Sets Open / close rear left window **/
	fun set_fhl_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close rear right window **/
	fun get_fhr_tvl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 8, 1) != 0
	
	/** Sets Open / close rear right window **/
	fun set_fhr_tvl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets rear left window **/
	fun get_fhl_aoe_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 23, 1) != 0
	
	/** Sets rear left window **/
	fun set_fhl_aoe_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 23, 1, if(p) 1 else 0)
	}
	
	/** Gets rear left window **/
	fun get_fhl_moe_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 22, 1) != 0
	
	/** Sets rear left window **/
	fun set_fhl_moe_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 22, 1, if(p) 1 else 0)
	}
	
	/** Gets rear left window **/
	fun get_fhl_ms_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 21, 1) != 0
	
	/** Sets rear left window **/
	fun set_fhl_ms_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 21, 1, if(p) 1 else 0)
	}
	
	/** Gets rear left window **/
	fun get_fhl_as_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 20, 1) != 0
	
	/** Sets rear left window **/
	fun set_fhl_as_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	}
	
	/** Gets rear right window **/
	fun get_fhr_aoe_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 19, 1) != 0
	
	/** Sets rear right window **/
	fun set_fhr_aoe_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets rear right window **/
	fun get_fhr_moe_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 18, 1) != 0
	
	/** Sets rear right window **/
	fun set_fhr_moe_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets rear right window **/
	fun get_fhr_ms_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 17, 1) != 0
	
	/** Sets rear right window **/
	fun set_fhr_ms_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets rear right window **/
	fun get_fhr_as_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 16, 1) != 0
	
	/** Sets rear right window **/
	fun set_fhr_as_ll(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets window in front right **/
	fun get_fvr_aoe() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 27, 1) != 0
	
	/** Sets window in front right **/
	fun set_fvr_aoe(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets front right window **/
	fun get_fvr_moe() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 26, 1) != 0
	
	/** Sets front right window **/
	fun set_fvr_moe(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets window front right **/
	fun get_fvr_ms() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 25, 1) != 0
	
	/** Sets window front right **/
	fun set_fvr_ms(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets window front right **/
	fun get_fvr_as() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A2, 24, 1) != 0
	
	/** Sets window front right **/
	fun set_fvr_as(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TVL_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TVL_A2 (0x0044):
		|	Comfort control mode: ${get_kb_mod_tvl()}
		|	direction of comfort actuation: ${get_kb_ri_tvl()}
		|	SHD / open / close convertible top: ${get_shd_tvl()}
		|	Open / close front left window: ${get_fvl_tvl()}
		|	Open / close front right window: ${get_fvr_tvl()}
		|	Open / close rear left window: ${get_fhl_tvl()}
		|	Open / close rear right window: ${get_fhr_tvl()}
		|	rear left window: ${get_fhl_aoe_ll()}
		|	rear left window: ${get_fhl_moe_ll()}
		|	rear left window: ${get_fhl_ms_ll()}
		|	rear left window: ${get_fhl_as_ll()}
		|	rear right window: ${get_fhr_aoe_ll()}
		|	rear right window: ${get_fhr_moe_ll()}
		|	rear right window: ${get_fhr_ms_ll()}
		|	rear right window: ${get_fhr_as_ll()}
		|	window in front right: ${get_fvr_aoe()}
		|	front right window: ${get_fvr_moe()}
		|	window front right: ${get_fvr_ms()}
		|	window front right: ${get_fvr_as()}
	""".trimMargin("|")
}
