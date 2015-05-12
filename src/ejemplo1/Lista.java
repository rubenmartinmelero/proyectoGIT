package ejemplo1;
public class Lista {
private Alumno [] listaAlumno;
private int numeroAlumnos;
/* Constructor */
public Lista(int a){
listaAlumno = new Alumno[a];
numeroAlumnos = 0;
}
/* Añadir un Alumno a la lista */
public void añadirAlumno(Alumno a) {listaAlumno[numeroAlumnos] = a;
numeroAlumnos++;
}
/* Borrar Alumno */
public void borrarAlumno(String a) {
int posicion;
posicion = buscarAlumno(a);
for (int i = posicion; i < numeroAlumnos - 1; i++) {
listaAlumno[i] = listaAlumno[i + 1];
}
numeroAlumnos--;
}
/* Buscar a un Alumno en la lista */
public int buscarAlumno(String a) {
int c = -1;
for (int i = 0;i < numeroAlumnos ;i++ ) {
if (a.equals(listaAlumno[i].getNombre())) {
c = i;
break;
}
}
return c;
}
public Alumno[] getListaAlumno() {
	// TODO Apéndice de método generado automáticamente
	return null;
}
public int getNumeroAlumnos() {
	// TODO Apéndice de método generado automáticamente
	return 0;
}}