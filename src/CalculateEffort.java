
public class CalculateEffort {
	
	
	public static double ManHours1(double UCP) {
		double ucp = UCP;
		double er1 =20;
		
		double manHours1 = ucp * er1;
		return manHours1;
	
		
	}
	
	public static double ManHours2(double UCP) {
		double ucp = UCP;
		double er2 =28;
               
		double manHours2 = ucp * er2;
		return manHours2;
	
		
	}
	
	public static double adjustManHour(double ManHours2) {
		double manH = ManHours2 ;
		double adjust = (1.0 + 05/100)* manH ;
		return adjust;
		
	}
	
	public static double Report(double adjustManHour) {
		double adj= adjustManHour ;
		double report = adj + 940;
		return report;
		
	}
	


}