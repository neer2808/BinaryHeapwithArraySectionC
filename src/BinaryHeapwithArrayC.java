public class BinaryHeapwithArrayC {
  int arr[];
  int sizeoftree;
  public BinaryHeapwithArrayC(int size)
  {
    arr = new int[size+1];
    sizeoftree = 0;
  }

  public void insert(int value)
  {
    arr[sizeoftree+1]= value;
    sizeoftree++;
    heapify(sizeoftree); // define the logic for compare and swap


  }

  public void heapify(int index)
  {
    int parent= index/2;
    if(index<=1)
    {
      return;
    }
    if(arr[index]<arr[parent])
    {
      int temp = arr[index];
      arr[index]= arr[parent];
      arr[parent]= temp;

    }
    heapify(parent);
  }

  public boolean isheapemmpty()
  {
    if(sizeoftree<=0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public void delete()
  {
    arr = null;
    System.out.println("heap deleted");
  }
  public void peek()
  {
    if(isheapemmpty()== false)
    {
      System.out.println("empty");
    }
    else
    {
      System.out.println(arr[1]);
    }
  }
  public int sizeofarray()
  {
    return arr.length;
  }

  public  int sizeoftree()
  {
    return sizeoftree;
  }

  public void display()
  {
    for(int i =1;i<=sizeoftree;i++)
    {
      System.out.println(arr[i]);
    }
  }


  public int extract()
  {
    if(sizeoftree==0 )
    {
      System.out.println("heap is empty");
      return -1;
    }
    else
    {
      int result = arr[1];
      arr[1] = arr[sizeoftree];
      sizeoftree--;
      heapifyextract(1);
      return result;
    }
  }
  public void heapifyextract(int index)
  {
    int left = index*2;
    int right = (index*2)+1;
    int smallestchild = 0;
    if(sizeoftree<left)
    {
      return;
    }
    else if( sizeoftree== left )
    {
      if(arr[index]> arr[left])
      {
        int temp = arr[index];
        arr[index]= arr[left];
        arr[left]= temp;

      }
      return;

    }
    else
    {
        if(arr[left]< arr[right])
          smallestchild = left;
          else
            smallestchild= right;

          if(arr[index]>arr[smallestchild])
          {
            int temp = arr[index];
            arr[index] = arr[smallestchild];
            arr[smallestchild]= temp;

          }

    }
    heapifyextract(smallestchild);

  }

}
