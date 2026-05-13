package com.mgs.carparking.netbean;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: VideoSetSpeedEntry.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class VideoSetSpeedEntry {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44320id;
    private boolean isSelector;

    @NotNull
    private String name;

    public VideoSetSpeedEntry(int i10, @NotNull String str, boolean z10) {
        p.k(str, "name");
        this.f44320id = i10;
        this.name = str;
        this.isSelector = z10;
    }

    public final int getId() {
        return this.f44320id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setId(int i10) {
        this.f44320id = i10;
    }

    public final void setName(@NotNull String str) {
        p.k(str, "<set-?>");
        this.name = str;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }
}
