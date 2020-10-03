package com.company.eshop.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.Product;

@UiController("eshop_Item.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}