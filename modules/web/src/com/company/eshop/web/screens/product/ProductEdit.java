package com.company.eshop.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.Product;

@UiController("eshop_Item.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}