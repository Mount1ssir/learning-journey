import java.util.ArrayList;
public class Div implements Elements{
	ArrayList<Elements> myChilds = new ArrayList<>();
	
	public Div() {
		this.myChilds = new ArrayList<>();
	}
	
	public Div(ArrayList<Elements> mychilds) {
		this.myChilds = mychilds;
	}
	
	public ArrayList<Elements> getChilds(){
		return this.myChilds;
	}
	
	void ajouterElement(Elements e) {
		myChilds.add(e);
	}

	@Override
	public void render() {
		System.out.println("<div>");
		for (Elements e :myChilds) {
			e.render();
		}
		System.out.println("</div>");
	}
	
	
	
	
}
