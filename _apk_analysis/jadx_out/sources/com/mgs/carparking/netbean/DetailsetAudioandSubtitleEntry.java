package com.mgs.carparking.netbean;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DetailsetAudioandSubtitleEntry.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DetailsetAudioandSubtitleEntry {

    @NotNull
    private String detailname;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44301id;
    private boolean isSelector;

    @NotNull
    private String name;

    public DetailsetAudioandSubtitleEntry(int i10, @NotNull String str, @NotNull String str2, boolean z10) {
        p.k(str, "name");
        p.k(str2, "detailname");
        this.f44301id = i10;
        this.name = str;
        this.detailname = str2;
        this.isSelector = z10;
    }

    @NotNull
    public final String getDetailname() {
        return this.detailname;
    }

    public final int getId() {
        return this.f44301id;
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

    public final void setId(int i10) {
        this.f44301id = i10;
    }

    public final void setName(@NotNull String str) {
        p.k(str, "<set-?>");
        this.name = str;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }
}
