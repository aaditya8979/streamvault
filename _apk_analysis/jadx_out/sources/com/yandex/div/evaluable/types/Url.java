package com.yandex.div.evaluable.types;

import java.net.MalformedURLException;
import java.net.URL;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Url.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class Url {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final String value;

    /* JADX INFO: compiled from: Url.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        private final boolean isValid(String str) {
            try {
                new URL(str);
                return true;
            } catch (MalformedURLException unused) {
                return false;
            }
        }

        @NotNull
        /* JADX INFO: renamed from: from-VcSV9u8, reason: not valid java name */
        public final String m7462fromVcSV9u8(@NotNull String str) throws IllegalArgumentException {
            p.k(str, "urlString");
            if (isValid(str)) {
                return Url.m7456constructorimpl(str);
            }
            throw new IllegalArgumentException("Invalid url " + str);
        }
    }

    private /* synthetic */ Url(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Url m7455boximpl(String str) {
        return new Url(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m7456constructorimpl(@NotNull String str) {
        p.k(str, "value");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7457equalsimpl(String str, Object obj) {
        return (obj instanceof Url) && p.f(str, ((Url) obj).m7461unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7458equalsimpl0(String str, String str2) {
        return p.f(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7459hashCodeimpl(String str) {
        return str.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7460toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m7457equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7459hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m7460toStringimpl(this.value);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m7461unboximpl() {
        return this.value;
    }
}
