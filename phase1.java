import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class filesCheck{
	
	public void welcome() {
		
		System.out.println("***********************************Welcome to checkFiles.com***************************");
		System.out.println("*********************************Designed by : -Shweta Kadgi-****************************");
		primaryMenu();
		
	}
	public void primaryMenu() {
		int flag = 0;
		while(true) {
			System.out.println("Enter your choice from the following menu : - \n1.List all the files from the main directory\n2. Add or delete a file\n3. Exit the application\n");
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			
			switch(input) {
			
			case 1:
				// List all the files from the main directory 
				File folder = new File("F:\\Java FSD Course by Simplilearn Self Study\\Organized Monthwise\\October\\First phase gradable project\\main");
				File array []= folder.listFiles();
				
				// printing the files in the ascending order
				
				for (int i=0; i<array.length;i++) {
					System.out.println(array[i]);
					
				}
				break;
			
			case 2:
				// Add or delete a file 
				secondaryMenu();
				break;
				
			case 3:
				// Exit the application 
				System.out.println("Thank you so much for using the application!");
				flag = 1;
				break;
				
			default:
				System.out.println("You entered a wrong choice! Please enter a valid choice!");
				
			}
			if (flag ==1) {
				break;
			
			}
		
		}
		
	}
	public void secondaryMenu() {
		
		int flag=0;
		
		while(true) {
			
			System.out.println("1.Add a file \n2.Delete a specific file or folder  \n3.Show the respective files starting with a name \n4.Return to the previous menu\n");
			System.out.println("Enter your choice:\n");
			
			Scanner ob = new Scanner(System.in);
			int choice = ob.nextInt();
			
			switch(choice) {
			
			case 1:
				// Add a file in the folder 
				System.out.println("Enter the file name:");
				Scanner scan = new Scanner(System.in);
				String name = scan.nextLine();
				
				
				File folder = new File("F:\\Java FSD Course by Simplilearn Self Study\\Organized Monthwise\\October\\First phase gradable project\\main\\"+name);
				try {
					folder.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("File is created successfully at location:"+ folder.getAbsolutePath());
				break;
			case 2:
				System.out.println("Enter the file name:");
				Scanner scan1 = new Scanner(System.in);
				String name1 = scan1.nextLine();
				
				File obj = new File("F:\\Java FSD Course by Simplilearn Self Study\\Organized Monthwise\\October\\First phase gradable project\\main\\"+name1);
				obj.delete();
				System.out.println("The file is been deleted successfully!");
				
				break;
			case 3: 
				// Take input from the user and display all the files starting with that name 
				System.out.println("Enter the file name:");
				Scanner scan2 = new Scanner(System.in);
				String name2 = scan2.nextLine();
				
				File obj1 = new File("F:\\Java FSD Course by Simplilearn Self Study\\Organized Monthwise\\October\\First phase gradable project\\main");
				//obj1.mkdir();
				
				File array []= obj1.listFiles();
				
				for (int i=0; i< array.length; i++) {
					
					if(array[i].getName().startsWith(name2)) {
						
						System.out.println(array[i]);
						
						
					}
				}
				break;
				
			case 4:
				//Return to previous menu 
				primaryMenu();
				flag = 1;
				break;
				
			case 5:
				// Terminate the program 
				
				break;
				
			default:
				System.out.println("Enter a valid choice!");
				
			}
			if (flag ==1) {
				
				break;
			}
			
		}
		
	}
	/*
	public void viewFiles() {
		
	}
	public void searchFiles() {
		
	}
	public void addFile() {
		
	}
	public void delteFile() {
		
	}*/
}
public class phase1 {

	public static void main(String[] args) {
		File folder = new File("F:\\Java FSD Course by Simplilearn Self Study\\Organized Monthwise\\October\\First phase gradable project\\main");
		
		if(folder.exists()) {
			System.out.println("The main folder exists, no need to create it!\n");
		}
		else {
			folder.mkdirs();
		}
		
		filesCheck obj = new filesCheck();
		obj.welcome();
		
		
	}
	
}
