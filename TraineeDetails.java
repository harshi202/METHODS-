class TraineeDetails{
	static String names[] ={"null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null","null",};
	
	static void printall(){
		for(int index=0;index<names.length;index++){
		System.out.print(names[index]+"\t");
		}
		System.out.println();
	}	
	static void updatename(int oldname, String newname){
				names[oldname]= newname;
			}
		
}