/* 4.28 Dangling-Else Problem

if (x < 10)
 if (y > 10)
 System.out.println("*****");
 else
 System.out.println("#####");
 System.out.println("$$$$$");
 if (x < 10) {
 if (y > 10)
 System.out.println("*****");
 }
 else {
 System.out.println("#####");
 System.out.println("$$$$$");
 }

Fixed one

if (x < 10) {
    if (y > 10)
        System.out.println("*****");
    else
        System.out.println("#####");
}
System.out.println("$$$$$");

if (x < 10) {
    if (y > 10)
        System.out.println("*****");
}
else {
    System.out.println("#####");
    System.out.println("$$$$$");
}
