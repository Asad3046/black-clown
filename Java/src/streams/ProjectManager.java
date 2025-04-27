package streams;

public class ProjectManager extends Employee
{
	String projectName;
	int teamSize;
	
	public ProjectManager()
	{
		
	}

	public ProjectManager(String projectName, int teamSize)
	{
		this.projectName = projectName;
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "ProjectManager [projectName=" + projectName + ", teamSize=" + teamSize + "]";
	}
	
}
