package com.yandex.div.core.tooltip;

import androidx.activity.OnBackPressedCallback;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.util.SafePopupWindow;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div2.Div;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: DivTooltipController.kt */
/* JADX INFO: loaded from: classes2.dex */
final class TooltipData {

    @NotNull
    private final BindingContext bindingContext;
    private boolean dismissed;

    @NotNull
    private final Div div;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @NotNull
    private final String f53952id;

    @Nullable
    private final OnBackPressedCallback onBackPressedCallback;

    @NotNull
    private final SafePopupWindow popupWindow;

    @Nullable
    private DivPreloader.Ticket ticket;

    public TooltipData(@NotNull String str, @NotNull BindingContext bindingContext, @NotNull Div div, @NotNull SafePopupWindow safePopupWindow, @Nullable DivPreloader.Ticket ticket, @Nullable OnBackPressedCallback onBackPressedCallback, boolean z10) {
        this.f53952id = str;
        this.bindingContext = bindingContext;
        this.div = div;
        this.popupWindow = safePopupWindow;
        this.ticket = ticket;
        this.onBackPressedCallback = onBackPressedCallback;
        this.dismissed = z10;
    }

    public /* synthetic */ TooltipData(String str, BindingContext bindingContext, Div div, SafePopupWindow safePopupWindow, DivPreloader.Ticket ticket, OnBackPressedCallback onBackPressedCallback, boolean z10, int i10, i iVar) {
        this(str, bindingContext, div, safePopupWindow, (i10 & 16) != 0 ? null : ticket, onBackPressedCallback, (i10 & 64) != 0 ? false : z10);
    }

    @NotNull
    public final BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    @NotNull
    public final Div getDiv() {
        return this.div;
    }

    @NotNull
    public final String getId() {
        return this.f53952id;
    }

    @Nullable
    public final OnBackPressedCallback getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    @NotNull
    public final SafePopupWindow getPopupWindow() {
        return this.popupWindow;
    }

    @Nullable
    public final DivPreloader.Ticket getTicket() {
        return this.ticket;
    }

    public final void setDismissed(boolean z10) {
        this.dismissed = z10;
    }

    public final void setTicket(@Nullable DivPreloader.Ticket ticket) {
        this.ticket = ticket;
    }
}
