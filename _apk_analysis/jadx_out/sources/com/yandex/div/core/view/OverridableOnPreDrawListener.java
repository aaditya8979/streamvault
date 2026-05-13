package com.yandex.div.core.view;

import android.annotation.SuppressLint;
import android.view.ViewTreeObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OnPreDrawListeners.kt */
/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"OnPreDrawListenerIssue"})
public final class OverridableOnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {

    @NotNull
    private final ViewTreeObserver.OnPreDrawListener delegate;

    @NotNull
    private final DrawingPassOverrideStrategy overrideStrategy;

    public OverridableOnPreDrawListener(@NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener, @NotNull DrawingPassOverrideStrategy drawingPassOverrideStrategy) {
        this.delegate = onPreDrawListener;
        this.overrideStrategy = drawingPassOverrideStrategy;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        return this.overrideStrategy.overrideDrawingPass(this.delegate, this.delegate.onPreDraw());
    }
}
