import java.util.Scanner;

public class Assignment1 extends CalculateEffort{
	 public static void main(String[] args) {
		//Create new scanner object
		 Scanner scan = new Scanner(System.in);
	
		 double totalActor = 0, totalTechnicalFactor = 0, totalUseCase = 0, totalExperience = 0, totalActUse=0, UUCP=0;
		 
		 System.out.println("\n*****Software Effort Estimation calculation*****\n");
		 //enter quantity 
		 System.out.println("*****Weighting Actor for Complexity*****\n");
		 System.out.println("Please enter quantity for actor type = Simple (3), Average(2), Complex(1)");
		 System.out.print("          Actor Type (Simple)  : ");
		 int act1 = scan.nextInt() *1;
		 System.out.print("          Actor Type (Average) : ");
		 int act2 = scan.nextInt() *2;
		 System.out.print("          Actor Type (Complex) : ");
		 int act3 = scan.nextInt() *3;
		 
		 totalActor += act1 + act2 + act3;
		 System.out.println("Total Actor Points= " + totalActor );
		 
		 System.out.println("\n*****Weighting Use Cases Complexity*****\n");
		 //enter quantity use case and multiply with weight factor
		 System.out.println("Please enter quantity for use case type = Simple (3), Average(2), Complex(1)");
		 System.out.print("           Use Case (Simple)  : ");
		 int use1 = scan.nextInt() *5;
		 System.out.print("           Use Case (Average) : ");
		 int use2 = scan.nextInt() *10;
		 System.out.print("           Use Case (Complex) : ");
		 int use3 = scan.nextInt()* 15;
		 
		 totalUseCase += use1 + use2 + use3;
		 //UUCP stands for Unadjusted Use Case Points
		 UUCP +=totalActor +totalUseCase;
		 System.out.println("Weighted Actor + Weighted Use Cases = " + UUCP);

		 System.out.println("\n*****Weighting Technical Factors*****\n");
		 System.out.println("Project Rating: T1 (5), T2 (3),T3 (5),T4 (5),T5 (3),T6 (3),T7 (3),T8 (0),T9 (5),T10 (0),T11 (5),T12 (0), T13 (3),");
		 System.out.print("|T1| Must have a distributed Solution              : ");
		 double techf1 = scan.nextDouble()*2;
		 System.out.print("|T2| Must response specific performance objectives : ");
		 double techf2 = scan.nextDouble()*1;
		 System.out.print("|T3| Must meet end-user efficiency desires         : ");
		 double techf3 = scan.nextDouble()*1;
		 System.out.print("|T4| Complex internal processing                   : ");
		 double techf4 = scan.nextDouble()*1;
		 System.out.print("|T5| Code must be reusable                         : ");
		 double techf5 = scan.nextDouble()*1;
		 System.out.print("|T6| Must be easy to install                       : ");
		 double techf6 = scan.nextDouble()*0.5;
		 System.out.print("|T7| Must easy to use                              : ");
		 double techf7 = scan.nextDouble()*0.5;
		 System.out.print("|T8| Must be portable                              : ");
		 double techf8 = scan.nextDouble()*2;
		 System.out.print("|T9| Must be easy to change                        : ");
		 double techf9 = scan.nextDouble()*1;
		 System.out.print("|T10| Must allow Concurrent users                  : ");
		 double techf10 = scan.nextDouble()*1;
		 System.out.print("|T11| Includes special security objectives         : ");
		 double techf11 = scan.nextDouble()*1;
		 System.out.print("|T12| Must provides direct access for third parties: ");
		 double techf12 = scan.nextDouble()*1;
		 System.out.print("|T13| Requires special user training facilities    : ");
		 double techf13 = scan.nextDouble()*1;
		 
		 totalTechnicalFactor += techf1 + techf2 + techf3 + techf4 + techf5 + techf6 + techf7 + techf8 +
	                techf9 + techf10 + techf11 + techf12 + techf13;
		 double TCF = (0.01 * totalTechnicalFactor) + 0.6;
		 double SzUC = UUCP * TCF;
		 System.out.println("\nTotal TFactor = " + totalTechnicalFactor);
		 System.out.println("Technical Complexity Factor = " + TCF + "(TCF)");
		 System.out.println("Size Use Case = " + SzUC + "(SzUC)");
		 
		 
		 System.out.println("\n||Weighting Experience Factors||\n");
		 System.out.println("Project Rating: E1 (4), E2 (2),E3 (4),E4 (4),E5 (4),E6 (2),E7 (0),E8 (3)");
		 System.out.print("|E1|Familiar with FPT software process : ");
		 double expf1 = scan.nextDouble()*1;
		 System.out.print("|E2|Application experience             : ");
		 double expf2 = scan.nextDouble()*0.5;
		 System.out.print("|E3|Paradigm experience (OO)           : ");
		 double expf3 = scan.nextDouble()*1;
		 System.out.print("|E4|Lead analyst capability            : ");
		 double expf4 = scan.nextDouble()*0.5;
		 System.out.print("|E5|Motivation                         : ");
		 double expf5 = scan.nextDouble()*0;
		 System.out.print("|E6|Stable requirements                : ");
		 double expf6 = scan.nextDouble()*2;
		 System.out.print("|E7|Part-time workers                  : ");
		 double expf7 = scan.nextDouble()* (-1);
		 System.out.print("|E8|Difficult programming language     : ");
		 double expf8 = scan.nextDouble() * (-1);
	        
	        totalExperience += expf1 + expf2 + expf3 + expf4 + expf5 + expf6 +
	                expf7 + expf8;
	        System.out.println("Total EFactor =" + totalExperience);
	        double EF = (-0.03 * totalExperience) +1.4;
	        System.out.println("Total EF = " + EF);
	        //calculate use case points, multiply SzUC by EF
	        double UCP = SzUC * EF;
	        System.out.println("Total Use Case Points = " + UCP);
	        
	        
	     
	        

	        double manHours1 = ManHours1(UCP);
	        double manHours2 = ManHours2(UCP);
	        double adjust = adjustManHour(manHours2);
	        double report = Report(adjust);
	        
	        System.out.println("Unadjusted Use Case Points    :" + UUCP);
	        System.out.println("Size of Software (Use Case)   :" + SzUC );
	        System.out.println("Use Case Points               :" + UCP);
	        System.out.println("Man Hours                     :" + manHours1 + " or " + manHours2);
	        System.out.println("Adjust Man-Hours              :" + adjust);
	        System.out.println("Estimating Report             :" + report);
	        
	        
	        
		
		 
		 
		 
		 
	 }
}