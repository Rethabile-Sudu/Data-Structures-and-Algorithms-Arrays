
/**
 * Write a description of class MyArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class MyArrayList<E>
{ 

  private int size; // Number of elements in the list
  private E[] data;
  /** Create an empty list */
  public MyArrayList() {
       data = (E[])new Object[100];// cannot create array of generics
       size = 0; // Number of elements in the list
  }
  
  public void add(int index, E e) {   
    // Ensure the index is in the right range
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size); 
    // Move the elements to the right after the specified index
    for (int i = size - 1; i >= index; i--)
      data[i + 1] = data[i];
    // Insert new element to data[index]
    data[index] = e;
    // Increase size by 1
    size++;
  }

  public boolean contains(Object e) {
    for (int i = 0; i < size; i++)
      if (e.equals(data[i])) return true;
    return false;
  }

  public E get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    return data[index];
  }
  
  public E remove(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException
        ("Index: " + index + ", Size: " + size);
    E e = data[index];
    // Shift data to the left
    for (int j = index; j < size - 1; j++)
      data[j] = data[j + 1];
    data[size - 1] = null; // This element is now null
    // Decrement size
    size--;
    return e;
  }

  public String toString() {
    String result=" ";
    for (int i = 0; i < size; i++) {
      result+= data[i];
      if (i < size - 1) result+=", ";
    }
    return result.toString() + "]";
  }
  
 /** public void getFiltered(E value)
  {
      int j = 0;
      E[] temp = (E[]) new Object[100];
      
      if(size == 0)
      return;
      
      for(int i = 0;i < size;i++)
      {
          if(((Comparable)data[i]).compareTo(value) > 0)
          {
             temp[j] = data[i];
             j++;
          }
      }
      data = temp;
      size = j;         
  }**/
  
  public boolean getUnique()
  {
    E t;
    
    for (int s = 0; s < size-1;s++)
     if (((Comparable)data[s]).compareTo(data[s+1]) == 0)
     return false;
    
        for(int j = 0; j<size-1;j++)
        {
            if(((Comparable)data[j]).compareTo(data[j+1]) != 0)
            {
               t = data[j+1];
               data[j+1] = data[j];
               data[j] = t;
            }
        }
    return true;    
  }

   public E getMax()
  {
      if(size == 0)
       throw new IndexOutOfBoundsException("The list is empty");
      
      E max = data[0];
      for(int i = 0;i < size-1; i++)
      {
          if(((Comparable)data[i]).compareTo(data[i+1]) > 0)
           max = data[i+1];
           data[i+1] = data[i];
           data[i]=max;
      }
      return max;
      
  }
  
 
  
    public E getMin()
   {
       if(size == 0)
        throw new IndexOutOfBoundsException("The list is empty");
        
        E min = data[0];
        for(int s = 0; s < size-1;s++)
        {
            if(((Comparable)data[s]).compareTo(data[s+1]) < 0)
            min = data[s+1];
            data[s+1] = data[s];
            data[s] = min;
        }
        return min;    
   }

  
  public int size() {
    return size;
  }
  
 public boolean sortList() {
    E hold;
    for (int i = 0; i < size-1; i++)
     {
       for (int j = 0; j<size-1; j++)
        {       
         if(((Comparable)data[j]).compareTo(data[j+1])>0)
          {
           hold= data[j+1];
           data[j+1]=data[j];
           data[j]=hold;
          }       
       }
     } 
     return true;          
  }
}
