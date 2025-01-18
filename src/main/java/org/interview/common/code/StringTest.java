package org.interview.common.code;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("123");
        String str2 = new String("123");
        System.out.println("String str1 = new String('123')");
        System.out.println("String str2 = new String('123')");
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("###########################################################");
        String str3 = "abc";
        String str4 = "abc";
        System.out.println("String str3 = 'abc'");
        System.out.println("String str4 = 'abc'");
        System.out.println("str3 == str4: " + (str3 == str4));
        System.out.println("str3.equals(str4): " + str3.equals(str4));
        System.out.println("###########################################################");
        String s1 = "d";
        String s2 = s1 + "ef";
        String s3 = "def";
        System.out.println("String s1 = 'd'");
        System.out.println("String s2 = s1 + 'ef'");
        System.out.println("String s3 = 'def'");
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));
        System.out.println("###########################################################");
        final String s4 = "hello";
        String s5 = s4 + "world";
        String s6 = "helloworld";
        System.out.println(
                "final String s4 = 'hello', because final variable is initialize in compiler time, so s4 is a constant");
        System.out.println("String s5 = s4 + 'world'");
        System.out.println("String s6 = 'helloworld'");
        System.out.println("s5 == s6: " + (s5 == s6));
        System.out.println("s5.equals(s6): " + s5.equals(s6));
        System.out.println("###########################################################");
        String h1 = "hello";
        final String h2 = h1;
        String h3 = h2 + "world";
        System.out.println("String h1 = 'hello'");
        System.out.println("final String h2 = h1, h1 is not a compiled constant, so h2 is not a constant");
        System.out.println("String h3 = h2 + 'world'");
        System.out.println("h3 == 'helloworld': " + (h3 == "helloworld"));
        System.out.println("h3.equals('helloworld'): " + h3.equals("helloworld"));
        System.out.println("###########################################################");
    }
}
