package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import bn.r;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewBindingProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;

/* JADX INFO: compiled from: ErrorVisualMonitor.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorVisualMonitor {

    @NotNull
    private final ViewBindingProvider bindingProvider;
    private boolean enabled;

    @NotNull
    private final ErrorModel errorModel;

    @Nullable
    private ErrorView errorView;

    @Nullable
    private ViewGroup lastConnectionView;
    private final boolean showPermanently;

    @NotNull
    private final DivTypefaceProvider typefaceProvider;
    private final boolean visualErrorsEnabled;

    public ErrorVisualMonitor(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View div2View, boolean z10, boolean z11, @NotNull ViewBindingProvider viewBindingProvider, @NotNull DivTypefaceProvider divTypefaceProvider) {
        this.visualErrorsEnabled = z10;
        this.showPermanently = z11;
        this.bindingProvider = viewBindingProvider;
        this.typefaceProvider = divTypefaceProvider;
        this.enabled = z10 || z11;
        this.errorModel = new ErrorModel(errorCollectors, div2View, z10);
        connectOrDisconnect();
    }

    private final void connectOrDisconnect() {
        if (!this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = null;
            return;
        }
        this.bindingProvider.observeAndGet(new l<Binding, r>() { // from class: com.yandex.div.core.view2.errors.ErrorVisualMonitor.connectOrDisconnect.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(Binding binding) {
                invoke2(binding);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Binding binding) {
                ErrorVisualMonitor.this.errorModel.bind(binding);
            }
        });
        ViewGroup viewGroup = this.lastConnectionView;
        if (viewGroup != null) {
            connect(viewGroup);
        }
    }

    public final void connect(@NotNull ViewGroup viewGroup) {
        this.lastConnectionView = viewGroup;
        if (this.enabled) {
            ErrorView errorView = this.errorView;
            if (errorView != null) {
                errorView.close();
            }
            this.errorView = new ErrorView(viewGroup, this.errorModel, this.typefaceProvider, this.showPermanently);
        }
    }

    public final boolean getEnabled$div_release() {
        return this.enabled;
    }

    public final void setEnabled$div_release(boolean z10) {
        this.enabled = z10;
        connectOrDisconnect();
    }
}
