import org.w3c.dom.ls.LSOutput;

class a1{
    Integer x;
    public a1 (int x){
        this.x=x;
    }
    public boolean equals(a1 other){
        return (this.x == other.x);
    }
}


class equalsovrr {
    public static void main(String[] args) {

        a1 a = new a1(20);
        a1 b = new a1(20);
        System.out.println(a.equals(b)) ;
    }



}
