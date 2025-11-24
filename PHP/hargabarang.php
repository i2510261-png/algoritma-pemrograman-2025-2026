<?php
    echo "Masukkan nama barang: ";
    $nama = trim(fgets(STDIN)); 
    echo "Masukkan harga barang: ";
    $harga = (float)trim(fgets(STDIN)); 
    echo "Masukkan jumlah beli: ";
$jumlah = (int)trim(fgets(STDIN)); 

$total = $harga * $jumlah;
$diskon = 0;

if ($total > 26.100) {
    $diskon = $total * 0.010;
}

$total_bayar = $total - $diskon;

echo "\nSTRUK PEMBELIAN\n";
echo "Nama Barang: ";
echo $nama;
echo "\nHarga Satuan: ";
echo $harga;
echo "\nJumlah Beli: ";
echo $jumlah;
echo "\nTotal Harga: ";
echo $total;
echo "\nDiskon: ";
echo $diskon;
echo "\nTotal Bayar: ";
echo $total_bayar;
echo "\nSELESAI\n";
?>