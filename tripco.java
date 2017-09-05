package tripco;

public class GreatCircleDistance {

	
	public double computeDistance(double latA, double latB, double longA, double longB){
		
		double a = 0.0; double b = 0.0; double change = 0.0;  double distance = 0.0;
		double deltalat = 0.0; double deltalong = 0.0;
		double earthradkm = 6371.0088; double earthradmi = 3958.7613;
		
		latA = Math.toRadians(latA); 	//φ1
		latB = Math.toRadians(latB); 	//φ2
		longA = Math.toRadians(longA);	//λ1
		longB = Math.toRadians(longB);	//λ2
		deltalat = latA - latB; 		//Δφ
		deltalong = longA - longB; 		//Δλ
		
		a = (Math.cos(latB) * (Math.sin(deltalong) * Math.sin(deltalong))) + 
				((Math.cos(latA) * Math.sin(latB)) - (Math.sin(latA) * Math.cos(latB)) 
						* (Math.cos(deltalong)* Math.cos(deltalong)));
		a = Math.sqrt(a);
		b = (Math.sin(latA) * Math.sin(latB)) + (Math.cos(latA) * Math.cos(latB)) + Math.cos(deltalong);
		change = Math.atan(a/b);
		distance = earthradkm * change;
		
		return distance;
	}
	
	
	
	public static void main (String [] args){
		computeDistance
	}
	
}
