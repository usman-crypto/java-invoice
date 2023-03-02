class Invoice
{
		String PartNumber;
		String Description;
		int Quantity;
		double Price;
		double amount;
		int choice;
	Invoice()
	{
		PartNumber=null;
		String Description=null;
		Quantity=0;
		Price=0.0;
	}
	
	void Display()
	{
		System.out.println("-------1. CPUs---------");
		System.out.println("-------2. Memory-------");
		System.out.println("-------3. SSD and HDD--");
		//return choice;
	}
	
	void setChoice(int Choice)
	{
		Choice=Choice;
	}
	int getChoice()
	{
		return Choice;
	}
	
	double getInvoiceAmount()
	{
		
		if((Quantity<0)||(Price<0))
		{
			Quantity=0;
			Price=0;
		}
		/*else if(Price<0)
		{
			Price=0;
		}*/
		else
		{
			amount=Quantity*Price;
		}
		return amount;
	}

	void setPartNumber(String PartNumber)
	{
		this.PartNumber=PartNumber;
	}
	
	
	String getPartNumber()
	{
		return PartNumber;
	}
	
	void setdescription(String Description)
	{
		this.Description=Description;
	}
	String getdescription()
	{
		return Description;
	}
	
	void setQuantity(int Quantity)
	{
		this.Quantity=Quantity;
	}
	int getQuantity()
	{
		return Quantity;
	}
	
	void setPrice(double Price)
	{
		this.Price=Price;
	}
	double getPrice()
	{
		return Price;
	}
		
}