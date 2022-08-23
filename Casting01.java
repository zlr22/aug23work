public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        
        //byte var1 = 128;
        
        
        

        
        //Declare and initialize a short with a value of 128
        //Create a print statement that casts this short to a byte
        
        short var2;
        byte var3 = 128;
        var2 = (short)var3;
        System.out.println(var2);

        
        
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        //Add 1 to this variable again and print it again
        
        byte var4 = 127;
        var4 = var4 + 1;
        System.out.println(var4);
        var4 = var4 + 1;
        System.out.println(var4);
        

        
        
        
    }    
}
