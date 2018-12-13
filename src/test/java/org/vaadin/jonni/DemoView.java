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
		textArea.setValue(""+
		
				 "    This is a dummy receipt!\n" +
				
				"\n" +
				 
				"--------------------------------\n" +
				
				"Product 1 ............ 34.12 EUR\n" +
				
				"Product Foobar ....... 13.37 EUR\n" +
				
				"\n" +
				
				"--------------------------------\n" +
				
				"Total ................ 47.49 EUR\n" +
				
				"\n" +
				
				"Vaadin Ltd\n" +
				
				"VAT ID FI16135639\n" +
				
				"Ruukinkatu 2-4\n" + 
				
				"20540 Turku\n" + 
				
				"Finland\n" + 
				
				"\n" + 
				
				"     Thank you, come again!\n" + 
				
				"\n" + 
				
				"<3 <3 <3 <3 <3 <3 <3 <3 <3 <3 <3\n" + 
				
				"");

		textArea.getStyle().set("width","270px");
		textArea.getStyle().set("font-family","monospace");
		
		add(

				textArea,

				bluetoothPrinter,
				
				new Button("Print", click -> bluetoothPrinter.print(textArea.getValue())));
	}
}
