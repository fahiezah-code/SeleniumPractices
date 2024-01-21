package javapractise;

public class ControlStructure {

    enum myChar{
        A,
        B,
        C
    }

    public static void main(String[] args){
        ControlStructure ct = new ControlStructure();
       // ct.ifElseCheck();
        // ct.forLoopCheck();
       // ct.forEachLoopCheck();
       // ct.whileLoopCheck();
        ct.switchCheck();
       // ct.usedEnum();
    }

    public void ifElseCheck(){
        boolean flag = false;
        String str = "myStr";

        if(str.equalsIgnoreCase("myhgjStr") || flag){
         System.out.println("I'm in if");
        }else {
            System.out.println("I'm in else");
        }
    }

    public void forLoopCheck(){
        for(int i = 0; i<5; i++){
            System.out.println("i is " + i);
            if(i==3){
                break;
            }

        }
    }

    public void forEachLoopCheck(){
        String[] myArray = {"a", "b", "c"};
        for (String str:myArray) {
            System.out.println(str);
            if(str.equalsIgnoreCase("b")){
                break;
            }
        }

    }

    public void whileLoopCheck(){
        int i = 3;
        while(i<5){
            System.out.println(" i is " +i);
            i++;
            if(i ==4){
                break;
            }
        }
    }

    public void switchCheck(){

        String str = "a";
// why it returns 2 times a, a
        switch (str){
            case "a" :
                System.out.println(str);
                break;
            case "b" : // below should print when str is b?
                System.out.println(str);
                break;
        }
    }

    public void usedEnum(){
        myChar nowChar = myChar.B;
        switch (nowChar){
            case A:
                System.out.println(nowChar);
            case B:
                System.out.println(nowChar);
            case C:
                System.out.println(nowChar);

                // ++no need to write default, because switch allow only enum value
        }
    }


}
