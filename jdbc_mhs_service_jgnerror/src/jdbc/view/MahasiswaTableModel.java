/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.view;

/**
 *
 * @author driven
 */
import jdbc.model.Mahasiswa;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MahasiswaTableModel extends AbstractTableModel {
    private List<Mahasiswa> list;
    private final String[] columnNames = {"ID", "Nama"};
    
    public MahasiswaTableModel(List<Mahasiswa> list) {
        this.list = list;
    }
    
    public void setList(List<Mahasiswa> list) {
        this.list = list;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Mahasiswa mahasiswa = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return mahasiswa.getId();
            case 1: return mahasiswa.getNama();
            default: return null;
        }
    }
}