package com.company.eshop.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.Customer;

@UiController("eshop_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}