public class a3TypeCasting {
    public static void main(String[] args) {
        
            // 1. double to float
            double doubleValue = 10.5;
            float floatValue = (float) doubleValue;
            System.out.println("double to float: " + floatValue);
    
            // 2. float to long
            float floatValue2 = 9.8f;
            long longValue = (long) floatValue2;
            System.out.println("float to long: " + longValue);
    
            // 3. long to int
            long longValue2 = 100000L;
            int intValue = (int) longValue2;
            System.out.println("long to int: " + intValue);
    
            // 4. int to short
            int intValue2 = 32768;
            short shortValue = (short) intValue2;
            System.out.println("int to short: " + shortValue);
    
            // 5. short to byte
            short shortValue2 = 150;
            byte byteValue = (byte) shortValue2;
            System.out.println("short to byte: " + byteValue);
    
            // 6. char to int
            char charValue = 'A';
            int charToInt = (int) charValue;
            System.out.println("char to int: " + charToInt);
    
            // 7. int to char
            int intToChar = 66;
            char charValue2 = (char) intToChar;
            System.out.println("int to char: " + charValue2);
    
            // 8. double to int
            double doubleValue2 = 123.99;
            int intFromDouble = (int) doubleValue2;
            System.out.println("double to int: " + intFromDouble);
    
            // 9. float to byte
            float floatValue3 = 65.5f;
            byte byteFromFloat = (byte) floatValue3;
            System.out.println("float to byte: " + byteFromFloat);
    
            // 10. byte to char
            byte byteToChar = 65;
            char charFromByte = (char) byteToChar;
            System.out.println("byte to char: " + charFromByte);
        
    }    
}
