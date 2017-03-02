package Model;

import java.util.HashSet;
import java.util.Set;



public class SecureDataVault {
	
	
	private int _vaultSeqNumber; //: INTEGER NOT NULL
	private String _keyID; //: VARCHAR2(20) NULL
	private String _appID; //: VARCHAR2(5) NULL
	private String _secureDataTxt; //: VARCHAR2(100) NULL
	private String _secureTokenID; //: VARCHAR2(16) NULL
	private java.util.Date _createdDate; //: DATE NULL
	private String _createdUserID; //: VARCHAR2(20) NULL
	private java.util.Date _purgeDate; //: DATE NULL
	CreditCardInfo creditCardInfo;
	private  Set<CreditCardInfo> creditcardinfo= new HashSet<CreditCardInfo>();
	
	
	public SecureDataVault(
			int vaultSeqNumber,
			String keyID,
			String appID,
			String secureDataTxt,
			String secureTokenID,
			java.util.Date createdDate,
			String createdUserID,
			java.util.Date purgeDate) {
		
			this._vaultSeqNumber=vaultSeqNumber;
			this._keyID=keyID;
			this._appID=appID;
			this._secureDataTxt=secureDataTxt;
			this._secureTokenID=secureTokenID;
			this._createdDate=createdDate;
			this._createdUserID=createdUserID;
			this._purgeDate=purgeDate;

	}
	public SecureDataVault(){
		
	}
	
	public int getVaultSeqNumber() {
		return this._vaultSeqNumber;
	}


	public void setVaultSeqNumber(int vaultSeqNumber) {
		this._vaultSeqNumber = vaultSeqNumber;
	}


	public String getKeyID() {
		return this._keyID;
	}


	public void setKeyID(String keyID) {
		this._keyID = keyID;
	}


	public String getAppID() {
		return this._appID;
	}


	public void setAppID(String appID) {
		this._appID = appID;
	}

	
	public String getSecureDataTxt() {
		return this._secureDataTxt;
	}


	public void setSecureDataTxt(String secureDataTxt) {
		this._secureDataTxt = secureDataTxt;
	}


	public String getSecureTokenID() {
		return this._secureTokenID;
	}


	public void setSecureTokenID(String secureTokenID) {
		this._secureTokenID = secureTokenID;
	}


	public java.util.Date getCreatedDate() {
		return this._createdDate;
	}


	public void setCreatedDate(java.util.Date createdDate) {
		this._createdDate = createdDate;
	}


	public String getCreatedUserID() {
		return this._createdUserID;
	}


	public void setCreatedUserID(String createdUserID) {
		this._createdUserID = createdUserID;
	}


	public java.util.Date getPurgeDate() {
		return this._purgeDate;
	}


	public void setPurgeDate(java.util.Date purgeDate) {
		this._purgeDate = purgeDate;
	}
	public CreditCardInfo getCreditCardInfo() {
		return creditCardInfo;
	}
	public void setCreditCardInfo(CreditCardInfo creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}
	
	public void setCreditcardInfo(Set<CreditCardInfo> creditcardInfo) {
		this.creditcardinfo = creditcardInfo;
	}
	public Set<CreditCardInfo> getCreditcardinfo() {
		return creditcardinfo;
	}
	public void setCreditcardinfo(Set<CreditCardInfo> creditcardinfo) {
		this.creditcardinfo = creditcardinfo;
	}
}
