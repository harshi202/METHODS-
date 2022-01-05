class Rockets{
	
	public static void main (String []args){
		payload  ();
		payload ("print");
		payload (1, "print");
		payload ("print",1);
		propulsion ();
		propulsion ("print");
		propulsion (1,"print");
		propulsion ("print",1);
		structure ();
	    structure ("print");
    	structure (1,"print");
		structure ("print",1);
		guidance ();
		guidance ("print");
		guidance (1,"print");
		guidance ("print",1);
		
	}
	
	static void payload (){
		System.out.println("printing method overload luxury seating car");
	}
	static void payload (String speed){
	System.out.println("print method overload single parameter()");	
	}
	static void payload (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void payload ( String speed1,int speed){
		System.out.println("printing method overload for sequance of parameter");
	}
	
	
	
	
	static void propulsion (){
		System.out.println("printing method overload listining music");
	}
	static void propulsion (String speed){
		System.out.println("print method overload single parameter");
	}
	static void propulsion (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void propulsion (String speed1,int speed ){
		System.out.println("printing method overload for sequance of parameter");
	}
	
	
	
	static void structure (){
		System.out.println("printing method overload having food");
	}
	static void structure (String speed){
		
		System.out.println ("print method overload single parameter");					
	}	
	
	static void structure (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void  structure (  String speed1,int speed ){
		
		System.out.println("printing method overload for sequance of parameter");
	}
	
	
	
	
	static void guidance (){
		System.out.println("printing method overload driving car");
	}
	static void guidance (String speed){
		System.out.println("print method overload single parameter");	
	}
	static void guidance (int speed, String speed1){
		System.out.println("printing method overload for 2 parameter()");
	}
	static void guidance (  String speed1,int speed ){
		System.out.println("printing method overload for sequance of parameter");
		
	}
	
	
	
	
	
	
	
	
	
}
}