package bbbb;
//over_loading
public class Project_Team {
	private void Project_Team111(String LEADER_NAME) {

    System.out.println("PROJECT_TEAM_LEADER_NAME:"+LEADER_NAME);
    }	
	private void Project_Team22(String MEMBER) {
	System.out.println("PROJECT_TEAM_TOTAL_MEMBER:"+MEMBER);
    }
	private void Project_Team11(String CO_LEADER_NAME) {
	System.out.println("PROJECT_TEAM_CO_LEADER_NAME:"+CO_LEADER_NAME);
    }
	private void Project_Team(String COMPANY_NAME) {
	System.out.println("COMPANY_NAME:"+COMPANY_NAME);
    }

	private void Project_Team1(String PROJECT_NAME) {
	System.out.println("PROJECT_TEAM_CURRENT_PROJECT_NAME:"+ PROJECT_NAME);
    }
	private void Project_Team2(String total_project) {
	System.out.println("TOTAL_PROJECT_COMPLETED:"+total_project);
	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Project_Team a =new Project_Team();
    a.Project_Team111("//RAVI//");
    a.Project_Team22("//12//");
    a.Project_Team11("//ROHINI//");
    a.Project_Team("//TCL//");
    a.Project_Team1("//INSTRAGRAM//");
    a.Project_Team2("//43//");
	}
	

}
