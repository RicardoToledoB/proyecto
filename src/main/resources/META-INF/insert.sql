/*TABLA USUARIO*/
insert into Usuario(username,password,nombre,apepat,apemat,estado) values('rtoledo','1234','RICARDO','TOLEDO','BARRIA','activo');
insert into Usuario(username,password,nombre,apepat,apemat,estado) values('pramirez','123','PEDRO','RAMIREZ','AGUIRRE','activo');
insert into Usuario(username,password,nombre,apepat,apemat,estado) values('pperez','1234','PABLO','PEREZ','ROMAN','activo');
insert into Usuario(username,password,nombre,apepat,apemat,estado) values('jrojas','123','JUAN','ROJAS','PEREZ','activo');
insert into Usuario(username,password,nombre,apepat,apemat,estado) values('atapia','1234','ANDRES','TAPIA','BARCAZAR','activo');
/*TABLA ROL*/
insert into Rol(nombre) values('administrador');
insert into Rol(nombre) values('ejecutivo');
insert into Rol(nombre) values('visor');
/*TABLA USUARIO_ROL*/
insert into Usuario_Rol(usuario_id,rol_id) values(1,1);
insert into Usuario_Rol(usuario_id,rol_id) values(1,2);
insert into Usuario_Rol(usuario_id,rol_id) values(1,3);
insert into Usuario_Rol(usuario_id,rol_id) values(2,2);
insert into Usuario_Rol(usuario_id,rol_id) values(3,3);

/* CREAR VISTA */
drop view v_user_role;
create VIEW v_user_role AS select u.username,u.password,g.nombre from Usuario_Rol ug INNER JOIN Usuario u ON u.usuario_id=ug.usuario_id INNER JOIN Rol g ON g.rol_id=ug.rol_id;







