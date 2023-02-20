public class Main {
    public static void main(String[] args) {
      Carrera carrera = new Carrera();
      Animal jirafa= new Animal("Jirafa","Jirafita",carrera);
      Animal perro= new Animal("Perro","Perrito",carrera);
      Animal gato= new Animal("Gato","Gatito",carrera);
      Animal puerco= new Animal("Cerdo","Puerquito",carrera);

      carrera.inscribirse(jirafa);
      carrera.inscribirse(perro);
      carrera.inscribirse(gato);
      carrera.inscribirse(puerco);

      carrera.start();
    }
}