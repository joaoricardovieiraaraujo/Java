
package UiEmJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDoListApp {

    // Modelo para armazenar as tarefas
    private DefaultListModel<String> tasksModel;

    // Lista de tarefas
    private JList<String> tasksList;

    // Campo para digitar novas tarefas
    private JTextField taskInput;

    // Construtor
    public ToDoListApp() {

        // Criar janela principal
        JFrame frame = new JFrame("To-Do List App");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);

        // Criar modelo e lista
        tasksModel = new DefaultListModel<>();
        tasksList = new JList<>(tasksModel);

        tasksList.setSelectionMode(
            ListSelectionModel.SINGLE_SELECTION
        );

        // Criar painel com rolagem
        JScrollPane scrollPane = new JScrollPane(tasksList);

        // Campo de texto
        taskInput = new JTextField(20);

        // Criar botões
        JButton addButton = new JButton("Adicionar Tarefa");
        JButton removeButton = new JButton("Remover Tarefa");
        JButton completeButton = new JButton("Concluir Tarefa");

        // Painel superior
        JPanel topPanel = new JPanel(new FlowLayout());

        topPanel.add(new JLabel("Nova Tarefa:"));
        topPanel.add(taskInput);
        topPanel.add(addButton);

        // Painel inferior
        JPanel bottomPanel = new JPanel(new FlowLayout());

        bottomPanel.add(removeButton);
        bottomPanel.add(completeButton);

        // Painel principal
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));

        mainPanel.setBorder(
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Adicionar painel à janela
        frame.add(mainPanel);

        // Evento do botão adicionar
        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                addTask(taskInput.getText());
            }
        });

        // Evento do botão remover
        removeButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                removeTask();
            }
        });

        // Evento do botão concluir
        completeButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                completeTask();
            }
        });

        // Permitir adicionar usando Enter
        taskInput.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                addTask(taskInput.getText());
            }
        });

        // Exibir janela
        frame.setVisible(true);
    }

    // Método para adicionar tarefa
    private void addTask(String task) {

        if (!task.trim().isEmpty()) {

            tasksModel.addElement(task.trim());

            clearInput();
        }
    }

    // Método para remover tarefa
    private void removeTask() {

        int selectedIndex = tasksList.getSelectedIndex();

        if (selectedIndex != -1) {

            tasksModel.remove(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Selecione uma tarefa para remover!"
            );
        }
    }

    // Método para concluir tarefa
    private void completeTask() {

        int selectedIndex = tasksList.getSelectedIndex();

        if (selectedIndex != -1) {

            String task = tasksModel.getElementAt(selectedIndex);

            if (!task.startsWith("Concluída: ")) {

                tasksModel.setElementAt(
                    "Concluída: " + task,
                    selectedIndex
                );

            }

        } else {
            JOptionPane.showMessageDialog(
                null,
                "Selecione uma tarefa para concluir!"
            );
        }
    }

    // Limpar campo de texto
    private void clearInput() {

        taskInput.setText("");
        taskInput.requestFocus();
    }

    // Método principal
    public static void main(String[] args) {

        SwingUtilities.invokeLater(ToDoListApp::new);
    }
}
