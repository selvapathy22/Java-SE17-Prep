/*
University Staff Management
Create a base class Staff with name and role. Derive TeachingStaff and NonTeachingStaff
with overridden workDetails() methods.
Sample Output:
Teaching Staff: Dr. Raj - Subject: Physics
Non-Teaching Staff: Mr. Kumar - Department: Administration
 */

package day7;

class Staff {
	String name,role;
	Staff(String name,String role) {
		this.name=name;
		this.role=role;
	}
	public void workDetails() {
		
	}
}

class TeachingStaff extends Staff {
	TeachingStaff(String name,String role) {
		super(name,role);
	}
	@Override
	public void workDetails() {
		System.out.println("Teaching Staff: "+name+" - Subject: "+role);
	}
}

class NonTeachingStaff extends Staff {
	NonTeachingStaff(String name,String role) {
		super(name,role);
	}
	@Override
	public void workDetails() {
		System.out.println("Non-Teaching Staff: "+name+" - Department: "+role);
	}
}

public class OOPS9 {
	public static void main(String[] args) {
		TeachingStaff ts=new TeachingStaff("Dr. Raj","Physics");
		NonTeachingStaff nts=new NonTeachingStaff("Mr. Kumar","Administration");
		ts.workDetails();
		nts.workDetails();
	}
}
