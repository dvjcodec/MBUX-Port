
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for KOMBI_A1 (ID 0x000C)
**/

object KOMBI_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of KOMBI_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.KOMBI_A1)

	/** Gets Brightness of instrument lighting  **/
	fun get_kl_58d_b() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 0, 8)
	
	/** Sets Brightness of instrument lighting  **/
	fun set_kl_58d_b(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 8, p)
	}
	
	/** Gets vehicle speed  **/
	fun get_v_signal() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 8, 8)
	
	/** Sets vehicle speed  **/
	fun set_v_signal(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 8, p)
	}
	
	/** Gets mirror in parking position **/
	fun get_sp_park_sperr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 23, 1) != 0
	
	/** Sets mirror in parking position **/
	fun set_sp_park_sperr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 23, 1, if(p) 1 else 0)
	}
	
	/** Gets key dependency on **/
	fun get_schlue_abh_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 22, 1) != 0
	
	/** Sets key dependency on **/
	fun set_schlue_abh_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 22, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on trailer monitoring **/
	fun get_anh_uebw() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 21, 1) != 0
	
	/** Sets Switch on trailer monitoring **/
	fun set_anh_uebw(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 21, 1, if(p) 1 else 0)
	}
	
	/** Gets daytime running lights on **/
	fun get_tfl_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 20, 1) != 0
	
	/** Sets daytime running lights on **/
	fun set_tfl_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 20, 1, if(p) 1 else 0)
	}
	
	/** Gets temperature unit **/
	fun get_t_c() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 19, 1) != 0
	
	/** Sets temperature unit **/
	fun set_t_c(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets Automatic door locking **/
	fun get_auto_tuer() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 18, 1) != 0
	
	/** Sets Automatic door locking **/
	fun set_auto_tuer(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets minimum tank level **/
	fun get_tfsm_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 17, 1) != 0
	
	/** Sets minimum tank level **/
	fun set_tfsm_b(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on roof sign (taxi) **/
	fun get_dz_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 16, 1) != 0
	
	/** Sets switch on roof sign (taxi) **/
	fun set_dz_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets entry aid / autom. Positioning a **/
	fun get_esh_auto_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 31, 1) != 0
	
	/** Sets entry aid / autom. Positioning a **/
	fun set_esh_auto_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 31, 1, if(p) 1 else 0)
	}
	
	/** Gets steering column adjustment with I / O help on **/
	fun get_esh_lenk_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 30, 1) != 0
	
	/** Sets steering column adjustment with I / O help on **/
	fun set_esh_lenk_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 30, 1, if(p) 1 else 0)
	}
	
	/** Gets Seat adjustment with I / O help on **/
	fun get_esh_sitz_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 29, 1) != 0
	
	/** Sets Seat adjustment with I / O help on **/
	fun set_esh_sitz_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 29, 1, if(p) 1 else 0)
	}
	
	/** Gets Seat adjustment path with I / O help on standard **/
	fun get_esh_pos_std() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 28, 1) != 0
	
	/** Sets Seat adjustment path with I / O help on standard **/
	fun set_esh_pos_std(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 28, 1, if(p) 1 else 0)
	}
	
	/** Gets Mirror folding in with vehicle locking **/
	fun get_sp_ankl_sperr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 25, 1) != 0
	
	/** Sets Mirror folding in with vehicle locking **/
	fun set_sp_ankl_sperr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets Save longitudinal seat position for I / O help **/
	fun get_esh_pos_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 24, 1) != 0
	
	/** Sets Save longitudinal seat position for I / O help **/
	fun set_esh_pos_sp(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets language **/
	fun get_language() : LANGUAGE = when(CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 36, 4)) {
		 0 -> LANGUAGE.GERMAN
		 1 -> LANGUAGE.ENGLISH
		 2 -> LANGUAGE.FRENCH
		 3 -> LANGUAGE.ITALIAN
		 4 -> LANGUAGE.SPANISH
		 5 -> LANGUAGE.JAPANESE
		 6 -> LANGUAGE.DUTCH
		 7 -> LANGUAGE.DAENISH
		 8 -> LANGUAGE.SWEDISH
		 9 -> LANGUAGE.PORTUGUESE
		 10 -> LANGUAGE.TURKISH
		 11 -> LANGUAGE.RUSSIAN
		 15 -> LANGUAGE.SNV
		 else -> throw Exception("Invalid raw value for LANGUAGE")
	}
	
	/** Sets language **/
	fun set_language(f: CanFrame, p: LANGUAGE) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 36, 4, p.raw)
	}
	
	/** Gets Surrounding lighting on **/
	fun get_ufb_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 35, 1) != 0
	
	/** Sets Surrounding lighting on **/
	fun set_ufb_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 35, 1, if(p) 1 else 0)
	}
	
	/** Gets Switching on the high beam is permitted **/
	fun get_fl_ok() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 34, 1) != 0
	
	/** Sets Switching on the high beam is permitted **/
	fun set_fl_ok(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 34, 1, if(p) 1 else 0)
	}
	
	/** Gets trip computer distance unit **/
	fun get_rr_km() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 33, 1) != 0
	
	/** Sets trip computer distance unit **/
	fun set_rr_km(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 33, 1, if(p) 1 else 0)
	}
	
	/** Gets search run **/
	fun get_slf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 32, 1) != 0
	
	/** Sets search run **/
	fun set_slf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	}
	
	/** Gets activate RDK **/
	fun get_rdk_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 47, 1) != 0
	
	/** Sets activate RDK **/
	fun set_rdk_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 47, 1, if(p) 1 else 0)
	}
	
	/** Gets Interior protection on when the convertible top is open **/
	fun get_irs_vdk_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 46, 1) != 0
	
	/** Sets Interior protection on when the convertible top is open **/
	fun set_irs_vdk_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 46, 1, if(p) 1 else 0)
	}
	
	/** Gets Preselection time deactivated via MFL (LED off) **/
	fun get_vwz_aus_mfl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 42, 1) != 0
	
	/** Sets Preselection time deactivated via MFL (LED off) **/
	fun set_vwz_aus_mfl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 42, 1, if(p) 1 else 0)
	}
	
	/** Gets preset time activated (LED on) **/
	fun get_vwz_akt() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 41, 1) != 0
	
	/** Sets preset time activated (LED on) **/
	fun set_vwz_akt(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 41, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on auxiliary heating / ventilation **/
	fun get_sthl_ein_kombi() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 40, 1) != 0
	
	/** Sets switch on auxiliary heating / ventilation **/
	fun set_sthl_ein_kombi(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 40, 1, if(p) 1 else 0)
	}
	
	/** Gets interior lighting afterglow time  **/
	fun get_inli_nlz() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 48, 8)
	
	/** Sets interior lighting afterglow time  **/
	fun set_inli_nlz(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 48, 8, p)
	}
	
	/** Gets parking light or fog light afterglow time (SWA)  **/
	fun get_abl_nlz() : Int = CanBusNative.getECUParameterB(CanBAddrs.KOMBI_A1, 56, 8)
	
	/** Sets parking light or fog light afterglow time (SWA)  **/
	fun set_abl_nlz(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 56, 8, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.KOMBI_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame KOMBI_A1 (0x000C):
		|	Brightness of instrument lighting : ${get_kl_58d_b()} %
		|	vehicle speed : ${get_v_signal()} km / h
		|	mirror in parking position: ${get_sp_park_sperr()}
		|	key dependency on: ${get_schlue_abh_ein()}
		|	Switch on trailer monitoring: ${get_anh_uebw()}
		|	daytime running lights on: ${get_tfl_ein()}
		|	temperature unit: ${get_t_c()}
		|	Automatic door locking: ${get_auto_tuer()}
		|	minimum tank level: ${get_tfsm_b()}
		|	switch on roof sign (taxi): ${get_dz_ein()}
		|	entry aid / autom. Positioning a: ${get_esh_auto_ein()}
		|	steering column adjustment with I / O help on: ${get_esh_lenk_ein()}
		|	Seat adjustment with I / O help on: ${get_esh_sitz_ein()}
		|	Seat adjustment path with I / O help on standard: ${get_esh_pos_std()}
		|	Mirror folding in with vehicle locking: ${get_sp_ankl_sperr()}
		|	Save longitudinal seat position for I / O help: ${get_esh_pos_sp()}
		|	language: ${get_language()}
		|	Surrounding lighting on: ${get_ufb_ein()}
		|	Switching on the high beam is permitted: ${get_fl_ok()}
		|	trip computer distance unit: ${get_rr_km()}
		|	search run: ${get_slf()}
		|	activate RDK: ${get_rdk_akt()}
		|	Interior protection on when the convertible top is open: ${get_irs_vdk_ein()}
		|	Preselection time deactivated via MFL (LED off): ${get_vwz_aus_mfl()}
		|	preset time activated (LED on): ${get_vwz_akt()}
		|	switch on auxiliary heating / ventilation: ${get_sthl_ein_kombi()}
		|	interior lighting afterglow time : ${get_inli_nlz()} s
		|	parking light or fog light afterglow time (SWA) : ${get_abl_nlz()} s
	""".trimMargin("|")
}
