package cg.day7.que7;

public class MyDate {
	private String date;
	public static String formatChange(String date) {
		int i=0;
		int day=0;
		int month=0;
		int year=0;
		String format1="";
		String format2="";
		  for(i=0;i<2;i++) {
		        day*= 10;
		        day += date.charAt(i) - '0'; 
		  }
		  for(i=2;i<4;i++)
		  {
			  month*= 10;
		        month += date.charAt(i) - '0';  
		  }
		  for(i=4;i<8;i++)
		  {
			  year*= 10;
		        year += date.charAt(i) - '0';  
		  }
		  if(month==1 || month==3 ||month==5 ||month==7 ||month== 8 ||month==10 ||month==12 )
			{
			if(day<1 || day>31)
					return "The entered dt is invalid";
			}
			else if (month==4 || month==6 ||month==9 ||month==11)
			{
			if(day<1 || day>30)
				return "The entered dt is invalid";
			}
			else if(month==2) {
if(year%4==0)
{
	
	if(day<1 || day>29)
		return "The entered dt is invalid";
}
	else if (day<1 || day>28)
		return "The entered dt is invalid";
			}
			else 
				return "The moth entered is invalid";
		format1=dateFormat1(day,month,year);
		format2=dateFormat2(day,month,year);
		System.out.println(format1+"\n"+format2);
//		System.out.println("Date in dd/mm/yyyy format = "+format1+"\nDate in dd,month name, yyyy format = "+format2);
		return format1+"; "+format2;
	}

	private static String dateFormat2(int dt, int month, int year) {
	String monthName="";
		switch(month)
		{

		case 1 :  monthName="January"; break;
		case 2 :  monthName="February"; break;
		case 3 :  monthName="March"; break;
		case 4 :  monthName="April"; break;
		case 5 :  monthName="May"; break;
		case 6 :  monthName="June"; break;
		case 7 :  monthName="July"; break;
		case 8 :  monthName="August"; break;
		case 9 :  monthName="September"; break;
		case 10 : monthName="October"; break;
		case 11 :  monthName="November"; break;
		case 12 :  monthName="December"; break;
		default: System.out.println("Invalid input");
		}
		return dt+" "+monthName+","+year;
	}

	private static String dateFormat1(int dt, int month, int year) {
	return dt+"/"+month+"/"+year;
	}
}
