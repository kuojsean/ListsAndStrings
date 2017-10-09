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
//		showTheList();
//		changeTheList();
		practiceTheList();
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
	
	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still contains " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed");
		
	}
	
	private void practiceTheList()
	{
		display.displayText("We're going to change the donut list a little bit");
		display.displayText("Right now the list has this many donuts" + donutList.size());
		Donut stinkyDonut = new Donut ("stinky");
		donutList.add(stinkyDonut);
		display.displayText(stinkyDonut.getFlavor() + " was added to the list.");
		display.displayText("The list is now " + donutList.size() + " large");
		Donut removedDonut = donutList.remove(4);
		display.displayText(removedDonut.getFlavor() + " was removed");
		Donut getDonut = donutList.get(0);
		display.displayText("The 2nd Donut is " + getDonut.getFlavor() + " flavor");
		
		Donut addIndexDonut = new Donut("Sriracha");
		donutList.add(3, addIndexDonut);
		display.displayText(addIndexDonut.getFlavor() + " donut was added into the 3rd spot");
		donutList.add(new Donut ("Wacky"));
		display.displayText("A wacky donut was created and added just now");
		
		int indexNew = 0;
		while  (indexNew < donutList.size())
		{
			String currentDonutFlavor = donutList.get(indexNew).getFlavor();
			display.displayText(donutList.get(indexNew).toString());
			indexNew +=1;
		}
		
	}
	
}

