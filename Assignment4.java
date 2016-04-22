
public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2;
		int year = 2006;
		int i=year%4;
		String Days;
		
					
			switch (month) {
         case 1:  Days = "31";
            break;
         case 2:  Days = "28";
         	break;               
         case 3:  Days = "28";
         	break;
         case 4:  Days = "30";
         	break;
         case 5:  Days = "31";
      		break;
         case 6:  Days = "30";
      		break;
         case 7:  Days = "31";
      		break;
         case 8:  Days = "31";
      		break;
         case 9:  Days = "30";
      		break;
         case 10:  Days = "31";
      		break;
         case 11:  Days = "30";
      		break;
         case 12:  Days = "31";
      		break;
         default: Days = "Invalid month";
         	break;
			}
			if (Days == "Invalid month")
				{
					System.out.println(Days);
					
				}
			else
				{ if (Days =="28")
					{if (i==0)
						{
						Days="29";
						}
					}
				System.out.println(Days + " Days are there in the Month of " + month + " for Year " + year);
				}			
						
				}
						
	}


