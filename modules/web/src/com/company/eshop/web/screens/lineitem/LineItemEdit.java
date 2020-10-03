package com.company.eshop.web.screens.lineitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.eshop.entity.LineItem;

@UiController("eshop_LineItem.edit")
@UiDescriptor("line-item-edit.xml")
@EditedEntityContainer("lineItemDc")
@LoadDataBeforeShow
public class LineItemEdit extends StandardEditor<LineItem> {
}