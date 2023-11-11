Proje 1
[22,27,16,2,18,6] -> Insertion Sort
Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.

insert 27=> [22,27,16,2,18,6] <br>
insert 16=> [16,22,27,2,18,6] <br>
insert 2=> [2,16,22,27,18,6]<br>
insert 18=> [2,16,18,22,27,6]<br>
insert 6=> [2,6,16,18,22,27]<br>

Big-O gösterimini yazınız.

O(n)

Time Complexity: Dizi sıralandıktan sonra 18 sayısı aşağıdaki case'lerden hangisinin kapsamına girer? Yazınız <br>

<b>Average case: Aradığımız sayının ortada olması</b> <br>
Worst case: Aradığımız sayının sonda olması<br>
Best case: Aradığımız sayının dizinin en başında olması.<br>
.



[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre ilk 4 adımını yazınız. <br>
swap 7,2  => [2,3,5,8,7,4,15,6]<br>
3 no swap => [2,3,5,8,7,4,15,6]<br>
swap 5,4  => [2,3,4,8,7,5,15,6]<br>
swap 8,5  => [2,3,4,5,7,8,15,6]<br>

Proje 2
[16,21,11,8,12,22] -> Merge Sort

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
[16,21,11] - [8,12,22]<br>
[16,21] [11] - [8,12] [22]<br>
[16] [21] [11] [8] [12] [22]<br>
[16,21] [8,11] [12,22]<br>
[8,11,16,21],[21,22]<br>
[8,11,12,16,21,22]<br>
Big-O gösterimini yazınız.
O(nlogn)<br>
