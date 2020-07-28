import java.util.*;

public class MorseCodeTranslator 
{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a text message to turn into morse code: ");
		String textMessage = scanner.nextLine();
		textMessage = textMessage.toLowerCase();
		
		//Turn string into array where each char has a single spot in the array
		char[] stringToCharArray = textMessage.toCharArray();
		
		
		System.out.print("Your message in morse code: ");
		for(int i = 0; i < stringToCharArray.length; i++)
		{
			char charAtIndex = textMessage.charAt(i);
			switch (charAtIndex) 
			{
				case 'a':
					System.out.print(".-");
				    break;
				    
				case 'b':
					System.out.print("-...");
				    break;
				    
				case 'c':
				    System.out.print("-.-.");
				    break;
				    
				case 'd':
				    System.out.print("-..");
				    break;
				    
				case 'e':
				    System.out.print(".");
				    break;
				    
				case 'f':
				    System.out.print("..-.");
				    break;
				    
				case 'g':
				    System.out.print("--.");
				    break;
				    
				case 'h':
					System.out.print("....");
					break;
					
				case 'i':
					System.out.print("..");
					break;
					
				case 'j':
					System.out.print(".---");
					break;
					
				case 'k':
					System.out.print("-.-");
					break;
					
				case 'l':
					System.out.print(".-..");
					break;
					
				case 'm':
					System.out.print("--");
					break;
					
				case 'n':
					System.out.print("-.");
					break;
					
				case 'o':
					System.out.print("---");
					break;
					
				case 'p':
					System.out.print(".--.");
					break;
					
				case 'q':
					System.out.print("--.-");
					break;
					
				case 'r':
					System.out.print(".-.");
					break;
					
				case 's':
					System.out.print("...");
					break;
					
				case 't':
					System.out.print("-");
					break;
					
				case 'u':
					System.out.print("..-");
					break;
					
				case 'v':
					System.out.print("...-");
					break;
					
				case 'w':
					System.out.print(".--");
					break;
					
				case 'x':
					System.out.print("-..-");
					break;
					
				case 'y':
					System.out.print("-.--");
					break;
					
				case 'z':
					System.out.print("--..");
					break;
					
				case ' ':
					System.out.print("  ");
					break;
					
				default:
					System.out.print("ERROR");
					break;
					
			}
			
			System.out.print(" ");
		}
	}
}