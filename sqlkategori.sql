create table kategori(id int(11) not null auto_increment,nama_kategori varchar(45) null,keterangan text null, primary key(id));
create table produk(id int(11) not null auto_increment,id_kategori int(11) not null,nama_produk varchar(45) null,keterangan text null, primary key(id), foreign key(id_kategori) references kategori(id));
insert into produk values(3,2,"crazy bb","sabun khusus orang gila"),(4,2,"Sabun Sadboy","Sabun khusus sad boy");
insert into kategori values(1,"Pasta Gigi","Pasta gigi khusus"),(2,"Sabun","Sabun khusus");
select * from produk;
select a.nama_kategori from kategori as a left join produk as b on (a.id=b.id_kategori);
select * from kategori inner join produk on (kategori.id=produk.id_kategori) where kategori.nama_kategori="sabun";
select * from kategori full join produk on (kategori.id=produk.id_kategori) where kategori.nama_kategori="sabun";
select * from kategori right join produk on (kategori.id=produk.id_kategori) where kategori.nama_kategori="sabun";
