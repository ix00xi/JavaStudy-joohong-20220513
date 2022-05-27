package j13_다형성;
		
public class FactoryMain2 {
		
	public static void main(String[] args) {
		
		Factory[] factorys = new Factory[100];
		
	//	factorys[0] = new SmartPhoneFactory();
	//	factorys[1] = new ComputerFactory();
		
		for(int i = 0; i < factorys.length; i++) {
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactory();
		}
		
		for(Factory factory : factorys) { 
			factory.start();
		}
		
		int i = 10;
		double d = i;
		int ii = (int)d;
		
		System.out.println();
		
		/*
		 *  다운 캐스팅
		 *  업캐스팅 되어있는것만 다운캐스팅 가능 
		 *  다른 하위 클래스 로의 다운캐스팅 불가능  
		 */
		
		for(Factory factory : factorys) {
			if(factory instanceof SmartPhoneFactory) {
				SmartPhoneFactory spf = (SmartPhoneFactory) factory;
				spf.showSmartPhone();
				
			}else if(factory instanceof ComputerFactory) {
				ComputerFactory cf = (ComputerFactory) factory;
				cf.showComputer();
				
			}else {
				System.out.println("다운캐스팅 할 수 없습니다.");
			}
			
		}
	
	}

}
