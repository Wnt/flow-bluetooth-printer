package org.vaadin.jonni;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

	public DemoView() {

		BluetoothPrinter bluetoothPrinter = new BluetoothPrinter();
		TextArea textArea = new TextArea();
		textArea.setValue("Hello from Vaadin Flow!");

		add(

				textArea,

				bluetoothPrinter,
				
				new Button("Print", click -> bluetoothPrinter.print(textArea.getValue())));
	}
}
