package org.example.emplyee;

public class que {
int size=5;
int Q[] =new int[size];
int front,rear;
	que() {
		front = -1;
		rear = -1;
		
	}
	boolean isempty()
	{
		return(front == -1);
	}
	boolean isfull() {
		return (rear == size-1);
		
	}
	void enqueue(int x) {
		if(isfull()) {
			System.out.println("queue is full");
			
		}
		else {
			if(front == -1) {
				front =0;
			}
			rear++;
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
			if(front>rear)
			{
				front =-1;
				rear=-1;
			}
			else {
				front++;
				
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
			for(int i=front;i<=rear;i++) {
				System.out.println(Q[i]+"");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que q1=new que();
		q1.enqueue(11);
		q1.enqueue(12);
		q1.enqueue(13);
		q1.enqueue(14);
		q1.display();
		q1.dequeue();
		q1.display();

	}

}
