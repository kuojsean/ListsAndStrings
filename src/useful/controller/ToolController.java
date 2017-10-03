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
	}
	
	private void showTheList()
	{
		for (int index = 0; index < donutList.size(); index += 1)
		{
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
