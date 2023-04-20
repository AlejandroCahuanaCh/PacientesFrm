/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.PacientesControl;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Pacientes;

/**
 *
 * @author alejandro
 */
public class PacienteFrm extends javax.swing.JFrame {

    private final PacientesControl pacientesControl= new PacientesControl();//La vista usando el controlador
    private Pacientes pacientesObj;// un objeto Pacientes que seria como mandamos la data al controlador
    private ArrayList<Pacientes> pacientesLista;//lista de pacientes para el Jtable
    private int filaSeleccionada; //variable de apoyo para solo trabajar con la variable cargada con doble click o con ENTER
    /**
     * Creates new form PacienteFrm
     */
    public PacienteFrm() {
        filaSeleccionada =-1;//valor negativo cuando no hay nada seleccionado
        
        
        initComponents(); 
        setLocationRelativeTo(null); // pone al centro el JFrame
        refrescarTabla();// carga el Jtable
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        //Carga la data al Jtable 
        private void refrescarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("APELLIDOS");
        modelo.addColumn("EMAIL");
        modelo.addColumn("DNI");
        modelo.addColumn("PROFESION");
        modelo.addColumn("F. NACIMIENTO");
        modelo.addColumn("F. INGRESO");
        
        pacientesLista = pacientesControl.listar("");
        Object[] fila= new Object[8];
        for (int i = 0; i < pacientesLista.size(); i++) {
            pacientesObj = pacientesLista.get(i);
            fila[0] = pacientesObj.getId();
            fila[1] = pacientesObj.getNombres();
            fila[2] = pacientesObj.getApellidos();
            fila[3] = pacientesObj.getEmail();
            fila[4] = pacientesObj.getDni();
            fila[5] = pacientesObj.getProfesion();
            fila[6] = pacientesObj.getFechaNacimiento();
            fila[7] = pacientesObj.getFechaIngreso();
            modelo.addRow(fila);
        }
         jTable1.setModel(modelo);
    
         
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtProfesion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dcNacimiento = new com.toedter.calendar.JDateChooser();
        dcIngreso = new com.toedter.calendar.JDateChooser();
        guardarBtn = new javax.swing.JButton();
        limpiarBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        eliminarBrn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PACIENTES FRM\n");
        setBounds(new java.awt.Rectangle(0, 0, 0, 300));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS PACIENTE"));

        jLabel1.setText("ID");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 0));
        txtId.setFont(new java.awt.Font("DejaVu Sans", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 0, 0));

        jLabel2.setText("NOMBRES");

        jLabel3.setText("APELLIDOS");

        jLabel4.setText("EMAIL");

        jLabel5.setText("DNI");

        jLabel6.setText("PROFESION");

        jLabel7.setText("FECHA NACIMIENTO");

        jLabel8.setText("FECHA INGRESO");

        dcIngreso.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(115, 115, 115)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(dcIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(80, 80, 80)
                            .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(115, 115, 115)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNombres.getAccessibleContext().setAccessibleDescription("");

        guardarBtn.setText("GUARDAR");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        limpiarBtn.setText("LIMPIAR");
        limpiarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRES", "APELLIDOS", "EMAIL", "DNI", "PROFESION", "FECHA NAC.", "FECHA INGRESO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addContainerGap())
        );

        eliminarBrn.setText("ELIMINAR");
        eliminarBrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBrnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(eliminarBrn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBrn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // inicializa todas las celdas y el boton de guardar como opcion inicial
    private void limpiarCeldas(){
        guardarBtn.setText("GUARDAR");
             txtId.setText("");
         txtNombres.setText("");
         txtApellidos.setText("");
         txtEmail.setText("");
         txtDni.setText("");
         txtProfesion.setText("");
         dcNacimiento.setDate(null);
         dcIngreso.setDate(null);
    }
    
    private boolean validateEmail(String email) {
        // Crea una expresión regular para validar el formato de correo electrónico
        Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

        // Verifica si el correo electrónico cumple con la expresión regular
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            // Si no cumple con la expresión regular, muestra un mensaje de error con JOptionPane
            JOptionPane.showMessageDialog(this, "Por favor ingrese un correo electrónico válido", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
            return true;
    }
    // boton limpiar celdas. Es como poner todo a su estado inicial   
    private void limpiarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBtnActionPerformed
        // TODO add your handling code here:
        limpiarCeldas();
    }//GEN-LAST:event_limpiarBtnActionPerformed
    
    //Dando click a Jtable
    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
         limpiarCeldas();
         int selectedRowIndex = jTable1.getSelectedRow();
         //Desactivamos la edicion para que con doble click se cargue a los jtxtFrames
         if (jTable1.getEditorComponent() != null) {
            jTable1.getEditorComponent().setEnabled(false);
        }
         // si se da 2 clicks sobre una fila esta subira cargado a los jtxtFrames
         if (evt.getClickCount() == 2) {
             try {
                 //cargando la fila seleccionada a los jtxtFrames
                 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                 int id = (int) model.getValueAt(selectedRowIndex, 0);
                 txtId.setText(Integer.toString(id));
                 txtNombres.setText(model.getValueAt(selectedRowIndex,1).toString());
                 txtApellidos.setText(model.getValueAt(selectedRowIndex,2).toString());
                 txtEmail.setText(model.getValueAt(selectedRowIndex,3).toString());
                 txtDni.setText(model.getValueAt(selectedRowIndex,4).toString());
                 txtProfesion.setText(model.getValueAt(selectedRowIndex,5).toString());
                 //conversion String a DataChooser para poder visualizar las fechas
                 dcNacimiento.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedRowIndex, 6)));
                 dcIngreso.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedRowIndex, 7)));
             } catch (ParseException ex) {
                Logger.getLogger(PacienteFrm.class.getName()).log(Level.SEVERE, "Error al analizar la fecha en la fila seleccionada: formato inválido", ex);             
             }
           //guarda el valor de la fila de la tabla el cual estamos cargando  
           filaSeleccionada = selectedRowIndex;
           //Como hemos subido los datos de la tabla para verlos, ya no tendriamos que guardarlos como nuevos
           //tenemos que actualizarlos, por eso cambiamos el valor del texto del boton, aclarando
           guardarBtn.setText("ACTUALIZAR");  
    } 


    }//GEN-LAST:event_jTable1MousePressed
    
    //Boton GUARDAR y ACTUALIZAR dependiendo si se ha encontrado algun Id
    //Si tiene Id es actualizar, sino es nuevo y hay que GUARDAR un nuevo registro
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        // TODO add your handling code here:
        try {
        String nombres = txtNombres.getText().trim();
        String apellidos = txtApellidos.getText().trim();
        String email = txtEmail.getText().trim();
        String dni = txtDni.getText().trim();
        String profesion = txtProfesion.getText().trim();            
        //Verificando que todas las celdas estes llenas o correctamente llenadas
        if (nombres.isEmpty()
                || apellidos.isEmpty()
                || (!validateEmail(email))
                || dni.isEmpty()
                || profesion.isEmpty()
                || (dcNacimiento.getDate() == null)) {
                    JOptionPane.showMessageDialog(this, "Por favor, llene bien los campos o seleccione una fecha antes de guardar", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            //formatenado la fecha de Nacimiento para pasarla al controlador 
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String fechaNaci = dcn.format(dcNacimiento.getDate());
            //si no hay id es porque es nuevo
            if("".equals(txtId.getText())){
                
                pacientesObj = new Pacientes(null, nombres, apellidos, email, dni, profesion, fechaNaci, null);
                pacientesControl.insertar(pacientesObj);
                JOptionPane.showMessageDialog(this, "Guardado con exito", "Registro Exitoso!!!", JOptionPane.WARNING_MESSAGE);
            }else{
            //si hay id hay que ACTUALIZAR
                pacientesObj = new Pacientes(Integer.valueOf(txtId.getText()), nombres, apellidos, email, dni, profesion, fechaNaci, null);
                pacientesControl.modificar(pacientesObj);
                JOptionPane.showMessageDialog(this, "Modificado con exito", "Registro Exitoso!!!", JOptionPane.WARNING_MESSAGE);

            }
            
            
            //Una vez usado esos datos, regresamos a su estado inicial
            this.refrescarTabla();
            this.limpiarCeldas();
        }
    } catch (HeadlessException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void eliminarBrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBrnActionPerformed
        // TODO add your handling code here:
        // verifico si esta vacio o tiene espacios en blanco o si no hay nada en la tabla seleccionado
        if (txtId.getText().isEmpty() || txtId.getText().isBlank() || filaSeleccionada < 0 ) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro");
        }
         else{
         //una vez seleccionado mi ginal a borrar, se carga a los jtextFrames y
         //SOLO BORRA LOSDATOS CARGADOS PREVIAMENTE DE LA SELECCION DE LA FILA. YA SEA POR ENTER O DOBLE CLICK
                jTable1.setRowSelectionInterval(filaSeleccionada, filaSeleccionada);
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                //solo trabajo con el valor que se cargo, no la seleccionada
                Integer id = (Integer) model.getValueAt(filaSeleccionada, 0);
                 Integer c =  JOptionPane.showConfirmDialog(null, "Estas seguro en borrar?");
                 if(c == 0){
                     pacientesControl.eliminar(new Pacientes(id, null, null, null, null, null, null, null));
                 }
                 this.refrescarTabla();
        }
        this.limpiarCeldas();
        
    }//GEN-LAST:event_eliminarBrnActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        //primeramente solo espera el evento que sea un ENTER el presionado
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpiarCeldas();
            int selectedRowIndex = jTable1.getSelectedRow();
            if (jTable1.getEditorComponent() != null) {
                jTable1.getEditorComponent().setEnabled(false);
             }
                 try {
                 DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                 int id = (int) model.getValueAt(selectedRowIndex, 0);
                 txtId.setText(Integer.toString(id));
                 txtNombres.setText(model.getValueAt(selectedRowIndex,1).toString());
                 txtApellidos.setText(model.getValueAt(selectedRowIndex,2).toString());
                 txtEmail.setText(model.getValueAt(selectedRowIndex,3).toString());
                 txtDni.setText(model.getValueAt(selectedRowIndex,4).toString());
                 txtProfesion.setText(model.getValueAt(selectedRowIndex,5).toString());
                 dcNacimiento.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedRowIndex, 6)));
                 dcIngreso.setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(selectedRowIndex, 7)));
                 //El ENTER me hace avanzar a la siguiente fila pero aqui la guardo para seleccionarla
                 jTable1.setRowSelectionInterval(selectedRowIndex, selectedRowIndex);
                 //no dejo q avance a la siguiente fila
                 evt.consume();
                 } catch (ParseException ex) {
                Logger.getLogger(PacienteFrm.class.getName()).log(Level.SEVERE, "Error al analizar la fecha en la fila seleccionada: formato inválido", ex);             
             }
           filaSeleccionada = selectedRowIndex;     
           guardarBtn.setText("ACTUALIZAR");  
                        
            }
    }//GEN-LAST:event_jTable1KeyPressed

    /**
     * @param args the command line arguments
     */
//        JOptionPane.showMessageDialog(null, "Error al guardar el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PacienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  Locale.setDefault(new Locale("es", "ES"));

                new PacienteFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcIngreso;
    private com.toedter.calendar.JDateChooser dcNacimiento;
    private javax.swing.JButton eliminarBrn;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton limpiarBtn;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtProfesion;
    // End of variables declaration//GEN-END:variables
}
