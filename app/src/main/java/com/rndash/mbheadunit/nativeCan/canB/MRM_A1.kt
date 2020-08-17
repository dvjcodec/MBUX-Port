
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for MRM_A1 (ID 0x0006)
**/

object MRM_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of MRM_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.MRM_A1)

	/** Gets direction flashing left **/
	fun get_bli_li() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 4, 1) != 0
	
	/** Sets direction flashing left **/
	fun set_bli_li(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets right direction flashing **/
	fun get_bli_re() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 3, 1) != 0
	
	/** Sets right direction flashing **/
	fun set_bli_re(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 3, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on high beam **/
	fun get_fl_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 2, 1) != 0
	
	/** Sets switch on high beam **/
	fun set_fl_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 2, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on headlight flasher **/
	fun get_lhp_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 1, 1) != 0
	
	/** Sets switch on headlight flasher **/
	fun set_lhp_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 1, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on the horn **/
	fun get_sgh_ein_lr() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 0, 1) != 0
	
	/** Sets switch on the horn **/
	fun set_sgh_ein_lr(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets Wipe / wash the rear window **/
	fun get_heck_wisch_mrm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 14, 1) != 0
	
	/** Sets Wipe / wash the rear window **/
	fun set_heck_wisch_mrm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 14, 1, if(p) 1 else 0)
	}
	
	/** Gets Intermittent wiping of the rear window **/
	fun get_heck_int_mrm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 13, 1) != 0
	
	/** Sets Intermittent wiping of the rear window **/
	fun set_heck_int_mrm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets Tip wipe actuated **/
	fun get_tipp_wisch() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 12, 1) != 0
	
	/** Sets Tip wipe actuated **/
	fun set_tipp_wisch(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets washing actuated **/
	fun get_washing() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 11, 1) != 0
	
	/** Sets washing actuated **/
	fun set_washing(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets LSS in position I (rain sensor operation) **/
	fun get_sch_wi_int() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 10, 1) != 0
	
	/** Sets LSS in position I (rain sensor operation) **/
	fun set_sch_wi_int(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets LSS in position II (level 1) **/
	fun get_sch_wi_1() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 9, 1) != 0
	
	/** Sets LSS in position II (level 1) **/
	fun set_sch_wi_1(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets LSS in position III (level 2) **/
	fun get_sch_wi_2() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 8, 1) != 0
	
	/** Sets LSS in position III (level 2) **/
	fun set_sch_wi_2(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets switch off voice control (abort) **/
	fun get_sbs_aus() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 23, 1) != 0
	
	/** Sets switch off voice control (abort) **/
	fun set_sbs_aus(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 23, 1, if(p) 1 else 0)
	}
	
	/** Gets Activate voice control (push to talk) **/
	fun get_sbs_ein() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 22, 1) != 0
	
	/** Sets Activate voice control (push to talk) **/
	fun set_sbs_ein(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 22, 1, if(p) 1 else 0)
	}
	
	/** Gets switch on the entry aid (if rotary knob) **/
	fun get_esh_ein_mrm() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 17, 1) != 0
	
	/** Sets switch on the entry aid (if rotary knob) **/
	fun set_esh_ein_mrm(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets steering column is locked [0] (only USA) **/
	fun get_ls_st_ver() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 16, 1) != 0
	
	/** Sets steering column is locked [0] (only USA) **/
	fun set_ls_st_ver(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets steering angle sign **/
	fun get_lw_vz_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 28, 1) != 0
	
	/** Sets steering angle sign **/
	fun set_lw_vz_b(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 28, 1, if(p) 1 else 0)
	}
	
	/** Gets Steering angle sensor: not initialized **/
	fun get_lw_ini_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 27, 1) != 0
	
	/** Sets Steering angle sensor: not initialized **/
	fun set_lw_ini_b(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets Steering angle sensor: Code error **/
	fun get_lw_cf_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 26, 1) != 0
	
	/** Sets Steering angle sensor: Code error **/
	fun set_lw_cf_b(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets Steering angle sensor: overflow **/
	fun get_lw_ov_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 25, 1) != 0
	
	/** Sets Steering angle sensor: overflow **/
	fun set_lw_ov_b(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets Steering angle parity bit (even parity) **/
	fun get_lw_pa_b() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 24, 1) != 0
	
	/** Sets Steering angle parity bit (even parity) **/
	fun set_lw_pa_b(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets Steering angle  **/
	fun get_lw_b() : Int = CanBusNative.getECUParameterB(CanBAddrs.MRM_A1, 29, 11)
	
	/** Sets Steering angle  **/
	fun set_lw_b(f: CanFrame, p: Int) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 29, 11, p)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.MRM_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame MRM_A1 (0x0006):
		|	direction flashing left: ${get_bli_li()}
		|	right direction flashing: ${get_bli_re()}
		|	switch on high beam: ${get_fl_ein()}
		|	switch on headlight flasher: ${get_lhp_ein()}
		|	switch on the horn: ${get_sgh_ein_lr()}
		|	Wipe / wash the rear window: ${get_heck_wisch_mrm()}
		|	Intermittent wiping of the rear window: ${get_heck_int_mrm()}
		|	Tip wipe actuated: ${get_tipp_wisch()}
		|	washing actuated: ${get_washing()}
		|	LSS in position I (rain sensor operation): ${get_sch_wi_int()}
		|	LSS in position II (level 1): ${get_sch_wi_1()}
		|	LSS in position III (level 2): ${get_sch_wi_2()}
		|	switch off voice control (abort): ${get_sbs_aus()}
		|	Activate voice control (push to talk): ${get_sbs_ein()}
		|	switch on the entry aid (if rotary knob): ${get_esh_ein_mrm()}
		|	steering column is locked [0] (only USA): ${get_ls_st_ver()}
		|	steering angle sign: ${get_lw_vz_b()}
		|	Steering angle sensor: not initialized: ${get_lw_ini_b()}
		|	Steering angle sensor: Code error: ${get_lw_cf_b()}
		|	Steering angle sensor: overflow: ${get_lw_ov_b()}
		|	Steering angle parity bit (even parity): ${get_lw_pa_b()}
		|	Steering angle : ${get_lw_b()} °
	""".trimMargin("|")
}
