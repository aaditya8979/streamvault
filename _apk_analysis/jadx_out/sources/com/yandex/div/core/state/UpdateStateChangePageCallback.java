package com.yandex.div.core.state;

import androidx.viewpager2.widget.ViewPager2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: UpdateStateChangePageCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UpdateStateChangePageCallback extends ViewPager2.OnPageChangeCallback {

    @NotNull
    private final String mBlockId;

    @NotNull
    private final DivViewState mDivViewState;

    public UpdateStateChangePageCallback(@NotNull String str, @NotNull DivViewState divViewState) {
        this.mBlockId = str;
        this.mDivViewState = divViewState;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i10) {
        if (i10 != -1) {
            this.mDivViewState.putBlockState(this.mBlockId, new PagerState(i10));
        }
    }
}
