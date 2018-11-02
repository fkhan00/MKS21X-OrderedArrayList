public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>
{
  public OrderedArrayList()
  {
    super();
  }
  public OrderedArrayList(int startingCapacity)
  {
    super(startingCapacity);
  }
  public boolean add(T element)
  {
    int present = 0;
    if (element == null)
    {
      throw new IllegalArgumentException();
    }
      for (int i = 0; i < size(); i++)
      {
        if ( element.compareTo(get(i)) < 0)
        {
          present = i;
        }
      }
      super.add(present, element);
      return true;
    }
  public void add(int index, T element)
  {
    add(element);
  }
}
