

public class Year {
    public Year() {
    }

    public boolean isleapyear(int year){
       boolean result;

       if((year%4==0&&year%100!=0)||year%400==0)
       {
           result=true;
       }
           else
           result=false;
           return  result;

       }

}