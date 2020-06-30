package com.hiberu.service;

import com.hiberu.model.Invoice;

public interface IInvoceService extends ICrud<Invoice>{

    public Invoice getTotalOrderPrice(Invoice invoice);
    public Invoice listById(Integer id);
    public String triggerLogistic(Invoice invoice);
}
