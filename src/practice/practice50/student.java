package practice.practice50;

import java.util.List;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentDAO studentDAO = new studentDAO();
		
		List<studentDTO> list = studentDAO.findStudentList();
		
		for(studentDTO s : list) {
			System.out.println(s);
		}
		
		System.out.println("*****************************************");
		
		List<studentDTO> list2 = studentDAO.findStudentListByGrade(3);
		for(studentDTO s : list2) {
			System.out.println(s);
		}
		
		
		
	}

}
