
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KLA_410h (ID 0x0410)
**/

object KLA_410h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KLA_410h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.KLA_410h)

	/** Gets A / C compressor switched on **/
	fun get_komp_ein() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 7, 1) != 0
	
	/** Sets A / C compressor switched on **/
	fun set_komp_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets Idle speed increase to increase the cooling capacity **/
	fun get_ll_dza() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 1, 1) != 0
	
	/** Sets Idle speed increase to increase the cooling capacity **/
	fun set_ll_dza(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Switching on auxiliary heater allowed **/
	fun get_zh_ein_ok() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 0, 1) != 0
	
	/** Sets Switching on auxiliary heater allowed **/
	fun set_zh_ein_ok(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets refrigerant pressure **/
	fun get_p_kaelte8() : Int = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 8, 8)
	
	/** Sets refrigerant pressure **/
	fun set_p_kaelte8(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets Torque absorption refrigeration compressor **/
	fun get_m_komp() : Int = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 16, 8)
	
	/** Sets Torque absorption refrigeration compressor **/
	fun set_m_komp(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 8, p)
	}
	
	/** Gets Motor fan setpoint speed **/
	fun get_nlfts() : Int = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 24, 8)
	
	/** Sets Motor fan setpoint speed **/
	fun set_nlfts(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 8, p)
	}
	
	/** Gets outside air temperature for heat management **/
	fun get_t_aussen_wm() : Int = CanBusNative.getECUParameterC(CanCAddrs.KLA_410h, 40, 8)
	
	/** Sets outside air temperature for heat management **/
	fun set_t_aussen_wm(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 40, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.KLA_410h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KLA_410h (0x0410):
		|	A / C compressor switched on: ${get_komp_ein()}
		|	Idle speed increase to increase the cooling capacity: ${get_ll_dza()}
		|	Switching on auxiliary heater allowed: ${get_zh_ein_ok()}
		|	refrigerant pressure: ${get_p_kaelte8()}
		|	Torque absorption refrigeration compressor: ${get_m_komp()}
		|	Motor fan setpoint speed: ${get_nlfts()}
		|	outside air temperature for heat management: ${get_t_aussen_wm()}
	""".trimMargin("|")
}
