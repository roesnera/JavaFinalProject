
<img align="right" width="150" height="150" src="https://media-exp1.licdn.com/dms/image/C4E0BAQF7BYCCZt5epw/company-logo_200_200/0?e=2159024400&v=beta&t=qUAFP9bUgBEEXGVQYpUXW1J_OiP8e0r4rFBpqp8OrxA">

# Java Programming Fundamentals	- Assessment

 <br/>
 <br/>
 It's time to see how much you learned about Java and Object-Oriented Programming.
 
 ## Part 1: Understanding the StudentGen project
 1. Download the source code and import the project using IntelliJ Idea or any other IDE you prefer.
 2. Understand the project structure:
 * Packages
 * Classes
 * Functionality
 3. Run and test the project to get a deeper understanding of how it works (remember the persistence mindset!).
 4. You will be working on the <strong>StudentService</strong> class, the <strong>Student</strong> class, the <strong>PrinterHelper</strong> class, and the <strong>Main</strong> class.
 
  ## Part 2: Implementing the Student and StudentService missing features
  1. Open the *Student* class (`src/com/generation/model/Student.java`) and implement the following methods:
  
   ```java
    public void enrollToCourse( Course course )
    {
        //TODO implement this method
    }

    public boolean isAttendingCourse( String courseCode )
    {
        //TODO implement this method
        return false;
    }
   ```
   
   2. Open the *StudentService* class (`src/com/generation/service/StudentService.java`) and implement the following methods:
   
   ```java

       public void showSummary()
       {
           //TODO implement
       }
   ```
   
   Hint: To show the summary use `System.out.println()` to print out to the console.

  ## Part 3: Trying out your new functionality in the main method
 
 
 1. Test the program to verify it works as expected:
  * Create a new student.
  * Enroll the student to a few courses.
  * Show the students and courses summary and verify that data is correct.
  

  ## Part 4: Handling exceptions
  1. Register a new user providing a wrong date format.
  2. Modify the createStudentMenu method of the PrinterHelper class so that it handles correctly the exception when a wrong date format is inserted by the user.
  3. Catch the exception and show a proper message to the user.
  
 ## Challenge Yourself
 1. Write 2 Unit tests for the class *StudentService*
 2. Write 2 Unit tests for the class *CourseService*
 3. Remember that this will involve setting up your testing environment! (Refer to instructions shared in the student slack channel if you need them)