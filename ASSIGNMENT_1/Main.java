import java.util.*; 
class Bike{
	int modelNumber, enginePower, tireSize, updater=1;
     static int expectedVisitor = 30;
	String enginetype, type, speciality, name;
	public Bike(String type){
		if(type.equals("sports")){
		this.name = "Sports Bike";
	    expectedVisitor += 20;
		Scanner sc = new Scanner(System.in);
		this.enginetype = "Oil";
		System.out.println("Input Model Number: ");
		this.modelNumber = sc.nextInt();
		System.out.println("Input Engine Power: ");
		this.enginePower = sc.nextInt();
		System.out.println("Input Tier Size: ");
		this.tireSize = sc.nextInt();
		this.speciality = "turbo";
		}
		else if(type.equals("heavy")){
		this.name = "Heavy Bike";
        Scanner sc = new Scanner(System.in);
		this.enginetype = "diesel";
		System.out.println("Input Model Number: ");
		this.modelNumber = sc.nextInt();
		System.out.println("Input Engine Power: ");
		this.enginePower = sc.nextInt();
		System.out.println("Input Tier Size: ");
		this.tireSize = sc.nextInt();
		this.speciality = "weight";	
		}
		else if(type.equals("normal")){
		this.name = "Normal Bike";
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Engine type: ");
		while(updater <=10){
		this.enginetype = sc.nextLine();
		if(this.enginetype.equals("oil") || this.enginetype.equals("gas") || this.enginetype.equals("diesel"))
			break;
		else System.out.println("Add correct Engine type");
		}
		System.out.println("Input Model Number: ");
		this.modelNumber = sc.nextInt();
		System.out.println("Input Engine Power: ");
		this.enginePower = sc.nextInt();
		System.out.println("Input Tier Size: ");
		this.tireSize = sc.nextInt();
		}
	}

}

class Main{
	    static int k =0;
		String enginetype, type;
		int i, modelNumber, modelNumber1, enginePower, tireSize;
		static ArrayList<Bike> bikes = new ArrayList<Bike>();
		Scanner sc = new Scanner(System.in);
		void addBike(){
			type = sc.nextLine();
		    Bike obj = new Bike(type);
			bikes.add(obj);
		}
		void removeBike(int modelNumber1){
			for(i=0;i<bikes.size();i++){
					if(bikes.get(i).modelNumber == modelNumber1){
						if(bikes.get(i).name.equals("Sports Bike")){
							Bike.expectedVisitor -= 20;
					}
						 bikes.remove(i);	
					}
				}
		}
		 void showVehicleWithVisitors(){
			for(i=0;i<bikes.size();i++){
					System.out.println(bikes.get(i).name);
				}
				if(i>=1) 
				 System.out.println("Total number of visitors present: " + Integer.toString(Bike.expectedVisitor));
				else 
				 System.out.println("There is no vehicle left for showcase or the showroom is closed");
		}
		void showVehicleDetails(){
			for(i=0;i<bikes.size();i++){
					System.out.print("Name: " + bikes.get(i).name+ "|| Model: "+ bikes.get(i).modelNumber+ "|| Engine: "+ bikes.get(i).enginetype+ "|| Power: "+ bikes.get(i).enginePower+ "|| tireSize: "+ bikes.get(i).tireSize);
					if(bikes.get(i).name != "Normal Bike"){
						System.out.println("|| Speciality: " + bikes.get(i).speciality);
					}
				}
				if(i==0)
					System.out.println("There is no vehicle left for showcase or the showroom is closed");
		}
		public static void main(String[] args){
			int updater=1, modelNumber1;
			String s;
			while(updater<=10){
				Main main = new Main();
			Scanner sc = new Scanner(System.in);
			s = sc.nextLine();
			if(s.equals("add"))
				main.addBike();
			else if(s.equals("remove")){
				modelNumber1 = sc.nextInt();
				main.removeBike(modelNumber1);
			}
			else if(s.equals("finish"))break;
			
			else if(s.equals("vehicles with visitors"))
				main.showVehicleWithVisitors();
				
			else if(s.equals("vehicles with details"))
				main.showVehicleDetails();
			}
	}
	

	}



