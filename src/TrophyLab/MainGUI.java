package TrophyLab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

/**
 *
 * @author elean
 */
public class MainGUI extends JFrame {

    private static Font font;
    public static PSNUsers psn = new PSNUsers();
    public static UIManager UI;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Trophy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(920, 520);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(255, 133, 179));

        font = new Font("Rockwell", Font.BOLD, 24);

        JLabel titulo = new JLabel("TROPHY");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(font);
        titulo.setForeground(new Color(255, 255, 255));
        panel.add(titulo, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        buttonPanel.setBackground(new Color(255, 133, 179));

        JButton agregarUsuario = new JButton("Agregar Usuario");
        agregarUsuario.setBackground(new Color(255, 173, 223));
        agregarUsuario.setForeground(new Color(255, 255, 255));
        agregarUsuario.setBounds(20, 10, 440, 240);

        JButton desactivarUsuario = new JButton("Desactivar Usuario");
        desactivarUsuario.setBackground(new Color(255, 173, 223));
        desactivarUsuario.setForeground(new Color(255, 255, 255));
        desactivarUsuario.setBounds(4700, 10, 440, 240);

        JButton agregarTrofeo = new JButton("Agregar Trofeo");
        agregarTrofeo.setBackground(new Color(255, 173, 223));
        agregarTrofeo.setForeground(new Color(255, 255, 255));
        agregarTrofeo.setBounds(20, 270, 440, 240);

        JButton playerInfo = new JButton("Player Info");
        playerInfo.setBackground(new Color(255, 173, 223));
        playerInfo.setForeground(new Color(255, 255, 255));
        playerInfo.setBounds(470, 270, 440, 240);

        agregarUsuario.setCursor(new Cursor(Cursor.HAND_CURSOR));
        desactivarUsuario.setCursor(new Cursor(Cursor.HAND_CURSOR));
        agregarTrofeo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        playerInfo.setCursor(new Cursor(Cursor.HAND_CURSOR));

        agregarUsuario.setFont(font);
        desactivarUsuario.setFont(font);
        agregarTrofeo.setFont(font);
        playerInfo.setFont(font);

        //Agregar al Panel
        buttonPanel.add(agregarUsuario);
        buttonPanel.add(desactivarUsuario);
        buttonPanel.add(agregarTrofeo);
        buttonPanel.add(playerInfo);

        //Action Listeners
        agregarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarUsuario();
            }
        });

        desactivarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desactivarUsuario();
            }
        });

        agregarTrofeo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTrofeo();
            }
        });

        playerInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerInfo();
            }
        });

        panel.add(buttonPanel, BorderLayout.CENTER);
        frame.add(panel);
        frame.setVisible(true);
    }

    private static void agregarUsuario() {

        JPanel tituloPanel = new JPanel(new FlowLayout());
        tituloPanel.setBackground(new Color(255, 173, 223));
        JPanel agregarUsuarioPanel = new JPanel(new FlowLayout());
        agregarUsuarioPanel.setBackground(new Color(255, 173, 223));

        tituloPanel.setLayout(new BorderLayout());
        JLabel titulo = new JLabel("AGREGAR USUARIO");
        titulo.setForeground(new Color(255, 255, 255));

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(font);
        usuarioLabel.setForeground(new Color(255, 255, 255));

        JButton botonAgregar = new JButton("Agregar");
        botonAgregar.setFont(font);
        botonAgregar.setBackground(new Color(255, 133, 179));
        botonAgregar.setForeground(Color.WHITE);

        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(font);
        JTextField usuarioField = new JTextField(15);
        usuarioField.setFont(font);
        usuarioField.setForeground(new Color(255, 133, 179));

        tituloPanel.add(titulo);
        agregarUsuarioPanel.add(usuarioLabel);
        agregarUsuarioPanel.add(usuarioField);
        agregarUsuarioPanel.add(botonAgregar);

        JFrame agregarUsuarioFrame = new JFrame();
        agregarUsuarioFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregarUsuarioFrame.setSize(920, 520);

        agregarUsuarioFrame.setLocationRelativeTo(null);

        agregarUsuarioFrame.add(tituloPanel, BorderLayout.NORTH);
        agregarUsuarioFrame.add(agregarUsuarioPanel);
        agregarUsuarioFrame.setVisible(true);

        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usuarioField.getText();

                if (username.isBlank() || username.isEmpty()) {
                    UI = null;
                    UI.put("OptionPane.background", new Color(255, 214, 224));
                    UI.put("Panel.background", new Color(255, 214, 224));
                    UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                    UI.put("Button.background", new Color(255, 133, 179));
                    UI.put("Button.foreground", new Color(255, 255, 255));
                    UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                    UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                    JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    boolean siguiente = psn.addUser(username);

                    if (siguiente) {
                        agregarUsuarioFrame.setVisible(false);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void desactivarUsuario() {

        JPanel tituloPanel = new JPanel(new FlowLayout());
        tituloPanel.setBackground(new Color(255, 173, 223));
        JPanel desactivarUsuarioPanel = new JPanel(new FlowLayout());
        desactivarUsuarioPanel.setBackground(new Color(255, 173, 223));

        tituloPanel.setLayout(new BorderLayout());
        JLabel titulo = new JLabel("DESACTIVAR USUARIO");
        titulo.setForeground(new Color(255, 255, 255));

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(font);
        usuarioLabel.setForeground(new Color(255, 255, 255));

        JButton botonDesactivar = new JButton("Desactivar");
        botonDesactivar.setFont(font);
        botonDesactivar.setBackground(new Color(255, 133, 179));
        botonDesactivar.setForeground(Color.WHITE);

        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(font);
        JTextField usuarioField = new JTextField(15);
        usuarioField.setFont(font);
        usuarioField.setForeground(new Color(255, 133, 179));

        tituloPanel.add(titulo);
        desactivarUsuarioPanel.add(usuarioLabel);
        desactivarUsuarioPanel.add(usuarioField);
        desactivarUsuarioPanel.add(botonDesactivar);

        JFrame desactivarUsuarioFrame = new JFrame();
        desactivarUsuarioFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        desactivarUsuarioFrame.setSize(920, 520);
        desactivarUsuarioFrame.setLocationRelativeTo(null);

        desactivarUsuarioFrame.add(tituloPanel, BorderLayout.NORTH);
        desactivarUsuarioFrame.add(desactivarUsuarioPanel);
        desactivarUsuarioFrame.setVisible(true);

        botonDesactivar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usuarioField.getText();

                if (username.isBlank() || username.isEmpty()) {
                    UI = null;
                    UI.put("OptionPane.background", new Color(255, 214, 224));
                    UI.put("Panel.background", new Color(255, 214, 224));
                    UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                    UI.put("Button.background", new Color(255, 133, 179));
                    UI.put("Button.foreground", new Color(255, 255, 255));
                    UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                    UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                    JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    boolean siguiente = psn.deactivateUser(username);

                    if (siguiente) {
                        desactivarUsuarioFrame.setVisible(false);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void agregarTrofeo() {
        JFrame agregarTrofeoFrame = new JFrame();

        agregarTrofeoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        agregarTrofeoFrame.setSize(920, 520);
        agregarTrofeoFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 173, 223));
        panel.setLayout(new BorderLayout());

        // Título centrado
        JLabel titulo = new JLabel("AGREGAR TROFEO", SwingConstants.CENTER);
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setFont(font);
        panel.add(titulo, BorderLayout.NORTH);

        // Panel para campos de entrada y botón
        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(new Color(255, 173, 223));
        inputPanel.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(font);
        usuarioLabel.setForeground(new Color(255, 255, 255));

        JTextField usuarioField = new JTextField(15);
        usuarioField.setFont(font);
        usuarioField.setForeground(new Color(255, 133, 179));

        JLabel tipoLabel = new JLabel("Tipo de Trofeo:");
        tipoLabel.setFont(font);
        tipoLabel.setForeground(new Color(255, 255, 255));

        JComboBox<Trophy> TrofeosTiposBox = new JComboBox<>();
        TrofeosTiposBox.setFont(font);
        TrofeosTiposBox.setForeground(new Color(255, 133, 179));

        JLabel juegoLabel = new JLabel("Trophy Game:");
        juegoLabel.setFont(font);
        juegoLabel.setForeground(new Color(255, 255, 255));

        JTextField TrophyGameField = new JTextField(15);
        TrophyGameField.setFont(font);
        TrophyGameField.setForeground(new Color(255, 133, 179));

        JLabel nombreLabel = new JLabel("Trophy Name:");
        nombreLabel.setFont(font);
        nombreLabel.setForeground(new Color(255, 255, 255));

        JTextField TrophyNameField = new JTextField(15);
        TrophyNameField.setFont(font);
        TrophyNameField.setForeground(new Color(255, 133, 179));

        for (Trophy trophy : Trophy.values()) {
            TrofeosTiposBox.addItem(trophy);
        }

        inputPanel.add(usuarioLabel);
        inputPanel.add(usuarioField);
        inputPanel.add(tipoLabel);
        inputPanel.add(TrofeosTiposBox);
        inputPanel.add(juegoLabel);
        inputPanel.add(TrophyGameField);
        inputPanel.add(nombreLabel);
        inputPanel.add(TrophyNameField);

        panel.add(inputPanel, BorderLayout.CENTER);

        // Botón Agregar
        JButton botonAgregar = new JButton("Agregar");
        botonAgregar.setFont(font);
        botonAgregar.setBackground(new Color(255, 133, 179));
        botonAgregar.setForeground(Color.WHITE);
        panel.add(botonAgregar, BorderLayout.SOUTH);

        agregarTrofeoFrame.add(panel);
        agregarTrofeoFrame.setVisible(true);

        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usuarioField.getText();
                Trophy tipoTrofeo = (Trophy) TrofeosTiposBox.getSelectedItem();
                String trophyGame = TrophyGameField.getText();
                String trophyName = TrophyNameField.getText();

                if (username.isBlank() || username.isEmpty()) {
                    UI = null;
                    UI.put("OptionPane.background", new Color(255, 214, 224));
                    UI.put("Panel.background", new Color(255, 214, 224));
                    UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                    UI.put("Button.background", new Color(255, 133, 179));
                    UI.put("Button.foreground", new Color(255, 255, 255));
                    UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                    UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                    JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (trophyGame.isBlank() || trophyGame.isEmpty()) {
                    UI = null;
                    UI.put("OptionPane.background", new Color(255, 214, 224));
                    UI.put("Panel.background", new Color(255, 214, 224));
                    UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                    UI.put("Button.background", new Color(255, 133, 179));
                    UI.put("Button.foreground", new Color(255, 255, 255));
                    UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                    UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                    JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE TROPHY GAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (trophyName.isBlank() || trophyName.isEmpty()) {
                    UI = null;
                    UI.put("OptionPane.background", new Color(255, 214, 224));
                    UI.put("Panel.background", new Color(255, 214, 224));
                    UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                    UI.put("Button.background", new Color(255, 133, 179));
                    UI.put("Button.foreground", new Color(255, 255, 255));
                    UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                    UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                    JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE TROPHY NAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    boolean siguiente = psn.addTrophieTo(username, trophyGame, trophyName, tipoTrofeo);

                    if (siguiente) {
                        agregarTrofeoFrame.setVisible(false);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public static void playerInfo() {
        JFrame playerInfoFrame = new JFrame();
        playerInfoFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        playerInfoFrame.setSize(920, 520);
        playerInfoFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 173, 223));
        panel.setLayout(new BorderLayout());

        // Título centrado
        JLabel titulo = new JLabel("PLAYER INFO", SwingConstants.CENTER);
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setFont(font);
        panel.add(titulo, BorderLayout.NORTH);

        // Panel para campos de entrada y botón
        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(new Color(255, 173, 223));
        inputPanel.setLayout(new FlowLayout());

        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setFont(font);
        usuarioLabel.setForeground(new Color(255, 255, 255));

        JTextField usuarioField = new JTextField(15);
        usuarioField.setFont(font);
        usuarioField.setForeground(new Color(255, 133, 179));

        JButton botonBuscar = new JButton("Buscar");
        botonBuscar.setFont(font);
        botonBuscar.setBackground(new Color(255, 133, 179));
        botonBuscar.setForeground(Color.WHITE);

        inputPanel.add(usuarioLabel);
        inputPanel.add(usuarioField);
        inputPanel.add(botonBuscar);

        panel.add(inputPanel, BorderLayout.CENTER);

        // JTextArea dentro de JScrollPane
        JTextArea infoArea = new JTextArea(10, 30);
        infoArea.setFont(font);
        infoArea.setForeground(new Color(255, 133, 179));

        JScrollPane scrollPane = new JScrollPane(infoArea);
        panel.add(scrollPane, BorderLayout.SOUTH);

        playerInfoFrame.add(panel);
        playerInfoFrame.setVisible(true);

        botonBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usuarioField.getText();

                if (username.isBlank() || username.isEmpty()) {
                    UI = null;
                    UI.put("OptionPane.background", new Color(255, 214, 224));
                    UI.put("Panel.background", new Color(255, 214, 224));
                    UI.put("OptionPane.messageForeground", new Color(255, 255, 255));
                    UI.put("Button.background", new Color(255, 133, 179));
                    UI.put("Button.foreground", new Color(255, 255, 255));
                    UI.put("OptionPane.messageFont", new Font("Rockwell", Font.BOLD, 16));
                    UI.put("Button.font", new Font("Rockwell", Font.BOLD, 16));
                    JOptionPane.showMessageDialog(null, "¡COMPLETE EL CAMPO DE USERNAME!", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                infoArea.setText(psn.playerinfo(username));
            }
        });
    }
}
