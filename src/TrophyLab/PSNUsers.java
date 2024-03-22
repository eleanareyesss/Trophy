package TrophyLab;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author elean
 */
public class PSNUsers {

    private RandomAccessFile raf, psn;
    private HashTable users;
    UIManager UI;

    public PSNUsers() {
        try {
            raf = new RandomAccessFile("Users", "rw");
            psn = new RandomAccessFile("PSN", "rw");
            users = new HashTable();
            reloadHashTable();
        } catch (IOException e) {
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡SE PRODUJO UN ERROR!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void reloadHashTable() {
        try {
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                long pos = raf.getFilePointer();
                String username = raf.readUTF();
                int points = raf.readInt();
                int trofeos = raf.readInt();
                boolean isActive = raf.readBoolean();

                if (isActive) {
                    users.add(username, pos);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡SE PRODUJO UN ERROR AL CARGAR LA HASH TABLE!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean addUser(String username) throws IOException {
        if (users.search(username) != -1) {
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "EL USUARIO YA EXISTE.\nELIGA UNO NUEVO", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        long pos = raf.length();
        raf.seek(pos);
        raf.writeUTF(username);
        raf.writeInt(0);
        raf.writeInt(0);
        raf.writeBoolean(true);
        users.add(username, pos);

        UI = null;
        UI.put("OptionPane.background", new Color(255, 214, 224));
        UI.put("Panel.background", new Color(255, 214, 224));
        UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
        UI.put("Button.background", new Color(255, 133, 179));
        UI.put("Button.foreground", new Color(255, 255, 255));
        UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
        UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
        JOptionPane.showMessageDialog(null, "¡USUARIO AGREGADO CON ÉXITO!", "USUARIO AGREGADO", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    public boolean deactivateUser(String username) throws IOException {
        long pos = users.search(username);

        if (pos != -1) {
            raf.seek(pos);
            String user = raf.readUTF();
            raf.readInt();
            raf.readInt();
            raf.writeBoolean(false);
            users.remove(user);
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡EL USUARIO HA SIDO DESACTIVADO!", "USUARIO DESACTIVADO", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡EL USUARIO INGRESADO NO EXISTE!", "USUARIO INEXISTENTE", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public boolean addTrophieTo(String username, String trophyGame, String trophyName, Trophy type) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            raf.seek(pos);
            String user = raf.readUTF();
            int pointsCounter = raf.readInt();
            int trophyCounter = raf.readInt();
            boolean isActive = raf.readBoolean();
            psn.seek(psn.length());
            psn.writeUTF(username);
            psn.writeUTF(trophyGame);
            psn.writeUTF(trophyName);
            psn.writeUTF(type.getType());
            psn.writeUTF(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            raf.seek(pos);
            raf.readUTF();
            raf.writeInt(pointsCounter + type.getPoints());
            raf.writeInt(trophyCounter + 1);
            raf.writeBoolean(isActive);

            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡EL TROFEO HA SIDO AGREGADO CON ÉXITO!", "TROFEO AGREGADO", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } else {
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "EL USUARIO INGRESADO NO EXISTE", "USUARIO INEXISTENTE", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }

    public String playerinfo(String username) {
        long pos = users.search(username);
        if (pos != -1) {
            try {
                raf.seek(pos);
                String user = raf.readUTF();
                int pointsCounter = raf.readInt();
                int trophyCounter = raf.readInt();
                boolean isActive = raf.readBoolean();

                StringBuilder player = new StringBuilder();
                player.append("INFORMACIÓN SOBRE EL USUARIO").append("\n");
                player.append("---------------------------------------------------------").append("\n");
                player.append("Nombre del Usuario: ").append(user).append("\n");
                player.append("Puntos por los Trofeos: ").append(pointsCounter).append("\n");
                player.append("Trofeos: ").append(trophyCounter).append("\n");
                player.append("Estado: ").append(isActive ? "Activo" : "Inactivo").append("\n");

                player.append("\n").append("INFORMACIÓN SOBRE LOS TROFEOS").append("\n");
                player.append("---------------------------------------------------------").append("\n");
                psn.seek(0);
                while (psn.getFilePointer() < psn.length()) {
                    String usuario = psn.readUTF();
                    String juegoT = psn.readUTF();
                    String nombreT = psn.readUTF();
                    String tipoT = psn.readUTF();
                    String fecha = psn.readUTF();

                    if (usuario.equals(username)) {
                        player.append(fecha).append(" - ").append(tipoT).append(" - ").append(juegoT).append(" - ").append(nombreT).append("\n");
                    }
                }
                return player.toString();
            } catch (IOException e) {
                e.printStackTrace();
                UI = null;
                UI.put("OptionPane.background", new Color(255, 214, 224));
                UI.put("Panel.background", new Color(255, 214, 224));
                UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                UI.put("Button.background", new Color(255, 133, 179));
                UI.put("Button.foreground", new Color(255, 255, 255));
                UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                JOptionPane.showMessageDialog(null, "¡ERROR AL OBTENER LA INFORMACIÓN DE DICHO USUARIO!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            UI = null;
            UI.put("OptionPane.background", new Color(255, 214, 224));
            UI.put("Panel.background", new Color(255, 214, 224));
            UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
            UI.put("Button.background", new Color(255, 133, 179));
            UI.put("Button.foreground", new Color(255, 255, 255));
            UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
            UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
            JOptionPane.showMessageDialog(null, "¡EL USUARIO NO EXISTE!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return "¡EL USUARIO NO EXISTE!";
        }
        return null;
    }
}
