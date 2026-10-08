public class Footer implements Elements{
	Elements e ;
	Footer(Elements e) {
		this.e=e;
	}
	
	public void render() {
		e.render();
		System.out.println("<footer>footer</footer>");
	}
	

}
