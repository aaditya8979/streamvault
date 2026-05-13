package com.unity3d.ads.core.data.model;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AdContext.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ImpressionConfig {

    @NotNull
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m7241boximpl(String str) {
        return new ImpressionConfig(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7242constructorimpl(@NotNull String str) {
        p.k(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7243equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && p.f(str, ((ImpressionConfig) obj).m7247unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7244equalsimpl0(String str, String str2) {
        return p.f(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7245hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7246toStringimpl(String str) {
        return "ImpressionConfig(data=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m7243equalsimpl(this.data, obj);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m7245hashCodeimpl(this.data);
    }

    public String toString() {
        return m7246toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7247unboximpl() {
        return this.data;
    }
}
