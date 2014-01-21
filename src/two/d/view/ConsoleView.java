package two.d.view;

import two.d.model.MarshmallowMonster;

/**
 * 
 * @author David Schilling
 * @version 1.0.2
 */
public class ConsoleView
{
	/**
	 * This outputs the information in the integer array to the console.
	 * 
	 * @param currentArray
	 *            the array that is printed.
	 */
	public void printIntInformation(int[][] currentArray)
	{
		for (int[] currentRow : currentArray)
			{
				System.out.print("[");
				for (int currentNumber : currentRow)
					{
						System.out.print(currentNumber + ", ");
					}
				System.out.println("]");
			}
	}

	/**
	 * This outputs the information in the name array to the console.
	 * 
	 * @param currentArray
	 *            the array that is printed.
	 */
	public void printNameInformation(String[] currentArray)
	{
		System.out.print("\n");
		for (String currentName : currentArray)
			{
				System.out.println(currentName);
			}

	}

	public void printMonsterInformation(MarshmallowMonster[][] currentArray)
	{
		System.out.print("\n");
		for (MarshmallowMonster[] currentRow : currentArray)
			{
				System.out.print("[");
				for (MarshmallowMonster currentMonster : currentRow)
					{
						System.out.print(currentMonster.getName() + ", "
								+ currentMonster.getArmNum() + ", " + currentMonster.getLegNum()
								+ ", " + currentMonster.getEyeNum() + ", "
								+ currentMonster.getHaveButton() + "\t");
					}
				System.out.println("]");
			}
	}

}
