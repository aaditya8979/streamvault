package com.unity3d.ads.core.data.model;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: InitializationState.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

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
