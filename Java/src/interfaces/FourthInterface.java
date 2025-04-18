package interfaces;

public interface FourthInterface extends ThirdInterface
{
	default void test() //this method is not its own method but overridden method of 'ThirdInterface'
	{
		System.out.println("FouthInterface test");
		ThirdInterface.super.display();
	}
	void show();
}

