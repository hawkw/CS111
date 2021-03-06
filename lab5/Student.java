//**************************************************************
// Student.java
// Author: Hawk Weisman    Based on: Student.java by Dr. Cupper
// Course: CS111: Introduction to Computer Science I
// Fall Semester 2012-2013
// Laboratory #5
//
// Defines a Student class to represent an individual student
// with a name, student id, major, two lab scores, and two test
// scores.
//*************************************************************

public class Student
{
    // declare instance variables
    private String name;                    // the student's name
    private int studentID;                  // the student's ID number
    private String  major;                  // the student's major
    private double lab1, lab2;              // the student's two lab scores
    private double exam1, exam2;            // the student's two exam scores

    //------------------------------
    // constructor
    //------------------------------
    public Student (String name, int studentID, String major)
    {
	this.name = name;
	this.studentID = studentID;
	this.major = major;
    }

    //--------------------------------------------------
    // getName: accessor for the name instance variable
    //--------------------------------------------------
    public String getName()
    {
	return name;
    }
 
    //--------------------------------------------------
    // getMajor: accesor for the major instance variable
    //--------------------------------------------------
    public String getMajor()
    {
	return major;
    }

    //--------------------------------------------------
    // getStudentID: accessor for the studentID instance
    // variable
    //--------------------------------------------------
    public int getStudentID()
    {
	return studentID;
    }

    //-------------------------------------------------
    // getLab1: accessor for the lab1 instance variable
    //-------------------------------------------------
    public double getLab1()
    {
	return lab1;
    }

    //-------------------------------------------------
    // getLab2: accessor for the lab2 instance variable
    //-------------------------------------------------
    public double getLab2()
    {
	return lab2;
    }

    //-------------------------------------------------
    // getExam1: accessor for the  exam1 instance variable
    //-------------------------------------------------
    public double getExam1()
    {
	return exam1;
    }

    //-------------------------------------------------
    // getExam2: accessor for the  exam1 instance variable
    //-------------------------------------------------
    public double getExam2()
    {
	return exam2;
    }

    //-------------------------------------------------
    // setName: mutator for the name instance variable
    //-------------------------------------------------
    public void setName(String name)
    {
	this.name = name;
    }

    //-------------------------------------------------
    // setMajor: mutator for the major instance variable
    //-------------------------------------------------
    public void setMajor(String major)
    {
	this.major =  major;
    }

    //-------------------------------------------------
    // setName: mutator for the studentID instance variable
    //-------------------------------------------------
    public void setStudentID(int studentID)
    {
	this.studentID = studentID;
    }

    //-------------------------------------------------
    // setLab1: mutator for the lab1 instance variable
    //-------------------------------------------------
    public void setLab1(double lab1)
    {
	this.lab1 = lab1;
    }

    //-------------------------------------------------
    // setLab2: mutator for the lab2 instance variable
    //-------------------------------------------------
    public void setLab2(double lab2)
    {
	this.lab2 = lab2;
    }

    //-------------------------------------------------
    // setExam1: mutator for the exam1 instance variable
    //-------------------------------------------------
    public void setExam1(double exam1)
    {
	this.exam1 = exam1;
    }

    //-------------------------------------------------
    // setExam2: mutator for the exam2 instance variable
    //-------------------------------------------------
    public void setExam2(double exam2)
    {
	this.exam2 = exam2;
    }



    // action methods
    //-------------------------------------------------
    // labAverage: calculates average of lab scores
    // labs 30 points each - averages to a per cent
    //-------------------------------------------------

    public double labAverage()
    {
	return (lab1 + lab2) / 2;
    }

    //-------------------------------------------------
    // examAverage: calculates average of lab scores
    // exams 100 points each - averages to a per cent
    //-------------------------------------------------
    
    public double examAverage()
    {
	return (exam1 + exam2) / 2;
    }

    //--------------------------------------------------
    // average: computes the average grade for
    // the student
    //--------------------------------------------------

    public double average()
    {
	return examAverage()*0.4+labAverage()*0.6;
    }

    //---------------------------------------------------
    // toString: returns the status of the object as a 
    // String
    //---------------------------------------------------

    public String toString()
    {
	return  name + "\t" +  studentID + "\t" + major + "\t" + lab1 + "\t" + lab2 + "\t" + exam1 + "\t" + exam2;
    }
}