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
    int holder = size();
    if (element == null)
    {
      throw new IllegalArgumentException();
    }
      for (int i = 0; i < size(); i++)
      {
        if (element.compareTo(get(i)) < 0)
        {
          holder = i;
          break;
        }
      }
      super.add(holder, element);
      return true;
    }
  public void add(int index, T element)
  {
    add(element);
  }
}
