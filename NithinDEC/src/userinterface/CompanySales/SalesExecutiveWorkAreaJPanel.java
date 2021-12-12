/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CompanySales;

import userinterface.AviationBusiness.*;
import userinterface.HospitalArea.*;
import userinterface.DeliveryManRole.*;
import Business.EcoSystem;
import Business.Order.Order;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;

/**
 *
 * @author raunak
 */
public class SalesExecutiveWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public SalesExecutiveWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        lbUserName.setText(account.getUsername());
        populateTable();
        showPieChart();
        showLineChart();
        showHistogram();
        showBarChart();
        
    }
    public void showPieChart(){
        
        //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      barDataset.setValue( "Pharma" , new Double( 20 ) );  
      barDataset.setValue( "Defence" , new Double( 20 ) );   
      barDataset.setValue( "Hospitals" , new Double( 40 ) );    
      barDataset.setValue( "Scuba" , new Double( 10 ) );  
      
      //create chart
       JFreeChart piechart = ChartFactory.createPieChart("Oxygen Sales",barDataset, false,true,false);//explain
      
        PiePlot piePlot =(PiePlot) piechart.getPlot();
      
       //changing pie chart blocks colors
       piePlot.setSectionPaint("Pharma", new Color(255,255,102));
        piePlot.setSectionPaint("Defence", new Color(102,255,102));
        piePlot.setSectionPaint("Hospitals", new Color(255,102,153));
        piePlot.setSectionPaint("Scuba", new Color(0,204,204));
      
       
        piePlot.setBackgroundPaint(Color.white);
        
        //create chartPanel to display chart(graph)
        ChartPanel pieChartPanel = new ChartPanel(piechart);
        panelPieChart.removeAll();
        panelPieChart.add(pieChartPanel, BorderLayout.CENTER);
        panelPieChart.validate();
    }
    
      public void showLineChart(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Purchase Trend","monthly","Number of Orders", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        panelLineChart.removeAll();
        panelLineChart.add(lineChartPanel, BorderLayout.CENTER);
        panelLineChart.validate();
      }  
      
       public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
//         JFreeChart chart = ChartFactory.createHistogram("Oxygen Cylinder Sales Histogram","Cylinder Packs", "Purchase Frequency", dataset,PlotOrientation.VERTICAL, false,true,false);
//            XYPlot plot= chart.getXYPlot();
//        plot.setBackgroundPaint(Color.WHITE);

        
        
        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        panelHistogramChart.removeAll();
        panelHistogramChart.add(barpChartPanel2, BorderLayout.CENTER);
        panelHistogramChart.validate();
    }

    /*========================================================================================*/
    
    public void showBarChart(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        JFreeChart chart = ChartFactory.createBarChart("Montlhy Turnover","monthly","Earned In USD(10k)", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        panelBarChart.removeAll();
        panelBarChart.add(barpChartPanel, BorderLayout.CENTER);
        panelBarChart.validate();
        
        
    }
    
    public void populateTable(){
        System.out.println("Inside method to populate orders table");
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        
        for(Order o : this.system.getOrderDirectory().getOrderDirectory()){
            System.out.println(this.userAccount.getUsername());
            System.out.println(o.getDeliveryMan());
            if((this.userAccount.getUsername().equals(o.getDeliveryMan()))
                    && (o.getOrderStatus().equals("Delivery Assigned") ||
                           o.getOrderStatus().equals("Order Picked up") ||
                    o.getOrderStatus().equals("Delivered"))){
                System.out.println(o);
                Object[] row = new Object[5];
                row[0] = o;
                row[1] = o.getSender().getUsername();
                row[2] = o.getReceiver().getUsername();
                row[3] = o.getOrderStatus();
                row[4] = o.getMessage();
                model.addRow(row);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        panelBarChart = new javax.swing.JPanel();
        panelPieChart = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        panelHistogramChart = new javax.swing.JPanel();

        setBackground(new java.awt.Color(246, 252, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 10, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Welcome : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        lbUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbUserName.setText("<value>");
        add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 259, -1));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 410, 280));

        panelPieChart.setLayout(new java.awt.BorderLayout());
        add(panelPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 420, 280));

        panelLineChart.setLayout(new java.awt.BorderLayout());
        add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 420, 280));

        panelHistogramChart.setLayout(new java.awt.BorderLayout());
        add(panelHistogramChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 420, 280));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelHistogramChart;
    private javax.swing.JPanel panelLineChart;
    private javax.swing.JPanel panelPieChart;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
