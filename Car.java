package �ڶ���java��ҵ;
//import java.util.Scanner;
//public class Car {
//
//	static Scanner sc = new Scanner(System.in);
//	static boolean  a = true;  //������־�Ƿ��������ѭ��
//	static String []carProperties = new String[]{
//			"car0,tanl0,oliConsumption0",
//			"car1,tanl1,oliConsumption1",
//			"car2,tanl2,oliConsumption2",
//			"car3,tanl3,oliConsumption3",
//			"car4,tanl4,oliConsumption4",
//			"car5,tanl5,oliConsumption5",
//			"car6,tanl6,oliConsumption6",
//			"car7,tanl7,oliConsumption7",
//			"car8,tanl8,oliConsumption8",
//			"car9,tanl9,oliConsumption9",};
//	static int len = carProperties.length;
//	
//	public static void print(){
//		while(a) {
//			System.out.print("��������������");
//			String newCar = sc.next();
//			for(int i=0; i<len; i++) {
//				int n = carProperties[i].indexOf(newCar);  //�������ÿ��Ԫ���в�������������n�����ز��ҵĽ��
//				if(n>=0) {
//					System.out.println(carProperties[i]);  //���ҵ���ʱ�������������������
//				}
//			}
//			System.out.print("�����밴1�������밴0��");
//			int n = sc.nextInt();
//			if(n == 0) {
//				a =false;
//			}
//		}
//	}
//	
//	public static void main(String[] args){
//		// TODO �Զ����ɵķ������
//		print();
//	}
//
//}
import java.lang.String;
import  java.util.Scanner;
public class Car{
	private String Cname;          //��������
	private double Tank;           //��������
	private double OilConsumption; //��������
	
	public Car(String Cname,double Tank,double OilConsumption){
		this.Cname = Cname; this.Tank = Tank; this.OilConsumption = OilConsumption; 
	}
	
	private static boolean gas(double tank) {  //�ж������������Ƿ����0
		if(tank>0)
			return true;
		return false;
	}
	
	private double run(double tank,double oilConsumption) { //�����������ܶ�Զ
		double len = tank/oilConsumption;
		return len;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Car []c = new Car[10];
		c[0] = new Car("car0",0,1000);
		c[1] = new Car("car1",1,1000);
		c[2] = new Car("car2",2,1000);
		c[3] = new Car("car3",3,1000);
		c[4] = new Car("car4",4,1000);
		c[5] = new Car("car5",5,1000);
		c[6] = new Car("car6",6,1000);
		c[7] = new Car("car7",7,1000);
		c[8] = new Car("car8",8,1000);
		c[9] = new Car("car9",9,1000);
		
		for(int i=0;i<10;i++) {
			System.out.print("��������������:");
			String cName = sc.next();
			for(int j=0; j<10; j++) {    //����������������10������������Ѱ�Ҷ�Ӧ�����������������������������
				if(cName.equals(c[j].Cname)) {
					System.out.println(c[j].Cname +" "+c[j].Tank+" "+c[j].OilConsumption 
							+" "+c[j].gas(c[j].Tank )+" "+c[j].run(c[j].Tank,c[j].OilConsumption));
					break;
				}else {
					if(j == 9) {
						System.out.println("û�и�����");
					}
				}
			}
		}
	}

}

