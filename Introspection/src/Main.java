import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {

        Class theClass;
        Class[] theInterface;
        Method[] theMethods;
        Z objectZ = new Z();
        theClass = objectZ.getClass().getSuperclass();
        theInterface = theClass.getInterfaces();
        theMethods = theClass.getDeclaredMethods();
        System.out.println(theClass);
        for(int i = 0; i< theInterface.length; i++){
            System.out.println(theInterface[i].getName());
        }

        for(int i = 0; i< theMethods.length; i++){
            System.out.println(theMethods[i].getName());
        }

        System.out.println("---------------------------");

        while((theClass = theClass.getSuperclass()) != null ){
            System.out.println(theClass);
            theInterface = theClass.getInterfaces();
            theMethods = theClass.getDeclaredMethods();

            for(int i = 0; i< theMethods.length; i++){
                System.out.println(theMethods[i].getName());
            }

            System.out.println("---------------------------");
        }
    }

}
