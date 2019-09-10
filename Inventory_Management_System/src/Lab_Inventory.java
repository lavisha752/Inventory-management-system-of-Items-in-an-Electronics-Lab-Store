import java.util.Scanner;
/**
 * 
 */

/**
 * @author lavish
 *
 */
public class Lab_Inventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner myKeyboard = new Scanner(System.in);
			
			//initialising variable
			int size = 0;
			int option = 0;
			String pwrd = null;
			final String PASSWORD = "DitProg123";// constant password
			int attemp=0;
			boolean A=true;
			int i=0;
			int Decision=0;
			
			
			//welcoming message
			System.out.println("Welcome to the lab inventory");
			//how many time user can store item
			System.out.println("Enter maximum number of Items to be store: ");
			size = myKeyboard.nextInt();
			
			//Creating an empty array named itemDatabase
			Item[] itemDatabase = new Item[size];
			
			while (true) {
				int count=0;
				//using a count for incrementing
				for(count=0; count>=0;count++) {
					System.out.println("What do you want to do? ");
					System.out.println("Press 1 to add new Item to the inventory ");
					System.out.println("Press 2 to change information of an existing Item ");
					System.out.println("Press 3 to display all the Items with specified category ");
					System.out.println("Press 4 to display all Item to be re-ordered ");
					System.out.println("Press 5 to know number of Items currently in store ");
					System.out.println("Press 6 to exit the program");
					System.out.println("Press your choice: ");
					option = myKeyboard.nextInt();
					
					if (option==1) {
						//no of attempts that user have to enter the password
						for(attemp=1;attemp<=3; attemp++) {
							//user to input password
							System.out.println("Please enter the password: ");
							pwrd=myKeyboard.next();
							if(pwrd.equals(PASSWORD)){
								System.out.println("Please enter the name of the items from the list and its features");
								for(i=0; i<size ; i++) {
									System.out.println("Enter the item name: ");
					 	        	 String Name  = myKeyboard.next();
					 	        	 
					 	        	 System.out.println("Enter the item's description: ");
					 	        	 String Description  = myKeyboard.next();
					 	        	 
					 	        	 System.out.println("Enter the category of the item: ");
					 	        	 String Category  = myKeyboard.next();
					 	        	 
					 	        	 System.out.println("Enter the name of the supplier of the item: ");
					 	        	 String Supplier_Name = myKeyboard.next();
					 	        	 
					 	        	 System.out.println("Enter the phone number of the supplier: ");
					 	        	 int Supplier_Contacts  = myKeyboard.nextInt();
					 	        	  
					 	        	 System.out.println("Enter the price of the item: ");
					 	        	 Double Price  = myKeyboard.nextDouble();
					 	        	 
					 	        	  System.out.println("Enter the available quantity of this item available: ");
					 	        	 int Available_Quantity  = myKeyboard.nextInt();
					 	        	 
					 	        	 System.out.println("Enter item id: ");
					 	        	 String Item_Id  = myKeyboard.next();
					 	        	 //setting the value
					 	        	 itemDatabase[i] = new Item(Name, Description,Category, Supplier_Name, Supplier_Contacts, Price, Available_Quantity, Item_Id);
					 	        	 itemDatabase[i].setName(Name);
					 	        	 itemDatabase[i].setDescription(Description);
					 	        	 itemDatabase[i].setCategory(Category);
					 	        	 itemDatabase[i].setSupplier_Name(Supplier_Name);
					 	        	 itemDatabase[i].setSupplier_Contacts(Supplier_Contacts);
					 	        	 itemDatabase[i].setPrice(Price);
					 	        	 itemDatabase[i].setAvailable_Qty(Available_Quantity);
					 	        	 itemDatabase[i].setItem_Id(Item_Id);
					 	        	 System.out.print(itemDatabase[i].toString());
					 	        
								}
								System.out.println("Name"+"Description"+ "Category"+"Supplier Name"+"Supplier Contact"+"Price"+"Available Quality"+"Item Id");
								break;
							}
							else if(!pwrd.equals(PASSWORD)){
								System.out.println("You have enter incorrect password.Only "+(3-(attemp))+ "attemps are left" );
								if(attemp==2) {
									continue;
								}
								else if(count==3) {
									System.out.println("Program detected suspicious activity and is terminating!");
									break;
								}
								
							}
							
						}
						
						
					}
					
					else if (option==2) {
						
						for(attemp=1;attemp<=1; attemp++) {
							System.out.println("Please enter the password: ");
							pwrd=myKeyboard.next();
							if(pwrd.equals(PASSWORD)){
								System.out.println("Please enter the Item_Id do you want to update: ");
								String Item_Id=myKeyboard.next();

								for(i=0; i<size ; i++) {
									String id = itemDatabase[i].getItem_Id();
									if(Item_Id.equalsIgnoreCase(id)) {
									
									System.out.println(itemDatabase[i]);
									// returning the variable value
									System.out.println("Item's Name: "+itemDatabase[i].getName());
									System.out.println("Item's description" +itemDatabase[i].getDescription() );
									System.out.println("Item's category"+itemDatabase[i].getCategory());
									System.out.println("Supplier's Name "+itemDatabase[i].getSupplier_Name());
									System.out.println("Supplier's contact"+itemDatabase[i].getSupplier_Contacts());
									System.out.println("Item's price"+itemDatabase[i].getPrice());
									System.out.println("Availability of items"+itemDatabase[i].getAvailable_Qty());
									System.out.println("Item's Id"+itemDatabase[i].getItem_Id());
									System.out.print(itemDatabase[i].toString());
									
									//User can change the item he/she want to	
									System.out.println("Please enter what information of this Item would you like to change?");
									System.out.println("Enter 1 for Name");
									System.out.println("Enter 2  for Description ");
									System.out.println("Enter 3 for Category");
									System.out.println("Enter 4 for Supplier Name ");
									System.out.println("Enter 5 for Supplier Contact");
									System.out.println("Enter 6 for Price");
									System.out.println("Enter 7 for Available Qty");
									System.out.println("Please enter your choice");
									Decision=myKeyboard.nextInt();
									
									while(A=true) {
										
										
										System.out.println("What attribute would you like to change?");
										if(Decision==1) {
											System.out.println("Name:");
									        String Name  = myKeyboard.next();
									        itemDatabase[i].setName(Name);
									        System.out.println(itemDatabase[i]);
										}
											
									else if (Decision==2) {
										
										System.out.println("Description: ");
								        String Description  = myKeyboard.next();
								        itemDatabase[i].setDescription(Description);
								        System.out.println(itemDatabase[i]);
									}
										
				
									else if (Decision==3) {

									System.out.println("Category");
									        String Category  = myKeyboard.next();
									        itemDatabase[i].setCategory(Category);
									        System.out.println(itemDatabase[i]);

									}
									else if (Decision==4) {
									System.out.println("Supplier's Name: ");
									        String Supplier_Name  = myKeyboard.next();
									        itemDatabase[i].setName(Supplier_Name );
									        System.out.println(itemDatabase[i]);

									}
									else if (Decision==5) {
									System.out.println("Supplier's Contact: ");
									        int Supplier_Contact  = myKeyboard.nextInt();
									        itemDatabase[i].setSupplier_Contacts(Supplier_Contact);
									        System.out.println(itemDatabase[i]);

									}
									else if (Decision==6) {
									System.out.println("Price: ");
									        double Price  = myKeyboard.nextDouble();
									       
									        itemDatabase[i].setPrice(Price);
									        System.out.println(itemDatabase[i]);

									}
									else if (Decision==7) {
									System.out.println("Enter the quantity available of the item ");
									        int Available_Qty = myKeyboard.nextInt();
									       
									        itemDatabase[i].setAvailable_Qty(Available_Qty);
									        System.out.println(itemDatabase[i]);

									}
									else if(Decision==8) {
										A=false;
										break;
										}
										else {
										System.out.println("Only between desicion 1-7 you can enter  valid number.");
										}
									
									break;
									
						}
									}
									else {
										break;
									}
									}
							
				}
							else if (!pwrd.equals(PASSWORD)){
								System.out.println("You have enter the incorrect password.Only "+(3-(attemp))+"attemps are left");
							}
						
						}
					}
							else if ( option==3) {
								//the user want to add any category of item in the stock
								System.out.println("Please enter the category of items :");
								String cat =myKeyboard.next();
								for(i=0; i<size ; i++) {
									String  input_cat = itemDatabase[i].getCategory();
									if (cat.equalsIgnoreCase(input_cat)) {
										System.out.println(itemDatabase[i].findItemByCat());
									}
									else {
										System.out.println("Category Not Found!");
									}
								}
							}	
								
					
							else if (option==4) {
								
								System.out.println("We should Re-order these products from the stock: ");
								for(i=0;i<size;i++) {
								
								if (itemDatabase[i].getAvailable_Qty() < 5) {
									System.out.println("The item Id : " + itemDatabase[0].getItem_Id()+ "\nItem's Name : " + itemDatabase[i].getName() 
											+ "\nQuantity of item available : " + itemDatabase[i].getAvailable_Qty());
									System.out.println(" Items ran out of the stock.Please Re-order");
									
								}
								else {
									System.out.println("The item Id : " + itemDatabase[i].getItem_Id() + "\nItem's Name : " + itemDatabase[i].getName() 
											+ "\nQuantity available: " + itemDatabase[i].getAvailable_Qty());
									System.out.println("There are sufficient  item in the stock.");
								}
								
								}
								
							}
								
							else if (option==5) {
								System.out.println("The number of Items which have been created so far :"+ Item.gettotalItem());
								
							}
						    else if(option==6)  {
						    	//Exiting the program
						    	System.out.println( "The Inventory management system is closed. \n Exit the program.");
						    	break;
							}
					
			}
				
				break;
}
			
			myKeyboard.close();
			} 
	
}

	


