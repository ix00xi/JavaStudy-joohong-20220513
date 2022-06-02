package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.upadateUser());
		System.out.println(((CMRespDto<User>) controller.getUser()));
		controller.getAnimal().getData().move();
		
		
	}

}
