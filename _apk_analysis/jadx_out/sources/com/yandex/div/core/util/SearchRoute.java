package com.yandex.div.core.util;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SearchUtil.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SearchRoute<T> {
    private int enterLeaveBalance;

    @Nullable
    private final T item;
    private int movedDistance;

    public SearchRoute(@Nullable T t10) {
        this.item = t10;
    }

    public final int distance() {
        return this.movedDistance;
    }

    @Nullable
    public final T getItem() {
        return this.item;
    }

    public final void onEnter() {
        this.enterLeaveBalance++;
        this.movedDistance++;
    }

    public final void onLeave() {
        int i10 = this.enterLeaveBalance;
        if (i10 <= 0) {
            this.movedDistance++;
        } else {
            this.enterLeaveBalance = i10 - 1;
            this.movedDistance--;
        }
    }
}
