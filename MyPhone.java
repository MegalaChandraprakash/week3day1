package week3day1;

public class MyPhone {

	public static void main(String[] args) {
		Mobile mobObj = new Mobile();
		mobObj.sendMsg();
		mobObj.makeCall();
		mobObj.saveContact();
		
		System.out.println("*******Call to smartphone*********");
		
		
	SmartPhone smtObj = new SmartPhone();
	smtObj.connectWhatsApp();
	smtObj.sendMsg();
	smtObj.makeCall();
	smtObj.saveContact();
	
	System.out.println("********Call to Android*******" );
	
	Android andObj = new Android();
	andObj.takeVideo();
	smtObj.connectWhatsApp();
	smtObj.sendMsg();
	smtObj.makeCall();
	smtObj.saveContact();
	
	
	
	
	
	
		
}

	
}
