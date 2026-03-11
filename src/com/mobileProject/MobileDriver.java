//package com.mobileProject;
//
//import java.util.Scanner;
//
//public class MobileDriver {
//    public static void main(String[] args) {
//        boolean r = true;
//        Mobile[] m =null;
//        do{
//            Scanner s =new Scanner(System.in);
//            System.out.println("1.Add\n2.sort\n3.Display\n4.Exit");
//            int n = s.nextInt();
//            switch (n){
//                case 1:{
//                    System.out.println("How many Mobiles do you want to add");
//                    int num = s.nextInt();
//                    m= new Mobile[num];
//                    for (int i = 0;i<num;i++){
//                        System.out.println("Enter Mobile Name , ram , rom, price, Color");
//                        String name = s.next();
//                        int ram = s.nextInt();
//                        int rom = s.nextInt();
//                        double price = s.nextDouble();
//                        String color = s.next();
//
//                        Mobile mobile = new Mobile(name,ram,rom,color,price);
//                        m[i] = mobile;
//                    }
//                }
//                case 2: {
//
//                    if (m == null) {
//                        System.out.println("No mobiles added yet!");
//                        break;
//                    }
//
//                    System.out.println("1.Sort By Name");
//                    System.out.println("2.Sort By Price (High to low)");
//                    System.out.println("3.Sort By Price (Low to Hight)");
//                    System.out.println("4.Sort By Ram (High to low)");
//                    System.out.println("5.Sort By Ram (Low to Hight)");
//                    System.out.println("6.Sort By Rom (High to low)");
//                    System.out.println("7.Sort By Rom (Low to Hight)");
//                    System.out.println("8.Sort By Coloyr");
//
//                    int num = s.nextInt();
//
//                    if (num == 1) {
//                        Arrays.sort(m, new SortByName());
//                    } else if (num == 2) {
//                        Arrays.sort(m, new SortByPriceDesc());
//                    } else if (num == 3) {
//                        Arrays.sort(m, new SortByPricAsc());
//                    } else if (num == 4) {
//                        Arrays.sort(m, new SortByRamDesc());
//                    } else if (num == 5) {
//                        Arrays.sort(m, new SortByRamAsc());
//                    } else if (num == 6) {
//                        Arrays.sort(m, new SortByRomDesc());
//                    } else if (num == 7) {
//                        Arrays.sort(m, new SortByRomAsc());
//                    } else if (num == 8) {
//                        Arrays.sort(m, new SortByColour());
//                    }
//
//                    for (Mobile mobile : m)
//                        System.out.println(mobile);
//                }
//                break;
//
//                case 3: {
//                    if (m == null) {
//                        System.out.println("No mobiles added yet!");
//                    } else {
//                        for (Mobile mobile : m)
//                            System.out.println(mobile);
//                    }
//                }
//                break;
//
//                case 4: {
//                    r = false;
//                    System.out.println("Thank you visit again");
//                }
//                break;
//            }
//        } while (r);
//            s.close();
//            break;
//            }
//        }
//
//
