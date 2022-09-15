
package com.xdev.rcmigrationexample.ui;

import com.xdev.rcmigrationexample.HasTitle;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "pictures", layout = MainLayout.class)
public class PicturesView extends VerticalLayout implements HasTitle
{
	public PicturesView()
	{
		super();
		this.initUI();
	}
	
	@Override
	public String getTitle()
	{
		return "Pictures";
	}
	
	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.paragraph = new Paragraph();
		
		this.paragraph.setText(
			"This lists all the pictures that we want to share with the user. Maybe some nice vacation pictures :)");
		
		this.paragraph.setWidthFull();
		this.paragraph.setHeight(null);
		this.add(this.paragraph);
		this.setWidthFull();
		this.setHeight(null);
	} // </generated-code>
	
	// <generated-code name="variables">
	private Paragraph paragraph;
	// </generated-code>
	
}
