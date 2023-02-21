package com.mycompany.libro;

public class Libro {

    public static void main(String[] args) {
        String s = "Hola";
        int x = s.length();
        
        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        String s2 = "Hola";
        boolean b2 = s2.isEmpty();
        
        String t = "Hola";
        for(int i=0; i<t.length(); i++){
        char c = t.charAt(i);
        System.out.println(c);
        }
        String X = "Hola";
        String y = "Hola";
        if(X.equals(y)){
        System.out.println("Si pasa por aqui");
        }
        
        String S = "Hola, como estan?";
        int p1 = S.indexOf('a');
        int p2 = S.lastIndexOf('a');
        
        String z = "Hola, como estas? Estas como querias?";
        int t1 = z.indexOf("como");
        int t2 = z.indexOf("estas");
        int t3 = z.lastIndexOf("como");
        
        String Z = "Hola, como estas?";
        String may = Z.toUpperCase();
        String min = Z.toLowerCase();
        
        String q = "Hola, como estas?";
        String q1 = q.substring(0,4);
        String q2 = q.substring(6,10);
        String q3 = q.substring(11);
        
        String r1 = "1234";
        int i = Integer.parseInt(r1);
        String T1 = Integer.toString(i);
        String r2 = "1234.56";
        double D = Double.parseDouble(r2);
        String T2 = Double.toString(D);
        
        String P = "Hola";
        String Y = "que tal?";
        String u = P+Y;
        
        String f = "Hola";
        f = "chau";
        System.out.println(f);
        
        String O = "Hola";
        O+= ", chau";
        System.out.println(O);
        
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");
        System.out.println(sb);
        
        StringBuilder sd = new StringBuilder("Hola");
        sd.setCharAt(2,'X');
        System.out.println(sd);
    }
}
