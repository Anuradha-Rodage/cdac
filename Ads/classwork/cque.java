package org.example.emplyee;

public class cque {
int size=5;
int Q[] =new int[size];
int front,rear;
	cque() {
		front = -1;
		rear = -1;
		
	}
	boolean isempty()
	{
		return(front == -1);
	}
	boolean isfull() {
		return ((rear + 1)%size == front);
		
	}
	void enqueue(int x) {
		if(isfull()) {
			System.out.println("queue is full");
			
		}
		else {
			if(front == -1) {
				front =0;
			}
			rear=(rear+1)%size;
			Q[rear]=x;
			System.out.println(x+"inserted");
		}
	}
	int dequeue() {
		if (isempty()) {
			System.out.println("queue is empty");
			return -1;
			
		}
		else {
			int x=Q[front];
			System.out.println(x+"deleted");
			if(front==rear)
			{
				front =-1;
				rear=-1;
			}
			else {
				front=(front+1)%size;
				
			}
			return x;
		}
	}
	void display()
	{
		if(isempty()) {
			System.out.println("empty queue");
			
		}
		else {
			System.out.println("queue element ");
			int i=front;
		
			while(i !=rear) {
				System.out.println(Q[i]+" ");
				i=(i+1)%size;
			}
			System.out.println(Q[rear]);
			
				
			
			System.out.println();
		}
	}
	/*for(i =front; i!=rear;i=(i+1)%size)
	{
		sop(Q[rear]);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cque q1=new cque();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(11);
		q1.display();
		

	}

}