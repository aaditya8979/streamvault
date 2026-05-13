package com.yandex.div.core.view2.backbutton;

import android.view.KeyEvent;
import android.view.View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: BackKeyPressedHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BackKeyPressedHelper {

    @Nullable
    private OnBackClickListener mOnBackClickListener;

    @NotNull
    private final View mOwnerView;

    /* JADX INFO: compiled from: BackKeyPressedHelper.kt */
    public interface OnBackClickListener {
        boolean onBackClick();
    }

    public BackKeyPressedHelper(@NotNull View view) {
        this.mOwnerView = view;
    }

    private final void setupAccessibilityFocus() {
        View rootView;
        if (this.mOnBackClickListener == null || !this.mOwnerView.hasWindowFocus()) {
            return;
        }
        View view = this.mOwnerView;
        if (view.isShown()) {
            BaseDivViewExtensionsKt.gainAccessibilityFocus(view);
        } else {
            if (!view.isAccessibilityFocused() || (rootView = view.getRootView()) == null) {
                return;
            }
            BaseDivViewExtensionsKt.gainAccessibilityFocus(rootView);
        }
    }

    public final boolean onKeyAction(int i10, @NotNull KeyEvent keyEvent) {
        if (this.mOnBackClickListener == null || i10 != 4) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = this.mOwnerView.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = this.mOwnerView.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        OnBackClickListener onBackClickListener = this.mOnBackClickListener;
        p.h(onBackClickListener);
        return onBackClickListener.onBackClick();
    }

    public final void onVisibilityChanged() {
        setupAccessibilityFocus();
    }

    public final void onWindowFocusChanged(boolean z10) {
        if (z10) {
            setupAccessibilityFocus();
        }
    }

    public final void setOnBackClickListener(@Nullable OnBackClickListener onBackClickListener) {
        this.mOnBackClickListener = onBackClickListener;
        setupAccessibilityFocus();
    }
}
