import java.util.*;
import java.lang.*;
class parent{

    void method(){
        System.out.println("Called The Parent Method");
    }

}
class child extends parent{
    public child() {
        super();
    }

    void method() {
        System.out.println("Called The Child Method");
    }
}


 class updowncast {
    public static void main(String[] args) {

//        child c = new child();
//        parent s = new parent();//child can access it's own class ofc
//        c.method();
        child a = new child() ;// Child can't create Parent's Ins0tance
        parent x = new child();
        parent obj = (parent) new child();

        child d  = (child)x;

        obj.method();
        parent p = (parent) a;         // parent can access child's class
        p.method();
        d.method();
//        a.method();
    }

}
