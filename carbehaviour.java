class carbehaviour {
	public static void main (String []args){
		luxuryseating  ();
		luxuryseating ("print");
		luxuryseating (1, "print");
		luxuryseating("print",1);
		listiningmusic();
		listiningmusic("print");
		listiningmusic(1,"print");
		listiningmusic("print",1);
		havingfood ();
	    havingfood ("print");
		havingfood (1,"print");
		havingfood ("print",1);
		drivingcar ();
		drivingcar ("print");
		drivingcar (1,"print");
		drivingcar ("print",1);
		
	}
	
	static void luxuryseating (){
		System.out.println("printing method overload luxury seating car");
	}
	static void luxuryseating (String speed){
	System.out.println("print method overload single parameter()");	
	}
	static void luxuryseating (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void luxuryseating ( String speed1,int speed){
		System.out.println("printing method overload for sequance of parameter");
	}
	
	
	
	
	static void listiningmusic (){
		System.out.println("printing method overload listining music");
	}
	static void listiningmusic (String speed){
		System.out.println("print method overload single parameter");
	}
	static void listiningmusic (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void listiningmusic (String speed1,int speed ){
		System.out.println("printing method overload for sequance of parameter");
	}
	
	
	
	static void havingfood (){
		System.out.println("printing method overload having food");
	}
	static void havingfood (String speed){
		
		System.out.println ("print method overload single parameter");					
	}	
	
	static void havingfood (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void havingfood (  String speed1,int speed ){
		
		System.out.println("printing method overload for sequance of parameter");
	}
	
	
	
	
	static void drivingcar (){
		System.out.println("printing method overload driving car");
	}
	static void drivingcar (String speed){
		System.out.println("print method overload single parameter");	
	}
	static void drivingcar (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void drivingcar (  String speed1,int speed ){
		System.out.println("printing method overload for sequance of parameter");
		
	}
	
	
	
	
	
	
	
	
	
}