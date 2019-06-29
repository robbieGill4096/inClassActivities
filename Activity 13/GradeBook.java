import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Lesson 13: Activity - GradeBook
 *
 * @author CS121 Instructors
 * @version [Summer 2019]
 * @author [Robbie Gill]
 */
public class GradeBook {
	
	private String firstName; 
	private String lastName;
	private int id;
	private int grade;
	public static void main(String[] args) {
		
		
		/* TODO: 1. Create a new ArrayList of Student objects called gradebook. */
		ArrayList<Student> gradebook = new ArrayList<Student>();
		
		/* TODO: 2. Create a new File object for gradebook.csv and 
		 * a new Scanner object to parse it. Catch any required 
		 * exceptions and display a useful message to the user.
		 */
		File file = new File("gradebook.csv");
			if(file.exists() && file.isFile()) {
				try {
					Scanner fileScanner = new Scanner(file);
					System.out.println("And thats how I met your Mother.");
					
					while(fileScanner.hasNext())
					{
						
						String line = fileScanner.nextLine();
						//System.out.println(line);
						// Iterate through every line of the fileScanner toBeToked = new Scanner(file);
						Scanner toBeToked = new Scanner(line);
					
						toBeToked.useDelimiter(",");
						
						ArrayList<String> studentData  = new ArrayList<String>();
						studentData.add(toBeToked.next());
						
						
						while (toBeToked.hasNextLine()) {
							
						
						studentData.add(toBeToked.next());
						//System.out.print(studentData);
						if (studentData.size() > 3) {
							
							String lastName = studentData.get(0);
							String firstName = studentData.get(1);
							String stringid = studentData.get(2);
							
							int id = Integer.parseInt(stringid);
							
							String stringGrade = studentData.get(3);
							
							int grade = Integer.parseInt(stringGrade);
							
							Student student = new Student(lastName,firstName,id);
							student.setGrade(grade);
							student.setGrade(grade);
							gradebook.add(student);
							}
						}
					if(fileScanner.hasNext() == false) {
						for(Student x:gradebook) {
							System.out.println(x);
						}
					}
					
						}
				}
			
				 catch (FileNotFoundException e) {
					
					e.printStackTrace();
				}
				
			}
			/* TODO: 3. Use a while loop and the Scanner created above to iterate 
			 * through the lines in the gradebook.csv file.
			 */


				/* TODO: 4. For each line (student record), use a second 
				 * Scanner object to tokenize the line using a comma (',')
				 * as the delimiter, extract values for lastName, firstName,
				 * id and grade and store them to local variables.
			 	 */


			 	/* TODO: 5. Create a new Student object using the local variables
			 	 * create above, set the student's grade, and finally add the 
			 	 * new Student object to the gradebook ArrayList. 
				 */

		
		
		/* TODO: 6. Use a foreach loop to print out contents of the gradebook */
		
		

	}

	private static void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}

}
