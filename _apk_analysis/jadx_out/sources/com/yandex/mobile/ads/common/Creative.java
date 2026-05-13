package com.yandex.mobile.ads.common;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes3.dex */
public final class Creative {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59180b;

    /* JADX WARN: Multi-variable type inference failed */
    public Creative() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public Creative(@Nullable String str, @Nullable String str2) {
        this.f59179a = str;
        this.f59180b = str2;
    }

    public /* synthetic */ Creative(String str, String str2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Creative)) {
            return false;
        }
        Creative creative = (Creative) obj;
        return p.f(this.f59179a, creative.f59179a) && p.f(this.f59180b, creative.f59180b);
    }

    public int hashCode() {
        String str = this.f59179a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f59180b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Creative(creativeId=" + this.f59179a + ", campaignId=" + this.f59180b + ")";
    }
}
