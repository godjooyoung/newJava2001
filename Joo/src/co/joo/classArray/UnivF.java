package co.joo.classArray;

public class UnivF extends Friends {
public String major;
UnivF(String name, String tel, String major) {
	super.name = name;
	super.tel = tel;
	this.major = major;
}
@Override
public String toString() {
	System.out.println("친구들>>  이름:" + name + ",  연락처:" + tel + ",  전공:" + major);
	return null;
	
}


}
