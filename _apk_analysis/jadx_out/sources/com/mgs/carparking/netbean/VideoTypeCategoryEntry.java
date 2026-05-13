package com.mgs.carparking.netbean;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VideoTypeCategoryEntry.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class VideoTypeCategoryEntry {
    private boolean isSelector;

    @Nullable
    private List<String> tagList;

    @Nullable
    private String typeName;
    public int videoType;

    @Nullable
    public final List<String> getTagList() {
        return this.tagList;
    }

    @Nullable
    public final String getTypeName() {
        return this.typeName;
    }

    public final boolean isSelector() {
        return this.isSelector;
    }

    public final void setSelector(boolean z10) {
        this.isSelector = z10;
    }

    public final void setTagList(@Nullable List<String> list) {
        this.tagList = list;
    }

    public final void setTypeName(@Nullable String str) {
        this.typeName = str;
    }
}
