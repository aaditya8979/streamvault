package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectorAgeEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SelectorAgeEntry implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private String f44309k;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private String f44310v;

    @Nullable
    public final String getK() {
        return this.f44309k;
    }

    @Nullable
    public final String getV() {
        return this.f44310v;
    }

    public final void setK(@Nullable String str) {
        this.f44309k = str;
    }

    public final void setV(@Nullable String str) {
        this.f44310v = str;
    }
}
