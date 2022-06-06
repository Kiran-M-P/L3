// 
// Decompiled by Procyon v0.5.36
// 

package moraPonnu;

import java.util.Scanner;

public class moraiMain
{
    public static void main(final String[] args) {
        final boolean loop = true;
        while (loop) {
            final matcher m = new matcher();
            System.out.println("1.add person /n2.find morai /n3.Exit");
            final Scanner sc = new Scanner(System.in);
            final int cas = Integer.parseInt(sc.next());
            switch (cas) {
                case 1: {
                    System.out.println("Enter Name");
                    final String name = sc.next();
                    System.out.println("Enter fathers name");
                    final String fname = sc.next();
                    System.out.println("Enter Mother'sName,");
                    final String mname = sc.next();
                    System.out.println("Enter Gender as F or N  ");
                    final String gender = sc.next().toUpperCase();
                    m.createperson(name, fname, mname, gender);
                }
                case 2: {
                    System.out.println("Enter Name");
                    final String nam = sc.next();
                    m.checkmorai(nam);
                }
                default: {
                    continue;
                }
            }
        }
    }
}
