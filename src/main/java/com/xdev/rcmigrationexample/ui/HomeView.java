
package com.xdev.rcmigrationexample.ui;

import java.util.Comparator;
import java.util.Optional;

import com.rapidclipse.framework.server.data.format.NumberFormatBuilder;
import com.rapidclipse.framework.server.data.renderer.RenderedComponent;
import com.rapidclipse.framework.server.resources.CaptionUtils;
import com.rapidclipse.framework.server.ui.filter.FilterComponent;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.provider.DataProvider;
import com.vaadin.flow.data.renderer.NumberRenderer;
import com.vaadin.flow.router.Route;
import com.xdev.rcmigrationexample.HasTitle;
import com.xdev.rcmigrationexample.dal.ProductDAO;
import com.xdev.rcmigrationexample.domain.Category;
import com.xdev.rcmigrationexample.domain.Product;
import com.xdev.rcmigrationexample.ui.gencols.GenColProduct;


@Route(value = "", layout = MainLayout.class)
public class HomeView extends VerticalLayout implements HasTitle
{
	public HomeView()
	{
		super();
		this.initUI();
	}

	@Override
	public String getTitle()
	{
		return "Home";
	}

	/* WARNING: Do NOT edit!<br>The content of this method is always regenerated by the UI designer. */
	// <generated-code name="initUI">
	private void initUI()
	{
		this.filterComponent = new FilterComponent();
		this.grid = new Grid<>(Product.class, false);
		
		this.grid.addThemeVariants(GridVariant.LUMO_ROW_STRIPES);
		this.grid.addColumn(Product::getProductid).setKey("productid").setHeader(
			CaptionUtils.resolveCaption(Product.class, "productid")).setSortable(true);
		this.grid.addColumn(Product::getProductname).setKey("productname").setHeader(
			CaptionUtils.resolveCaption(Product.class, "productname")).setSortable(true);
		this.grid.addColumn(
			v -> Optional.ofNullable(v).map(Product::getCategory).map(Category::getCategoryname).orElse(null)).setKey(
				"category.categoryname").setHeader(
					CaptionUtils.resolveCaption(Product.class, "category.categoryname")).setSortable(true);
		this.grid.addColumn(new NumberRenderer<>(Product::getUnitprice, NumberFormatBuilder.Currency().build(), "")).setKey(
			"unitprice").setHeader(CaptionUtils.resolveCaption(Product.class, "unitprice")).setSortable(true).setAutoWidth(
				true).setFlexGrow(0).setTextAlign(ColumnTextAlign.END);
		this.grid.addColumn(
			new NumberRenderer<>(Product::getUnitsinstock, NumberFormatBuilder.Integer().build(), "")).setKey(
				"unitsinstock").setHeader(CaptionUtils.resolveCaption(Product.class, "unitsinstock")).setSortable(
					true).setAutoWidth(true).setFlexGrow(0).setTextAlign(ColumnTextAlign.END);
		this.grid.addColumn(Product::isDiscontinued).setKey("discontinued").setHeader(
			CaptionUtils.resolveCaption(Product.class, "discontinued")).setSortable(true).setComparator(
				Comparator.comparing(Product::isDiscontinued)).setAutoWidth(true).setFlexGrow(0);
		this.grid.addColumn(RenderedComponent.Renderer(GenColProduct::new)).setKey("renderer").setHeader("...").setSortable(
			false).setAutoWidth(true).setFlexGrow(0).setTextAlign(ColumnTextAlign.CENTER);
		this.grid.setDataProvider(DataProvider.ofCollection(ProductDAO.INSTANCE.findAll()));
		this.grid.setSelectionMode(Grid.SelectionMode.SINGLE);
		
		this.filterComponent.setWidthFull();
		this.filterComponent.setHeight(null);
		this.grid.setSizeFull();
		this.add(this.filterComponent, this.grid);
		this.setFlexGrow(1.0, this.grid);
		this.setSizeFull();
	} // </generated-code>
	
	// <generated-code name="variables">
	private FilterComponent filterComponent;
	private Grid<Product>   grid;
	// </generated-code>

}
