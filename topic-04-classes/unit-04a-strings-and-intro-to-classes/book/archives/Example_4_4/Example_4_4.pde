String str1 = "cat";
String str2 = "Cat";

if(str1.compareTo(str2) < 0){
     println(str1+" comes before "+ str2 +" in the alphabet");
}
else if(str1.compareTo(str2) > 0){
     println(str2 +" comes before "+ str1+" in the alphabet");
}
else{
    println("The strings are identical");
}