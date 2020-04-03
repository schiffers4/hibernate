use pascal;
create table trainee(idTrainee int not null,nama varchar(255) null,asal_sekolah varchar(50) nultraineetraineel, primary key(idTrainee));
alter table trainee(idTrainee int not null,nama varchar (255) null,asal_sekolah varchar (50) null, primary key(idTrainee));
drop table trainee;
select * from trainee;
insert into trainee values(3,"Pepy","asal-asalan");
insert into trainee values(6,"Pepy5","asal-asalan"),(7,"Pepy4","asal-asalan"),(10,"Pepy3","asal-asalan");
insert into trainee (nama,asal_sekolah) values("asd","asal-asalan");
delete from trainee where idTrainee=3;
update trainee set nama="Schiffers",asal_sekolah="asal aja lah" where idTrainee=1;
select nama,asal_sekolah from trainee;
select * from trainee order by nama asc;
delete from trainee where idTrainee=9;
select * from trainee where nama like "pep%";
select count nama from trainee;
set SQL_SAFE_UPDATEs=0; --jika error sql_safe_updates--
select * from trainee limit 5;