package com.company.eshop.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.Order;

@UiController("eshop_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
}