package edu.cvtc.java;

import java.text.DecimalFormat;

public class CourseGrades implements Analyzable {

  public final int NUMBER_OF_GRADES = 4;
  private GradedActivity[] grades;

  public CourseGrades() {
    grades = new GradedActivity[NUMBER_OF_GRADES];
  }

  public void setGradedActivity(GradedActivity gradedActivity) {
    grades[0] = gradedActivity;
  }

  public void setPassFailExam(PassFailExam passFailExam) {
    grades[1] = passFailExam;
  }

  public void setEssay(Essay essay) {
    grades[2] = essay;
  }

  public void setFinalExam(FinalExam finalExam) {
    grades[3] = finalExam;
  }

  public String toString() {
    DecimalFormat decimalFormart = new DecimalFormat("0.0");
    return "\n\n************************************\n\nLab Score: " + decimalFormart.format(grades[0].getScore())
        + "\n" + "    Grade: " + grades[0].getGrade() + "\n\n" + "Pass/Fail Exam Score: "
        + decimalFormart.format(grades[1].getScore()) + "\n" + "    Grade: " + grades[1].getGrade() + "\n\n"
        + "Essay Score: " + decimalFormart.format(grades[2].getScore()) + "\n" + "    Grade: " + grades[2].getGrade()
        + "\n\n" + "Final Exam Score: " + decimalFormart.format(grades[3].getScore()) + "\n" + "    Grade: "
        + grades[3].getGrade();
  }

  // Get the average number from array
  @Override
  public double getAverage() {
    double total = 0.0;
    for (int i = 0; i < grades.length; i++) {
      total += grades[i].getScore();
    }

    return total / grades.length;
  }

  // Get the hightest number from array
  @Override
  public GradedActivity getHighest() {
    GradedActivity highest = grades[0];

    for (int i = 1; i < grades.length; i++) {
      if (grades[i].getScore() > highest.getScore()) {
        highest = grades[i];
      }
    }
    return highest;
  }

  // Get the lowest number from array
  @Override
  public GradedActivity getLowest() {
    GradedActivity lowest = grades[0];

    for (int i = 1; i < grades.length; i++) {
      if (grades[i].getScore() < lowest.getScore()) {
        lowest = grades[i];
      }
    }
    return lowest;
  }
}