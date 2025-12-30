#include <iostream>
using namespace std;

struct TNode {
    int data;
    TNode *next;
};

TNode *head = NULL;

bool isEmpty() {
    return head == NULL;
}

void insertDepan(int databaru) {
    TNode *baru = new TNode;
    baru->data = databaru;
    baru->next = head;
    head = baru;
}

int main() {
    insertDepan(17);
    insertDepan(18);
    insertDepan(19);

    TNode *curr = head;
    while (curr != NULL) {
        cout << curr->data << " ";
        curr = curr->next;
    }
}
