package com.mgs.carparking.netbean;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SeriesInfoEntry.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SeriesInfoEntry {

    /* JADX INFO: renamed from: default, reason: not valid java name */
    @Nullable
    private Boolean f3280default = Boolean.FALSE;

    @Nullable
    private String series;
    private int vod_id;

    @Nullable
    public final Boolean getDefault() {
        return this.f3280default;
    }

    @Nullable
    public final String getSeries() {
        return this.series;
    }

    public final int getVod_id() {
        return this.vod_id;
    }

    public final void setDefault(@Nullable Boolean bool) {
        this.f3280default = bool;
    }

    public final void setSeries(@Nullable String str) {
        this.series = str;
    }

    public final void setVod_id(int i10) {
        this.vod_id = i10;
    }
}
