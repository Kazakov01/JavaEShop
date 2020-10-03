package com.company.eshop.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.Customer;

@UiController("eshop_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}