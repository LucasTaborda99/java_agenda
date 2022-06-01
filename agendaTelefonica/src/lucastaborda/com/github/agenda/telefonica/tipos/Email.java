package lucastaborda.com.github.agenda.telefonica.tipos;

public class Email {

private String email;
	
	public Email(String email) {
		this.email = email;
	}
	
	public void setNome(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Email: " + email);
		return sb.toString();
	}
}
