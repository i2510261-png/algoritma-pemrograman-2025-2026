#include <iostream>
using namespace std;

struct Node {
    int data;
    Node *next;
};

Node *head = NULL;

bool isKosong() {
    return head == NULL;
}

void insertBelakang(int nilai) {
    cout << "Data lama: ";
    Node *t = head;
    if (t == NULL) {
        cout << "(kosong)";
    } else {
        while (t != NULL) {
            cout << t->data << " ";
            t = t->next;
        }
    }
    cout << endl;

    Node *baru = new Node;
    baru->data = nilai;
    baru->next = NULL;

    if (isKosong()) {
        head = baru;
    } else {
        Node *bantu = head;
        while (bantu->next != NULL) {
            bantu = bantu->next;
        }
        bantu->next = baru;
    }

    cout << "Data baru ditambah: " << nilai << "\n\n";
}

int main() {
    insertBelakang(17);
    insertBelakang(18);
    insertBelakang(19);

    Node *bantu = head;
    while (bantu != NULL) {
        cout << bantu->data << " ";
        bantu = bantu->next;
    }
}
