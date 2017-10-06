package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;
import useful.view.PopupDisplay;

//imported the model and list functions

public class ToolController
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	//Created a list and initialized it in the controller
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		String favorite = "bleach";
		for (int index = 0; index < donutList.size(); index += 1)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			Donut currentDonut = donutList.get(index);
			String flavor = currentDonut.getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop <5; woop += 1)
				{
					display.displayText("The best flavor ever!!!!!!");
				}
			}
			
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex += 1)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex,  currentLetterIndex + 1));
			}
			
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut cinnamonSugar = new Donut("cinnamon sugar");
		Donut shujaetDonut = new Donut("monkey");
		Donut pizzaDonut = new Donut("PIZZA");
		Donut bleachDonut = new Donut("bleach");
		
		donutList.add(bleachDonut);
		donutList.add(jellyFilled);
		donutList.add(cinnamonSugar);
		donutList.add(shujaetDonut);
		donutList.add(pizzaDonut);
	}
}
