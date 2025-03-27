package TeacherExample;

/*import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TeacherRepositoryTest {
	@Autowired
	private TeacherRepository teacherrep;
	Scanner sc=new Scanner(System.in);
	public void insertdetails() {
		try {
		/*System.out.println("enter the teacher id");
		int id=sc.nextInt();
		sc.nextLine();*/

		/*System.out.println("enter the teacher name");
		String name=sc.nextLine();
		System.out.println("enter the teacher email");
		String email=sc.nextLine();
        System.out.println("enter the teacher mobile number");
        String mobile=sc.nextLine();
        System.out.println("enter the teacher Designation");
        String designation=sc.nextLine();
        Teacher teacher=Teacher.builder()
        		//.teacherid(id)
        		.name(name)
        		.email(email)
        		.mobile(mobile)
        		.Designation(designation)
        		.build();
         teacherrep.save(teacher);
       System.out.println(teacher.getId()+"th teacher details is inserted");
	}
	catch(Exception e) {
		System.out.println(e.toString());
	}
		finally {
			System.out.println("enter correct  details");
		}
		
	}
       
	/*public void getdetailsbyemail() {
		List<Teacher>teacherlist=teacherrep.getbyemail("siri@gmail.com");
		System.out.println("Teacherlist="+teacherlist);
	}*/

	/*public void getAllDetails() {
		List<Teacher>teacherlist=teacherrep.getdetails();
		System.out.printf("%-5s,%-10s,%-15s,%-10s,%-25s\n","teacherid","techername","teacheremail","teachermobile","teacherdesignation");
		System.out.println("-------------------------------------------------------------------------------------------------------");
		for(Teacher teacher:teacherlist)
			System.out.printf("%-5s,%-10s,%-15s,%-10s,%-25s\n",teacher.getId(),teacher.getName(),teacher.getEmail(),
					teacher.getMobile(),teacher.getDesignation());
	}
	public void  updatedetailsbyteacher() {
		System.out.println("enter email");
		String email=sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		int k=teacherrep.updatedetails( name, email);
		if(k==1) {
			System.out.println("update successfull");
			}else {
				System.out.println("student details are not updated");
			}
		}
	public void deletedetailsbyteacher() {
		System.out.println("enter the name to delete");
		String name=sc.nextLine();
		int k=teacherrep.deletedetails( name );
		if(k==1) {
			System.out.println("delete successfully");
		}else {
			System.out.println("not deleted");
		}
	}

}*/