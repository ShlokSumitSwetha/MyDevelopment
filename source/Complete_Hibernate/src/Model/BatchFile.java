package Model;

public class BatchFile {
	
	private int _eventSeqNumber; //--NUMBER(20) NOT NULL
	private String _fileName; // --VARCHAR2(50) NULL
	private String _fileType; // --VARCHAR2(10) NULL
	private java.util.Date _fileDate; // --Date NULL
	
	public BatchFile(
			int fileSeqNumber,
			String fileName,
			String fileType,
			java.sql.Date fileDate) {
		
			this._eventSeqNumber=fileSeqNumber;
			this._fileName=fileName;
			this._fileType=fileType;
			this._fileDate=fileDate;
		}
	public BatchFile(){
		
	}

	public int getEventSeqNumber() {
		return this._eventSeqNumber;
	}

	public void setEventSeqNumber(int fileSeqNumber) {
		this._eventSeqNumber = fileSeqNumber;
	}

	public String getFileName() {
		return this._fileName;
	}

	public void setFileName(String fileName) {
		this._fileName = fileName;
	}

	public String getFileType() {
		return this._fileType;
	}

	public void setFileType(String fileType) {
		this._fileType = fileType;
	}

	public java.util.Date getFileDate() {
		return this._fileDate;
	}

	public void setFileDate(java.util.Date fileDate) {
		this._fileDate = fileDate;
	}
}
