package projectWorkAssignment;

public class MethodLab {

		
		    public static void printProfile(
		            String name, int age, double height, boolean student, char grade) {
		        System.out.println("Name: " + name);
		        System.out.println("Age: " + age);
		        System.out.println("Height: " + height);
		        System.out.println("Student: " + student);
		        System.out.println("Grade: " + grade);
		    }
		    
		    public static double average (int a, int b, int c) {
		    	return (a + b + c)/3.0;
		    }
		    
		    public static boolean fitsInByte(int value) {
		    	if(value >= -128 && value <= 127) {
		    		return true;
		    	}else {
				return false;
		    	}
		    }
		    
		    public static int addText(String a, String b) {
		    	int sum = Integer.parseInt(a) + Integer.parseInt(b);
		    	return sum;
		    }
		    
		    public static Integer boxTwice(int x) {
		    	return Integer.valueOf(x * 2);
		    }
		    
		    public static void describle(Integer n) {
		    	
		    	System.out.println("Binary string: " + Integer.toBinaryString(n));
		    	System.out.println("Integer Max value: " + Integer.MAX_VALUE);
		    	System.out.println("Double compared: " + Double.compare(n, 10.5));
		    
		    }
		    
		    public static boolean sameValue(Integer a, Integer b) {
		    	return a.equals(b);
		    }
		    
		    public static int truncate(double d) {
	        	return (int) d;
	        	
		    }
		    
		    public static double widen(int i) {
		    	return i;
		    }
		    
		    public static void overflowDemo() {
		    	int big = 130;
		    	byte b = (byte) big;
		    	System.out.println("Big: " + big + " Byte: " + b);
		    }
		    
		    public static char shiftLetter(char c, int by) {
		    	return (char) (c + by);
		    }
		    
		    public static void describeValue(int n) {
		    	System.out.println("Integer: " + n);
		    }
		    
		    public static void describeValue(double d) {
		    	System.out.println("Double: " + d);
		    }
		    
		    public static void describeValue(String s) {
		    	System.out.println("String: " + s);
		    }
		    
		    public static void tryChange(int n) {
		    	 n = 99;
		    }
		    
		    public static void appendBang(StringBuilder sb) {
		    	sb.append("!");
		    }
		    
		    public static void shout(String s) {
		    	s = s.toUpperCase();
		    }
		    
		   public static void compareRefs() {
			   String s1 = "java";
			   String s2 = "java";
			   String s3 = new String("java");
			   System.out.println("s1 == s2: " + (s1 == s2) + "s1 == s3: " + (s1 == s3) + "s1.equals(s3): " + s1.equals(s3));
		   }
		   
		   public static int safeLength(String s) {
			   if(s == null) {
				   return -1;
			   } else {
				   return s.length();
			   }
		   }
		   
		   
		   public static String initials(String first, String last) {
			   return "" + Character.toUpperCase(first.charAt(0)) + Character.toUpperCase(last.charAt(0));
			   }
		   
		   public static String clean(String raw) {
			   return raw.trim().toLowerCase();
		   }
		   
		   public static boolean isPalindromeWord(String w) {
			   String reversed = new StringBuilder(w).reverse().toString();
			   
			   return w.equalsIgnoreCase(reversed);
		   }
		   
		   public static String maskEmail(String email) {
			   int atIndex = email.indexOf('@');
			   
			   String firstLetter = email.substring(0, 1);
			    String stars = "*".repeat(atIndex - 1);
			    String domain = email.substring(atIndex);

			    return firstLetter + stars + domain;
			   }
		   
		   
		   public static String buildCsv(String a, String b, String c) {
			   StringBuilder sb = new StringBuilder();
			   sb.append(a).append(",").append(b).append(",").append(c);
			   return sb.toString();
		   }
		   
		   public static String edit(String text) {
			   StringBuilder sbb = new StringBuilder(text);
			   sbb.insert(0,  "[").append("]").replace(7, 12,"Java").deleteCharAt(6);
			   return sbb.toString();
		   }
		   /////////////////////////////////////////////////////////////////////////////////
		    public static void main(String[] args) {
		        printProfile("Asha", 21, 5.6, true, 'A');
		        printProfile("Ravi", 30, 5.9, false, 'B');
		        
		        System.out.println(average(1,2,2));
		        System.out.println(fitsInByte(127));
		        System.out.println(fitsInByte(128));
		        System.out.println(fitsInByte(-129));
		        
		        System.out.println("***********************************************"); // 2
		        
		        System.out.println(addText("12", "30"));
		        
		        int r = boxTwice(21);
		        System.out.println(r);
		        
		        describle(10);
		        
		        Integer a = 127;
		        Integer b = 127;
		        System.out.println(a + ": equals=" + sameValue(a, b) + " ==" + (a == b));
		        
		        Integer c = 1000;
		        Integer d = 1000;
		        System.out.println(c + ": equals=" + sameValue(c, d) + " ==" + (c == d));
		        
		        System.out.println("***********************************************"); // 3
		        
		        System.out.println(truncate(9.99));
		        System.out.println(truncate(-9.99));
		    
		        System.out.println(widen(7));
		        
		        overflowDemo();
		        
		        System.out.println(shiftLetter('a', 2));
		        
		        System.out.println("***************************************************"); // 4 
		  
		        describeValue(5);
		        describeValue(2.5);
		        describeValue("hi");
		        describeValue('A');
		        describeValue(5L);
		        
		        System.out.println("***************************************************"); // 5

		        int x = 1;
		        tryChange(x);
		        System.out.println("x = " + x);
		        
		        StringBuilder sb = new StringBuilder("Hi");
		        appendBang(sb);
		        System.out.println(sb);
		        
		        String s = "java";
		        shout(s);
		        System.out.println(s);
		        
		        System.out.println("***************************************************"); //6

		        StringBuilder ab = new StringBuilder("cat");
		        StringBuilder abc = ab;
		        
		        abc.append("s");
		        
		        System.out.println(ab);
		        
		        compareRefs();
		        
		        System.out.println(safeLength((null)));
		        System.out.println(safeLength(("hello")));
		        
		        System.out.println("***************************************************"); //7
		        
		      System.out.println(initials("ashu", "jauhari")); // 7.1
		      
		      System.out.println(clean("  Hello World!  ")); // 7.2
		      
		      System.out.println(isPalindromeWord("Level"));
		      System.out.println(isPalindromeWord("Java"));

		      System.out.println(maskEmail("asha@mail.com"));
		     
		      System.out.println("***************************************************"); //8
		        
		      System.out.println(buildCsv("a", "b", "c"));
		      
		      System.out.println(edit("Hellow World!"));
		      
		      

		    }
		    

		    
}   
		    
	

