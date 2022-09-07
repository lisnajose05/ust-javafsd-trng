package gene.ust;
class Te_st<T>{
	T obj;
	Te_st(T obj){
		this.obj=obj;
	}
		public T getObject() {
			return this.obj;
		}
	}
	

public class Generic_Classes {
	public static void main(String args[]) {
		Te_st<Integer>iObj=new Te_st<Integer>(15);
		System.out.println(iObj.getObject());
		Te_st<String>sObj=new Te_st<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		//iObj=sObj;
	}

}
