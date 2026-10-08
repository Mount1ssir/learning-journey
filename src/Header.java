public class Header implements Elements{
	Elements e ;
	Header(Elements e) {
		this.e=e;
	}
	
	public void render() {
		System.out.println("<header>header</header>");
		e.render();
	}
	

}
