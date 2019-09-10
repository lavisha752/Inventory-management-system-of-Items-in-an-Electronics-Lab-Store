/**
 * 
 */

/**
 * @author lavish
 *
 */
public class Item {
	/*static attribute*/
	private static  int totalItem = 0;

	
	/*attributes*/
	private String Name;
	private String Description;
	private String Category;
	private String Supplier_Name;
	private int  Supplier_Contacts;
	private double Price;
	private int Available_Qty;
	private String Item_Id;
	
	

	public Item() {
		/*constructors*/
		/**
		 * default constructor
		 */
		
		this.Name=null;
		this.Description= null;
		this.Category=null;
		this.Supplier_Name=null;
		this.Supplier_Contacts=0;
		this.Price=0;
		this.Available_Qty=0;
		this.Item_Id=null;
		
		settotalItem(gettotalItem()+1);//incrementing the count to track the Total no of Item
		
	            
	}
			/**
			 * 
			 * @param Name of item
			 * @param Description of item
			 * @param Category of item
			 * @param Supplier_Name 
			 * @param Supplier_Contacts
			 * @param Price of item
			 * @param Available_Qty for the required item
			 * @param Item_Id for the item
			 */
		public Item(String Name, String Description,String Category,String Supplier_Name, int Supplier_Contacts,double Price,int Available_Qty, String Item_Id) {
			this.Name=Name;
			this.Description=Description;
			this.Category=Category;
			this.Supplier_Name= Supplier_Name;
			this.Supplier_Contacts=Supplier_Contacts;
			this.Price=Price;
			this.Available_Qty=Available_Qty;
			this.Item_Id=Item_Id;
			settotalItem(gettotalItem()+1);//incrementing the count to track the Total no of Item
			
	}
		/*Behaviours*/
		/*Getters*/
			/**
			 * @return the totalItem for the item
			 */
			public static int gettotalItem() {
				return totalItem;
			}
			/**
			 * @return the name of item
			 */
			public String getName() {
				return Name;
			}
			/**
			 * @return the description for the item
			 */
			public String getDescription() {
				return Description;
			}
			/**
			 * @return the category for the item
			 */
			public String getCategory() {
				return Category;
			}
			/**
			 * @return the supplier_Name 
			 */
			public String getSupplier_Name() {
				return Supplier_Name;
			}
			/**
			 * @return the supplier_Contacts
			 */
			public int getSupplier_Contacts() {
				return Supplier_Contacts;
			}
			/**
			 * @return the price for the item
			 */
			public double getPrice() {
				return Price;
			}
			/**
			 * @return the available_Qty for the item
			 */
			public int getAvailable_Qty() {
				return Available_Qty;
			}
			/**
			 * @return the item_Id
			 */
			public String getItem_Id() {
				return Item_Id;
			}
			/*SETTERS*/
			/**
			 * 
			 * @param totalItem of the item
			 */
			public  void settotalItem(int totalItem) {
				Item.totalItem = totalItem;
			}
			/**
			 * @param name the name to set
			 */
			public void setName(String name) {
				Name = name;
			}
			/**
			 * @param description the description to set
			 */
			public void setDescription(String description) {
				Description = description;
			}
			/**
			 * @param category the category to set
			 */
			public void setCategory(String category) {
				Category = category;
			}
			/**
			 * @param supplier_Name the supplier_Name to set
			 */
			public void setSupplier_Name(String supplier_Name) {
				Supplier_Name = supplier_Name;
			}
			/**
			 * @param supplier_Contacts the supplier_Contacts to set
			 */
			public void setSupplier_Contacts(int supplier_Contacts) {
				Supplier_Contacts = supplier_Contacts;
			}
			/**
			 * @param price the price to set
			 */
			public void setPrice(double price) {
				Price = price;
			}
			/**
			 * @param available_Qty the available_Qty to set
			 */
			public void setAvailable_Qty(int available_Qty) {
				Available_Qty = available_Qty;
			}
			/**
			 * @param item_Id the item_Id to set
			 */
			public void setItem_Id(String item_Id) {
				Item_Id = Item_Id;
			}
			@Override
			public String toString() {
				return "Item [Name=" + Name + ", Description=" + Description + ", Category=" + Category
						+ ", Supplier_Name=" + Supplier_Name + ", Supplier_Contacts=" + Supplier_Contacts + ", Price="
						+ Price + ", Available_Qty=" + Available_Qty + ", Item_Id=" + Item_Id + "]";
			}
			/**
			 * method to compare if two item id  are the same
			 * @param I is the other item with whose the comparison will be done
			 * @return true if both are same
			 */
			
			public boolean eqauls(Item I) {
				 if(this.Item_Id.equalsIgnoreCase(I.Item_Id)) {
					 return true;
				 }
				 else {
					 return false;
				 }
			 }
			/**
			 * 
			 * @return findItemByCat by its attributes
			 */
			public  String findItemByCat() {
				return "findItemByCat [Name=" + Name + ", Description=" + Description + ", Category=" + Category
						+ ", Supplier_Name=" + Supplier_Name + ", Supplier_Contacts=" + Supplier_Contacts + ", Price="
						+ Price + ", Available_Qty=" + Available_Qty + ", Item_Id=" + Item_Id + "]";
			}
			
			public  void totalItem() {
				System.out.println("totalItem");
			}
			
			
			
		

	}
		
	
	
	
	
	


