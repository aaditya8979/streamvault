package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoTypeAreaEntry.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoTypeAreaEntry {

    @Nullable
    private List<String> areaList;
    private boolean isSelector;

    @Nullable
    private String typeName;
    private int videoType;

    @Nullable
    public final List<String> getAreaList() {
        return this.areaList;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    public final int getVideoType() {
        return this.videoType;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setAreaList(@Nullable List<String> list) {
        this.areaList = list;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }

    public final void setTypeName(@Nullable String str) {
        this.typeName = str;
    }

    public final void setVideoType(int i10) {
        this.videoType = i10;
    }
}
