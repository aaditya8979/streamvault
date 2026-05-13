package com.yandex.div.core.util;

import android.view.ViewTreeObserver;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.view.SafeDrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReportingSafeDrawingPassOverrideStrategy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ReportingSafeDrawingPassOverrideStrategy extends SafeDrawingPassOverrideStrategy {

    @NotNull
    private final Div2View divView;

    @NotNull
    private final Div2Logger logger;

    public ReportingSafeDrawingPassOverrideStrategy(@NotNull Div2View div2View, @NotNull Div2Logger div2Logger) {
        this.divView = div2View;
        this.logger = div2Logger;
    }

    @Override // com.yandex.div.core.view.SafeDrawingPassOverrideStrategy
    public void onFrameCancelLimitExceeded(@NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.logger.logFrameCancelLimitExceeded(this.divView, "Frame cancellation limit exceeded by " + onPreDrawListener + ". Forcing frame drawing.");
    }

    @Override // com.yandex.div.core.view.SafeDrawingPassOverrideStrategy
    public void onFrameCancelled(@NotNull ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.logger.logFrameCancelled(this.divView, "Frame cancelled by " + onPreDrawListener);
    }
}
