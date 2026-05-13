package org.fourthline.cling.registry;

import ir.k;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RegistrationException extends RuntimeException {
    public List<k> errors;

    public RegistrationException(String str) {
        super(str);
    }

    public RegistrationException(String str, Throwable th2) {
        super(str, th2);
    }

    public RegistrationException(String str, List<k> list) {
        super(str);
        this.errors = list;
    }

    public List<k> getErrors() {
        return this.errors;
    }
}
