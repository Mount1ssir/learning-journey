public class Border implements Elements{
	Elements e ;
	Border(Elements e) {
		this.e=e;
	}
	public void render() {
		System.out.println("<header>");
		e.render();
		System.out.println("</header>");
	}
	

}
