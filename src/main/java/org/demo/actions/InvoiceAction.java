package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.demo.actions.beans.InvoiceBean;


@Action(value = "invoice", results = {
        @Result(name = "success", location = "/WEB-INF/welcome.jsp")
})
public class InvoiceAction extends ActionSupport {
    private InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }

    public double getNetAmount() {
        double vatRate = 0.21;
        double netAmount = invoiceBean.getGrossAmount() * (1 + vatRate);
        return Math.round(netAmount * 100.0) / 100.0;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }

    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty() || invoiceBean.getSubject() == null) {
            addFieldError("invoiceBean.subject", "El concepto es obligatorio.");
        }
        if (invoiceBean.getDateFrom() == null) {
            addFieldError("invoiceBean.dateFrom", "La fecha de inicio es obligatoria.");
        }
        if (invoiceBean.getDateTo() == null) {
            addFieldError("invoiceBean.dateTo", "La fecha fin es obligatoria.");
        }
		if (invoiceBean.getGrossAmount() <= 0) {
			addFieldError("invoiceBean.grossAmount", "El importe bruto es obligatorio.");
		}
    }
}
