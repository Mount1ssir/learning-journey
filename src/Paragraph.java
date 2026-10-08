
public class Paragraph implements Elements{
	String texte;
	
	Paragraph(){
		this.texte ="";
	}
	Paragraph(String txt){
		this.texte = txt;
	}
	
	void setTexte(String text) {
		this.texte = text;
	}
	String getTexte() {
		return this.texte;
	}
	@Override
	public void render() {
		System.out.println("<p>"+this.texte+"</p>");
		}
}

