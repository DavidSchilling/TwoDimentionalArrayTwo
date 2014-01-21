package two.d.model;


public class MarshmallowMonster
{
	//Declaration Section!
	
	private String name;
	private int eyeNum;
	private int legNum;
	private int armNum;
	private boolean haveButton;
	
	
	//Setters!
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeNum(int eyeNum)
	{
		this.eyeNum = eyeNum;
	}
	
	public void setLegNum(int legNum)
	{
		this.legNum = legNum;
	}
	
	public void setArmNum(int armNum)
	{
		this.armNum = armNum;
	}
	
	public void setHaveButton(boolean haveButton)
	{
		this.haveButton = haveButton;
	}
	
	
	//Getters!
	public String getName()
	{
		return name;
	}
	
	public int getEyeNum()
	{
		return eyeNum;
	}
	
	public int getLegNum()
	{
		return legNum;
	}
	
	public int getArmNum()
	{
		return armNum;
	}
	
	public boolean getHaveButton()
	{
		return haveButton;
	}
	
	
	//Default Constructor
	public MarshmallowMonster()
	{
		name = "George";
		eyeNum = 2;
		legNum = 2;
		armNum = 2;
		haveButton = false;
	}
	
	//Overload Constructor
	/**
	 * Parameters for our lovely Marshy friend.
	 * @param name : The name of a Marshy fiend.
	 * @param eyeNum : The number of eyes that the creature has.
	 * @param legNum : The number of legs the creature has.
	 * @param armNum : The number of arms the creature has.
	 * @param haveButton : Whether or not the creature has a button.
	 */
	public MarshmallowMonster(String name, int eyeNum, int legNum, int armNum, boolean haveButton)
	{
		this.name = name;
		this.eyeNum = eyeNum;
		this.legNum = legNum;
		this.armNum = armNum;
		this.haveButton = haveButton;
	}
}
