abstract class Game
{
	public void play()
	{
		openApplication();
		startGame();
		playGame();
		stopGame();
		closeApplication();
	}
	public void openApplication()
	{
		System.out.println("Start the application of game!");
	}
	public void startGame()
	{
		System.out.println("Start the game!");
	}
	abstract public void playGame();

	public void stopGame()
	{
		System.out.println("Stop the game !");
	}
	public void closeApplication()
		{
			System.out.println("close the application of game!");
	}
}
