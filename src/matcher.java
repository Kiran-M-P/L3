// 
// Decompiled by Procyon v0.5.36
// 

package moraPonnu;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;

public class matcher
{
    static HashMap<String, person> dat;
    
    static {
        matcher.dat = new HashMap<String, person>();
    }
    
    public void createperson(final String name, final String Fname, final String MName, final String gender) {
        final person p = new person(name);
        p.Gender = gender;
        matcher.dat.put(p.Name, p);
        for (final String i : matcher.dat.keySet()) {
            final person l = matcher.dat.get(i);
            if (l.Name == Fname) {
                p.FName = matcher.dat.get(i);
            }
            else {
                final person f = new person(Fname);
                p.FName = f;
            }
            if (l.Name == MName) {
                p.MName = matcher.dat.get(i);
            }
            else {
                final person m = new person(Fname);
                p.FName = m;
            }
            if (p.FName == l.FName) {
                if (l.Gender == "F") {
                    p.sisters.add(l);
                }
                else {
                    p.brothers.add(l);
                }
            }
            if (name == l.FName.Name) {
                if (l.Gender == "F") {
                    p.Daughters.add(l);
                }
                else {
                    p.sons.add(l);
                }
            }
        }
    }
    
    public void checkmorai(final String name) {
        final ArrayList<person> morais = new ArrayList<person>();
        final person mora = matcher.dat.get(name);
        if (mora.Gender == "F") {
            for (final person i : mora.FName.sisters) {
                morais.addAll(i.sons);
            }
        }
        else {
            for (final person i : mora.MName.brothers) {
                morais.addAll(i.Daughters);
            }
        }
    }
}
