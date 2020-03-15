package edu.cvtc.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CourseGradesDemo {

  public static void main(String[] args) {
    DecimalFormat decimalFormart = new DecimalFormat("0.0");

    String missingQuestions = "Enter the number of questions missed:";

    // Create objects for the grades
    GradedActivity gradedActivity = getGradedActivityGrade();
    PassFailExam passFailExam = getPassFailExamGrade(missingQuestions);
    Essay essay = getEssayGrade();
    FinalExam finalExam = getFinalExamGrade(missingQuestions);

    // Create course grades object
    CourseGrades grades = new CourseGrades();
    grades.setGradedActivity(gradedActivity);
    grades.setPassFailExam(passFailExam);
    grades.setEssay(essay);
    grades.setFinalExam(finalExam);

    System.out.println(grades.toString());

    System.out.println("\nAverage Score: " + decimalFormart.format(grades.getAverage()) + "\n\n" + "Highest Score: "
        + decimalFormart.format(grades.getHighest().getScore()) + "\n\n" + "Lowest Score: "
        + decimalFormart.format(grades.getLowest().getScore()));
  }

  public static GradedActivity getGradedActivityGrade() {

    GradedActivity gradedActivity = new GradedActivity();
    gradedActivity.setScore(validateUserInput("Enter score for lab activity: (0-100)", 0, 100));
    return gradedActivity;
  }

  public static PassFailExam getPassFailExamGrade(String missingQuestions) {

    System.out.println("Pass Fail Exam Score:\n20 questions total:");
    int questions = 20;
    int miss = validateUserInput(missingQuestions, 0, questions);
    double minimumPassingScore = 70;
    return new PassFailExam(minimumPassingScore, questions, miss);
  }

  public static Essay getEssayGrade() {
    System.out.println("Essay Score:");
    double grammar = validateUserInput("Enter Grammar points: (0-15)", 0, 15);
    double spelling = validateUserInput("Enter Spelling points: (0-15)", 0, 15);
    double correctLength = validateUserInput("Enter Length points: (0-20)", 0, 20);
    double content = validateUserInput("Enter Content points: (0-50)", 0, 50);
    return new Essay(grammar, spelling, correctLength, content);
  }

  public static FinalExam getFinalExamGrade(String missingQuestions) {
    System.out.println("Final Exam Score:\n50 questions total:");
    int questions = 50;
    int miss = validateUserInput(missingQuestions, 0, questions);
    return new FinalExam(questions, miss);
  }

  public static int getIntInput(String userInput) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println(userInput);
    return keyboard.nextInt();
  }

  // Check is user input is between the minimun and maximum values
  public static int validateUserInput(String userInput, int minValue, int maxValue) {
    int value = getIntInput(userInput);
    while (value > maxValue || value < minValue) {
      System.out.println("Invalid Value! Please, try again!");
      value = getIntInput(userInput);
    }
    return value;
  }
}
