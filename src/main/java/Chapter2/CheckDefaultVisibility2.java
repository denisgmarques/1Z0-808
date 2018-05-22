package Chapter2;

/**
 * Created by denisgmarques on 21/05/2018.
 */
public class CheckDefaultVisibility2 {

    public CheckDefaultVisibility2(CheckDefaultVisibility1 class1) {
        class1.attrProtected = "a"; // protected is visible for classes in the same package
        class1.attrPublic = "a"; // Public is visible to all classes
        class1.attrWithoutVisibility = "a"; // Default in a class is public
        // class1.attrPrivate = "a"; Can't see because is private
    }
}
