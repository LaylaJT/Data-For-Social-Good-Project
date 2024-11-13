import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

  UserStory userStory = new UserStory("universities.txt", "sports.txt", "divisions.txt");

    
    String userSchool = userStory.selectSchool();
    System.out.println(userSchool);

    String userSport = userStory.selectSport();
    System.out.println(userSport);

    userStory.findDivision(userSchool, userSport);
  }
}