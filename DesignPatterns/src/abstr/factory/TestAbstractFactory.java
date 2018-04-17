package abstr.factory;

public class TestAbstractFactory {
	// https://dzone.com/articles/design-patterns-abstract-factory
	public static void main(String[] args) {
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		// check what platform we're on
		String platform = "MACOSX";// Platform.currentPlatform()
		if (platform.equals("MACOSX")) {
			widgetFactory = new MacOSXWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);
	}
}
