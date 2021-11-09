class MyDefaultConstructor{
    int x;
    int y;
    MyDefaultConstructor(){
        x=10;
        y=20;
    }
}
class MyParameterizedContructor{
    int x,y;
    MyParameterizedContructor(int i, int j){
        x=i;
        y=j;
    }
}
public class DefaultConstructorAndParameterizedConstructor {
    public static void main(String[] args) {
        MyDefaultConstructor constructor1 = new MyDefaultConstructor();
        MyDefaultConstructor constructor2 = new MyDefaultConstructor();
        System.out.println(constructor1.x + " " + constructor2.x);
        System.out.println(constructor1.y + " " + constructor2.y);
        MyParameterizedContructor c1 =new MyParameterizedContructor(10,20);
        System.out.println(c1.x + " " + c1.y);
    }
}