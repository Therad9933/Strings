import java.util.Scanner;

public class introToStrings
	{

		public static void main(String[] args)
			{
				//insideVoice();
				//verticalLetters();
				vowelsCounting();
			}
		public static void insideVoice()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Shout at me!!");
			String userChoice = userInput.nextLine();
			
			
				{
			String userType = userChoice.toLowerCase();
			System.out.println("You should have said, " + userType.substring(0,1).toUpperCase() + userType.substring(1));
				}
				}

	
	
		public static void verticalLetters()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Type any word.");
			String userChoice = userInput.nextLine();
			for(int i=0; i < userChoice.length(); i++)
				{
					System.out.println(userChoice.substring(i,i+1));
				}
		}
		public static void vowelsCounting()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Type any sentence.");
				String userChoice=userInput.nextLine();
				String[] Letters = {"a","e","i","o","u"};
				int sum = 0;
				for(int i=0; i < userChoice.length(); i++)
					{
						switch(userChoice.substring(i,i+1))
				{
					case "a":
					case "A":
					case "e":
					case "E":
					case "i":
					case "I":
					case "o":
					case "O":
					case "u":
					case "U":
							{
								sum = sum + 1;
								break;
							}
				}			
				}
			if (sum == 1)
			{
					System.out.println("There is " + sum + " vowel in your sentence.");
			
				}
			else
					System.out.println("There are " + sum + " vowels in your sentence.");
				}
				}
