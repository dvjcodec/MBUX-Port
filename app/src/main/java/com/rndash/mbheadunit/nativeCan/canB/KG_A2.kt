
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KG_A2 (ID 0x0050)
**/

object KG_A2 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KG_A2
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.KG_A2)

	/** Gets Comfort control mode **/
	fun get_kb_mod_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 6, 1) != 0
	
	/** Sets Comfort control mode **/
	fun set_kb_mod_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets direction of comfort actuation **/
	fun get_kb_ri_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 5, 1) != 0
	
	/** Sets direction of comfort actuation **/
	fun set_kb_ri_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets SHD / open / close convertible top **/
	fun get_shd_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 4, 1) != 0
	
	/** Sets SHD / open / close convertible top **/
	fun set_shd_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close front left window **/
	fun get_fvl_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 3, 1) != 0
	
	/** Sets Open / close front left window **/
	fun set_fvl_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close front right window **/
	fun get_fvr_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 2, 1) != 0
	
	/** Sets Open / close front right window **/
	fun set_fvr_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close rear left window **/
	fun get_fhl_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 1, 1) != 0
	
	/** Sets Open / close rear left window **/
	fun set_fhl_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Open / close rear right window **/
	fun get_fhr_kg() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KG_A2, 0, 1) != 0
	
	/** Sets Open / close rear right window **/
	fun set_fhr_kg(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.KG_A2.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KG_A2 (0x0050):
		|	Comfort control mode: ${get_kb_mod_kg()}
		|	direction of comfort actuation: ${get_kb_ri_kg()}
		|	SHD / open / close convertible top: ${get_shd_kg()}
		|	Open / close front left window: ${get_fvl_kg()}
		|	Open / close front right window: ${get_fvr_kg()}
		|	Open / close rear left window: ${get_fhl_kg()}
		|	Open / close rear right window: ${get_fhr_kg()}
	""".trimMargin("|")
}
