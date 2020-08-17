
@file:Suppress("unused", "FunctionName", "ClassName")
package com.rndash.mbheadunit.nativeCan.canB
import com.rndash.mbheadunit.CanFrame // AUTO GEN
import com.rndash.mbheadunit.nativeCan.CanBusNative // AUTO GEN

/**
 *   Generated by db_converter.py
 *   Object for TVL_A1 (ID 0x028C)
**/

object TVL_A1 {

    /** 
     *  Returns the most recent Can Frame representing the state
     *  of TVL_A1
    **/
    fun get_frame() : CanFrame? = CanBusNative.getBFrame(CanBAddrs.TVL_A1)

	/** Gets seat front left **/
	fun get_svl_vor() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 7, 1) != 0
	
	/** Sets seat front left **/
	fun set_svl_vor(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 7, 1, if(p) 1 else 0)
	}
	
	/** Gets seat front left **/
	fun get_svl_zur() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 6, 1) != 0
	
	/** Sets seat front left **/
	fun set_svl_zur(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 6, 1, if(p) 1 else 0)
	}
	
	/** Gets seat front left **/
	fun get_svl_hi_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 5, 1) != 0
	
	/** Sets seat front left **/
	fun set_svl_hi_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 5, 1, if(p) 1 else 0)
	}
	
	/** Gets seat front left **/
	fun get_svl_hi_ab() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 4, 1) != 0
	
	/** Sets seat front left **/
	fun set_svl_hi_ab(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 4, 1, if(p) 1 else 0)
	}
	
	/** Gets front left seat **/
	fun get_svl_tgl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 0, 1) != 0
	
	/** Sets front left seat **/
	fun set_svl_tgl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 0, 1, if(p) 1 else 0)
	}
	
	/** Gets front left seat **/
	fun get_svl_le_vor() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 13, 1) != 0
	
	/** Sets front left seat **/
	fun set_svl_le_vor(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 13, 1, if(p) 1 else 0)
	}
	
	/** Gets front left seat **/
	fun get_svl_le_zur() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 12, 1) != 0
	
	/** Sets front left seat **/
	fun set_svl_le_zur(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 12, 1, if(p) 1 else 0)
	}
	
	/** Gets seat front left **/
	fun get_svl_vo_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 11, 1) != 0
	
	/** Sets seat front left **/
	fun set_svl_vo_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 11, 1, if(p) 1 else 0)
	}
	
	/** Gets seat front left **/
	fun get_svl_vo_ab() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 10, 1) != 0
	
	/** Sets seat front left **/
	fun set_svl_vo_ab(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 10, 1, if(p) 1 else 0)
	}
	
	/** Gets front left seat **/
	fun get_svl_kst_auf() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 9, 1) != 0
	
	/** Sets front left seat **/
	fun set_svl_kst_auf(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 9, 1, if(p) 1 else 0)
	}
	
	/** Gets front left seat **/
	fun get_svl_kst_ab() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 8, 1) != 0
	
	/** Sets front left seat **/
	fun set_svl_kst_ab(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 8, 1, if(p) 1 else 0)
	}
	
	/** Gets steering column up **/
	fun get_ls_auf_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 19, 1) != 0
	
	/** Sets steering column up **/
	fun set_ls_auf_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 19, 1, if(p) 1 else 0)
	}
	
	/** Gets steering column down **/
	fun get_ls_ab_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 18, 1) != 0
	
	/** Sets steering column down **/
	fun set_ls_ab_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 18, 1, if(p) 1 else 0)
	}
	
	/** Gets steering column forward **/
	fun get_ls_vor_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 17, 1) != 0
	
	/** Sets steering column forward **/
	fun set_ls_vor_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 17, 1, if(p) 1 else 0)
	}
	
	/** Gets steering column to the rear (towards the driver) **/
	fun get_ls_zurueck_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 16, 1) != 0
	
	/** Sets steering column to the rear (towards the driver) **/
	fun set_ls_zurueck_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 16, 1, if(p) 1 else 0)
	}
	
	/** Gets memory front left **/
	fun get_mvl_p1_en() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 31, 1) != 0
	
	/** Sets memory front left **/
	fun set_mvl_p1_en(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 31, 1, if(p) 1 else 0)
	}
	
	/** Gets memory front left **/
	fun get_mvl_p2_en() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 30, 1) != 0
	
	/** Sets memory front left **/
	fun set_mvl_p2_en(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 30, 1, if(p) 1 else 0)
	}
	
	/** Gets memory front left **/
	fun get_mvl_p3_en() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 29, 1) != 0
	
	/** Sets memory front left **/
	fun set_mvl_p3_en(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 29, 1, if(p) 1 else 0)
	}
	
	/** Gets front left memory **/
	fun get_mvl_p1_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 28, 1) != 0
	
	/** Sets front left memory **/
	fun set_mvl_p1_sp(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 28, 1, if(p) 1 else 0)
	}
	
	/** Gets memory front left **/
	fun get_mvl_p2_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 27, 1) != 0
	
	/** Sets memory front left **/
	fun set_mvl_p2_sp(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 27, 1, if(p) 1 else 0)
	}
	
	/** Gets memory front left **/
	fun get_mvl_p3_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 26, 1) != 0
	
	/** Sets memory front left **/
	fun set_mvl_p3_sp(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 26, 1, if(p) 1 else 0)
	}
	
	/** Gets Save right outside mirror parking position **/
	fun get_spi_re_sp() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 25, 1) != 0
	
	/** Sets Save right outside mirror parking position **/
	fun set_spi_re_sp(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 25, 1, if(p) 1 else 0)
	}
	
	/** Gets front left memory **/
	fun get_mvl_tgl() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 24, 1) != 0
	
	/** Sets front left memory **/
	fun set_mvl_tgl(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 24, 1, if(p) 1 else 0)
	}
	
	/** Gets outside mirror right to left (not 203) **/
	fun get_spi_re_n_li() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 39, 1) != 0
	
	/** Sets outside mirror right to left (not 203) **/
	fun set_spi_re_n_li(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 39, 1, if(p) 1 else 0)
	}
	
	/** Gets Outside mirror right to right (not 203) **/
	fun get_spi_re_n_re() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 38, 1) != 0
	
	/** Sets Outside mirror right to right (not 203) **/
	fun set_spi_re_n_re(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 38, 1, if(p) 1 else 0)
	}
	
	/** Gets Outside mirror right up (not 203) **/
	fun get_spi_re_n_ob() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 37, 1) != 0
	
	/** Sets Outside mirror right up (not 203) **/
	fun set_spi_re_n_ob(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 37, 1, if(p) 1 else 0)
	}
	
	/** Gets Outside mirror right down (not 203) **/
	fun get_spi_re_n_un() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 36, 1) != 0
	
	/** Sets Outside mirror right down (not 203) **/
	fun set_spi_re_n_un(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 36, 1, if(p) 1 else 0)
	}
	
	/** Gets Outside mirror right after garage position (not 203) **/
	fun get_spi_re_garage() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 35, 1) != 0
	
	/** Sets Outside mirror right after garage position (not 203) **/
	fun set_spi_re_garage(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 35, 1, if(p) 1 else 0)
	}
	
	/** Gets Outside mirror right after driving position (not 203) **/
	fun get_spi_re_fahren() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 34, 1) != 0
	
	/** Sets Outside mirror right after driving position (not 203) **/
	fun set_spi_re_fahren(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 34, 1, if(p) 1 else 0)
	}
	
	/** Gets Mirror adjustment switch actuated **/
	fun get_spvs_bet_ll() : Boolean = CanBusNative.getECUParameterB(CanBAddrs.TVL_A1, 32, 1) != 0
	
	/** Sets Mirror adjustment switch actuated **/
	fun set_spvs_bet_ll(f: CanFrame, p: Boolean) : CanFrame? {
		checkFrame(f)
		return CanBusNative.setFrameParameter(f, 32, 1, if(p) 1 else 0)
	}
	
	/**
     * Auto generated function
     * Throws exception if user tries to set a value in a frame
     * Not designated from the correct ECU
    **/
    private fun checkFrame(f: CanFrame) {
        if (f.canID != CanBAddrs.TVL_A1.addr) {
            throw IllegalArgumentException("CAN ID does not match object!")
        }
    }

	override fun toString() = """
		|Frame TVL_A1 (0x028C):
		|	seat front left: ${get_svl_vor()}
		|	seat front left: ${get_svl_zur()}
		|	seat front left: ${get_svl_hi_auf()}
		|	seat front left: ${get_svl_hi_ab()}
		|	front left seat: ${get_svl_tgl()}
		|	front left seat: ${get_svl_le_vor()}
		|	front left seat: ${get_svl_le_zur()}
		|	seat front left: ${get_svl_vo_auf()}
		|	seat front left: ${get_svl_vo_ab()}
		|	front left seat: ${get_svl_kst_auf()}
		|	front left seat: ${get_svl_kst_ab()}
		|	steering column up: ${get_ls_auf_ll()}
		|	steering column down: ${get_ls_ab_ll()}
		|	steering column forward: ${get_ls_vor_ll()}
		|	steering column to the rear (towards the driver): ${get_ls_zurueck_ll()}
		|	memory front left: ${get_mvl_p1_en()}
		|	memory front left: ${get_mvl_p2_en()}
		|	memory front left: ${get_mvl_p3_en()}
		|	front left memory: ${get_mvl_p1_sp()}
		|	memory front left: ${get_mvl_p2_sp()}
		|	memory front left: ${get_mvl_p3_sp()}
		|	Save right outside mirror parking position: ${get_spi_re_sp()}
		|	front left memory: ${get_mvl_tgl()}
		|	outside mirror right to left (not 203): ${get_spi_re_n_li()}
		|	Outside mirror right to right (not 203): ${get_spi_re_n_re()}
		|	Outside mirror right up (not 203): ${get_spi_re_n_ob()}
		|	Outside mirror right down (not 203): ${get_spi_re_n_un()}
		|	Outside mirror right after garage position (not 203): ${get_spi_re_garage()}
		|	Outside mirror right after driving position (not 203): ${get_spi_re_fahren()}
		|	Mirror adjustment switch actuated: ${get_spvs_bet_ll()}
	""".trimMargin("|")
}
