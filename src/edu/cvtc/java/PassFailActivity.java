package edu.cvtc.java;

public class PassFailActivity extends GradedActivity {
  private double minimumPassingScore;

  public PassFailActivity() {
    minimumPassingScore = 70.0;
  }

  public PassFailActivity(double minimumPassingScore) {
    this.minimumPassingScore = minimumPassingScore;
  }

  @Override
  public char getGrade() {
    char letterGrade;

    if (super.getScore() >= minimumPassingScore) {
      letterGrade = 'P';
    } else {
      letterGrade = 'F';
    }
    return letterGrade;
  }

}
