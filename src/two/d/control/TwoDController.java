package two.d.control;

import two.d.model.MarshmallowMonster;
import two.d.view.ConsoleView;

/**
 * 
 * @author David Schilling
 * @version 1.0.3
 * 
 */
public class TwoDController
{
	/* ********* DECLARATION SECTION *********** */
	/**
	 * This is a two-dimensional array of integers.
	 */
	private int[][] intArray = new int[9][9];
	/**
	 * This is an array of Strings.
	 */
	private String[] nameArray = new String[16];
	/**
	 * This is an array of marshy mallowey monsters. Yum!
	 */
	private MarshmallowMonster[][] monsterArray = new MarshmallowMonster[6][4];

	/* ********** GETTERS AND SETTERS *********** */
	public int[][] getIntArray()
	{
		return intArray;
	}

	public void setIntArray(int[][] intArray)
	{
		this.intArray = intArray;
	}

	public String[] getNameArray()
	{
		return nameArray;
	}

	public void setNameArray(String[] nameArray)
	{
		this.nameArray = nameArray;
	}
	
	public MarshmallowMonster[][] getMonsterArray()
	{
		return monsterArray;
	}
	
	public void setMonsterArray(MarshmallowMonster[][] monsterArray)
	{
		this.monsterArray = monsterArray;
	}

	/* ************ START ************ */
	/**
	 * This is where the magic happens, if this wasn't called, nothing would
	 * happen.
	 */
	public void start()
	{
		ConsoleView view = new ConsoleView();

		fillTheIntArray();
		fillTheNameArray();
		fillTheMonsterArray();

		view.printIntInformation(intArray);
		view.printNameInformation(nameArray);
		view.printMonsterInformation(monsterArray);
	}

	/* ********* PRIVATE METHODS *********** */
	/**
	 * This fills the array of integers.
	 */
	private void fillTheIntArray()
	{
		intArray[0][0] = 1;
		for (int row = 1; row < intArray.length; row++)
			{
				for (int col = 1; col < intArray[0].length; col++)
					{
						intArray[row][col] = 1;
						intArray[row][col] = (row * col);
					}
			}
	}

	/**
	 * This fills the array of Strings with posh English names.
	 */
	private void fillTheNameArray()
	{
		nameArray[0] = "Edmond";
		nameArray[1] = "Ralph";
		nameArray[2] = "Alfred";
		nameArray[3] = "Lewis";
		nameArray[4] = "Johnathan";

		nameArray[5] = "Nathaniel";
		nameArray[6] = "Elliot";
		nameArray[7] = "George";
		nameArray[8] = "Colin";
		nameArray[9] = "Layne";

		nameArray[10] = "Charlotte";
		nameArray[11] = "Cole";
		nameArray[12] = "Emerson";
		nameArray[13] = "Grayson";
		nameArray[14] = "Oliver";

		nameArray[15] = "Owen";
	}
	

	/**
	 * This fills the array with marshmallow creatures.
	 */
	private void fillTheMonsterArray()
	{
		for(int row = 0; row < monsterArray.length; row++)
			{
				for (int col = 0; col < monsterArray[0].length; col++)
					{
						monsterArray[row][col] = new MarshmallowMonster();
					}
			}
	}
}
