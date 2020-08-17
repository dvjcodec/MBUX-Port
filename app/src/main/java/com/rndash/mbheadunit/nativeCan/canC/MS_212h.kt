
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MS_212h (ID 0x0212)
**/

object MS_212h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MS_212h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.MS_212h)

	/** Gets Target engine idling speed **/
	fun get_nmots() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 0, 16)
	
	/** Sets Target engine idling speed **/
	fun set_nmots(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 16, p)
	}
	
	/** Gets Enable torque request ART **/
	fun get_m_art_e() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 18, 1) != 0
	
	/** Sets Enable torque request ART **/
	fun set_m_art_e(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets Series cruise control is variant-coded **/
	fun get_tm_ms() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 17, 1) != 0
	
	/** Sets Series cruise control is variant-coded **/
	fun set_tm_ms(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets driver default torque **/
	fun get_m_fv() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 19, 13)
	
	/** Sets driver default torque **/
	fun set_m_fv(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 19, 13, p)
	}
	
	/** Gets Enable torque request ESP **/
	fun get_m_esp_e() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 34, 1) != 0
	
	/** Sets Enable torque request ESP **/
	fun set_m_esp_e(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 34, 1, if(p) 1 else 0)
	}
	
	/** Gets Enable fast torque setting **/
	fun get_sme_e() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 33, 1) != 0
	
	/** Sets Enable fast torque setting **/
	fun set_sme_e(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 33, 1, if(p) 1 else 0)
	}
	
	/** Gets Substitute default torque driver **/
	fun get_m_fev() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 35, 13)
	
	/** Sets Substitute default torque driver **/
	fun set_m_fev(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 35, 13, p)
	}
	
	/** Gets Enable torque request EGS **/
	fun get_m_egs_e() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 50, 1) != 0
	
	/** Sets Enable torque request EGS **/
	fun set_m_egs_e(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 50, 1, if(p) 1 else 0)
	}
	
	/** Gets Acknowledgment of torque request EGS **/
	fun get_m_egs_q() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 49, 1) != 0
	
	/** Sets Acknowledgment of torque request EGS **/
	fun set_m_egs_q(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 49, 1, if(p) 1 else 0)
	}
	
	/** Gets Transfer CALID / CVN enable **/
	fun get_calid_cvn_e() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 48, 1) != 0
	
	/** Sets Transfer CALID / CVN enable **/
	fun set_calid_cvn_e(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 1, if(p) 1 else 0)
	}
	
	/** Gets Preset torque ESP **/
	fun get_m_espv() : Int = CanBusNative.getECUParameterC(CanCAddrs.MS_212h, 51, 13)
	
	/** Sets Preset torque ESP **/
	fun set_m_espv(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 51, 13, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.MS_212h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MS_212h (0x0212):
		|	Target engine idling speed: ${get_nmots()}
		|	Enable torque request ART: ${get_m_art_e()}
		|	Series cruise control is variant-coded: ${get_tm_ms()}
		|	driver default torque: ${get_m_fv()}
		|	Enable torque request ESP: ${get_m_esp_e()}
		|	Enable fast torque setting: ${get_sme_e()}
		|	Substitute default torque driver: ${get_m_fev()}
		|	Enable torque request EGS: ${get_m_egs_e()}
		|	Acknowledgment of torque request EGS: ${get_m_egs_q()}
		|	Transfer CALID / CVN enable: ${get_calid_cvn_e()}
		|	Preset torque ESP: ${get_m_espv()}
	""".trimMargin("|")
}
