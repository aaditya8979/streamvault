package com.mgs.carparking.netbean;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SetLanguageEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SetLanguageEntry {

    @NotNull
    private String detailname;
    private boolean isSelector;

    @NotNull
    private String name;

    public SetLanguageEntry(@NotNull String str, @NotNull String str2, boolean z10) {
        p.k(str, "name");
        p.k(str2, "detailname");
        this.name = str;
        this.detailname = str2;
        this.isSelector = z10;
    }

    @NotNull
    public final String getDetailname() {
        return this.detailname;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setDetailname(@NotNull String str) {
        p.k(str, "<set-?>");
        this.detailname = str;
    }

    public final void setName(@NotNull String str) {
        p.k(str, "<set-?>");
        this.name = str;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }
}
