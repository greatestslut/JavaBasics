package GetterSetterTest;

import java.util.ArrayList;

public class Student {
    private ArrayList<String> testAttr = new ArrayList<String>();
    //the return value is the reference of the testAttr field
//    public ArrayList<String> getTestAttr() {
//        return testAttr;
//    }
    public ArrayList<String> getTestAttr(){
        ArrayList<String> rltTestAttr = new ArrayList<>();
        for (String attr : testAttr) {
            rltTestAttr.add(attr);
        }
        return rltTestAttr;
    }

    public void setTestAttr(ArrayList<String> testAttr) {
        if (testAttr == null) {
            return;
        }
        this.testAttr = testAttr;
    }

}
