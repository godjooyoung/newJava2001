package co.joo.classArray;

public class ComF extends Friends{
	public String dept;
ComF(String name, String tel, String dept) {
	super.name = name;
	super.tel = tel;
	super.memo = dept;
}
	@Override
	public String toString() {
		System.out.println("친구들>>  이름:" + name + ",  연락처:" + tel + ",  부서:" + memo);
		return null;
}
}
