package com.company.eshop.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.Order;

@UiController("eshop_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}