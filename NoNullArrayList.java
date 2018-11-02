import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>
{
  public NoNullArrayList()
  {
    super();
  }
  public NoNullArrayList(int setup)
  {
    super(setup);
  }
  public void add(int index, T word)
  {
    if (word == null)
    {
      throw new IllegalArgumentException();
    }
    else
    {
      super.add(index, word);
    }
  }
  public boolean add(T element)
  {
    if (element == null)
    {
      throw new IllegalArgumentException();
    }
    super.add(element);
    return true;
  }
  public T set(int index, T element)
  {
    if (element == null)
    {
      throw new IllegalArgumentException();
    }
      return super.set(index, element);
  }

}
