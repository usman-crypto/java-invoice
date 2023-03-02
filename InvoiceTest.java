import java.util.*;
class InvoiceTest
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		Invoice obj=new Invoice();
		obj.Display();
		System.out.print("Enter your choice.");
		int choice=input.nextInt();
		obj.setChoise(choice);
		
		
		/*
		System.out.print("Enter the name of product: ");
		String pro=input.nextLine();
		obj.setPartNumber(pro);
		System.out.println();
		System.out.print("Enter description about product: ");
		String vim=input.nextLine();
		obj.setdescription(vim);
		System.out.println();
		System.out.println("Enter quantity: ");
		obj.setQuantity(input.nextInt());
			obj.setPrice(32);
		
		switch(pro)
		{
			case "gala":
			obj.setPrice(15);
			break;
				
			case "marie":
			obj.setPrice(10);
			break;
			
			case "oreo":
			obj.setPrice(18);
			break;

			case "sooper":
			obj.setPrice(17);
			break;
		}
		
		if(((obj.getPrice())<0)||((obj.getQuantity())<0))
		{
			System.out.println("Error arguments.");
		}
		else
		{
		System.out.println("The product name is: " + obj.getPartNumber());
		System.out.println("Description: " + obj.getdescription());
		System.out.println("Quantity is: " + obj.getQuantity());
		System.out.println("Price of Product is: " + obj.getPrice());
		System.out.println("Total amount is: " + obj.getInvoiceAmount());
		}
*/
		
		
	}
	
}






















