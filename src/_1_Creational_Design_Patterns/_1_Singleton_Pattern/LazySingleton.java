package _1_Creational_Design_Patterns._1_Singleton_Pattern;

import java.io.Serializable;

/**
 * Lazy initialization mean application will create instance when it is requested.
 * However, this can be used when you have non-thread-safe application. If used in multi threading it might break,
 * Why? because your getinstance method if invoked by two thread at same time then!!!!
 *
 * When to use?  Non thread safe and creating common resource like db connection.
 *
 *
 */
public class LazySingleton implements Serializable {
    private static LazySingleton instance = null;

    //constructor made private therefore others can't use it to publicly create object
    private LazySingleton() {

    }

    //check if instance is already created or not, if not create one, if already have then use that object
    public static LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
