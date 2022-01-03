class Studentnames{
	static String names[]={"harshith","santosh","shankar","ullas","akashay","hemanth","umesh","mahesh","ram","raj"};
	
	static void printall(){
		for (int index=0;index<names.length;index++){
			System.out.print(names[index]+"\t");
		}
		System.out.println();
	}
	
	static void updatename(String oldname, String newname){
		for (int index =0; index<names.length;index++){
			if (oldname.equals(names[index])){
				names[index]= newname;
				
			}
		}
    }
}