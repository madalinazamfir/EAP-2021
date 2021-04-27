package lab10.ui;

import lab10.service.UserService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class EntryPoint {

    public static void main(String[] args) {
        // sa userii intr-un tabel
        // sa avem un buton de add - se deschide o fereastra cu un form atunci cand este apasat butonul
        // sa avem un buton de delete - sterge randul selectat din tabel

        // Model
        UserService userService = UserService.getInstance();
        Vector<Vector<String>> data = userService.getAll();
        Vector<String> tableHeader = new Vector<>();
        tableHeader.add("Name");
        tableHeader.add("Email");
        tableHeader.add("Active");

        //tabelul de useri
        JTable userTable = new JTable(data, tableHeader);
        userTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane scrollPane = new JScrollPane(userTable);


        // panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.add(scrollPane);

        // container
        JFrame body = new JFrame("User management");


        // butoanele
        JButton addButton = new JButton("Add new user");
        addButton.addActionListener(e -> {
            new AddUserFrame(body, userTable);
        });
        JButton deleteButton = new JButton("Delete user");
        deleteButton.addActionListener(e -> {
            int index = userTable.getSelectedRow();
            userService.delete(index);
            ((DefaultTableModel) userTable.getModel()).removeRow(index);
        });
        deleteButton.setBackground(Color.RED);
        deleteButton.setForeground(Color.blue);

        // continuare panel principal
        mainPanel.add(addButton);
        mainPanel.add(deleteButton);

        // cont body
        body.add(mainPanel);
        body.pack();
        body.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        body.setVisible(true);

    }
}
