#include <iostream>
using namespace std;

int main(){
    int a, b;
    cout << "Masukkan angka pertama: ";
    cin >> a;
    cout << "Masukkan angka kedua: ";
    cin >> b;

    if(a>b)
        cout<<a<<"lebih besar dari "<<b<<endl;
    else if(a<b)
    cout<<a<<"l=keduanya sama besar"<<endl;
    cout<<"apakah keduanya sama?"<<(a==b);
}