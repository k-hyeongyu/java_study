package db.v3;

import java.time.LocalDateTime;
import java.util.List;

import db.v2.Dept;

public class DBMain {

	public static void main(String[] args) {
// TODO Auto-generated method stub

		DeptDAO deptDAO = new DeptDAO();

		ProductDAO productDAO = new ProductDAO();

		Dept d = deptDAO.findDeptByDeptno(30);
		System.out.println(d);

		List<Dept> dList = deptDAO.findDeptList();
		for (Dept dp : dList) {
			System.out.println(dp);
		}

		List<ProductDTO> pList = productDAO.findProductList();
		for (ProductDTO pd : pList) {

			System.out.println("수정이 잘 됐나보다~");
		}

		ProfessorDAO professorDAO = new ProfessorDAO();

		Professor p = professorDAO.findProfessorByProfno(2002);
		if (p != null)
			System.out.println(p);

		// p.getHiredate().getDayOfMonth();
		// p.getHirdate().getDate();
		// p.getHirdate().getYear();

		/*
		 * Professor saveP = new Professor(9091, "name", "id", "position", 111,
		 * LocalDateTime.now(), 100, 50, "email", "hpage");
		 */
		Professor saveP = new Professor(9991, "name", "id", "position", 111, "2025-06-01", 100, 50, "email", "hpage");

		int rs5 = professorDAO.saveProfessor(saveP);
		if (rs5 > 0) {
			System.out.println("saveP 잘 저장됐다~~~");
		}

	}

}