package javazensar.inheritanceoperations;

import javazensar.constructor.Employee;

public class QADepartment extends Employee {
	
	private int qaTeamsize;
	private int qaMemberID;
	private String qaRole;
	private String QATeamlead;
	private static int qaTeamcount;
	
	

	private String qaEmpName;
	
	public QADepartment(int QAEMPID, String QAEMPNAME, String QAROLE)
	{
		this.qaMemberID=QAEMPID;
		this.qaRole=QAROLE;
		this.qaEmpName=QAEMPNAME;
		++qaTeamcount;
	}
	
	public QADepartment(int EMPID, String EMPNAME, double EMPSALARY , int EMPAGE, String EMPDEPART, String EMPWORK,int QAEMPID, String QAEMPNAME, String QAROLE, String TEAMLEAD)
	{
		super(EMPID, EMPNAME, EMPSALARY, EMPAGE, EMPDEPART,  EMPWORK);
		this.qaMemberID=QAEMPID;
		this.qaRole=QAROLE;
		this.qaEmpName=QAEMPNAME;
		this.QATeamlead =TEAMLEAD;
		++qaTeamcount;
	}
	
	@Override
	public String toString() {
		return "QADepartment [qaMemberID=" + qaMemberID + ", qaRole=" + qaRole + ", qaEmpName=" + qaEmpName + "]";
	}

	
	public String getQATeamlead() {
		return QATeamlead;
	}

	public void setQATeamlead(String qATeamlead) {
		QATeamlead = qATeamlead;
	}
	public String getQaEmpName() {
		return qaEmpName;
	}
	public void setQaEmpName(String qaEmpName) {
		this.qaEmpName = qaEmpName;
	}
	public int getQaTeamsize() {
		return qaTeamsize;
	}

	public void setQaTeamsize(int qaTeamsize) {
		this.qaTeamsize = qaTeamsize;
	}

	public int getQaMemberID() {
		return qaMemberID;
	}

	public void setQaMemberID(int qaMemberID) {
		this.qaMemberID = qaMemberID;
	}

	public String getQaRole() {
		return qaRole;
	}

	public void setQaRole(String qaRole) {
		this.qaRole = qaRole;}	
	@Override
	public double calculateSalary(double basesalary, float orgBonus, int qaTeamBonus)
	{
		double empsalary = super.calculateSalary(basesalary, orgBonus);
		System.out.println("QA emp salary without QA Bonus = "+empsalary);
		int qateambonusperqamember = qaTeamBonus/qaTeamcount;
		System.out.println("QA team member bonus per = "+qateambonusperqamember);
		double qaMemberSalaryPer =qateambonusperqamember+empsalary ;
		System.out.println("Per QA Team member salary is with QA bonus "+qaMemberSalaryPer);
		return qaMemberSalaryPer;		
	}
	
	public static int qaTeamCount()
	{
		System.out.println("Total QA Team member Size is "+qaTeamcount);
		return qaTeamcount;
	}
	
	public void getWorkDetail()
	{
		System.out.println("QA are working on Manual, automation and performance");
	}
	
}
