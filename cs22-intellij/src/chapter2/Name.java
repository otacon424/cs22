package chapter2;

public class Name
{
    private String fName, lName;
    private char mName;
    
    public Name(String fName, String lName, char mName) {
        this.fName = fName;
        this.lName = lName;
        this.mName = mName;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
    
    public char getmName()
    {
        return mName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public void setmName(char mName)
    {
        this.mName = mName;
    }

    @Override
    public String toString() {
        return "Name = {" +
                "First Name: '" + fName + '\'' +
                ", Last Name: '" + lName + '\'' +
                ", Middle Name: " + mName +
                '}';
    }
}
