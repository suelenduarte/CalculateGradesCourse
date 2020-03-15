package edu.cvtc.java;

public class Essay extends GradedActivity {
  private double grammar;
  private double spelling;
  private double correctLength;
  private double content;
  private double overallGrade;

  public void setScore(double grammar, double spelling, double correctLength, double content) {
    setGrammar(grammar);
    setSpelling(spelling);
    setCorrectLength(correctLength);
    setContent(content);

  }

  public Essay(double grammar, double spelling, double correctLength, double content) {
    setGrammar(grammar);
    setSpelling(spelling);
    setCorrectLength(correctLength);
    setContent(content);
    setOverallGrade();
    setScore(getOverallGrade());
  }

  public double getScore() {
    return super.getScore();
  }

  public double getGrammar() {
    return grammar;
  }

  public void setGrammar(double grammar) {
    this.grammar = grammar;
  }

  public double getSpelling() {
    return spelling;
  }

  public void setSpelling(double spelling) {

    this.spelling = spelling;
  }

  public double getCorrectLength() {
    return correctLength;
  }

  public void setCorrectLength(double length) {
    this.correctLength = length;
  }

  public double getContent() {
    return content;
  }

  public void setContent(double content) {
    this.content = content;
  }

  public double getOverallGrade() {
    return overallGrade;
  }

  // calculates the overall grade for the class
  // by adding all of the grades
  public void setOverallGrade() {
    double grades = grammar + spelling + correctLength + content;
    this.overallGrade = grades;
  }
}