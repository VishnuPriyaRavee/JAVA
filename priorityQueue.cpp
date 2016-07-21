include <iostream>
using namespace std;

class priorityQueue
{
private:
    int front;
    int rear;
    int size;
    int *array;

public:
    priorityQueue();
    ~priorityQueue();
    void insert(int x);
    
    int extractMin();
    bool empty();
};

priorityQueue::priorityQueue()
{
    front = rear = -1;
    size = 10;
    array = new int[size];
}

priorityQueue::~priorityQueue()
{
    delete[] array;
}

void priorityQueue::insert(int x)
{
    //if queue is full
    if ( (rear + 1)% size == front ){
        return;
    }

    //else if queue is empty
    else if ( empty() ){
        rear = front = 0;
    }

    else
    {
        rear = (rear + 1) % size;
    }

    array[rear] = x;
}

//extract and return smallest value in queue
int priorityQueue::extractMin()
{
    int minValue = array[front];

    if ( empty() ){
        return -1;
    }

    else if (front == rear){
        front = rear = -1;
        }

    else
    {
        front = (front + 1) % size;
    }

    //find smallest value
    for (int i = front; i <= rear; i++){
        if (array[i] < minValue)
            minValue = array[i];
    }

    //return smallest value
    return array[front];
}

bool priorityQueue::empty()
{
    if ( (front == -1) && (rear == -1) )
        return true;
    else
        return false;
}

int main()
{
    priorityQueue myqueue;

    myqueue.insert(4);
    myqueue.insert(3);
    myqueue.insert(2);
    myqueue.insert(1);

    cout << myqueue.extractMin() << endl;
    cout << myqueue.extractMin() << endl;

    myqueue.insert(8);
    myqueue.insert(7);
    myqueue.insert(6);
    myqueue.insert(5);

    cout << myqueue.extractMin() << endl;
    cout << myqueue.extractMin() << endl;
    cout << myqueue.extractMin() << endl;

    system("pause");
    return 0;
}
