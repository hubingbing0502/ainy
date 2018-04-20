package com.hhdb.csadmin.plugin.user_permission.UI;


import javax.swing.table.DefaultTableModel;

/**
 * 
 * @Description: 表格模型
 * @Copyright: Copyright (c) 2017�?0�?5�?
 * @Company:H2 Technology
 * @author zhipeng.zhang
 * @version 1.0
 */
public class TableDataModel extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 表格只读 true:编辑 false：只�?
	 */
	private boolean editable;
	/**
	 * 列只�?
	 */
	private int[] cloumns;

	public TableDataModel(boolean editable, int[] cloumns) {
		this.cloumns = cloumns;
		this.editable = editable;
	}

	@Override
	public boolean isCellEditable(int row, int column) {
		if (cloumns != null) {
			for (int cl : cloumns) {
				if (cl == column) {
					return false;
				}
			}
		}
		return editable;
	}
}
