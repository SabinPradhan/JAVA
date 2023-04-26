class Distance
{
    int meter;
    int centimeter;
    Distance(int m,int c)
    {
        this.meter=m;
        this.centimeter=c;
    }
   int adddistance(){
       return meter*100+centimeter;
   }
   void show()
   {
       System.out.println("meter="+meter+"\tcentimeter="+centimeter);
   }
}
class shreya{
    public static void main(String args[]){
        Distance obj=new Distance(3,400);
        System.out.println("the addtion is"+obj.adddistance());
        obj.show();
       
    }
}