package two.d.control;

/**
 * 
 * @author David Schilling
 * @version 1.0.0
 * 
 */
public class TwoDRunner
{

	/**
	 * @param args
	 *            An unused parameter.
	 */
	public static void main(String[] args)
	{
		TwoDController myController = new TwoDController();
		myController.start();

		System.out.print(args);
	}

}
