class ButtonAdapter implements Elements{
	private final LegacyButton button = new LegacyButton();
	@Override
	public void render() {
		button.display();
	}

}
