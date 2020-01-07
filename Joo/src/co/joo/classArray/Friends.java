package co.joo.classArray;

public class Friends {
public String name;
public String tel;
public String memo;

Friends(){
	
}
Friends(String name, String tel,String memo){
	//생성자
	this.name =name ;
	this.memo =memo;
	this.tel = tel;
}

@Override
public String toString() {
	System.out.println("친구들>>  이름:" + name + ",  연락처:" + tel + ",  기록사항:" + memo);
	return null; 

}


}
