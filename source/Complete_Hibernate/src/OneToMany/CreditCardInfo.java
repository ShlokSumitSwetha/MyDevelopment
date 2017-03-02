package OneToMany;



// Generated May 24, 2011 7:06:05 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CreditCardInfo generated by hbm2java
 */
public class CreditCardInfo implements java.io.Serializable {

	private BigDecimal cciCardSeqNbr;
	private SecureDataVault secureDataVault;
	private String cciSecureTokenId;
	private Date cciCardExpDt;
	private String cciCardTypeDesc;
	private String cciPolicyNbr;
	private String cciQuoteNbr;
	private String cciFirstNm;
	private String cciMiddleNm;
	private String cciLastNm;
	private String cciLine1Addr;
	private String cciLine2Addr;
	private String cciCityNm;
	private String cciStCd;
	private String cciZipCd;
	private String cciCardDataStatCd;
	private String cciLastActivityTypCd;
	private Date cciLastAuthDt;
	private Date cciLastSettleDt;
	private Date cciCreatedDt;
	private Date cciModifiedDt;
	private String cciAppId;
	private Set<CreditCardAuth> creditCardAuths = new HashSet<CreditCardAuth>(0);
	private Set<OneshotCcTrans> oneshotCcTranses = new HashSet<OneshotCcTrans>(
			0);

	public CreditCardInfo() {
	}

	public CreditCardInfo(BigDecimal cciCardSeqNbr) {
		this.cciCardSeqNbr = cciCardSeqNbr;
	}

	public CreditCardInfo(BigDecimal cciCardSeqNbr,
			SecureDataVault secureDataVault, String cciSecureTokenId,
			Date cciCardExpDt, String cciCardTypeDesc, String cciPolicyNbr,
			String cciQuoteNbr, String cciFirstNm, String cciMiddleNm,
			String cciLastNm, String cciLine1Addr, String cciLine2Addr,
			String cciCityNm, String cciStCd, String cciZipCd,
			String cciCardDataStatCd, String cciLastActivityTypCd,
			Date cciLastAuthDt, Date cciLastSettleDt, Date cciCreatedDt,
			Date cciModifiedDt, String cciAppId,
			Set<CreditCardAuth> creditCardAuths,
			Set<OneshotCcTrans> oneshotCcTranses) {
		this.cciCardSeqNbr = cciCardSeqNbr;
		this.secureDataVault = secureDataVault;
		this.cciSecureTokenId = cciSecureTokenId;
		this.cciCardExpDt = cciCardExpDt;
		this.cciCardTypeDesc = cciCardTypeDesc;
		this.cciPolicyNbr = cciPolicyNbr;
		this.cciQuoteNbr = cciQuoteNbr;
		this.cciFirstNm = cciFirstNm;
		this.cciMiddleNm = cciMiddleNm;
		this.cciLastNm = cciLastNm;
		this.cciLine1Addr = cciLine1Addr;
		this.cciLine2Addr = cciLine2Addr;
		this.cciCityNm = cciCityNm;
		this.cciStCd = cciStCd;
		this.cciZipCd = cciZipCd;
		this.cciCardDataStatCd = cciCardDataStatCd;
		this.cciLastActivityTypCd = cciLastActivityTypCd;
		this.cciLastAuthDt = cciLastAuthDt;
		this.cciLastSettleDt = cciLastSettleDt;
		this.cciCreatedDt = cciCreatedDt;
		this.cciModifiedDt = cciModifiedDt;
		this.cciAppId = cciAppId;
		this.creditCardAuths = creditCardAuths;
		this.oneshotCcTranses = oneshotCcTranses;
	}

	public BigDecimal getCciCardSeqNbr() {
		return this.cciCardSeqNbr;
	}

	public void setCciCardSeqNbr(BigDecimal cciCardSeqNbr) {
		this.cciCardSeqNbr = cciCardSeqNbr;
	}

	public SecureDataVault getSecureDataVault() {
		return this.secureDataVault;
	}

	public void setSecureDataVault(SecureDataVault secureDataVault) {
		this.secureDataVault = secureDataVault;
	}

	public String getCciSecureTokenId() {
		return this.cciSecureTokenId;
	}

	public void setCciSecureTokenId(String cciSecureTokenId) {
		this.cciSecureTokenId = cciSecureTokenId;
	}

	public Date getCciCardExpDt() {
		return this.cciCardExpDt;
	}

	public void setCciCardExpDt(Date cciCardExpDt) {
		this.cciCardExpDt = cciCardExpDt;
	}

	public String getCciCardTypeDesc() {
		return this.cciCardTypeDesc;
	}

	public void setCciCardTypeDesc(String cciCardTypeDesc) {
		this.cciCardTypeDesc = cciCardTypeDesc;
	}

	public String getCciPolicyNbr() {
		return this.cciPolicyNbr;
	}

	public void setCciPolicyNbr(String cciPolicyNbr) {
		this.cciPolicyNbr = cciPolicyNbr;
	}

	public String getCciQuoteNbr() {
		return this.cciQuoteNbr;
	}

	public void setCciQuoteNbr(String cciQuoteNbr) {
		this.cciQuoteNbr = cciQuoteNbr;
	}

	public String getCciFirstNm() {
		return this.cciFirstNm;
	}

	public void setCciFirstNm(String cciFirstNm) {
		this.cciFirstNm = cciFirstNm;
	}

	public String getCciMiddleNm() {
		return this.cciMiddleNm;
	}

	public void setCciMiddleNm(String cciMiddleNm) {
		this.cciMiddleNm = cciMiddleNm;
	}

	public String getCciLastNm() {
		return this.cciLastNm;
	}

	public void setCciLastNm(String cciLastNm) {
		this.cciLastNm = cciLastNm;
	}

	public String getCciLine1Addr() {
		return this.cciLine1Addr;
	}

	public void setCciLine1Addr(String cciLine1Addr) {
		this.cciLine1Addr = cciLine1Addr;
	}

	public String getCciLine2Addr() {
		return this.cciLine2Addr;
	}

	public void setCciLine2Addr(String cciLine2Addr) {
		this.cciLine2Addr = cciLine2Addr;
	}

	public String getCciCityNm() {
		return this.cciCityNm;
	}

	public void setCciCityNm(String cciCityNm) {
		this.cciCityNm = cciCityNm;
	}

	public String getCciStCd() {
		return this.cciStCd;
	}

	public void setCciStCd(String cciStCd) {
		this.cciStCd = cciStCd;
	}

	public String getCciZipCd() {
		return this.cciZipCd;
	}

	public void setCciZipCd(String cciZipCd) {
		this.cciZipCd = cciZipCd;
	}

	public String getCciCardDataStatCd() {
		return this.cciCardDataStatCd;
	}

	public void setCciCardDataStatCd(String cciCardDataStatCd) {
		this.cciCardDataStatCd = cciCardDataStatCd;
	}

	public String getCciLastActivityTypCd() {
		return this.cciLastActivityTypCd;
	}

	public void setCciLastActivityTypCd(String cciLastActivityTypCd) {
		this.cciLastActivityTypCd = cciLastActivityTypCd;
	}

	public Date getCciLastAuthDt() {
		return this.cciLastAuthDt;
	}

	public void setCciLastAuthDt(Date cciLastAuthDt) {
		this.cciLastAuthDt = cciLastAuthDt;
	}

	public Date getCciLastSettleDt() {
		return this.cciLastSettleDt;
	}

	public void setCciLastSettleDt(Date cciLastSettleDt) {
		this.cciLastSettleDt = cciLastSettleDt;
	}

	public Date getCciCreatedDt() {
		return this.cciCreatedDt;
	}

	public void setCciCreatedDt(Date cciCreatedDt) {
		this.cciCreatedDt = cciCreatedDt;
	}

	public Date getCciModifiedDt() {
		return this.cciModifiedDt;
	}

	public void setCciModifiedDt(Date cciModifiedDt) {
		this.cciModifiedDt = cciModifiedDt;
	}

	public String getCciAppId() {
		return this.cciAppId;
	}

	public void setCciAppId(String cciAppId) {
		this.cciAppId = cciAppId;
	}

	public Set<CreditCardAuth> getCreditCardAuths() {
		return this.creditCardAuths;
	}

	public void setCreditCardAuths(Set<CreditCardAuth> creditCardAuths) {
		this.creditCardAuths = creditCardAuths;
	}

	public Set<OneshotCcTrans> getOneshotCcTranses() {
		return this.oneshotCcTranses;
	}

	public void setOneshotCcTranses(Set<OneshotCcTrans> oneshotCcTranses) {
		this.oneshotCcTranses = oneshotCcTranses;
	}

}