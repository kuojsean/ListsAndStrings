package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut;

//imported the model and list functions

public class ToolController
{
	private List<Donut> donutList;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	//Created a list and initialized it in the controller
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
}
