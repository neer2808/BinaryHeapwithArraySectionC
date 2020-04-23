public class BinaryHeapWithArrayMainC {

  public static void main(String[] args) {

    BinaryHeapwithArrayC obj = new BinaryHeapwithArrayC(10);
    obj.insert(13);
    obj.insert(8);
   obj.insert(6);
    obj.insert(11);
    obj.insert(9);
    obj.insert(40);
   // obj.display();
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());
    System.out.println(obj.extract());


  }
}
