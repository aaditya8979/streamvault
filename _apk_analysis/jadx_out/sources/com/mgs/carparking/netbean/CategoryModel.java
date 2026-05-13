package com.mgs.carparking.netbean;

import java.io.Serializable;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CategoryModel.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CategoryModel implements Serializable {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f44297id;

    @Nullable
    private String name;

    public final int getId() {
        return this.f44297id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setId(int i10) {
        this.f44297id = i10;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
