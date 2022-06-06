// 
// Decompiled by Procyon v0.5.36
// 

package moraPonnu;

import java.util.ArrayList;

public class person
{
    static int id;
    String Name;
    person FName;
    person MName;
    ArrayList<person> sisters;
    ArrayList<person> brothers;
    ArrayList<person> Daughters;
    ArrayList<person> sons;
    String Gender;
    
    static {
        person.id = 0;
    }
    
    person(String Name) {
        this.sisters = new ArrayList<person>();
        this.brothers = new ArrayList<person>();
        this.Daughters = new ArrayList<person>();
        this.sons = new ArrayList<person>();
        Name = this.Name;
        ++person.id;
    }
}
