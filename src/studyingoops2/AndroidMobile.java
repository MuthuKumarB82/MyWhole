package studyingoops2;

public class AndroidMobile extends Mobile {
     float os;
     int ram;
//     public AndroidMobile(String brand,boolean isQuality,String model,int price,String color,float os,int ram) {
//    	 super(brand,isQuality,model,price,color);
//    	 this.os = os;
//    	 this.ram = ram;
//     }
     public String toString() {
    	 return super.toString()+os+ram;
     }
}
