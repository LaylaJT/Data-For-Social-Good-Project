import java.util.Scanner;

public class UserStory {

  private String[] universities;
  private String[] sports;
  private int[] divisions;

  public UserStory(String universitiesFile, String sportsFile, String dividionsFile) {
     universities = FileReader.toStringArray(universitiesFile);
     sports = FileReader.toStringArray(sportsFile);
     divisions = FileReader.toIntArray(dividionsFile);
  }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  
public String selectSchool() {
  Scanner userInput = new Scanner(System.in);
System.out.println("Which school would you like to look into? Type full name of university: ");
  String university = userInput.nextLine();
  userInput.close();
  return "Next \n";
}

  public String selectSport() {
  Scanner userInput = new Scanner(System.in);
System.out.println("Which sport would you like to look into?");
  String sport = userInput.nextLine();
  userInput.close();
  return "Searching...";

}

   public void findDivision(String universities, String sports) {
   for (int i = 0; i < universities.length; i++) {
     for (universities[i].equals(university) && sports[i].equals(divisions)) {
          System.out.println("Division: " + divisions[i]);
        
            }
        }
     return "This data could not be found. Try another school." ;
     return selectSchool;
   }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  public String toString() {
     return "University: " + university + ", Sport: " + sport + ", Division: " + division;
 }

  
}