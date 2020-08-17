
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KLA_A1 (ID 0x0030)
**/

object KLA_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KLA_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.KLA_A1)

	/** Gets Ventilate auxiliary heating **/
	fun get_ventilate() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 7, 1) != 0
	
	/** Sets Ventilate auxiliary heating **/
	fun set_ventilate(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets heating auxiliary heating **/
	fun get_heating() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 6, 1) != 0
	
	/** Sets heating auxiliary heating **/
	fun set_heating(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets Idle speed increase to increase the cooling capacity **/
	fun get_ll_dza() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 5, 1) != 0
	
	/** Sets Idle speed increase to increase the cooling capacity **/
	fun set_ll_dza(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets Switching on auxiliary heater allowed **/
	fun get_zh_ein_ok() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 4, 1) != 0
	
	/** Sets Switching on auxiliary heater allowed **/
	fun set_zh_ein_ok(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on additional water pump **/
	fun get_zwp_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 3, 1) != 0
	
	/** Sets switch on additional water pump **/
	fun set_zwp_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on the indoor sensor fan **/
	fun get_ifg_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 2, 1) != 0
	
	/** Sets switch on the indoor sensor fan **/
	fun set_ifg_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets EC mode active **/
	fun get_ec_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 1, 1) != 0
	
	/** Sets EC mode active **/
	fun set_ec_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on the heated rear window **/
	fun get_hhs_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 0, 1) != 0
	
	/** Sets Switch on the heated rear window **/
	fun set_hhs_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets Motor fan setpoint speed  **/
	fun get_nlfts() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 8, 8)
	
	/** Sets Motor fan setpoint speed  **/
	fun set_nlfts(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets Torque absorption refrigeration compressor  **/
	fun get_m_komp() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 16, 8)
	
	/** Sets Torque absorption refrigeration compressor  **/
	fun set_m_komp(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 8, p)
	}
	
	/** Gets Cooling compressor control signal  **/
	fun get_komp_stell() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 24, 8)
	
	/** Sets Cooling compressor control signal  **/
	fun set_komp_stell(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 8, p)
	}
	
	/** Gets Switching point increase in case of cooling power deficit **/
	fun get_g_anf_kuehl_kla() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 33, 1) != 0
	
	/** Sets Switching point increase in case of cooling power deficit **/
	fun set_g_anf_kuehl_kla(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 33, 1, if(p) 1 else 0)
	}
	
	/** Gets windshield heater. switch on (for G463) **/
	fun get_fsb_hzg_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 32, 1) != 0
	
	/** Sets windshield heater. switch on (for G463) **/
	fun set_fsb_hzg_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	}
	
	/** Gets Fan output  **/
	fun get_geb_lstg() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 40, 8)
	
	/** Sets Fan output  **/
	fun set_geb_lstg(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 40, 8, p)
	}
	
	/** Gets position ventilation flap down **/
	fun get_lku_vorn() : LKU_VORN = when(CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 54, 2)) {
		 0 -> LKU_VORN.CENTER
		 1 -> LKU_VORN.UP
		 2 -> LKU_VORN.CLOSED
		 3 -> LKU_VORN.SNV
		 else -> throw Exception("Invalid raw value for LKU_VORN")
	}
	
	/** Sets position ventilation flap down **/
	fun set_lku_vorn(f: CanFrame, p: LKU_VORN) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 54, 2, p.raw)
	}
	
	/** Gets Position ventilation flap center **/
	fun get_lkm_vorn() : LKM_VORN = when(CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 52, 2)) {
		 0 -> LKM_VORN.CENTER
		 1 -> LKM_VORN.UP
		 2 -> LKM_VORN.CLOSED
		 3 -> LKM_VORN.SNV
		 else -> throw Exception("Invalid raw value for LKM_VORN")
	}
	
	/** Sets Position ventilation flap center **/
	fun set_lkm_vorn(f: CanFrame, p: LKM_VORN) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 52, 2, p.raw)
	}
	
	/** Gets position ventilation flap up **/
	fun get_lko_vorn() : LKO_VORN = when(CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 50, 2)) {
		 0 -> LKO_VORN.CENTER
		 1 -> LKO_VORN.UP
		 2 -> LKO_VORN.CLOSED
		 3 -> LKO_VORN.SNV
		 else -> throw Exception("Invalid raw value for LKO_VORN")
	}
	
	/** Sets position ventilation flap up **/
	fun set_lko_vorn(f: CanFrame, p: LKO_VORN) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 50, 2, p.raw)
	}
	
	/** Gets Switching point increase in case of heating power deficit **/
	fun get_g_anf_kla() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 49, 1) != 0
	
	/** Sets Switching point increase in case of heating power deficit **/
	fun set_g_anf_kla(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 49, 1, if(p) 1 else 0)
	}
	
	/** Gets circulating air active **/
	fun get_ul_akt_kla() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 48, 1) != 0
	
	/** Sets circulating air active **/
	fun set_ul_akt_kla(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 1, if(p) 1 else 0)
	}
	
	/** Gets Inside temperature  **/
	fun get_t_innen_kla() : Int = CanBusNative.getECUParameterB(CanBAddrs.KLA_A1, 56, 8)
	
	/** Sets Inside temperature  **/
	fun set_t_innen_kla(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 56, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.KLA_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KLA_A1 (0x0030):
		|	Ventilate auxiliary heating: ${get_ventilate()}
		|	heating auxiliary heating: ${get_heating()}
		|	Idle speed increase to increase the cooling capacity: ${get_ll_dza()}
		|	Switching on auxiliary heater allowed: ${get_zh_ein_ok()}
		|	switch on additional water pump: ${get_zwp_ein()}
		|	switch on the indoor sensor fan: ${get_ifg_ein()}
		|	EC mode active: ${get_ec_akt()}
		|	Switch on the heated rear window: ${get_hhs_ein()}
		|	Motor fan setpoint speed : ${get_nlfts()} %
		|	Torque absorption refrigeration compressor : ${get_m_komp()} Nm
		|	Cooling compressor control signal : ${get_komp_stell()} %
		|	Switching point increase in case of cooling power deficit: ${get_g_anf_kuehl_kla()}
		|	windshield heater. switch on (for G463): ${get_fsb_hzg_ein()}
		|	Fan output : ${get_geb_lstg()} %
		|	position ventilation flap down: ${get_lku_vorn()}
		|	Position ventilation flap center: ${get_lkm_vorn()}
		|	position ventilation flap up: ${get_lko_vorn()}
		|	Switching point increase in case of heating power deficit: ${get_g_anf_kla()}
		|	circulating air active: ${get_ul_akt_kla()}
		|	Inside temperature : ${get_t_innen_kla()} ° C
	""".trimMargin("|")
}
