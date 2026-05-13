package com.mgs.carparking.netbean;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: FeedbackTypeEntry.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class FeedbackTypeEntry {
    private boolean isFlag;

    @NotNull
    private String name;

    public FeedbackTypeEntry(@NotNull String str, boolean z10) {
        p.k(str, "name");
        this.name = str;
        this.isFlag = z10;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isFlag() {
        return this.isFlag;
    }

    public final void setFlag(boolean z10) {
        this.isFlag = z10;
    }

    public final void setName(@NotNull String str) {
        p.k(str, "<set-?>");
        this.name = str;
    }
}
