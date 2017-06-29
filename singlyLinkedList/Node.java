package hw4;

public class Node<Item>
{
   public Item data;
   public Node<Item> next;

   public Node(Item data, Node<Item> next)
   {
      this.data = data;
      this.next = next;
   }
}
