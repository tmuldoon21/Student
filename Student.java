
public class Student 
{
	private String name;
	private int gradeLevel;
	private int phoneNum;
	private int gradeYear;
	
	public Student(String n, int gl, int pn, int gy)
	{
		name = n;
		gradeLevel = gl;
		phoneNum = pn;
		gradeYear = gy;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGradeLevel()
	{
		return gradeLevel;
	}
	
	public int getPhoneNum()
	{
		return phoneNum;
	}
	
	public int getGradeYear()
	{
		return gradeYear;
	}
	
	
	public void setPhoneNum(int pn)
	{
		phoneNum = pn;
	}
	
	public void nextGradeYear()
	{
		gradeYear++;
	}
}
