package org.fourthline.cling.model;

import ir.k;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ValidationException extends Exception {
    public List<k> errors;

    public ValidationException(String str) {
        super(str);
    }

    public ValidationException(String str, Throwable th2) {
        super(str, th2);
    }

    public ValidationException(String str, List<k> list) {
        super(str);
        this.errors = list;
    }

    public List<k> getErrors() {
        return this.errors;
    }
}
