package model;

import java.util.List;
import java.util.Objects;

public class Student extends Person {

     public long studentId;
     public int totalCredits;
     public List<Course> enrolledCourses;

     public Student ( long studentId, String firstName, String lastName, int totalCredits, List<Course> enrolledCourses){
          super(firstName, lastName);
          this.studentId = studentId;
          this.totalCredits = totalCredits;
          this.enrolledCourses = enrolledCourses;
     }

     public long getStudentId() {
          return studentId;
     }

     public void setStudentId(long studentId) {
          this.studentId = studentId;
     }

     public int getTotalCredits() {
          return totalCredits;
     }

     public void setTotalCredits(int totalCredits) {
          this.totalCredits = totalCredits;
     }

     public List<Course> getenrolledCourses() {
          return enrolledCourses;
     }

     public void setenrolledCourses(List<Course> enrolledCourses) {
          this.enrolledCourses = enrolledCourses;
     }

     @Override
     public String toString() {
          return "Student{" +
                  "firstName='" + firstName + '\'' +
                  ", lastName='" + lastName + '\'' +
                  ", studentId=" + studentId +
                  ", totalCredits=" + totalCredits +
                  ", enrolledCourses=" + enrolledCourses +
                  '}';
     }

     @Override
     public int hashCode() {
          return Objects.hash(super.hashCode(), totalCredits, enrolledCourses);
     }
}
