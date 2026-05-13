package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VodFeedbackEntry.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class VodFeedbackEntry {
    private boolean isCheck;

    @Nullable
    private String title;

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z10) {
        this.isCheck = z10;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
