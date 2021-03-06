package OneToMany;



// Generated May 24, 2011 7:06:05 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BatchFile generated by hbm2java
 */
public class BatchFile implements java.io.Serializable {

	private BigDecimal bafFileSeqNbr;
	private String bafFileNm;
	private String bafFileTypCd;
	private Date bafFileDt;
	private Set<OneshotTransRev> oneshotTransRevsForBafReturnFileSeqNbr = new HashSet<OneshotTransRev>(
			0);
	private Set<OneshotCcTrans> oneshotCcTransesForBafReturnFileSeqNbr = new HashSet<OneshotCcTrans>(
			0);
	private Set<OneshotTransRev> oneshotTransRevsForBafSettleFileSeqNbr = new HashSet<OneshotTransRev>(
			0);
	private Set<OneshotCcTrans> oneshotCcTransesForBafSettleFileSeqNbr = new HashSet<OneshotCcTrans>(
			0);

	public BatchFile() {
	}

	public BatchFile(BigDecimal bafFileSeqNbr) {
		this.bafFileSeqNbr = bafFileSeqNbr;
	}

	public BatchFile(BigDecimal bafFileSeqNbr, String bafFileNm,
			String bafFileTypCd, Date bafFileDt,
			Set<OneshotTransRev> oneshotTransRevsForBafReturnFileSeqNbr,
			Set<OneshotCcTrans> oneshotCcTransesForBafReturnFileSeqNbr,
			Set<OneshotTransRev> oneshotTransRevsForBafSettleFileSeqNbr,
			Set<OneshotCcTrans> oneshotCcTransesForBafSettleFileSeqNbr) {
		this.bafFileSeqNbr = bafFileSeqNbr;
		this.bafFileNm = bafFileNm;
		this.bafFileTypCd = bafFileTypCd;
		this.bafFileDt = bafFileDt;
		this.oneshotTransRevsForBafReturnFileSeqNbr = oneshotTransRevsForBafReturnFileSeqNbr;
		this.oneshotCcTransesForBafReturnFileSeqNbr = oneshotCcTransesForBafReturnFileSeqNbr;
		this.oneshotTransRevsForBafSettleFileSeqNbr = oneshotTransRevsForBafSettleFileSeqNbr;
		this.oneshotCcTransesForBafSettleFileSeqNbr = oneshotCcTransesForBafSettleFileSeqNbr;
	}

	public BigDecimal getBafFileSeqNbr() {
		return this.bafFileSeqNbr;
	}

	public void setBafFileSeqNbr(BigDecimal bafFileSeqNbr) {
		this.bafFileSeqNbr = bafFileSeqNbr;
	}

	public String getBafFileNm() {
		return this.bafFileNm;
	}

	public void setBafFileNm(String bafFileNm) {
		this.bafFileNm = bafFileNm;
	}

	public String getBafFileTypCd() {
		return this.bafFileTypCd;
	}

	public void setBafFileTypCd(String bafFileTypCd) {
		this.bafFileTypCd = bafFileTypCd;
	}

	public Date getBafFileDt() {
		return this.bafFileDt;
	}

	public void setBafFileDt(Date bafFileDt) {
		this.bafFileDt = bafFileDt;
	}

	public Set<OneshotTransRev> getOneshotTransRevsForBafReturnFileSeqNbr() {
		return this.oneshotTransRevsForBafReturnFileSeqNbr;
	}

	public void setOneshotTransRevsForBafReturnFileSeqNbr(
			Set<OneshotTransRev> oneshotTransRevsForBafReturnFileSeqNbr) {
		this.oneshotTransRevsForBafReturnFileSeqNbr = oneshotTransRevsForBafReturnFileSeqNbr;
	}

	public Set<OneshotCcTrans> getOneshotCcTransesForBafReturnFileSeqNbr() {
		return this.oneshotCcTransesForBafReturnFileSeqNbr;
	}

	public void setOneshotCcTransesForBafReturnFileSeqNbr(
			Set<OneshotCcTrans> oneshotCcTransesForBafReturnFileSeqNbr) {
		this.oneshotCcTransesForBafReturnFileSeqNbr = oneshotCcTransesForBafReturnFileSeqNbr;
	}

	public Set<OneshotTransRev> getOneshotTransRevsForBafSettleFileSeqNbr() {
		return this.oneshotTransRevsForBafSettleFileSeqNbr;
	}

	public void setOneshotTransRevsForBafSettleFileSeqNbr(
			Set<OneshotTransRev> oneshotTransRevsForBafSettleFileSeqNbr) {
		this.oneshotTransRevsForBafSettleFileSeqNbr = oneshotTransRevsForBafSettleFileSeqNbr;
	}

	public Set<OneshotCcTrans> getOneshotCcTransesForBafSettleFileSeqNbr() {
		return this.oneshotCcTransesForBafSettleFileSeqNbr;
	}

	public void setOneshotCcTransesForBafSettleFileSeqNbr(
			Set<OneshotCcTrans> oneshotCcTransesForBafSettleFileSeqNbr) {
		this.oneshotCcTransesForBafSettleFileSeqNbr = oneshotCcTransesForBafSettleFileSeqNbr;
	}

}
