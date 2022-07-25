create table user(
	id_user int not null,
	nama varchar(50) not null,
	alamat varchar(50) not null,
	tanggal_lahir date not null,
	status_user varchar(25) not null,
	gender char(10) not null,
	created_at date not null,
	updated_at date not null,
	primary key(id_user));
INSERT INTO `user` (`id_user`, `nama`, `alamat`, `tanggal_lahir`, `status_user`, `gender`, `created_at`, `updated_at`) VALUES ('1', 'Andi', 'Bandung', '2022-07-25', 'Aktif', 'L', '2022-07-25', '2022-07-25'), ('2', 'Nina', 'Bandung', '2022-07-25', 'Aktif', 'P', '2022-07-25', '2022-07-25')

drop table user;

create table product(
	id_product int not null,
	product varchar(50) not null,
	product_type varchar(50) not null,
	product_description varchar(50) not null,
	operator varchar(20) not null,
	id_payment_method int not null,
	primary key(id_product),
	FOREIGN KEY(id_payment_method) references payment(id)
);

INSERT INTO `product` (`id_product`, `product`, `product_type`, `product_description`, `operator`, `id_payment_method`) VALUES ('1', 'Barang 1', 'Aksesoris', 'Ini barang', 'Yes', '1')

drop table payment;

create table payment(
	id int not null,
	payment_method varchar(20) not null,
	primary key(id)
);

INSERT INTO `payment` (`id`, `payment_method`) VALUES ('1', 'Cash'), ('2', 'Cicil');

drop table product;

create table transaksi(
	id_transaksi char(10) not null,
	id_user int not null,
	tanggal datetime not null,
	total_bayar int not null,
	primary key(id_transaksi)
);
INSERT INTO `transaksi` (`id_transaksi`, `id_user`, `tanggal`, `total_bayar`) VALUES ('1', '1', now(), '50000');
drop table transaksi;

create table transaksi_detail(
	id int not null,
	id_transaksi char(10) not null,
	id_product int not null,
	harga int not null,
	qty int not null,
	subtotal int not null,
	primary key(id)
);

INSERT INTO `transaksi_detail` (`id`, `id_transaksi`, `id_product`, `harga`, `qty`, `subtotal`) VALUES ('1', '1', '2', '5000', '2', '10000')

create table kurir(
	id int not null,
	name varchar(25) not null,
	created_at datetime not null,
	updated_at datetime not null,
	primary key(id)
);

alter table kurir add column ongkos_dasar int not null;

alter table kurir rename to shipping;

drop table shipping ;

create table payment_detail(
	id int not null,
	id_user int not null,
	jumlah_bayar int not null,
	primary key(id),
	constraint user_payment_method foreign key(id_user) references user(id_user)
);
