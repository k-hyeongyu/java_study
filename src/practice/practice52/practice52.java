package practice.practice52;

import java.util.List;

public class practice52 {

	public static void main(String[] args) {

		
		StudentScoreDAO ssDAO = new StudentScoreDAO();
		
		List<StudentScoreDTO> ssList = ssDAO.findStudentScoreListByDeptno(201);
		
		for(StudentScoreDTO ss : ssList) {
			System.out.println(ss);
		}
		
	}

}
