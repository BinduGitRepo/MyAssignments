package week3.day2;

public class Elements extends Button {

	public static void main(String[] args) {
		
		TextField  textField = new TextField();
		Elements elements =  new Elements();
		CheckBoxButton checkBoxButton = new CheckBoxButton();
		RadioButton radioButton = new RadioButton();
		
		//set text message in base class WebElement
		elements.setText("Text from Elements");
		//print the text set using getText method in Subclass
		textField.getText();
				
		elements.submit();
		elements.click();
		
		checkBoxButton.clickCheckButton();
		radioButton.selectRadioButton();		

	}

}
