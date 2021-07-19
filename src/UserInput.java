
public class UserInput {
	
	private int mainMenuSelection;
	private int firstUnitSelection;
	private int secondUnitSelection;
	private double value;
	private double convertedValue;
	
	public void setMainMenuSelection(int selection) {
		this.mainMenuSelection = selection;
	}
	
	public void setFirstUnitSelection(int selection) {
		this.firstUnitSelection = selection;
	}
	
	public void setSecondUnitSelection(int selection) {
		this.secondUnitSelection = selection;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	public void setConvertedValue(double value)
	{
		this.convertedValue = value;
	}
	
	public int getFirstSelection(){
		return this.firstUnitSelection;
	}
	
	public int getSecondSelection(){
		return this.secondUnitSelection;
	}
	public double getInputValue() {
		return this.value;
	}
	public double getConvertedValue() {
		return this.convertedValue;
	}
	
	public String getFirstUnit() {
		String type = null;
		switch (this.mainMenuSelection) {
		case 1:
			switch(this.firstUnitSelection) {
			case 1:
				type = "Gallons";
				break;
			case 2:
				type = "Liters";
				break;
			case 3: 
				type = "Cubic Feet";
				break;
			case 4:
				type = "Imperial Cups";
				break;
			}
			break;
		case 2:
			switch(this.firstUnitSelection) {
			case 1:
				type = "Feet";
				break;
			case 2:
				type = "Meters";
				break;
			case 3: 
				type = "Miles";
				break;
			case 4:
				type = "Kilometers";
				break;
			}
			break;
		}
		return type;
	}
	public String getSecondUnit() {
		String type = null;
		switch (this.mainMenuSelection) {
		case 1:
			switch(this.secondUnitSelection) {
			case 1:
				type = "Gallons";
				break;
			case 2:
				type = "Liters";
				break;
			case 3: 
				type = "Cubic Feet";
				break;
			case 4:
				type = "Imperial Cups";
				break;
			}
			break;
		case 2:
			switch(this.secondUnitSelection) {
			case 1:
				type = "Feet";
				break;
			case 2:
				type = "Meters";
				break;
			case 3: 
				type = "Miles";
				break;
			case 4:
				type = "Kilometers";
				break;
			}
			break;
		}
		return type;
	}

}
