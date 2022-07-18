Java Programming Fundamentals - Assessment


It's time to see how much you learned about Java and Object-Oriented Programming.
Part 1: Understanding the StudentGen project
Download the source code and import the project using IntelliJ Idea or any other IDE you prefer.
Understand the project structure:
Packages
Classes
Functionality
Run and test the project to get a deeper understanding of how it works (remember the persistence mindset!).
Part 2: Implementing the Student and StudentService missing features
Open the Student class (src/com/generation/model/Student.java) and implement the following methods:
public void enrollToCourse( Course course )
{
//TODO implement this method
}

public boolean isAttendingCourse( String courseCode )
{
//TODO implement this method
return false;
}
Open the StudentService class (src/com/generation/service/StudentService.java) and implement the following methods:
public void showSummary()
{
//TODO implement
}
Hint: To show the summary use System.out.println() to print out to the console.

Part 3: Implementing the missing main method features
Test the program to verify it works as expected:
Create a new student.
Enroll the student to a few courses.
Show the students and courses summary and verify that data is correct.
Part 4: Handling exceptions
Register a new user providing a wrong date format.
Modify the createStudentMenu so that it handles correctly the exception when a wrong date format is inserted by the user.
Catch the exception and show a proper message to the user.
Part 5: Writing Unit Tests
Write 2 Unit tests for the class StudentService
Write 2 Unit tests for the class CourseService
Challenge Yourself
Implement a way to store grades for each course a student is taking. There should be a way to update/set the score. Afterwards, fill in the public List<Course> findPassedCourses( Course course ) method in Student.java
Implement an additional feature in the menu options that will display the average grade of all the students suscribed to a given course.