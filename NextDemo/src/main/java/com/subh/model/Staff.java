package com.subh.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "staff")
public class Staff 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "staffid")
	private int staff_id;

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	@Transient
	private MultipartFile file;

	@Column(name = "photo")
	private Integer photo;

	@Column(name = "staffpassword")
	private String password;

	@Column(name = "staffname")
	private String name;

	@Column(name = "done_by")
	private Integer doneBy;

	@Column(name = "staff_personal_id")
	private String staffId;

	@Column(name = "branchid")
	private int branchId;

	@Column(name = "stafftype")
	private int typeId;

	@Column(name = "fathername")
	private String fatherName;

	@Transient
	private String dateOfBirth1;

	@Column(name = "dateofbirth") // **********************************************************************************
	private Date dateOfBirth;

	@Transient
	private String dateOfJoining1;
	
	@Transient
	private int deptid;  // departmentId

	@Column(name = "dtofjoin")  
	private Date dateOfJoining;
	
	@Column(name = "passwordchangedate")  
	private Date passwordchangedate;

	@Column(name = "contact")
	private String contactNumber;

	@Column(name = "staffgender")
	private String gender;

	@Column(name = "staffadd_prmnt")
	private String correspondenceAddress;

	@Column(name = "staffadd")
	private String permanentAdress;

//	@Column(name = "staff_mailId")
//	private String mailId;

	@Column(name = "nomineename")
	private String nomineeNname;

	@Column(name = "nomineerelation")
	private String nomineeRelation;

	@Column(name = "referencename_1") // >>>>>>>>>>>>>>>
	private String referenceName1;

	@Column(name = "referancecontact_1")
	private String referanceContactNumber1;

	@Column(name = "referancename_2")
	private String referenceName2;

	@Column(name = "referancecontact_2")
	private String referanceContactNumber2;

	@Column(name = "residencecontect")
	private String residenceContact;

	@Column(name = "staffdivid")
	private int divisionId;

	@Column(name = "stafflive")
	private int stafflive;

	// changing**************************************************************************************

	@Column(name = "referencename")
	private String staffReferredBy;

	@Column(name = "basic")
	private int basicSalary;

	@Column(name = "hra")
	private int hra;

	@Column(name = "cca")
	private int cca;

	@Column(name = "conveyance")
	private int conveyance;

	@Column(name = "bikeconveyance")
	private int bikeConveyance;

	@Column(name = "mobileconveyance")
	private int mobileConveyance;

	@Column(name = "staff_insurence_no")
	private String insurenceNo;

	@Column(name = "pfno")
	private String pfNo;

	@Column(name = "esi_ipno")
	private String esiIpNo;

	@Column(name = "staff_accountno")
	private String accountNo;

	@Column(name = "staff_ifcscode")
	private String ifcsCode;

	@Column(name = "staff_bankname")
	private String bankName;

	@Column(name = "staff_bankbranchname")
	private String bankBranchName;

	@Column(name = "staff_uanno")
	private String uanNo;

	@Column(name = "salary")
	private Integer salary;
	
	
	
	
	
	

	public Date getPasswordchangedate() {
		return passwordchangedate;
	}

	public void setPasswordchangedate(Date passwordchangedate) {
		this.passwordchangedate = passwordchangedate;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public void setPhoto(Integer photo) {
		this.photo = photo;
	}

	public int getPhoto() {
		return photo;
	}

	public void setPhoto(int photo) {
		this.photo = photo;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getDateOfBirth1() {
		return dateOfBirth1;
	}

	public void setDateOfBirth1(String dateOfBirth1) {
		this.dateOfBirth1 = dateOfBirth1;
	}

	public String getDateOfJoining1() {
		return dateOfJoining1;
	}

	public void setDateOfJoining1(String dateOfJoining1) {
		this.dateOfJoining1 = dateOfJoining1;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public Integer getDoneBy() {
		return doneBy;
	}

	public void setDoneBy(Integer doneBy) {
		this.doneBy = doneBy;
	}

	public int getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(int divisionId) {
		this.divisionId = divisionId;
	}

	/*
	 * public String getDivisionName() { return divisionName; }
	 * 
	 * public void setDivisionName(String divisionName) { this.divisionName =
	 * divisionName; }
	 */

	public String getNomineeNname() {
		return nomineeNname;
	}

	public String getStaffReferredBy() {
		return staffReferredBy;
	}

	public void setStaffReferredBy(String staffReferredBy) {
		this.staffReferredBy = staffReferredBy;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getCca() {
		return cca;
	}

	public void setCca(int cca) {
		this.cca = cca;
	}

	public int getConveyance() {
		return conveyance;
	}

	public void setConveyance(int conveyance) {
		this.conveyance = conveyance;
	}

	public int getBikeConveyance() {
		return bikeConveyance;
	}

	public void setBikeConveyance(int bikeConveyance) {
		this.bikeConveyance = bikeConveyance;
	}

	public int getMobileConveyance() {
		return mobileConveyance;
	}

	public void setMobileConveyance(int mobileConveyance) {
		this.mobileConveyance = mobileConveyance;
	}

	public String getInsurenceNo() {
		return insurenceNo;
	}

	public void setInsurenceNo(String insurenceNo) {
		this.insurenceNo = insurenceNo;
	}

	public String getPfNo() {
		return pfNo;
	}

	public void setPfNo(String pfNo) {
		this.pfNo = pfNo;
	}

	public String getEsiIpNo() {
		return esiIpNo;
	}

	public void setEsiIpNo(String esiIpNo) {
		this.esiIpNo = esiIpNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfcsCode() {
		return ifcsCode;
	}

	public void setIfcsCode(String ifcsCode) {
		this.ifcsCode = ifcsCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getUanNo() {
		return uanNo;
	}

	public void setUanNo(String uanNo) {
		this.uanNo = uanNo;
	}

	public void setNomineeNname(String nomineeNname) {
		this.nomineeNname = nomineeNname;
	}

	public String getNomineeRelation() {
		return nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public String getReferenceName1() {
		return referenceName1;
	}

	public void setReferenceName1(String referenceName1) {
		this.referenceName1 = referenceName1;
	}

	public String getReferanceContactNumber1() {
		return referanceContactNumber1;
	}

	public void setReferanceContactNumber1(String referanceContactNumber1) {
		this.referanceContactNumber1 = referanceContactNumber1;
	}

	public String getReferenceName2() {
		return referenceName2;
	}

	public void setReferenceName2(String referenceName2) {
		this.referenceName2 = referenceName2;
	}

	public String getReferanceContactNumber2() {
		return referanceContactNumber2;
	}

	public void setReferanceContactNumber2(String referanceContactNumber2) {
		this.referanceContactNumber2 = referanceContactNumber2;
	}

	public String getResidenceContact() {
		return residenceContact;
	}

	public void setResidenceContact(String residenceContact) {
		this.residenceContact = residenceContact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public String getMailId() {
//		return mailId;
//	}

//	public void setMailId(String mailId) {
//		this.mailId = mailId;
//	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCorrespondenceAddress() {
		return correspondenceAddress;
	}

	public void setCorrespondenceAddress(String correspondenceAddress) {
		this.correspondenceAddress = correspondenceAddress;
	}

	public String getPermanentAdress() {
		return permanentAdress;
	}

	public void setPermanentAdress(String permanentAdress) {
		this.permanentAdress = permanentAdress;
	}

	

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/*
	 * public String getDesignationName() { return designationName; }
	 * 
	 * public void setDesignationName(String designationName) { this.designationName
	 * = designationName; }
	 */

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	/*
	 * public String getBranchName() { return branchName; }
	 * 
	 * public void setBranchName(String branchName) { this.branchName = branchName;
	 * }
	 */

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public int getStafflive() {
		return stafflive;
	}

	public void setStafflive(int stafflive) {
		this.stafflive = stafflive;
	}

	@Override
	public String toString() {
		return "Staff [staff_id=" + staff_id + ", file=" + file + ", photo=" + photo + ", password=" + password
				+ ", name=" + name + ", doneBy=" + doneBy + ", staffId=" + staffId + ", branchId=" + branchId
				+ ", typeId=" + typeId + ", fatherName=" + fatherName + ", dateOfBirth1=" + dateOfBirth1
				+ ", dateOfBirth=" + dateOfBirth + ", dateOfJoining1=" + dateOfJoining1 + ", deptid=" + deptid
				+ ", dateOfJoining=" + dateOfJoining + ", passwordchangedate=" + passwordchangedate + ", contactNumber="
				+ contactNumber + ", gender=" + gender + ", correspondenceAddress=" + correspondenceAddress
				+ ", permanentAdress=" + permanentAdress + ", nomineeNname=" + nomineeNname + ", nomineeRelation="
				+ nomineeRelation + ", referenceName1=" + referenceName1 + ", referanceContactNumber1="
				+ referanceContactNumber1 + ", referenceName2=" + referenceName2 + ", referanceContactNumber2="
				+ referanceContactNumber2 + ", residenceContact=" + residenceContact + ", divisionId=" + divisionId
				+ ", stafflive=" + stafflive + ", staffReferredBy=" + staffReferredBy + ", basicSalary=" + basicSalary
				+ ", hra=" + hra + ", cca=" + cca + ", conveyance=" + conveyance + ", bikeConveyance=" + bikeConveyance
				+ ", mobileConveyance=" + mobileConveyance + ", insurenceNo=" + insurenceNo + ", pfNo=" + pfNo
				+ ", esiIpNo=" + esiIpNo + ", accountNo=" + accountNo + ", ifcsCode=" + ifcsCode + ", bankName="
				+ bankName + ", bankBranchName=" + bankBranchName + ", uanNo=" + uanNo + ", salary=" + salary + "]";
	}
	

}
