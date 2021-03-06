
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canC
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for EZS_240h (ID 0x0240)
**/

object EZS_240h {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of EZS_240h
    **/
    fun get_frame() : CanFrame? = CanBusNative.getCFrame(CanCAddrs.EZS_240h)

	/** Gets Cruise control lever: "Switch off" **/
	fun get_off() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 7, 1) != 0
	
	/** Sets Cruise control lever: "Switch off" **/
	fun set_off(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets Cruise control lever: "Resume" **/
	fun get_wa() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 6, 1) != 0
	
	/** Sets Cruise control lever: "Resume" **/
	fun set_wa(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets Cruise control lever: "Set and accelerate level0" **/
	fun get_s_plus_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 5, 1) != 0
	
	/** Sets Cruise control lever: "Set and accelerate level0" **/
	fun set_s_plus_b(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets Cruise control lever: "Set and decelerate level0" **/
	fun get_s_minus_b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 4, 1) != 0
	
	/** Sets Cruise control lever: "Set and decelerate level0" **/
	fun set_s_minus_b(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets Operation variable speed limit **/
	fun get_vmax_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 3, 1) != 0
	
	/** Sets Operation variable speed limit **/
	fun set_vmax_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets Cruise control lever implausible **/
	fun get_wh_up() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 2, 1) != 0
	
	/** Sets Cruise control lever implausible **/
	fun set_wh_up(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 50 **/
	fun get_kl_50() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 15, 1) != 0
	
	/** Sets Terminal 50 **/
	fun set_kl_50(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 15, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 15 **/
	fun get_kl_15() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 14, 1) != 0
	
	/** Sets Terminal 15 **/
	fun set_kl_15(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	}
	
	/** Gets brake switch for shift lock **/
	fun get_bs_sl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 13, 1) != 0
	
	/** Sets brake switch for shift lock **/
	fun set_bs_sl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets reverse gear engaged (only manual transmission) **/
	fun get_rg_schalt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 12, 1) != 0
	
	/** Sets reverse gear engaged (only manual transmission) **/
	fun set_rg_schalt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets left-hand drive / right-hand drive **/
	fun get_ll_rlc() : LL_RLC = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 10, 2)) {
		 0 -> LL_RLC.NOT_DEFINED
		 1 -> LL_RLC.LL
		 2 -> LL_RLC.RL
		 3 -> LL_RLC.SNV
		 else -> throw Exception("Invalid raw value for LL_RLC")
	}
	
	/** Sets left-hand drive / right-hand drive **/
	fun set_ll_rlc(f: CanFrame, p: LL_RLC) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 10, 2, p.raw)
	}
	
	/** Gets Keyles Go event conditions met **/
	fun get_kg_alb_ok() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 9, 1) != 0
	
	/** Sets Keyles Go event conditions met **/
	fun set_kg_alb_ok(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets Keyless Go terminal control active **/
	fun get_kg_kl_akt() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 8, 1) != 0
	
	/** Sets Keyless Go terminal control active **/
	fun set_kg_kl_akt(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets message counter **/
	fun get_bz240h() : Int = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 20, 4)
	
	/** Sets message counter **/
	fun set_bz240h(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 20, 4, p)
	}
	
	/** Gets Cruise control lever parity (even parity) **/
	fun get_wh_pa() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 19, 1) != 0
	
	/** Sets Cruise control lever parity (even parity) **/
	fun set_wh_pa(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets crash signal from Airbag-SG **/
	fun get_crash() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 31, 1) != 0
	
	/** Sets crash signal from Airbag-SG **/
	fun set_crash(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 31, 1, if(p) 1 else 0)
	}
	
	/** Gets CRASH confirmbit **/
	fun get_crash_cnf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 30, 1) != 0
	
	/** Sets CRASH confirmbit **/
	fun set_crash_cnf(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 30, 1, if(p) 1 else 0)
	}
	
	/** Gets ASG sport mode on / off activated (ST2_LED_DL if ABC is available) **/
	fun get_asg_sport_bet() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 27, 1) != 0
	
	/** Sets ASG sport mode on / off activated (ST2_LED_DL if ABC is available) **/
	fun set_asg_sport_bet(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets direction flashing left **/
	fun get_bli_li() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 39, 1) != 0
	
	/** Sets direction flashing left **/
	fun set_bli_li(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 39, 1, if(p) 1 else 0)
	}
	
	/** Gets direction flashing right **/
	fun get_bli_re() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 38, 1) != 0
	
	/** Sets direction flashing right **/
	fun set_bli_re(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 38, 1, if(p) 1 else 0)
	}
	
	/** Gets wiper outside of parking position **/
	fun get_kl_31b() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 36, 1) != 0
	
	/** Sets wiper outside of parking position **/
	fun set_kl_31b(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 36, 1, if(p) 1 else 0)
	}
	
	/** Gets handbrake applied (control lamp) **/
	fun get_has_kl() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 35, 1) != 0
	
	/** Sets handbrake applied (control lamp) **/
	fun set_has_kl(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 35, 1, if(p) 1 else 0)
	}
	
	/** Gets ESP on / off actuated **/
	fun get_esp_bet() : ESP_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 33, 2)) {
		 0 -> ESP_BET.NBET
		 1 -> ESP_BET.AUS_BET
		 2 -> ESP_BET.EIN_NDEF
		 3 -> ESP_BET.SNV
		 else -> throw Exception("Invalid raw value for ESP_BET")
	}
	
	/** Sets ESP on / off actuated **/
	fun set_esp_bet(f: CanFrame, p: ESP_BET) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 33, 2, p.raw)
	}
	
	/** Gets On-board network emergency operation: Prio1 and Prio2 consumers off, second battery supports **/
	fun get_bn_ntlf() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 32, 1) != 0
	
	/** Sets On-board network emergency operation: Prio1 and Prio2 consumers off, second battery supports **/
	fun set_bn_ntlf(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	}
	
	/** Gets Terminal 54 hardware active **/
	fun get_kl54_rm() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 47, 1) != 0
	
	/** Sets Terminal 54 hardware active **/
	fun set_kl54_rm(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 47, 1, if(p) 1 else 0)
	}
	
	/** Gets Switch on low beam **/
	fun get_abl_ein() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 46, 1) != 0
	
	/** Sets Switch on low beam **/
	fun set_abl_ein(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 46, 1, if(p) 1 else 0)
	}
	
	/** Gets ART distance warning on / off activated **/
	fun get_art_abw_bet() : ART_ABW_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 44, 2)) {
		 0 -> ART_ABW_BET.NDEF_NBET
		 1 -> ART_ABW_BET.AUS_NDEF
		 2 -> ART_ABW_BET.ON_BET
		 3 -> ART_ABW_BET.SNV
		 else -> throw Exception("Invalid raw value for ART_ABW_BET")
	}
	
	/** Sets ART distance warning on / off activated **/
	fun set_art_abw_bet(f: CanFrame, p: ART_ABW_BET) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 44, 2, p.raw)
	}
	
	/** Gets LF / ABC 3-stage switch actuated **/
	fun get_st3_bet() : ST3_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 42, 2)) {
		 0 -> ST3_BET.NBET
		 1 -> ST3_BET.UNBET_NDEF
		 2 -> ST3_BET.OBBET_BET
		 3 -> ST3_BET.NOT_DEFINED_ROCKER_AND_PUSH_PUSH
		 else -> throw Exception("Invalid raw value for ST3_BET")
	}
	
	/** Sets LF / ABC 3-stage switch actuated **/
	fun set_st3_bet(f: CanFrame, p: ST3_BET) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 42, 2, p.raw)
	}
	
	/** Gets LF / ABC 2-stage switch actuated **/
	fun get_st2_bet() : ST2_BET = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 40, 2)) {
		 0 -> ST2_BET.NBET
		 1 -> ST2_BET.UNBET_NDEF
		 2 -> ST2_BET.OBBET_BET
		 3 -> ST2_BET.NOT_DEFINED_ROCKER_AND_PUSH_PUSH
		 else -> throw Exception("Invalid raw value for ST2_BET")
	}
	
	/** Sets LF / ABC 2-stage switch actuated **/
	fun set_st2_bet(f: CanFrame, p: ST2_BET) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 40, 2, p.raw)
	}
	
	/** Gets distance factor **/
	fun get_art_abstand() : Int = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 48, 8)
	
	/** Sets distance factor **/
	fun set_art_abstand(f: CanFrame, p: Int) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 48, 8, p)
	}
	
	/** Gets country code **/
	fun get_ldc() : LDC = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 62, 2)) {
		 0 -> LDC.RDW
		 1 -> LDC.USA_CAN
		 2 -> LDC.NOT_DEFINED
		 3 -> LDC.SNV
		 else -> throw Exception("Invalid raw value for LDC")
	}
	
	/** Sets country code **/
	fun set_ldc(f: CanFrame, p: LDC) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 62, 2, p.raw)
	}
	
	/** Gets model-dependent vehicle version (only 220/215/230) **/
	fun get_fzgversn() : FZGVERSN = when(CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 59, 3)) {
		 0 -> FZGVERSN.START_WAS_LAUNCHED
		 1 -> FZGVERSN.V1
		 2 -> FZGVERSN.V2
		 3 -> FZGVERSN.V3
		 4 -> FZGVERSN.V4
		 5 -> FZGVERSN.V5
		 6 -> FZGVERSN.V6
		 7 -> FZGVERSN.V7
		 else -> throw Exception("Invalid raw value for FZGVERSN")
	}
	
	/** Sets model-dependent vehicle version (only 220/215/230) **/
	fun set_fzgversn(f: CanFrame, p: FZGVERSN) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 59, 3, p.raw)
	}
	
	/** Gets E-suction fan: basic ventilation off **/
	fun get_gbl_aus() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 57, 1) != 0
	
	/** Sets E-suction fan: basic ventilation off **/
	fun set_gbl_aus(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 57, 1, if(p) 1 else 0)
	}
	
	/** Gets ART available **/
	fun get_art_vh() : Boolean = CanBusNative.getECUParameterC(CanCAddrs.EZS_240h, 56, 1) != 0
	
	/** Sets ART available **/
	fun set_art_vh(f: CanFrame, p: Boolean) {
		checkFrame(f)
		CanBusNative.setFrameParameter(f, 56, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanCAddrs.EZS_240h.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame EZS_240h (0x0240):
		|	Cruise control lever: "Switch off": ${get_off()}
		|	Cruise control lever: "Resume": ${get_wa()}
		|	Cruise control lever: "Set and accelerate level0": ${get_s_plus_b()}
		|	Cruise control lever: "Set and decelerate level0": ${get_s_minus_b()}
		|	Operation variable speed limit: ${get_vmax_akt()}
		|	Cruise control lever implausible: ${get_wh_up()}
		|	Terminal 50: ${get_kl_50()}
		|	Terminal 15: ${get_kl_15()}
		|	brake switch for shift lock: ${get_bs_sl()}
		|	reverse gear engaged (only manual transmission): ${get_rg_schalt()}
		|	left-hand drive / right-hand drive: ${get_ll_rlc()}
		|	Keyles Go event conditions met: ${get_kg_alb_ok()}
		|	Keyless Go terminal control active: ${get_kg_kl_akt()}
		|	message counter: ${get_bz240h()}
		|	Cruise control lever parity (even parity): ${get_wh_pa()}
		|	crash signal from Airbag-SG: ${get_crash()}
		|	CRASH confirmbit: ${get_crash_cnf()}
		|	ASG sport mode on / off activated (ST2_LED_DL if ABC is available): ${get_asg_sport_bet()}
		|	direction flashing left: ${get_bli_li()}
		|	direction flashing right: ${get_bli_re()}
		|	wiper outside of parking position: ${get_kl_31b()}
		|	handbrake applied (control lamp): ${get_has_kl()}
		|	ESP on / off actuated: ${get_esp_bet()}
		|	On-board network emergency operation: Prio1 and Prio2 consumers off, second battery supports: ${get_bn_ntlf()}
		|	Terminal 54 hardware active: ${get_kl54_rm()}
		|	Switch on low beam: ${get_abl_ein()}
		|	ART distance warning on / off activated: ${get_art_abw_bet()}
		|	LF / ABC 3-stage switch actuated: ${get_st3_bet()}
		|	LF / ABC 2-stage switch actuated: ${get_st2_bet()}
		|	distance factor: ${get_art_abstand()}
		|	country code: ${get_ldc()}
		|	model-dependent vehicle version (only 220/215/230): ${get_fzgversn()}
		|	E-suction fan: basic ventilation off: ${get_gbl_aus()}
		|	ART available: ${get_art_vh()}
	""".trimMargin("|")
}
