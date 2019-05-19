package Heranca;

public class Email {
	private String email;
	
	public Email(String _email) {
		this.setEmail(_email);
	}
	public void setEmail(String _email) {
		this.email = _email;
	}
	public String getEmail(){
		return this.email;
	}
	public static boolean verificar(String _email) {
		if(_email.contains("@")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
