package edu.cvtc.java;

public class FinalExam extends GradedActivity {
  private int numberOfQuestions;
  private double pointsEach;
  private int numberOfMissed;

  public FinalExam(int numberOfQuestions, int numberOfMissed) {
    double numericScore;

    this.numberOfQuestions = numberOfQuestions;
    this.numberOfMissed = numberOfMissed;

    pointsEach = 100.0 / numberOfQuestions;
    numericScore = 100.0 - (numberOfMissed * pointsEach);

    setScore(numericScore);
  }

  public int getNumberOfQuestions() {
    return numberOfQuestions;
  }

  public double getPointsEach() {
    return pointsEach;
  }

  public int getNumberOfMissed() {
    return numberOfMissed;
  }

}
