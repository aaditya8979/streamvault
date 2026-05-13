package com.yandex.div.core.dagger;

import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Div2ViewComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface Div2ViewComponent {

    /* JADX INFO: compiled from: Div2ViewComponent.kt */
    public interface Builder {
        @NotNull
        Div2ViewComponent build();

        @NotNull
        Builder divView(@NotNull Div2View div2View);
    }

    @NotNull
    DivAnimatorController getAnimatorController();

    @NotNull
    ViewBindingProvider getBindingProvider();

    @NotNull
    DivTooltipController getDivTooltipController();

    @NotNull
    DrawingPassOverrideStrategy getDrawingPassOverrideStrategy();

    @NotNull
    ErrorCollectors getErrorCollectors();

    @NotNull
    ErrorVisualMonitor getErrorMonitor();

    @NotNull
    InputFocusTracker getInputFocusTracker();

    @NotNull
    MediaReleaseViewVisitor getMediaReleaseViewVisitor();

    @NotNull
    ReleaseViewVisitor getReleaseViewVisitor();

    @NotNull
    DivRuntimeVisitor getRuntimeVisitor();

    @NotNull
    DivStateSwitcher getStateSwitcher();

    @NotNull
    DivStateTransitionHolder getStateTransitionHolder();

    @NotNull
    DivTransitionBuilder getTransitionBuilder();

    @NotNull
    DivViewIdProvider getViewIdProvider();
}
