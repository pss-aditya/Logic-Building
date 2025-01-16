class node  
{
    public int data;
    public node next;

    public node(int x)
    {
        data = x;
        next = null;
    }
}

class Stack
{
    public node head;
    public int iCount;

    public Stack()
    {
        head = null;
        iCount = 0;
    }

    public void Push(int no)
    {
        node newn = null ;

        newn = new node(no);
       
        
        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
        }
        iCount++;
    }

    public void Display()
    {
        System.out.println("Elements of the linked list are:");

        node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    
    }

    public int Count()
    {
        return iCount;
    }

    public void Pop()
    {
        int no = 0;
        if(head == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else if(head.next == null)
        {
            no = head.data;
            head = null;
            System.gc();
        }
        else
        {
            no = head.data;
            head = head.next;
            System.gc();
        }

        iCount--;

        return no;
    }

}

class program512
{
    public static void main(String Arr[])
    {
        SinglyLL sobj = new SinglyLL();
        int iRet = 0;

        sobj.Push(51);
        sobj.Push(21);
        sobj.Push(11);

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elements in the Linked List are : "+iRet);

        sobj.InsertAtPos(75,4);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the Linked List are : "+iRet);

        
        sobj.DeleteAtPos(4);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the Linked List are : "+iRet);
   
    }
}