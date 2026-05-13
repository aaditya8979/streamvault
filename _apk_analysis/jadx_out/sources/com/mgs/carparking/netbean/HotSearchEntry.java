package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HotSearchEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class HotSearchEntry {
    private int sort;

    @Nullable
    private String word;

    public final int getSort() {
        return this.sort;
    }

    @Nullable
    public final String getWord() {
        return this.word;
    }

    public final void setSort(int i10) {
        this.sort = i10;
    }

    public final void setWord(@Nullable String str) {
        this.word = str;
    }
}
