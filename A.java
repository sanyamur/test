public class A {
    private String n="sasha";
    private int zz=100;
    
    public class B{
        //private final A this$0;
        
        public void f(){
        n="mm";// я получаю доступ через зыс, и метод, который байткод сам внутри а прописывает, чтобы изменить прайвит, это все делает 
        // inside a : static void g(a obg, int n){ obj.zz=n;}--так можно см. вниз 
        zz=200;
    }
  
      
    }

public void m(){
        System.out.println(n);
        System.out.println(zz);

    }

     private static void changeN(A obj, String newName) {
        obj.n = newName;  // Доступ разрешён, потому что метод внутри класса a
    }
    
    public void k(A obj) {
        //changeN(obj, "kate");  // Вызываем хелпер
        obj.n="mmm";//inside class even if its another object we can change private
    }

    
}
