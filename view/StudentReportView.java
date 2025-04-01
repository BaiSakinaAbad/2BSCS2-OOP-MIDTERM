
package view;

import domain.Student;
import domain.Address;
import domain.Parent;
import static extract.StudentReportController.students;

public class StudentReportView {
    public static void displayReport() {
        for(Student student : students) {
            System.out.println("Student id is "+ student.getId());
            System.out.println("Student name is "+ student.getLastName().toUpperCase()+", "+student.getFirstName());
            System.out.println("Studying " + (student.getDegreeCode() != null ? student.getDegreeCode().getDegreeName() : "Unknown Degree"));

            for (Address address : student.getAddresses()) {
                if (address.getAddrType().equals("C")) {
                    System.out.println("City address is " + address.getLocation());
                } else if (address.getAddrType().equals("P")) {
                    System.out.println("Provincial address is " + address.getLocation());
                }
            }

            for (Parent parent : student.getParents()) {
                switch (parent.getParentCode()) {
                    case "M" -> System.out.println("Mother's name is " + parent.getParentName());
                    case "F" -> System.out.println("Father's name is " + parent.getParentName());
                    case "G" -> System.out.println("Guardian's name is " + parent.getParentName());
                }
            }
            System.out.println();
        }
        System.out.println("MIDTERM LAB GROUP 1:\n\tABAD, BAI SAKINA B.\n\tGREGORIO, JOHN EDUARD SANTOS\n\tRODRIGO, JULIA\n\tTOMACRUZ, JOSH");
    }
}