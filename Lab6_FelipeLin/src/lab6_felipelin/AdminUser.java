package lab6_felipelin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser {

    private File archivo = null;
    private ArrayList<User> lista = new ArrayList();

    public AdminUser(String path) {
        archivo = new File(path);
    }

    public AdminUser() {
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<User> getLista() {
        return lista;
    }

    public void setLista(ArrayList<User> lista) {
        this.lista = lista;
    }

    public void setUsuario(User p) {
        this.lista.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (User t : lista) {
                bw.append(t.getNombre() + ";"); //0
                bw.append(t.getUsuario() + ";"); //1
                bw.append(t.getPassword() + ";"); //2
                bw.append(t.getFecha() + ";"); //3

            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {

        if (archivo.exists()) {
            SimpleDateFormat time = new SimpleDateFormat("EEEE MMM dd HH: ss zz yyyy");
            String[] array;

            try {
                String cadena;

                FileReader f = new FileReader(archivo);
                BufferedReader b = new BufferedReader(f);
                while ((cadena = b.readLine()) != null) {
                    array = cadena.split(";");
                    Date fecha;
                    String algo;
                    algo = array[3];
                    fecha = time.parse(algo);
                    lista.add(new User(array[0], array[1], array[2], fecha));
                }
                b.close();
                f.close();
            } catch (Exception e) {
            }

        }
    }

}
