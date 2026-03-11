package com.exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        String s = "java";
        try {
            System.out.println(s.charAt(10));
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticBlock");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBond");
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBonds");
        }
        catch (Exception e){
            System.out.println("Exception-Block");
        }
    }
}
// to provide the multiple solution then u can provide multiple catch block.