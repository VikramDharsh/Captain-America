class ToothPaste
{
	static String name;
	static String brand;
	static int cost;
	static char size;
	static String shape;
	static int length;
	static String taste;
	static boolean available;
	static String waterPer;
	static String[] abbresives;
	static String mfgDate;
	static String expDate;
	static int batchNo;
	  static boolean agmark;
	  
	  
	  
	  
	  static void setName(String value)
	  {
		  name=value;
	  }
	  static String getName()
	  {
		  System.out.println("name  :"+name);
		  return name;
	  }
	  
	  
	  
	   static void setBrand(String value)
	  {
		  brand=value;
	  }
	  static String getBrand()
	  {
		  System.out.println("brand :"+brand);
		  return brand;
	  }
	  
	  
	   static void setCost(int value)
	  {
		  cost=value;
	  }
	  static int getCost()
	  {
		  System.out.println("cost  :"+cost);
		  return cost;
	  }
	  
	   static void setSize(char value)
	  {
		  size=value;
	  }
	  static char getSize()
	  {
		  System.out.println("size  :"+size);
		  return size;
	  }
	  
	  
	   static void setShape(String value)
	  {
		  shape=value;
	  }
	  static String getShape()
	  {
		  System.out.println("shape  :"+shape);
		  return shape;
	  }
	  
	   static void setLength(int value)
	  {
		  length=value;
	  }
	  static int getLength()
	  {
		  System.out.println("length :"+length);
		  return length;
	  }
	  
	   static void setTaste(String value)
	  {
		  taste=value;
	  }
	  static String getTaste()
	  {
		  System.out.println("taste  :"+taste);
		  return taste;
	  }
	  
	   static void setAvailable(boolean value)
	  {
		  available=value;
	  }
	  static boolean getAvailable()
	  {
		  System.out.println("available :"+available);
		  return available;
	  }
	  
	   static void setWaterPer(String value)
	  {
		  waterPer=value;
	  }
	  static String getWaterPer()
	  {
		  System.out.println("waterPer  :"+waterPer);
		  return waterPer;
	  }
	  
	  
	   static void setAbbresives(String[] value)
	  {
		  abbresives=value;
	  }
	  static void getAbbresives()
	  {
		  
		  for(int index=0;index<abbresives.length;index++)
		  {
			  String ref=abbresives[index];
		 
		  System.out.println("abbresives  :"+ref   +index);
	  }}
	  
	   static void setMfgDate(String value)
	  {
		  mfgDate=value;
	  }
	  static String getMfgDate()
	  {
		  System.out.println("mfgDate :"+mfgDate);
		  return mfgDate;
	  }
	  
	   static void setExpDate(String value)
	  {
		  expDate=value;
	  }
	  static String getExpDate()
	  {
		  System.out.println("expDate  :"+expDate);
		  return expDate;
	  }
	  
	   static void setBatchNo(int value)
	  {
		  batchNo=value;
	  }
	  static int getBatchNo()
	  {
		  System.out.println("batchNo :"+batchNo);
		  return batchNo;
	  }
	  
	   static void setAgmark(boolean value)
	  {
		  agmark=value;
	  }
	  static boolean getAgmark()
	  {
		  System.out.println("agmark :"+agmark);
		  return agmark;
	  }
	  
	  
	  
	  
	  
	  
	  
	  
}