// Leonardo Goulart
// UFRN - IT student
// Java programming language
/*
*	This program serve to create templates Java file with some comments at the top
*	and with the main function already created. 
*/

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter; 
import java.util.ArrayList;

class FileMaker {
	public static void main(String[] args) {
		try 
		{
			// Variable to read inputs from the user
				Scanner scan = new Scanner(System.in);
			// Strings variables
				String path;
				String fileName;
				String line;
			
			//Path where the new file it's going to be
				System.out.println("Enter the path for new file: ");
				path = scan.nextLine();
				System.out.println("Give a name for your file: ");
				fileName = scan.nextLine();
				path = "../" + path + "/" + fileName + ".java"; 
			
			// File creation and verifying if it doesn't exist. If so create a new
				File file = new File(path);
					if (!file.exists()) {
					    file.createNewFile();
					}
				System.out.println("File created");

			// List with the inputs
				ArrayList<String> lista = new ArrayList<String>();

			// This method Returns the absolute form of this abstract pathname. Equivalent to new File
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				
			// Writes text to a character-output stream
				BufferedWriter bw = new BufferedWriter(fw);

			lista.add ("//Leonardo Goulart");
			lista.add ("//UFRN");
			lista.add ("//Java Programming language");
			System.out.println("Name your class:");
			line = scan.nextLine();
			lista.add ("\n");
			lista.add ("class " + line + " {");
			lista.add ("	public static void main (String[] args) {\n");
			lista.add ("	}");
			lista.add ("}");

			// Write the input lines on the new file one by one
				do 
				{
					bw.write(lista.remove(0) + "\n");
				} while (lista.size() != 0);
				bw.close();
				System.out.println("File Created successfully");

		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}