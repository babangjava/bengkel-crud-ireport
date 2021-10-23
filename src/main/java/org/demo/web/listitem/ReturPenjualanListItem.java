/*
 * Created on 25 Jul 2021 ( Time 02:07:52 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package org.demo.web.listitem;

import org.demo.bean.ReturPenjualan;
import org.demo.web.common.ListItem;

public class ReturPenjualanListItem implements ListItem {

	private final String value ;
	private final String label ;
	
	public ReturPenjualanListItem(ReturPenjualan returPenjualan) {
		super();

		this.value = ""
			 + returPenjualan.getIdreturPenjualan()
		;

		//TODO : Define here the attributes to be displayed as the label
		this.label = returPenjualan.toString();
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public String getLabel() {
		return label;
	}

}