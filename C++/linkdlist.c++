#include <iostream>

using namespace std;

//Declare Node
struct Node{
    int num;
    Node *next;
};

//Declare starting (Head) node
struct Node *head = NULL;

//Insert node at start
void insertNode(int n){
    struct Node *newNode = new Node;
    newNode->num = n;
    newNode->next = head;
    head = newNode;

    printf("     Insert %d, DATA menjadi >> [ ", n);
}

//Traverse/ display all nodes (print items)
void display(){
    if(head == NULL){
        printf(">> List is empty ! \n");
        return;
    }
    struct Node *temp = head;

    while(temp != NULL){
        cout << temp->num << " ";
        temp = temp->next;
    }
    printf("]\n");
}

//delete node from start
void deleteItem(){
    if(head == NULL){
        printf(">> List is empty ! \n");
        return;
    }
    printf("     (%d) Removed, DATA menjadi >> [ ", head->num);
    head = head->next;
}

int main(){

    display();    
    insertNode(10);

    display();
    insertNode(20);

    display();
    insertNode(30);

    display();
    insertNode(40);

    display();
    insertNode(50);

    display();
    deleteItem();

    display();
    deleteItem();

    display();
    deleteItem();

    display();
    return 0;
}