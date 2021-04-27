package lab10.ui;

import com.mysql.cj.util.StringUtils;
import lab10.dto.User;
import lab10.service.PermissionService;
import lab10.service.UserService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

// 2 filduri pentru nume si email
// checkboxes pentru permisiuni
// un buton de save - care sa fie inactiv daca name si email nu sunt completate
// un buton de cancel
public class AddUserFrame extends JFrame {
    // model
    private UserService userService = UserService.getInstance();
    private PermissionService permissionService = new PermissionService();
    private java.util.List<String> selectedPermissions = new ArrayList<>();
    private String name;
    private String email;


    private JFrame parent;
    private JTable parentTable;
    private JPanel permissionsPanel;
    private JPanel buttons = new JPanel(new GridLayout(1, 2));
    private JPanel fileds = new JPanel(new GridLayout(2, 1));
    private JPanel mainPanel = new JPanel(new GridLayout(3, 1));
    private JButton saveButton = new JButton("Save");


    public AddUserFrame(JFrame parent, JTable userTable) {
        this.parent = parent;
        this.parentTable = userTable;
        this.parent.setEnabled(false);
        this.setFields();
        this.setPermissionsCheckBoxes();
        this.setButtons();
        mainPanel.add(fileds);
        mainPanel.add(permissionsPanel);
        mainPanel.add(buttons);
        mainPanel.setPreferredSize(new Dimension(500, 500));
        this.add(mainPanel);
        this.setName("Add new user");
        this.pack();
        this.setVisible(true);
    }

    private void setButtons() {
        saveButton.setPreferredSize(new Dimension(25, 10));

        saveButton.setEnabled(false);
        saveButton.addActionListener(e -> {
            User user = new User();
            user.setEmail(email);
            user.setName(name);
            user.setPermissions(selectedPermissions);
            user.setActive(true);
            userService.add(user);
            ((DefaultTableModel) parentTable.getModel()).addRow(new Object[]{name, email, "yes"});
            enableParent();
        });
        JButton cancel = new JButton("Cancel");
        cancel.addActionListener(e -> {
            enableParent();
        });
        cancel.setSize(new Dimension(25, 10));
        buttons.add(saveButton);
        buttons.add(cancel);
        buttons.setPreferredSize(new Dimension(100, 10));

    }

    private void enableParent() {
        this.setVisible(false);
        parent.setEnabled(true);
    }

    private void setPermissionsCheckBoxes() {
        permissionsPanel = new JPanel(new GridLayout(permissionService.getAll().size(), 1));
        permissionService.getAll().stream()
                .map(permission -> new JCheckBox(permission, false))
                .forEach(checkBox -> {
                    checkBox.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JCheckBox box = (JCheckBox) e.getSource();
                            if (box.isSelected()) {
                                selectedPermissions.add(box.getText());
                            } else {
                                selectedPermissions.remove(box.getText());
                            }
                        }
                    });
                    permissionsPanel.add(checkBox);
                });
    }

    private void setFields() {
        JLabel nameLabel = new JLabel("Name*:");
        JLabel emailLabel = new JLabel("Email*:");
        JTextField nameInput = new JTextField();
        nameInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                name = ((JTextField) e.getSource()).getText();
                enableSaveButton();
            }
        });
        JTextField emailInput = new JTextField();
        emailInput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                email = ((JTextField) e.getSource()).getText();
                enableSaveButton();
            }
        });
        fileds.add(nameLabel);
        fileds.add(nameInput);
        fileds.add(emailLabel);
        fileds.add(emailInput);
    }

    private void enableSaveButton() {
        if (!StringUtils.isNullOrEmpty(name) && !StringUtils.isNullOrEmpty(email)) {
            saveButton.setEnabled(true);
        } else {
            saveButton.setEnabled(false);
        }
    }
}
