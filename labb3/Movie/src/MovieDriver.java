import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		{
			// TODO Auto-generated method stub
			String choice;
			Scanner Scan= new Scanner(System.in);
			
			do
			{


				System.out.println("Enter the name of a Movie ");
				String movie=Scan.nextLine();

				System.out.println("Enter the rating of the Movie ");
				String rating=Scan.nextLine();

				System.out.println("Enter the number of tickets sold for this Movie  ");
				int sold=Scan.nextInt();

				System.out.println(movie+" ( "+rating +" ) "+"Tickets sold :  "+sold+"\n");


				System.out.println("Do you wannt to enter another ? ( Y/N ) \n");
				choice=Scan.next();
			} while (choice.equalsIgnoreCase("y"));
		}
		System.out.println("Goodbye");
	}

}