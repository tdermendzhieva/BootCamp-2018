package abstr.factory;

//ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory {
	// create a MacOSXWindow
	public Window createWindow() {
		MacOSWindow window = new MacOSWindow();
		return window;
	}
}
