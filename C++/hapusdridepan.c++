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
    cout << "Data lama: ";
    TNode *t = head;
    if (t == NULL) cout << "(kosong)";
    else while (t != NULL) { cout << t->data << " "; t = t->next; }
    cout << endl;

    TNode *baru = new TNode;
    baru->data = databaru;
    baru->next = head;
    head = baru;

    cout << "Data baru ditambah di depan: " << databaru << "\n\n";
}

void hapusDepan() {
    if (isEmpty()) {
        cout << "Linked list kosong\n";
        return;
    }

    TNode *temp = head;
    int nilai = temp->data;

    head = head->next;
    delete temp;

    cout << nilai << " berhasil dihapus dari depan\n\n";
}

int main() {
    insertDepan(12);
    insertDepan(13);
    insertDepan(14);

    hapusDepan();
    hapusDepan();

    cout << "Isi linked list sekarang: ";
    TNode *bantu = head;
    while (bantu != NULL) {
        cout << bantu->data << " ";
        bantu = bantu->next;
    }
}
