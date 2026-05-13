package com.yandex.div.core.state;

import com.yandex.div.core.state.DivViewState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PagerState.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PagerState implements DivViewState.BlockState {
    private final int currentPageIndex;

    public PagerState(int i10) {
        this.currentPageIndex = i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PagerState) && this.currentPageIndex == ((PagerState) obj).currentPageIndex;
    }

    public final int getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentPageIndex);
    }

    @NotNull
    public String toString() {
        return "PagerState(currentPageIndex=" + this.currentPageIndex + ')';
    }
}
