import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class moreFUN
	{
		static String userPhrase;
		static int digits = 0;
		static int vowels = 0;
		static int con = 0;
		static int i = 0;
		public static void main(String[] args)
			{
				greeting();
				input();
				stats();
				Mullen();

			}
		
		public static void greeting()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, What is your name?");
				String name = userInput.nextLine();
				int randomNumber=(int)(Math.random()*3);
				String[]complimants= {" you look great!"," that is an awesome name!"," you sound very happy today!"};
				System.out.println(name + complimants[randomNumber]);
			}

		public static void input()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please type a complete sentence with at least 5 words and no punctuation.");
				userPhrase = userInput.nextLine();
			}
		public static void stats()
		{
			int sum = 0;
			for(int i=0; i < userPhrase.length(); i++)
				{
					switch(userPhrase.substring(i,i+1))
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
							digits = digits + 1;
							break;
						}
			}	
					switch(userPhrase.substring(i,i+1))
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
									con = con - 1;
									break;
								}
						default:
								{
									con = con + 1;
								}
					}
						}
		if (sum == 1)
			{
				System.out.println("There is " + sum + " vowel in your sentence.");
				System.out.println("There are " + con + " consinents in your sentence.");
		
			}
		else
				System.out.println("There are " + sum + " vowels in your sentence.");
				System.out.println("There are " + con + " consinents in your sentence.");
			}
			{
		for (int i = 0; i<userPhrase.length();i++)
			{
				digits = digits + 1;
				switch(userPhrase.substring(i,i+1))
				{
					case " ":
							{
								vowels = vowels - 1;
							}
							default:
									{
										vowels = vowels + 1;
									}
									for (int j = 0; j<userPhrase.length();j++)
										{
											digits = digits + 1;
											switch(userPhrase.substring(j,j+1))
											{
												case " ":
														{
															vowels = vowels - 1;
														}
														default:
																{
																	vowels = vowels + 1;
																}
				}
			}
			}
			}
			}
			public static void Mullen()
			{
				String s = "Mullen High School";
				for(int i = 0; i < s.length(); i++)
					{
						System.out.println(s.substring(0,i+1));
					}
							}
	}