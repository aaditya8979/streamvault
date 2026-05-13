package com.unity3d.ads.core.data.model;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AdContext.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AdData {

    @NotNull
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m7227boximpl(String str) {
        return new AdData(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7228constructorimpl(@NotNull String str) {
        p.k(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7229equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && p.f(str, ((AdData) obj).m7233unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7230equalsimpl0(String str, String str2) {
        return p.f(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7231hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7232toStringimpl(String str) {
        return "AdData(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m7229equalsimpl(this.data, obj);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m7231hashCodeimpl(this.data);
    }

    public String toString() {
        return m7232toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7233unboximpl() {
        return this.data;
    }
}
