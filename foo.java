public class foo {
    public static void main(String[] args) {
        System.out.println(foo1(3,5));
    }
    static int foo1(int x,int y){
        if(y==0) return 1;

        return bar(x,foo1(x,y-1));
    }
    static int bar(int x,int y){
        if(y==0) return 0;
        return (x+bar(x,y-1));
    }
}
