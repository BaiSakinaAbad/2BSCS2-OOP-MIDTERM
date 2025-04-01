package extract;

import domain.Degree;
import domain.Student;
import domain.Address;
import domain.Parent;
import java.io.File;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import static view.StudentReportView.displayReport;

public class StudentReportController {
    public static ArrayList<Student> students = new ArrayList<>();

    public static void processReport() {
        try {
            Scanner studFile = new Scanner(new File("C:\\Users\\Sakina Abad\\IdeaProjects\\OOPnaGalingKayVinz\\src\\Studinfo.csv"));
            while (studFile.hasNextLine()) {
                String rowStudent = studFile.nextLine();
                String[] rowStudentSpecific = rowStudent.split(",");
                Student student = new Student(rowStudentSpecific[0].trim(), rowStudentSpecific[1].trim(), rowStudentSpecific[2].trim());
                Degree degree = new Degree(rowStudentSpecific[3].trim());
                student.setDegreeCode(degree);
                processAddress(student);
                processParent(student);
                students.add(student);

            }

            displayReport();
            studFile.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void processAddress(Student student) {
        try {
            Scanner addressFile = new Scanner(new File("C:\\Users\\Sakina Abad\\IdeaProjects\\OOPnaGalingKayVinz\\src\\AddressInfo.csv"));
            ArrayList<Address> addresses = new ArrayList<>();
            while (addressFile.hasNextLine()) {
                String rowAddress = addressFile.nextLine();
                String[] rowAddressSpecific = rowAddress.split(",");
                if (student.getId().equals(rowAddressSpecific[0].trim())) {
                    Address address = new Address(rowAddressSpecific[0].trim());
                    address.setAddrType(rowAddressSpecific[1].trim());
                    address.setLocation(rowAddressSpecific[2].trim());
                    addresses.add(address);
                }
            }

            addressFile.close();
            student.setAddresses(addresses);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void processParent(Student student) {
        try {
            Scanner parentFile = new Scanner(new File("C:\\Users\\Sakina Abad\\IdeaProjects\\OOPnaGalingKayVinz\\src\\ParentInfo.csv"));
            ArrayList<Parent> parents = new ArrayList<>();
            while (parentFile.hasNextLine()) {
                String rowParent = parentFile.nextLine();
                String[] rowParentSpecific = rowParent.split(",");
                if (student.getId().equals(rowParentSpecific[0].trim())) {
                    Parent parent = new Parent();
                    parent.setParentCode(rowParentSpecific[1].trim());
                    parent.setParentName(rowParentSpecific[2].trim());
                    parents.add(parent);
                }
            }
            parentFile.close();
            student.setParents(parents);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}