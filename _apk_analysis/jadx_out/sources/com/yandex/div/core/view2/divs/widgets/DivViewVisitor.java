package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivViewVisitor.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivViewVisitor {
    public void defaultVisit(@NotNull DivHolderView<?> divHolderView) {
    }

    public void visit(@NotNull View view) {
    }

    public void visit(@NotNull DivCustomWrapper divCustomWrapper) {
        defaultVisit(divCustomWrapper);
    }

    public void visit(@NotNull DivFrameLayout divFrameLayout) {
        defaultVisit(divFrameLayout);
    }

    public void visit(@NotNull DivGifImageView divGifImageView) {
        defaultVisit(divGifImageView);
    }

    public void visit(@NotNull DivGridLayout divGridLayout) {
        defaultVisit(divGridLayout);
    }

    public void visit(@NotNull DivImageView divImageView) {
        defaultVisit(divImageView);
    }

    public void visit(@NotNull DivLineHeightTextView divLineHeightTextView) {
        defaultVisit(divLineHeightTextView);
    }

    public void visit(@NotNull DivLinearLayout divLinearLayout) {
        defaultVisit(divLinearLayout);
    }

    public void visit(@NotNull DivPagerIndicatorView divPagerIndicatorView) {
        defaultVisit(divPagerIndicatorView);
    }

    public void visit(@NotNull DivPagerView divPagerView) {
        defaultVisit(divPagerView);
    }

    public void visit(@NotNull DivRecyclerView divRecyclerView) {
        defaultVisit(divRecyclerView);
    }

    public void visit(@NotNull DivSelectView divSelectView) {
        defaultVisit(divSelectView);
    }

    public void visit(@NotNull DivSeparatorView divSeparatorView) {
        defaultVisit(divSeparatorView);
    }

    public void visit(@NotNull DivSliderView divSliderView) {
        defaultVisit(divSliderView);
    }

    public void visit(@NotNull DivStateLayout divStateLayout) {
        defaultVisit(divStateLayout);
    }

    public void visit(@NotNull DivSwitchView divSwitchView) {
        defaultVisit(divSwitchView);
    }

    public void visit(@NotNull DivTabsLayout divTabsLayout) {
        defaultVisit(divTabsLayout);
    }

    public void visit(@NotNull DivVideoView divVideoView) {
        defaultVisit(divVideoView);
    }

    public void visit(@NotNull DivWrapLayout divWrapLayout) {
        defaultVisit(divWrapLayout);
    }
}
