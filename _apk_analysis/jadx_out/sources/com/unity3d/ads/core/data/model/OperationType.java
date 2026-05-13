package com.unity3d.ads.core.data.model;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: OperationType.kt */
/* JADX INFO: loaded from: classes4.dex */
public enum OperationType {
    UNKNOWN,
    INITIALIZATION,
    LOAD,
    LOAD_HEADER_BIDDING,
    SHOW,
    REFRESH,
    PRIVACY_UPDATE,
    INITIALIZATION_COMPLETED,
    TRANSACTION_EVENT,
    GET_TOKEN,
    UNIVERSAL_EVENT;

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        p.j(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        p.j(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
