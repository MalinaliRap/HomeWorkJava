/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import com.mxgraph.analysis.mxAnalysisGraph;
import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import views.TelaGrafo;

/**
 *
 * @author Mali
 */
public class Grafo {
     private mxGraph graph = new mxGraph();
     private Object parent = graph.getDefaultParent();
     private ImageIcon icon = new ImageIcon("C:\\Users\\Mali\\Documents\\NetBeansProjects\\PadroesDeProjeto\\projetodebuscas\\src\\images\\brasil.jpg");
     private mxICell vertice;
     private mxICell aresta;
     private mxGraphComponent comp;
   
     public mxGraph graph(){
                
                confdefaulttela();               
                
                getGraph().getModel().beginUpdate();

		try
		{  
                        //Cria Vertices
                        /*
                        v1 = Rio Branco
                        v2 = Macapá
                        v3 = Manaus
                        v4 = Curitiba
                        v5 = Belém
                        v6 = Porto Velho
                        v7 = Boa Vista
                        v8 = Palmas
                        v9 = Maceió
                        v10 = Salvador
                        v11 = Fortaleza
                        v12 = São Luís
                        v13 = João Pessoa
                        v14 = Recife
                        v15 = Teresina
                        v16 = Natal
                        v17 = Aracaju
                        v18 = Goiania
                        v19 = Cuiabá
                        v20 = Campo Grande
                        v21 = Brasília
                        v22 = Vitória
                        v23 = Belo Horizonte
                        v24 = São Paulo
                        v25 = Rio de Janeiro
                        v26 = Porto Alegre
                        v27 = Florianópolis
                        */
			Object v1 = getGraph().insertVertex(getParent(), "v1", "Rio Branco", 50, 270, 70,20,"ROUNDED");
                        Object v2 = getGraph().insertVertex(getParent(), "v2", "Macapá", 280, 90, 70,20,"ROUNDED");
                        Object v3 = getGraph().insertVertex(getParent(), "v3", "Manaus", 150, 150, 70,20,"ROUNDED");
                        Object v4 = getGraph().insertVertex(getParent(), "v4", "Curitiba", 290, 480, 70,20,"ROUNDED");
                        Object v5 = getGraph().insertVertex(getParent(), "v5", "Belém", 300, 140, 70,20,"ROUNDED");
                        Object v6 = getGraph().insertVertex(getParent(), "v6", "Porto Velho", 130, 280, 70,20,"ROUNDED");
                        Object v7 = getGraph().insertVertex(getParent(), "v7", "Boa Vista", 160, 70, 70,20,"ROUNDED");
                        Object v8 = getGraph().insertVertex(getParent(), "v8", "Palmas", 340, 250,70,20,"ROUNDED");
                        Object v9 = getGraph().insertVertex(getParent(), "v9", "Maceió", 465, 255,70,20,"ROUNDED");
                        Object v10 = getGraph().insertVertex(getParent(), "v10", "Salvador", 415, 320, 70,20,"ROUNDED");
                        Object v11 = getGraph().insertVertex(getParent(), "v11", "Fortaleza", 460, 160,70,20,"ROUNDED");
                        Object v12 = getGraph().insertVertex(getParent(), "v12", "São Luís", 370, 170,70,20,"ROUNDED");
                        Object v13 = getGraph().insertVertex(getParent(), "v13", "João Pessoa",550, 210, 70,20,"ROUNDED");
                        Object v14 = getGraph().insertVertex(getParent(), "v14", "Recife",530, 240,70,20,"ROUNDED");
                        Object v15 = getGraph().insertVertex(getParent(), "v15", "Teresina",410, 210, 70,20,"ROUNDED");
                        Object v16 = getGraph().insertVertex(getParent(), "v16", "Natal",550, 180,70,20,"ROUNDED");
                        Object v17 = getGraph().insertVertex(getParent(), "v17", "Aracaju",480, 290,70,20,"ROUNDED");
                        Object v18 = getGraph().insertVertex(getParent(), "v18", "Goiania",320, 360,70,20,"ROUNDED");
                        Object v19 = getGraph().insertVertex(getParent(), "v19", "Cuiabá",240, 340,70,20,"ROUNDED");
                        Object v20 = getGraph().insertVertex(getParent(), "v20", "Campo Grande",240, 400,70,20,"ROUNDED");
                        Object v21 = getGraph().insertVertex(getParent(), "v21", "Brasília",320, 330,70,20,"ROUNDED");
                        Object v22 = getGraph().insertVertex(getParent(), "v22", "Vitória",440, 410,70,20,"ROUNDED");
                        Object v23 = getGraph().insertVertex(getParent(), "v23", "Belo Horizonte",410, 380,70,20,"ROUNDED");
                        Object v24 = getGraph().insertVertex(getParent(), "v24", "São Paulo",370, 460,70,20,"ROUNDED");
                        Object v25 = getGraph().insertVertex(getParent(), "v25", "Rio de Janeiro",400, 435,70,20,"ROUNDED");
                        Object v26 = getGraph().insertVertex(getParent(), "v26", "Porto Alegre",290, 560,70,20,"ROUNDED");
                        Object v27 = getGraph().insertVertex(getParent(), "v27", "Florianópolis",310, 510,70,20,"ROUNDED");
                        //Cria Arestas
                       
//----------------------------------------------------------- LINHAS AÉREAS -----------------------------------------------------------//
                    //---Manaus 
                        
                        //Manaus x Rio Branco
                        Object e1 = getGraph().insertEdge(getParent(), "e1", "1149;1445", v3, v1,"MYLINE");
                        //Manaus x Porto Velho
                        Object e2 = getGraph().insertEdge(getParent(), "e2", "0761;0901", v3, v6, "MYLINE");
                        //Manaus x Boa Vista 
                        Object e3 = getGraph().insertEdge(getParent(), "e3", "0661;0785", v3, v7, "MYLINE");
                        //Manaus x Belem
                        Object e5 = getGraph().insertEdge(getParent(), "e5", "1292;5298", v3, v5, "MYLINE");
                        
                    //---Belem 
                       
                        //Belem x Boa Vista
                        Object e4 = getGraph().insertEdge(getParent(), "e4", "1432;5298", v5, v7, "MYLINE");
                        
                    //---Florianpolis
        
                        // Florianópolis x Porto Alegre 
                        Object e6 = getGraph().insertEdge(getParent(), "e6", "0376;0476",v27,v26, "MYLINE");
              
                        //Florianópolis x Curitiba
                        Object e7 = getGraph().insertEdge(getParent(), "e7", "0251;0300",v27,v4, "MYLINE");
                        
                    //---Curitiba

                        //Curitiba x São Paulo
                        Object e8 = getGraph().insertEdge(getParent(), "e8", "0338;0408", v4, v24, "MYLINE");

                        //Curitiba x Campo Grande
                        Object e9 = getGraph().insertEdge(getParent(), "e9", "0780;0991", v4, v20, "MYLINE");
                         
                    //---Sao Paulo
        
                        //São Paulo x Rio de Janeiro
                        Object e10 = getGraph().insertEdge(getParent(), "e10", "0357;0429", v24, v25, "MYLINE");
                        //São Paulo x Belo Horizonte
                        Object e11 = getGraph().insertEdge(getParent(), "e11", "0489;0586", v24, v23,  "MYLINE");
                        //São Paulo x Campo Grande
                        Object e12 = getGraph().insertEdge(getParent(), "e12", "0894;1014", v24, v23,  "MYLINE");
                        
                    //---Campo Grande
        
                        //Campo Grande x Belo Horizonte
                        Object e13 = getGraph().insertEdge(getParent(), "e13", "1118;1453", v20, v23, "MYLINE");
                        //Campo Grande x Cuiabá
                        Object e14 = getGraph().insertEdge(getParent(), "e14", "0559;0694", v20, v19,  "MYLINE");
                        //Campo Grande x Goiania
                        Object e15 = getGraph().insertEdge(getParent(), "e15", "0705;0935", v20, v18, "MYLINE");
                        
                    //---Rio de Janeiro
        
                        //Rio de Janeiro x Belo Horizonte
                         Object e16 = getGraph().insertEdge(getParent(), "e16", "0339;0434", v25, v23, "MYLINE");
                        //Rio de Janeiro x Vitória
                         Object e17 = getGraph().insertEdge(getParent(), "e17", "0412;0521", v25, v22, "MYLINE");
                         
                    //---Belo Horizonte
        
                        //Belo Horizonte x Salvador
                        Object e18 = getGraph().insertEdge(getParent(), "e18", "0964;1372", v23, v10, "MYLINE");
                        //Belo Horizonte x Vitória
                        Object e19 = getGraph().insertEdge(getParent(), "e19", "0378;0524", v23, v22, "MYLINE");
                        //Belo Horizonte x Goiania
                        Object e20 = getGraph().insertEdge(getParent(), "e20", "0666;0906", v23, v18, "MYLINE");
                        
                        
                    //---Vitoria
        
                        //Vitória x Salvador
                        Object e21 = getGraph().insertEdge(getParent(), "e21", "0839;1202", v22, v10, "MYLINE");
                        
                    //---Brasilia
        
                        //Brasilia x Campo Grande
                        Object e22 = getGraph().insertEdge(getParent(), "e22", "0878;1134", v21, v20, "MYLINE");
              
                        //Brasilia x Belo Horizonte
                        Object e23 = getGraph().insertEdge(getParent(), "e23", "0624;0716", v21, v23, "MYLINE");
   
                        //Brasilia x Cuiaba
                        Object e24 = getGraph().insertEdge(getParent(), "e24", "0873;1133", v21, v19, "MYLINE");
                    
                        //Brasilia x Palmas
                        Object e25 = getGraph().insertEdge(getParent(), "e25", "0620;0973", v21, v8, "MYLINE");
                        
                        //Brasilia x Salvador;
                        Object e26 = getGraph().insertEdge(getParent(), "e26", "1060;1446", v21, v10, "MYLINE");
                        
                        //Brasilia x Goiania
                        Object e27 = getGraph().insertEdge(getParent(), "e27", "0173;0209", v21, v18, "MYLINE");
                        
                    //---Goiania 
        
                        //Goiania x Cuiaba
                        Object e28 = getGraph().insertEdge(getParent(), "e28", "0740;0934", v18, v19, "MYLINE");
                       
                        //Goiania x Palmas
                        Object e29 = getGraph().insertEdge(getParent(), "e29", "0724;0874", v18, v8, "MYLINE");
                        
                        //Goiania x Salvador
                        Object e30 = getGraph().insertEdge(getParent(), "e30", "1225;1643", v18, v10, "MYLINE");
                        
                    //---Cuiaba
        
                        //Cuiaba x Porto Velho
                        Object e31 = getGraph().insertEdge(getParent(), "e31", "1137;1456", v19, v6, "MYLINE");
                        
                        //Cuiaba x Manaus
                        Object e32 = getGraph().insertEdge(getParent(), "e32", "1453;2357", v19, v3, "MYLINE");
                       
                        //Cuiaba x Belém
                        Object e33 = getGraph().insertEdge(getParent(), "e33", "1778;2941", v19, v5, "MYLINE");
                     
                        //Cuiaba x Palmas
                        Object e34 = getGraph().insertEdge(getParent(), "e34", "1029;1784", v19, v8, "MYLINE");
                        
                    //---Belem
        
                        //Belem x Macapa
                        Object e35 = getGraph().insertEdge(getParent(), "e35", "0329;0000", v5, v2, "MYLINE");
                       
                        //Belem x Palmas
                        Object e36 = getGraph().insertEdge(getParent(), "e36", "0973;1283", v5, v8, "MYLINE");
                   
                        //Belem x Sao Luiz
                        Object e37 = getGraph().insertEdge(getParent(), "e37", "0481;0806", v5, v12, "MYLINE");
                    
                    //---Palmas
        
                        //Palmas X São Luiz
                        Object e38 = getGraph().insertEdge(getParent(), "e38", "0964;1386", v8, v12, "MYLINE");
                       
                        //Palmas x Teresina
                        Object e39 = getGraph().insertEdge(getParent(), "e39", "0835;1401", v8, v15, "MYLINE");
                        
                        //Palmas x Salvador
                        Object e40 = getGraph().insertEdge(getParent(), "e40", "1114;1454", v8, v10, "MYLINE");
                        
                    //---Sao Luiz
        
                        //São Luiz x Teresina
                        Object e41 = getGraph().insertEdge(getParent(), "e41", "0329;1163", v15, v12, "MYLINE");
                        
                    //---Teresina
        
                        //Teresina x Fortaleza
                        Object e42 = getGraph().insertEdge(getParent(), "e42", "0495;0634", v15, v11, "MYLINE");
                        
                        //Teresina x Recife
                        Object e43 = getGraph().insertEdge(getParent(), "e43", "0934;1137", v15, v14, "MYLINE");
                        
                        //Teresina x Salvador
                        Object e44 = getGraph().insertEdge(getParent(), "e44", "0994;1163", v15, v10, "MYLINE");
                       
                    //---Fortaleza
        
                        //Fortaleza x Natal
                        Object e45 = getGraph().insertEdge(getParent(), "e45", "0435;0537", v11, v16, "MYLINE");
                        
                        //Fortaleza x João Pessoa
                        Object e46 = getGraph().insertEdge(getParent(), "e46", "0555;0688", v11, v13, "MYLINE");
                        
                        //Fortaleza x Recife
                        Object e47 = getGraph().insertEdge(getParent(), "e47", "0629;0800", v11, v16, "MYLINE");
                        
                    //---Natal
        
                        //Natal x João Pessoa
                        Object e48 = getGraph().insertEdge(getParent(), "e48", "0151;0185", v16, v13, "MYLINE");
                     
                   //---Joao Pessoa
        
                        //João Pessoa x Recife
                        Object e49 = getGraph().insertEdge(getParent(), "e49", "0104;0120", v13, v14, "MYLINE");
                       
                   //---Recife
                        
                        //Recife x Maceio
                        Object e50 = getGraph().insertEdge(getParent(), "e50", "0202;0285", v14, v9, "MYLINE");
                     
                    //---Maceio 
        
                        //Maceio x Aracaju
                         Object e51 = getGraph().insertEdge(getParent(), "e51", "0201;0294", v9, v17, "MYLINE");

                    //---Salvador
        
                        //Salvador x Aracaju
                         Object e52 = getGraph().insertEdge(getParent(), "e52", "0277;0356", v10, v17, "MYLINE");
                   
                        //Salvador x Maceio
                        Object e53 = getGraph().insertEdge(getParent(), "e53", "0475;0632", v10, v9, "MYLINE");
                    
                        //Salvador x Recife
                        Object e54 = getGraph().insertEdge(getParent(), "e54", "0675;0839", v10, v14, "MYLINE");
                        
                                   
		}
		finally
		{
			getGraph().getModel().endUpdate();
		}
               
                return getGraph();
               
    }
     
     public mxGraphComponent graphcomponent(mxGraph g){
           //criando component
		mxGraphComponent graphComponent = new mxGraphComponent(getGraph());
                //desabilitando opção de criar conexão com o click do mouse
                graphComponent.setConnectable(false);
                //plano de fundo 
                graphComponent.setBackgroundImage(getIcon());
                
                return graphComponent;
     }
     
     
      
      public mxStylesheet estilopadrao(){
                        //estilo dos vértices padrão
                        mxStylesheet stylesheet = getGraph().getStylesheet();
                        Hashtable<String, Object> styleVertex = new Hashtable<String, Object>();
                        //estilo do vertice
                        styleVertex.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
                        //opacidade do vertice
                        styleVertex.put(mxConstants.STYLE_OPACITY, 90);
                        //cor da borda do vertice
                        styleVertex.put(mxConstants.STYLE_STROKECOLOR, "black");
                        //cor do fundo do vertice
                        styleVertex.put(mxConstants.STYLE_FILLCOLOR, "#D9DB91");
                        //cor da fonte
                        styleVertex.put(mxConstants.STYLE_FONTCOLOR, "#000000");
                        //estilo da fonte
                        styleVertex.put(mxConstants.STYLE_FONTFAMILY, "Arial");
                        //estilo da aresta
                        styleVertex.put(mxConstants.STYLE_EDGE, "topToBottomEdgeStyle");
                        //
                        styleVertex.put(mxConstants.STYLE_EDGE, false);  
                        stylesheet.putCellStyle("ROUNDED", styleVertex);
                        
                         //estilo dos vértices buscalargura
                        Map<String, Object> styleLarg = new HashMap<>();
                        //estilo do vertice
                        styleLarg.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
                        //opacidade do vertice
                        styleLarg.put(mxConstants.STYLE_OPACITY, 90);
                        //cor da borda do vertice
                        styleLarg.put(mxConstants.STYLE_STROKECOLOR, "black");
                        //cor do fundo do vertice
                        styleLarg.put(mxConstants.STYLE_FILLCOLOR, "#ff1a1a");
                        //cor da fonte
                        styleLarg.put(mxConstants.STYLE_FONTCOLOR, "#000000");
                        //estilo da fonte
                        styleLarg.put(mxConstants.STYLE_FONTFAMILY, "Arial");
                        //estilo da aresta
                        styleLarg.put(mxConstants.STYLE_EDGE, "topToBottomEdgeStyle");
                        //
                        styleLarg.put(mxConstants.STYLE_EDGE, false);  
                        stylesheet.putCellStyle("LARG", styleLarg);
                        
                        
                        //estilo dos vértices profundidade
                        Map<String, Object> styleProf = new HashMap<>();
                        //estilo do vertice
                        styleProf.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
                        //opacidade do vertice
                        styleProf.put(mxConstants.STYLE_OPACITY, 90);
                        //cor da borda do vertice
                        styleProf.put(mxConstants.STYLE_STROKECOLOR, "black");
                        //cor do fundo do vertice
                        styleProf.put(mxConstants.STYLE_FILLCOLOR, "#FF00FF");
                        //cor da fonte
                        styleProf.put(mxConstants.STYLE_FONTCOLOR, "#000000");
                        //estilo da fonte
                        styleProf.put(mxConstants.STYLE_FONTFAMILY, "Arial");
                        //estilo da aresta
                        styleProf.put(mxConstants.STYLE_EDGE, "topToBottomEdgeStyle");
                        //
                        styleProf.put(mxConstants.STYLE_EDGE, false);  
                        stylesheet.putCellStyle("PROF", styleProf);
                        
                        //estilo dos vértices gulosa
                        Map<String, Object> styleGulo = new HashMap<>();
                        //estilo do vertice
                        styleGulo.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
                        //opacidade do vertice
                        styleGulo.put(mxConstants.STYLE_OPACITY, 90);
                        //cor da borda do vertice
                        styleGulo.put(mxConstants.STYLE_STROKECOLOR, "black");
                        //cor do fundo do vertice
                        styleGulo.put(mxConstants.STYLE_FILLCOLOR, "#FF00FF");
                        //cor da fonte
                        styleGulo.put(mxConstants.STYLE_FONTCOLOR, "#000000");
                        //estilo da fonte
                        styleGulo.put(mxConstants.STYLE_FONTFAMILY, "Arial");
                        //estilo da aresta
                        styleGulo.put(mxConstants.STYLE_EDGE, "topToBottomEdgeStyle");
                        //
                        styleGulo.put(mxConstants.STYLE_EDGE, false);  
                        stylesheet.putCellStyle("GULO", styleGulo);
                        
                        //estilo dos vértices estrela
                        Map<String, Object> styleStar = new HashMap<>();
                        //estilo do vertice
                        styleStar.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_ELLIPSE);
                        //opacidade do vertice
                        styleStar.put(mxConstants.STYLE_OPACITY, 90);
                        //cor da borda do vertice
                        styleStar.put(mxConstants.STYLE_STROKECOLOR, "black");
                        //cor do fundo do vertice
                        styleStar.put(mxConstants.STYLE_FILLCOLOR, "#4682B4");
                        //cor da fonte
                        styleStar.put(mxConstants.STYLE_FONTCOLOR, "#000000");
                        //estilo da fonte
                        styleStar.put(mxConstants.STYLE_FONTFAMILY, "Arial");
                        //estilo da aresta
                        styleStar.put(mxConstants.STYLE_EDGE, "topToBottomEdgeStyle");
                        //
                        styleStar.put(mxConstants.STYLE_EDGE, false);  
                        stylesheet.putCellStyle("STAR", styleStar);
                        
                        
                        

                    //Estilo da aresta estrela
                        Map<String, Object> styleEdge1 = new HashMap<>();
                        styleEdge1.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_CONNECTOR);
                        styleEdge1.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_OPEN);
                        styleEdge1.put(mxConstants.STYLE_STARTARROW, mxConstants.ARROW_OPEN);
                        styleEdge1.put(mxConstants.STYLE_STROKECOLOR, "black");
                        styleEdge1.put(mxConstants.STYLE_FONTCOLOR, "blue");
                        styleEdge1.put(mxConstants.STYLE_FONTFAMILY, "Arial Black"); 
                        stylesheet.putCellStyle("MYLINE", styleEdge1);   
                    //Estilo da aresta percorrida largura
                        Map<String, Object> styleEdge2 = new HashMap<>();
                        styleEdge2.put(mxConstants.STYLE_SHAPE, mxConstants.SHAPE_CONNECTOR);
                        styleEdge2.put(mxConstants.STYLE_ENDARROW, mxConstants.ARROW_OPEN);
                        styleEdge2.put(mxConstants.STYLE_STARTARROW, mxConstants.ARROW_OPEN);             
                        styleEdge2.put(mxConstants.STYLE_STROKECOLOR, "gray");
                        styleEdge2.put(mxConstants.STYLE_FONTCOLOR, "red");
                        styleEdge2.put(mxConstants.STYLE_FONTFAMILY, "Arial Black"); 
                        stylesheet.putCellStyle("RED", styleEdge2);   
                       
                        return stylesheet;
      }
      
      public void confdefaulttela(){
                 getGraph().setCellsEditable(false);   // Want to edit the value of a cell in the graph?
                 getGraph().setCellsMovable(false);    // Moving cells in the graph. Note that an edge is also a cell.
                 getGraph().setCellsResizable(false);  // Inhibit cell re-sizing.
                 getGraph().setCellsSelectable(false); // Now I can't even select the cells!!!
                 getGraph().setEnabled(false); // Catch-All: no interaction with the graph.
                 getGraph().setStylesheet(estilopadrao());
      }
      
      public void desmarcartodos(mxGraph g){
          
          Object[] cells =  g.getChildVertices(g.getDefaultParent()); //cell tem todas as células que são vertices
          //desmarca todos os vertices
          for (Object c : cells) {
                 mxCell cell = (mxCell) c; //cast
                 
                  g.getModel().beginUpdate();
                    try{
                       cell.setStyle("ROUNDED");
                    }
                    finally{
                        // Updates the display
                        g.getModel().endUpdate();
                    }  
                        setComp(graphcomponent(g));
                        getComp().refresh();
                    
          }
      }
      
       /*baseado no slide da aula 06 http://moodle.pg.utfpr.edu.br/mod/resource/view.php?id=42800 */
      
        public ArrayList<mxICell> buscagulosa(mxGraph g, String Origem, String Destino, JTextArea areacaminho, JTextArea areacusto, Container c){
       //caminiho
        ArrayList<mxICell> caminho = new ArrayList<>();
        //vetice recebe Origem
        setVertice(getmxICellwithid(g,Origem));
        //tamanho da arraylist dos vizinhos
        int size;
        //Arraylist com vizinhos
        ArrayList<mxICell> vizinhos = new ArrayList<>();
        //limpa seleção e coloca todos os elementos do grafo em um vetor;
        Object[] cells =  g.getChildVertices(g.getDefaultParent()); //cell tem todas as células que são vertices
        //1. Desmarcar todos os vértices
        desmarcartodos(g);
        //2. Definir fila Q vazia
        Fila largura = new Fila();
        //3. Marcar s e inserir s na fila Q
        //System.out.println(vertice.getStyle());
        getVertice().setStyle("LARG");
       // System.out.println(vertice.getStyle());
        largura.insere(getVertice());
        caminho.add(getVertice());
        //areacaminho.setText((String) vertice.getValue());
            //4.Enquanto Q não estiver vazia
            while(largura.vazia() != true){
                
                     //5. Retirar v de Q
                    setVertice((mxICell) largura.remove());         
                    //6. Para todo vizinho w de v faça
                    vizinhos = getvizinhos(g, getVertice());//pega todos os vizinhos de vertice
                    size = vizinhos.size(); //size pega quantos vizinhos vertice tem  
                    //pega o menor zinho    
                    mxICell v = getmenor(g,vizinhos, getVertice());
                    
                               
                                //JOptionPane.showMessageDialog(null,v.getValue()+" Index:"+i);
                                //7. Se w não estiver marcado
                                //JOptionPane.showMessageDialog(null,v.getValue()+"tem:"+v.getStyle()+"Style");
                                if(!"GULO".equals(v.getStyle())){
                                    //8. marcar w
                                    g.getModel().beginUpdate();
                                        //SE ACHAR O DESTINO SAI DO LAÇO
                                        if(v.getValue() == Destino){
                                        caminho.add(v);
                                        return caminho;
                                        }else{
                                        caminho.add(v);
                                        }
                                    try
                                    {
                                     v.setStyle("GULO");
                                     }
                                    finally
                                    {
                                    // Updates the display
                                    g.getModel().endUpdate();
                                    }
                                    setComp(graphcomponent(g));
                                    getComp().refresh(); 
                                   
                                    //JOptionPane.showMessageDialog(null,v.getValue()+"tem:"+v.getStyle()+"Style");
                                    //9. inserir w em Q
                                    largura.insere(v);
                                }
                                 
                       
                        setVertice(v);
                    
                    //JOptionPane.showMessageDialog(null," VAZIO: "+largura.vazia()+" Tamanho: "+largura.size());
            }
            //JOptionPane.showMessageDialog(null, "Busca Largura finalizada");

            return caminho;
                
        }
        
       public ArrayList<mxICell> buscaestrela(mxGraph g, String Origem, String Destino, JTextArea areacaminho, JTextArea areacusto, Container c){
       //caminiho
        ArrayList<mxICell> caminho = new ArrayList<>();
        //vetice recebe Origem
        setVertice(getmxICellwithid(g,Origem));
        //tamanho da arraylist dos vizinhos
        int size;
        //Arraylist com vizinhos
        ArrayList<mxICell> vizinhos = new ArrayList<>();
        //limpa seleção e coloca todos os elementos do grafo em um vetor;
        Object[] cells =  g.getChildVertices(g.getDefaultParent()); //cell tem todas as células que são vertices
        //1. Desmarcar todos os vértices
        desmarcartodos(g);
        //2. Definir fila Q vazia
        Fila largura = new Fila();
        //3. Marcar s e inserir s na fila Q
        //System.out.println(vertice.getStyle());
        getVertice().setStyle("LARG");
       // System.out.println(vertice.getStyle());
        largura.insere(getVertice());
        caminho.add(getVertice());
        //areacaminho.setText((String) vertice.getValue());
            //4.Enquanto Q não estiver vazia
            while(largura.vazia() != true){
                
                     //5. Retirar v de Q
                    setVertice((mxICell) largura.remove());         
                    //6. Para todo vizinho w de v faça
                    vizinhos = getvizinhos(g, getVertice());//pega todos os vizinhos de vertice
                    size = vizinhos.size(); //size pega quantos vizinhos vertice tem  
                    //pega o menor zinho    
                    mxICell v = getestrela(g,vizinhos, getVertice());
                    
                               
                                //JOptionPane.showMessageDialog(null,v.getValue()+" Index:"+i);
                                //7. Se w não estiver marcado
                                //JOptionPane.showMessageDialog(null,v.getValue()+"tem:"+v.getStyle()+"Style");
                                if(!"STAR".equals(v.getStyle())){
                                    //8. marcar w
                                    g.getModel().beginUpdate();
                                        //SE ACHAR O DESTINO SAI DO LAÇO
                                        if(v.getValue() == Destino){
                                        caminho.add(v);
                                        return caminho;
                                        }else{
                                        caminho.add(v);
                                        }
                                    try
                                    {
                                     v.setStyle("STAR");
                                     }
                                    finally
                                    {
                                    // Updates the display
                                    g.getModel().endUpdate();
                                    }
                                    setComp(graphcomponent(g));
                                    getComp().refresh(); 
                                   
                                    //JOptionPane.showMessageDialog(null,v.getValue()+"tem:"+v.getStyle()+"Style");
                                    //9. inserir w em Q
                                    largura.insere(v);
                                }
                                 
                       
                        setVertice(v);
                    
                    //JOptionPane.showMessageDialog(null," VAZIO: "+largura.vazia()+" Tamanho: "+largura.size());
            }
            //JOptionPane.showMessageDialog(null, "Busca Largura finalizada");

            return caminho;
                
        }
        
      

      
      /* baseado em http://www.land.ufrj.br/~classes/grafos/slides/aula_6.pdf */
      
       public ArrayList<mxICell> buscaprofundidade(mxGraph g, String Origem, String Destino, JTextArea areacaminho, JTextArea areacusto, Container c){
        //caminho
         ArrayList<mxICell> caminho = new ArrayList<>();
        //vetice recebe Origem
        setVertice(getmxICellwithid(g,Origem));
        //tamanho da arraylist dos vizinhos
        int size;
        //Arraylist com vizinhos
        ArrayList<mxICell> vizinhos = new ArrayList<>();
        //limpa seleção e coloca todos os elementos do grafo em um vetor;
        Object[] cells =  g.getChildVertices(g.getDefaultParent()); //cell tem todas as células que são vertices
        //2. Desmarcar todos os vértices
        desmarcartodos(g);
        //3. Definir pilha P com um elemento s
        Pilha profundidade = new Pilha();
        // System.out.println(vertice.getStyle());
        profundidade.insere(getVertice());
        //areacaminho.setText((String) vertice.getValue());
            //4.Enquanto P não estiver vazia
            while(profundidade.vazia() != true){
                
                     //5. Remover u de P // no topo da pilha
                    setVertice((mxICell) profundidade.remove());      
                    //6. Se u não estiver marcado
                    if(getVertice().getStyle() != "PROF"){
                        //7. Marcar u como descoberto
                            getVertice().setStyle("PROF");
                            caminho.add(getVertice());
                            if(getVertice().getValue().toString() == Destino){
                               return caminho;
                            }
                            //8. Para cada aresta (u,v) incidente a u
                                vizinhos = getvizinhos(g, getVertice());
                                size = vizinhos.size(); //size pega quantos vizinhos vertice tem
                                 for(int i=0; i<size; i++){
                                 //9. Adicionar v em P // no topo
                                 profundidade.insere(vizinhos.get(i));
                                 }
                    }
                        setComp(graphcomponent(g));
                        getComp().refresh();
                    
            }
           
           
           return caminho;
       }
      
       
      /* baseado em http://www.land.ufrj.br/~classes/grafos/slides/aula_6.pdf */
       
      public ArrayList<mxICell> buscalargura(mxGraph g, String Origem, String Destino, JTextArea areacaminho, JTextArea areacusto, Container c){
        //caminiho
        ArrayList<mxICell> caminho = new ArrayList<>();
        //vetice recebe Origem
        setVertice(getmxICellwithid(g,Origem));
        caminho.add(getVertice());
        //tamanho da arraylist dos vizinhos
        int size;
        //Arraylist com vizinhos
        ArrayList<mxICell> vizinhos = new ArrayList<>();
        //limpa seleção e coloca todos os elementos do grafo em um vetor;
        Object[] cells =  g.getChildVertices(g.getDefaultParent()); //cell tem todas as células que são vertices
        //1. Desmarcar todos os vértices
        desmarcartodos(g);
        //2. Definir fila Q vazia
        Fila largura = new Fila();
        //3. Marcar s e inserir s na fila Q
        //System.out.println(vertice.getStyle());
        getVertice().setStyle("LARG");
       // System.out.println(vertice.getStyle());
        largura.insere(getVertice());
        //areacaminho.setText((String) vertice.getValue());
            //4.Enquanto Q não estiver vazia
            while(largura.vazia() != true){
                
                     //5. Retirar v de Q
                    setVertice((mxICell) largura.remove());         
                    //6. Para todo vizinho w de v faça
                    vizinhos = getvizinhos(g, getVertice());//pega todos os vizinhos de vertice
                    size = vizinhos.size(); //size pega quantos vizinhos vertice tem
                    for(int i=0; i<size; i++){
                        
                        mxICell v = vizinhos.get(i);

                               
                                //JOptionPane.showMessageDialog(null,v.getValue()+" Index:"+i);
                                //7. Se w não estiver marcado
                                //JOptionPane.showMessageDialog(null,v.getValue()+"tem:"+v.getStyle()+"Style");
                                if(!"LARG".equals(v.getStyle())){
                                    //8. marcar w
                                    g.getModel().beginUpdate();
                                        //SE ACHAR O DESTINO SAI DO LAÇO
                                        if(v.getValue() == Destino){
                                        caminho.add(v);
                                        return caminho;
                                        }else{
                                        caminho.add(v);
                                        }
                                    try
                                    {
                                     v.setStyle("LARG");
                                     }
                                    finally
                                    {
                                    // Updates the display
                                    g.getModel().endUpdate();
                                    }
                                     
                                   
                                    //JOptionPane.showMessageDialog(null,v.getValue()+"tem:"+v.getStyle()+"Style");
                                    //9. inserir w em Q
                                    largura.insere(v);
                                }
                                 
                       }
                        
                    
                    //JOptionPane.showMessageDialog(null," VAZIO: "+largura.vazia()+" Tamanho: "+largura.size());
            }
            //JOptionPane.showMessageDialog(null, "Busca Largura finalizada");
            setGraph(g);
            return caminho;
                

    }
    // PEGA TODOS OS VIZINHOS (VERTICES) DE UM VERTICE 
    public ArrayList<mxICell> getvizinhos(mxGraph g, mxICell vertice){
           //arraylist de todos os vizinhos do vertice
           ArrayList<mxICell> vizinhos = new ArrayList<>();
           g.clearSelection(); 
           g.selectAll();
           //System.out.println("vertice raiz:"+vertice.getId()+" value:"+vertice.getValue());
           //pega todas as arestas
           Object[] cells = g.getChildEdges(g.getDefaultParent()); 
                for (Object c : cells) {
                mxCell cell = (mxCell) c; //cast
                if(cell.getSource().equals(vertice)){
                  vizinhos.add(cell.getTarget());
                  //System.out.println("add:Target");
                }else if(cell.getTarget().equals(vertice)){
                  vizinhos.add(cell.getSource());
                 // System.out.println("add:Source");
                }
            
            }
                //JOptionPane.showMessageDialog(null,vertice.getValue()+"tem:"+vizinhos.size()+" vizinhos");
                return vizinhos;
 }
    //PEGA O MENOR DOS VIZINHOS
    public mxICell getmenor(mxGraph g, ArrayList<mxICell> vizinhos, mxICell raiz){
           int valor = 0;
           //variavel como menor
           mxICell menor = raiz;
           g.clearSelection(); 
           g.selectAll();
           //System.out.println("vertice raiz:"+vertice.getId()+" value:"+vertice.getValue());
           //pega todas as arestas
           Object[] cells = g.getChildEdges(g.getDefaultParent()); 
            //percorre todos os vizinhos
            for(int i=0; i<vizinhos.size(); i++){
                //percorre todas as arestas
                for (Object c : cells) {
                mxCell cell = (mxCell) c;
                
                if(cell.getTarget()==raiz){
                    //se for a primeira interaçao
                    if(menor == raiz){
                        valor = Integer.parseInt(cell.getValue().toString().substring(0,4));
                        menor = cell.getSource();
                    //se nao for o primeiro vizinho
                    }else{
                        if(valor > Integer.parseInt(cell.getValue().toString().substring(0,4))){
                            valor = Integer.parseInt(cell.getValue().toString().substring(0,4));
                            menor = cell.getSource();
                        }
                    }
                }else if(cell.getSource()==raiz){
                    //se for a primeira interaçao
                    if(menor == raiz){
                        valor = Integer.parseInt(cell.getValue().toString().substring(0,4));
                        menor = cell.getTarget();
                    //se nao for o primeiro vizinho
                    }else{
                         if(valor > Integer.parseInt(cell.getValue().toString().substring(0,4))){
                            valor = Integer.parseInt(cell.getValue().toString().substring(0,4));
                            menor = cell.getTarget();
                        }
                    }
                }
                
                }
           }

           return menor;
    }
    
     //PEGA O MENOR DOS VIZINHOS
    public mxICell getestrela (mxGraph g, ArrayList<mxICell> vizinhos, mxICell raiz){
           int valor = 0;
           //variavel como menor
           mxICell menor = raiz;
           g.clearSelection(); 
           g.selectAll();
           //System.out.println("vertice raiz:"+vertice.getId()+" value:"+vertice.getValue());
           //pega todas as arestas
           Object[] cells = g.getChildEdges(g.getDefaultParent()); 
            //percorre todos os vizinhos
            for(int i=0; i<vizinhos.size(); i++){
                //percorre todas as arestas
                for (Object c : cells) {
                mxCell cell = (mxCell) c;
                
                if(cell.getTarget()==raiz){
                    //se for a primeira interaçao
                    if(menor == raiz){
                        valor = (Integer.parseInt(cell.getValue().toString().substring(0,4))+ Integer.parseInt(cell.getValue().toString().substring(5,9)));
                        menor = cell.getSource();
                    //se nao for o primeiro vizinho
                    }else{
                        if(valor > (Integer.parseInt(cell.getValue().toString().substring(0,4))+ Integer.parseInt(cell.getValue().toString().substring(5,9)))){
                            valor = (Integer.parseInt(cell.getValue().toString().substring(0,4))+ Integer.parseInt(cell.getValue().toString().substring(5,9)));
                            menor = cell.getSource();
                        }
                    }
                }else if(cell.getSource()==raiz){
                    //se for a primeira interaçao
                    if(menor == raiz){
                        valor = (Integer.parseInt(cell.getValue().toString().substring(0,4))+ Integer.parseInt(cell.getValue().toString().substring(5,9)));
                        menor = cell.getTarget();
                    //se nao for o primeiro vizinho
                    }else{
                         if(valor > (Integer.parseInt(cell.getValue().toString().substring(0,4))+ Integer.parseInt(cell.getValue().toString().substring(5,9)))){
                            valor = (Integer.parseInt(cell.getValue().toString().substring(0,4))+ Integer.parseInt(cell.getValue().toString().substring(5,9)));
                            menor = cell.getTarget();
                        }
                    }
                }
                
                }
           }

           return menor;
    }
    
    //PEGA O VERTICE ATRAVES DO ID
    public mxICell getmxICellwithid(mxGraph g,String vertice){
            mxICell cell;
            g.clearSelection(); 
            g.selectEdges();
            Object[] cells = g.getChildVertices(g.getDefaultParent());
            for (Object c : cells) {
             cell = (mxICell) c; //cast
             //System.out.println("Cell.getvalue: "+cell.getValue()+" vertice:"+ vertice);
             if(cell.getValue() == vertice)
                 return cell;
            }
      return null;
    }
    
    //lista de custos
    public ArrayList<String> listadecustosrodo(mxGraph g, ArrayList<mxICell> caminho){
        //arraylist com os custos de determinado caminho
        ArrayList<String> custos = new ArrayList<>();
        Object[] cells = g.getChildEdges(g.getDefaultParent());
        //PERCORRE TODOS OS VERTICES DO CAMINHO
        for (int i=0; i<(caminho.size()-1);i++) {
             //PERCORRE TODAS AS ARESTAS DO GRAFO
              for (Object c : cells) {
              mxCell cell = (mxCell) c; //cast    
     
              if(cell.getSource().equals(caminho.get(i))&&cell.getTarget().equals(caminho.get(i+1))){
                  custos.add(cell.getValue().toString().substring(5, 9));
                  //JOptionPane.showMessageDialog(null,cell.getId()+"CUSTOU:"+cell.getValue().toString().substring(5, 9));
                  break;
              }else if(cell.getTarget().equals(caminho.get(i))&&cell.getSource().equals(caminho.get(i+1))){
                  custos.add(cell.getValue().toString().substring(5, 9));
                  //JOptionPane.showMessageDialog(null,cell.getId()+"CUSTOU:"+cell.getValue().toString().substring(5, 9));
                  break;
              }
            
             
              }
        }
 
        
        
        return custos;
        
    }
    
    //lista de custos
    public ArrayList<String> listadecustosaereo(mxGraph g, ArrayList<mxICell> caminho){
        //arraylist com os custos de determinado caminho
        ArrayList<String> custos = new ArrayList<>();
        Object[] cells = g.getChildEdges(g.getDefaultParent());
        //PERCORRE TODOS OS VERTICES DO CAMINHO
        for (int i=0; i<(caminho.size()-1);i++) {
             //PERCORRE TODAS AS ARESTAS DO GRAFO
              for (Object c : cells) {
              mxCell cell = (mxCell) c; //cast    
     
              if(cell.getSource().equals(caminho.get(i))&&cell.getTarget().equals(caminho.get(i+1))){
                  custos.add(cell.getValue().toString().substring(0, 4));
                  //JOptionPane.showMessageDialog(null,cell.getId()+"CUSTOU:"+cell.getValue().toString().substring(5, 9));
                  break;
              }else if(cell.getTarget().equals(caminho.get(i))&&cell.getSource().equals(caminho.get(i+1))){
                  custos.add(cell.getValue().toString().substring(0, 4));
                  //JOptionPane.showMessageDialog(null,cell.getId()+"CUSTOU:"+cell.getValue().toString().substring(5, 9));
                  break;
              }
            
             
              }
        }
 
        
        
        return custos;
        
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
     * @return the graph
     */
    public mxGraph getGraph() {
        return graph;
    }

    /**
     * @param graph the graph to set
     */
    public void setGraph(mxGraph graph) {
        this.graph = graph;
    }

    /**
     * @return the parent
     */
    public Object getParent() {
        return parent;
    }

    /**
     * @param parent the parent to set
     */
    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * @return the icon
     */
    public ImageIcon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    /**
     * @return the vertice
     */
    public mxICell getVertice() {
        return vertice;
    }

    /**
     * @param vertice the vertice to set
     */
    public void setVertice(mxICell vertice) {
        this.vertice = vertice;
    }

    /**
     * @return the aresta
     */
    public mxICell getAresta() {
        return aresta;
    }

    /**
     * @param aresta the aresta to set
     */
    public void setAresta(mxICell aresta) {
        this.aresta = aresta;
    }
    
}
             

        
                
      

