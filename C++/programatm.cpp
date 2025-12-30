#include <iostream>
#include <string>
using namespace std;    

int main() {
    string nama;

    while (true) {
        cout << "Masukkan Nama: ";
        cin >> nama;

        if (nama == "Intan Khalimatu Sa'diyah") {
            cout << "Nama TRUE\n";
            break;
        } else {
            cout << "Nama FALSE, Masukkan Ulang!!\n";
        }
    }

    string nim = "2510261";
    int saldo = stoi (nim);
    cout << "NIM: " << nim <<endl;
    cout << "saldo kamu sekarang: Rp " << saldo << endl;

    int pilih;

    while (true) {
        cout << "\n==== MENU ATM ====\n";
        cout << "1. cek saldo\n2. tarik tunai\n3 setor tunai\n4. transfer\n5 keluar\n";
        cin >> pilih;

        if(pilih == 1) {
            cout << "saldo: Rp " << saldo << endl;

        } else if (pilih == 2) {
            int tarik;
            cout << "jumlah tarik: ";
            cin >> tarik;

            if (tarik <= saldo) {
                saldo -= tarik;
                cout << "berhasil sisa saldo: " << saldo << endl;
            } else { 
                cout << "saldo tidak cukup!\n;"
    
            }else if (pilih == 3) {
            int setor;
            cout << "jumlah setor:" ;
            cin >> setor;
            saldo += setor;
            cout << "saldo baru: Rp " << saldo << endl;

        }else if (pilih == 4) {
            string tujuan;
            int jumlah;
            cout << "rekening tujuan: ";
            cin >> tujuan;
            cout << "jumlah transfer: ";
            cin >> jumlah;

            if (jumlah <= saldo) {
            saldo -= jumlah;
            cout << "transfer berhasil. sisa saldo: rp" << saldo << endl;
            } else {
                cout << "saldo tidak cukup!\n";
            }
        } else if (pilih == 5) {
            cout << "terima kasih\n";
            break;
        
        }else {
             cout << "menu tidak valid!\n";
        }
    }

return 0;