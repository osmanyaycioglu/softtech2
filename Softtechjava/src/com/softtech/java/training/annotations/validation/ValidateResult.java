package com.softtech.java.training.annotations.validation;

import java.util.ArrayList;
import java.util.List;

public class ValidateResult {

    private int          status;
    private List<String> errorDescList;

    public int getStatus() {
        return this.status;
    }

    public void setStatus(final int statusParam) {
        this.status = statusParam;
    }

    public List<String> getErrorDesc() {
        return this.errorDescList;
    }

    public void addErrorDesc(final String errorDescParam) {
        this.status++;
        if (this.errorDescList == null) {
            this.errorDescList = new ArrayList<>();
        }
        this.errorDescList.add(errorDescParam);
    }


}
