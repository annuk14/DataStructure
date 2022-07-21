package com.qa.datastructures;

public class StackImplusingarray {
	
	//stack is linear data structure ,it is ordered list which follow LIFO principle i.e LAST IN FIRST OUT.here we have only one end
	//i.e top end and insertion and deletion perform at that end.you can insert data and delete data rom one end only i.e top.if top==-1 it means stack is empty
	//Time Complexity of push(),pop(),peek(),isFull(),isEmpty() operations is O(1) ca there is no for loop
	//Applications of stack is: it can be used * when you have to reverse a string *in recursive function* can be used in algorithm like DFS,Tree trvaersal,Tower of Hanoi


	int size;
	int stack[];
	int top;
	 public StackImplusingarray(int size) {
		 
		 this.size=size;
		 this.stack=new int[size];
		 this.top=-1;
	 }
	 
	 public boolean isFull() {
		 return (top==size-1);
	 }
	 
	 public boolean isEmpty() {
		 return (top==-1);
	 }

	 public void push(int data) {  //in case stack is full then it is overflow condition ie. stack is full.you cannot push data
		                            //if top==size-1 then stack is full
		// if(top==size-1) {  //you can write this line also
		 if(isFull()) {
			 System.out.println("overflow condition:stack is empty");
		 }else {
			 top++;
			 stack[top]=data;
			 System.out.println("pushed data is :"+data);
		 }
	 }
	 
	 public void pop() {// if there is no element present in stack it means stack is empty,you cannot popped out any data
		                //it means underflow condition .in pop(),we dont pass any aruement cz top element is popped out.you cannot popped out element from stack in between
		                //pop() means it will give you the top element present in stack plus it will remove the element as weel
		                //i.e it will decrease the size of stack by 1
		 
		 int item;
		// if(top==-1) {
		 if(isEmpty()) {
			 System.out.println("underflow condition:stack is empty");
		 }else {
			item=stack[top];
			top--;
			System.out.println("pooped data is :"+item);
		 }
	 }
	 
	 public void peek() {
		 if(isEmpty()) {
			 System.out.println("underflow condition:stack is empty");
		 }
		 else {
			 System.out.println("peek data is:"+stack[top]);
		 }
	 }
	 
	 public void display() {
		 
		 int i;
		 for(i=top;i>=0;i--) {
			 System.out.println(stack[i]);
		 }
	 }
	public static void main(String[] args) {

		StackImplusingarray simp=new StackImplusingarray(7);
		simp.pop();
		simp.peek();
		System.out.println(simp.isEmpty());
        simp.push(1);
		simp.push(1);
		simp.push(8);
		simp.push(13);
		simp.push(17);
		simp.push(5);
		simp.push(19);
		System.out.println(simp.isFull());
        simp.display();
		simp.pop();
		simp.display();
		simp.peek();
		System.out.println(simp.isEmpty());
		System.out.println(simp.isFull());




		
	}

}
