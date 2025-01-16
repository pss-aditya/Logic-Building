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

class SinglyLL
{
    public node head;
    public int iCount;

    public SinglyLL()
    {
        head = null;
        iCount = 0;
    }

   

    public void Queue(int no)
    {
        node newn = null ;

        newn = new node(no);
       
        
        if(head == null)
        {
            head = newn;
        }
        else
        {
            node temp = head;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public void Display()
    {
        System.out.println("Elements of the linked list are:");

        node temp = head;

        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return iCount;
    }

    public int Dequeue()
    {
        int no =0 ;

        if(head == null)
        {
            System.out.println("Q is empty");
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

class program511
{
    public static void main(String Arr[])
    {
        Queue sobj = new Queue();
        int iRet = 0;

        sobj.Enqueue(51);
        sobj.Enqueue(21);
        sobj.Enqueue(11);

        sobj.Enqueue(101);
        sobj.Enqueue(121);
        sobj.Enqueue(151);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the Queue are : "+iRet);

        iRet = sobj.Dequeue();
        System.out.println("Removed:"+iRet);

        iRet = sobj.Dequeue();
        System.out.println("Removed:"+iRet);

        iRet = sobj.Dequeue();
        System.out.println("Removed:"+iRet);
        
         sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the  are : "+iRet);
    }
}