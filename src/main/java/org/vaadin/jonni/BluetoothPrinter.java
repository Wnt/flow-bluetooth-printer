package org.vaadin.jonni;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

@Tag("bluetooth-printer")
@HtmlImport("frontend://bluetooth-printer.html")
public class BluetoothPrinter extends PolymerTemplate<BluetoothPrinterModel> {

    public BluetoothPrinter() {
    }

	public void print(String value) {
		getElement().callFunction("print", value);
	}

	public void connect() {
		getElement().callFunction("connect");
	}
}
