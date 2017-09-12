/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import classes.Grafo;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;




/**
 *
 * @author Mali
 */
public class TelaGrafo extends JFrame {
   //////COMPONENTS
    private JScrollPane scrollcaminho;
    private JScrollPane scrollcusto;
    private Container c;
    private Border blackline = BorderFactory.createLineBorder(Color.black);
    private JLabel labelorigem = new JLabel();
    private JTextField txtorigem = new JTextField();
    private JTextArea areacaminho = new JTextArea();
    private JTextArea areacusto = new JTextArea();
    private JLabel espaco = new JLabel();
    private JLabel labeldestino = new JLabel();
    private JLabel labelcaminho = new JLabel();
    private JLabel labelcusto = new JLabel();
    private JComboBox combodestino;
    private JComboBox comboorigem;
    private JButton btlargura = new JButton();
    private JButton btprofundidade = new JButton();
    private JButton btestrela = new JButton();
    private JButton btgulosa = new JButton();
    private Toolkit tk;
    private Dimension d;
    private GridLayout grade = new GridLayout();
    private GridLayout gradepanel = new GridLayout();
    private JMenuBar jm = new JMenuBar();
    private JPanel panelform = new JPanel();
    
    ///GRAFO
    private Grafo g = new Grafo();
    private mxGraph mx = getG().graph();
    private mxGraphComponent comp = getG().graphcomponent(getMx());
    private String[] capitais = {
        "Rio Branco",
        "Macapá",
        "Manaus",
        "Curitiba",
        "Belém",
        "Porto Velho",
        "Boa Vista",
        "Palmas",
        "Maceió",
        "Salvador",
        "Fortaleza",
        "São Luís",
        "João Pessoa",
        "Recife",
        "Teresina",
        "Natal",
        "Aracaju",
        "Goiania",
        "Cuiabá",
        "Campo Grande",
        "Brasília",
        "Vitória",
        "Belo Horizonte",
        "São Paulo",
        "Rio de Janeiro",
        "Porto Alegre",
        "Florianópolis"
                
        };

    public TelaGrafo() {
        this.comboorigem = new JComboBox(getCapitais());
        this.combodestino = new JComboBox(getCapitais());
        
    }

    public void addgraphcomponent(){
        
        setC(getContentPane());
        getC().add(getComp());
    }
    
    public void initcomponents(){
        //campos do jpanel
        
        getLabelorigem().setText("Origem:");
        getLabelorigem().setForeground(Color.WHITE);
       
        getTxtorigem().setPreferredSize( new Dimension( 300, 24 ));
               
        getAreacaminho().setEditable(false);
        scrollcaminho = new JScrollPane(getAreacaminho());   	
        getAreacusto().setEditable(false);
        scrollcusto = new JScrollPane(getAreacusto());   
        getEspaco().setText("");
        
        getLabeldestino().setText("Destino:");
        getLabeldestino().setForeground(Color.WHITE);       
        getLabelcaminho().setText("Caminho:");
        getLabelcaminho().setForeground(Color.WHITE);
        getLabelcusto().setText("Custo:");
        getLabelcusto().setForeground(Color.WHITE);
        
        getBtlargura().setText("Largura");
        getBtlargura().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlarguraActionPerformed(evt);
            }
        });
        
        getBtprofundidade().setText("Profundidade");
        getBtprofundidade().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btprofundidadeActionPerformed(evt);
            }
        });
        
        getBtestrela().setText("Estrela");
        getBtestrela().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btestrelaActionPerformed(evt);
            }
        });
        getBtgulosa().setText("BuscaGulosa");
        getBtgulosa().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgulosaActionPerformed(evt);
            }
        });
        setTk(Toolkit.getDefaultToolkit());
        setD(getTk().getScreenSize());
        //Cria Layout
        
        getGradepanel().setColumns(10);
        getGradepanel().setRows(10);
        getGrade().setColumns(2);
        //Cria um JMenuBar
        getJm().setOpaque(true);
        getJm().setBackground(new Color(154, 165, 127));
        getJm().add(getBtlargura());
        getJm().add(getBtprofundidade());
        getJm().add(getBtestrela());
        getJm().add(getBtgulosa());
        getJm().setPreferredSize(new Dimension(1000, 20));
        
        //Cria um Label com o Mapa do Brasil
        getPanelform().setOpaque(true);
        getPanelform().setLayout(getGradepanel());
        
        //adicionaitens no jpanell
        getPanelform().setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        getPanelform().setBackground(Color.darkGray);
        getPanelform().add(getLabelorigem());
        getPanelform().add(getComboorigem());
        getPanelform().add(getLabeldestino());
        getPanelform().add(getCombodestino());
        getPanelform().add(getLabelcaminho());
        getPanelform().add(scrollcaminho);
        getPanelform().add(getLabelcusto());
        getPanelform().add(scrollcusto);
  
        //pega resolucao da tela
        
        
        //Cria Tela 
        TelaGrafo tela = new TelaGrafo();
        tela.setDefaultCloseOperation(TelaGrafo.EXIT_ON_CLOSE);
        tela.setLayout(getGrade());
        tela.setJMenuBar(getJm());
        tela.addgraphcomponent();
        tela.getContentPane().add(getPanelform(), BorderLayout.CENTER);
        tela.setSize(getD().width,659);
        tela.setResizable(false);
        tela.setVisible(true);

        //fim da tela
    }
    private void btestrelaActionPerformed(java.awt.event.ActionEvent evt) {    
               // TODO add your handling code here:
       if((String) getComboorigem().getSelectedItem() != (String) getCombodestino().getSelectedItem()){
           ArrayList<mxICell> caminho = getG().buscaestrela(getMx(), (String) getComboorigem().getSelectedItem(),(String) getCombodestino().getSelectedItem(), getAreacaminho(), getAreacusto(), getC());
           getAreacaminho().setText(caminhoestrela(caminho));
           getAreacusto().setText(custoestrela(getG().listadecustosaereo(getMx(), caminho)));
       }else{
           JOptionPane.showMessageDialog(null, "Selecione Pontos diferentes");
       }
       super.repaint();
     }
    
        private void btgulosaActionPerformed(java.awt.event.ActionEvent evt) {    
              // TODO add your handling code here:
       if((String) getComboorigem().getSelectedItem() != (String) getCombodestino().getSelectedItem()){
           ArrayList<mxICell> caminho = getG().buscagulosa(getMx(), (String) getComboorigem().getSelectedItem(),(String) getCombodestino().getSelectedItem(), getAreacaminho(), getAreacusto(), getC());
           getAreacaminho().setText(caminhoguloso(caminho));
           getAreacusto().setText(custoguloso(getG().listadecustosaereo(getMx(), caminho)));
       }else{
           JOptionPane.showMessageDialog(null, "Selecione Pontos diferentes");
       }
       super.repaint();
     }
    
     private void btprofundidadeActionPerformed(java.awt.event.ActionEvent evt) {    
      if((String) getComboorigem().getSelectedItem() != (String) getCombodestino().getSelectedItem()){
           ArrayList<mxICell> caminho = getG().buscaprofundidade(getMx(), (String) getComboorigem().getSelectedItem(),(String) getCombodestino().getSelectedItem(), getAreacaminho(), getAreacusto(), getC());
           getAreacaminho().setText(caminhoprofundidade(caminho));
           getAreacusto().setText(custoprofundidade(getG().listadecustosrodo(getMx(), caminho)));

       }else{
           JOptionPane.showMessageDialog(null, "Selecione Pontos diferentes");
       }
      super.repaint();
     }
    
    private void btlarguraActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       if((String) getComboorigem().getSelectedItem() != (String) getCombodestino().getSelectedItem()){
           ArrayList<mxICell> caminho = getG().buscalargura(getMx(), (String) getComboorigem().getSelectedItem(),(String) getCombodestino().getSelectedItem(), getAreacaminho(), getAreacusto(), getC());
           getAreacaminho().setText(caminholargura(caminho));
           getAreacusto().setText(custolargura(getG().listadecustosrodo(getMx(), caminho)));
 
       }else{
           JOptionPane.showMessageDialog(null, "Selecione Pontos diferentes");
       }
    }
    
    public String caminholargura( ArrayList<mxICell> c){
        String caminho = "Busca Largura:\n";
     for (int i=0; i<c.size();i++) {
         if(c.get(i).getValue() != "null"){
            caminho += (i+"-"+c.get(i).getValue()+"\n"); 
         }
        }
   
     return caminho;
    }
    
        public String caminhoguloso( ArrayList<mxICell> c){
        String caminho = "Busca Guloso:\n";
     for (int i=0; i<c.size();i++) {
         if(c.get(i).getValue() != "null"){
            caminho += (i+"-"+c.get(i).getValue()+"\n"); 
         }
        }
        if(c.get(c.size()-1).getValue().toString() != (String) getCombodestino().getSelectedItem()){
            JOptionPane.showMessageDialog(null, "Busca ficou em loop");
        }
   
     return caminho;
    }
        
        public String caminhoprofundidade( ArrayList<mxICell> c){
        String caminho = "Busca Profundidade:\n";
     for (int i=0; i<c.size();i++) {
         if(c.get(i).getValue() != "null"){
            caminho += (i+"-"+c.get(i).getValue()+"\n"); 
         }
        }
   
     return caminho;
    }
        
            public String caminhoestrela( ArrayList<mxICell> c){
        String caminho = "Busca Estrela:\n";
     for (int i=0; i<c.size();i++) {
         if(c.get(i).getValue() != "null"){
            caminho += (i+"-"+c.get(i).getValue()+"\n"); 
         }
        }
        if(c.get(c.size()-1).getValue().toString() != (String) getCombodestino().getSelectedItem()){
            JOptionPane.showMessageDialog(null, "Busca ficou em loop");
        }
   
     return caminho;
    }
    
    public String custoprofundidade( ArrayList<String> c){
        String custo = "Custo Profundidade:\n";
        Integer soma = 0;
        
            for (int i=0; i<c.size();i++) {
              System.out.println(c.get(i)+"\n");
              if(i==0){
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POIS PASSA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += c.get(i);
              }
              else{
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += " + "+c.get(i);
                    }
            }
              
            custo = custo+" = "+Integer.toString(soma)+" KM";
     
            return custo;
    }
    
        public String custolargura( ArrayList<String> c){
        String custo = "Custo Largura:\n";
        Integer soma = 0;
        
            for (int i=0; i<c.size();i++) {
              System.out.println(c.get(i)+"\n");
              if(i==0){
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POIS PASSA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += c.get(i);
              }
              else{
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += " + "+c.get(i);
                    }
            }
              
            custo = custo+" = "+Integer.toString(soma)+" KM";
     
            return custo;
    }
        
        public String custoguloso( ArrayList<String> c){
        String custo = "Custo Gulosa:\n";
        Integer soma = 0;
        
            for (int i=0; i<c.size();i++) {
              System.out.println(c.get(i)+"\n");
              if(i==0){
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POIS PASSA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += c.get(i);
              }
              else{
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += " + "+c.get(i);
                    }
            }
              
            custo = custo+" = "+Integer.toString(soma)+" KM";
     
            return custo;
    }
        
        public String custoestrela( ArrayList<String> c){
        String custo = "Custo Estrela:\n";
        Integer soma = 0;
        
            for (int i=0; i<c.size();i++) {
              System.out.println(c.get(i)+"\n");
              if(i==0){
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POIS PASSA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += c.get(i);
              }
              else{
                   if(c.get(i).contains("0000")){
                       return "IMPOSSIVEL CHEGAR POR MEIO DE RODOVIA POR MACAPÁ";
                   
                   }
                   soma += Integer.parseInt(c.get(i));
                   custo += " + "+c.get(i);
                    }
            }
              
            custo = custo+" = "+Integer.toString(soma)+" KM";
     
            return custo;
    }
    

    /**
     * @return the c
     */
    public Container getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Container c) {
        this.c = c;
    }

    /**
     * @return the blackline
     */
    public Border getBlackline() {
        return blackline;
    }

    /**
     * @param blackline the blackline to set
     */
    public void setBlackline(Border blackline) {
        this.blackline = blackline;
    }

    /**
     * @return the labelorigem
     */
    public JLabel getLabelorigem() {
        return labelorigem;
    }

    /**
     * @param labelorigem the labelorigem to set
     */
    public void setLabelorigem(JLabel labelorigem) {
        this.labelorigem = labelorigem;
    }

    /**
     * @return the txtorigem
     */
    public JTextField getTxtorigem() {
        return txtorigem;
    }

    /**
     * @param txtorigem the txtorigem to set
     */
    public void setTxtorigem(JTextField txtorigem) {
        this.txtorigem = txtorigem;
    }

    /**
     * @return the areacaminho
     */
    public JTextArea getAreacaminho() {
        return areacaminho;
    }

    /**
     * @param areacaminho the areacaminho to set
     */
    public void setAreacaminho(JTextArea areacaminho) {
        this.areacaminho = areacaminho;
    }

    /**
     * @return the areacusto
     */
    public JTextArea getAreacusto() {
        return areacusto;
    }

    /**
     * @param areacusto the areacusto to set
     */
    public void setAreacusto(JTextArea areacusto) {
        this.areacusto = areacusto;
    }

    /**
     * @return the espaco
     */
    public JLabel getEspaco() {
        return espaco;
    }

    /**
     * @param espaco the espaco to set
     */
    public void setEspaco(JLabel espaco) {
        this.espaco = espaco;
    }

    /**
     * @return the labeldestino
     */
    public JLabel getLabeldestino() {
        return labeldestino;
    }

    /**
     * @param labeldestino the labeldestino to set
     */
    public void setLabeldestino(JLabel labeldestino) {
        this.labeldestino = labeldestino;
    }

    /**
     * @return the labelcaminho
     */
    public JLabel getLabelcaminho() {
        return labelcaminho;
    }

    /**
     * @param labelcaminho the labelcaminho to set
     */
    public void setLabelcaminho(JLabel labelcaminho) {
        this.labelcaminho = labelcaminho;
    }

    /**
     * @return the labelcusto
     */
    public JLabel getLabelcusto() {
        return labelcusto;
    }

    /**
     * @param labelcusto the labelcusto to set
     */
    public void setLabelcusto(JLabel labelcusto) {
        this.labelcusto = labelcusto;
    }

    /**
     * @return the combodestino
     */
    public JComboBox getCombodestino() {
        return combodestino;
    }

    /**
     * @param combodestino the combodestino to set
     */
    public void setCombodestino(JComboBox combodestino) {
        this.combodestino = combodestino;
    }

    /**
     * @return the comboorigem
     */
    public JComboBox getComboorigem() {
        return comboorigem;
    }

    /**
     * @param comboorigem the comboorigem to set
     */
    public void setComboorigem(JComboBox comboorigem) {
        this.comboorigem = comboorigem;
    }

    /**
     * @return the btlargura
     */
    public JButton getBtlargura() {
        return btlargura;
    }

    /**
     * @param btlargura the btlargura to set
     */
    public void setBtlargura(JButton btlargura) {
        this.btlargura = btlargura;
    }

    /**
     * @return the btprofundidade
     */
    public JButton getBtprofundidade() {
        return btprofundidade;
    }

    /**
     * @param btprofundidade the btprofundidade to set
     */
    public void setBtprofundidade(JButton btprofundidade) {
        this.btprofundidade = btprofundidade;
    }

    /**
     * @return the btestrela
     */
    public JButton getBtestrela() {
        return btestrela;
    }

    /**
     * @param btestrela the btestrela to set
     */
    public void setBtestrela(JButton btestrela) {
        this.btestrela = btestrela;
    }

    /**
     * @return the btgulosa
     */
    public JButton getBtgulosa() {
        return btgulosa;
    }

    /**
     * @param btgulosa the btgulosa to set
     */
    public void setBtgulosa(JButton btgulosa) {
        this.btgulosa = btgulosa;
    }

    /**
     * @return the tk
     */
    public Toolkit getTk() {
        return tk;
    }

    /**
     * @param tk the tk to set
     */
    public void setTk(Toolkit tk) {
        this.tk = tk;
    }

    /**
     * @return the d
     */
    public Dimension getD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(Dimension d) {
        this.d = d;
    }

    /**
     * @return the grade
     */
    public GridLayout getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(GridLayout grade) {
        this.grade = grade;
    }

    /**
     * @return the gradepanel
     */
    public GridLayout getGradepanel() {
        return gradepanel;
    }

    /**
     * @param gradepanel the gradepanel to set
     */
    public void setGradepanel(GridLayout gradepanel) {
        this.gradepanel = gradepanel;
    }

    /**
     * @return the jm
     */
    public JMenuBar getJm() {
        return jm;
    }

    /**
     * @param jm the jm to set
     */
    public void setJm(JMenuBar jm) {
        this.jm = jm;
    }

    /**
     * @return the panelform
     */
    public JPanel getPanelform() {
        return panelform;
    }

    /**
     * @param panelform the panelform to set
     */
    public void setPanelform(JPanel panelform) {
        this.panelform = panelform;
    }

    /**
     * @return the g
     */
    public Grafo getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(Grafo g) {
        this.g = g;
    }

    /**
     * @return the mx
     */
    public mxGraph getMx() {
        return mx;
    }

    /**
     * @param mx the mx to set
     */
    public void setMx(mxGraph mx) {
        this.mx = mx;
    }

    /**
     * @return the comp
     */
    public mxGraphComponent getComp() {
        return comp;
    }

    /**
     * @param comp the comp to set
     */
    public void setComp(mxGraphComponent comp) {
        this.comp = comp;
    }

    /**
     * @return the capitais
     */
    public String[] getCapitais() {
        return capitais;
    }

    /**
     * @param capitais the capitais to set
     */
    public void setCapitais(String[] capitais) {
        this.setCapitais(capitais);
    }


    
    
}
