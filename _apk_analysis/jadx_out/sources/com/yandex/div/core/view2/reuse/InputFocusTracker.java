package com.yandex.div.core.view2.reuse;

import android.view.View;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: InputFocusTracker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class InputFocusTracker {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private static WeakReference<View> lastFocused;
    private boolean changingState;

    @NotNull
    private final InputFocusPersistentDivDataChangedObserver divDataChangedObserver;

    @Nullable
    private Object focusedInputTag;

    /* JADX INFO: compiled from: InputFocusTracker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: InputFocusTracker.kt */
    public final class InputFocusPersistentDivDataChangedObserver implements PersistentDivDataObserver {
        private boolean focusRequestedDuringChangeState;

        public InputFocusPersistentDivDataChangedObserver() {
        }

        @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
        public void onAfterDivDataChanged() {
            InputFocusTracker.this.changingState = false;
            if (this.focusRequestedDuringChangeState) {
                return;
            }
            InputFocusTracker.this.focusedInputTag = null;
        }

        @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
        public void onBeforeDivDataChanged() {
            InputFocusTracker.this.changingState = true;
            this.focusRequestedDuringChangeState = false;
        }

        public final void setFocusRequestedDuringChangeState(boolean z10) {
            this.focusRequestedDuringChangeState = z10;
        }
    }

    public InputFocusTracker(@NotNull Div2View div2View) {
        InputFocusPersistentDivDataChangedObserver inputFocusPersistentDivDataChangedObserver = new InputFocusPersistentDivDataChangedObserver();
        this.divDataChangedObserver = inputFocusPersistentDivDataChangedObserver;
        div2View.addPersistentDivDataObserver$div_release(inputFocusPersistentDivDataChangedObserver);
    }

    public final void inputFocusChanged(@Nullable Object obj, @NotNull DivInputView divInputView, boolean z10) {
        if (this.changingState) {
            return;
        }
        if (z10) {
            this.focusedInputTag = obj;
            lastFocused = new WeakReference<>(divInputView);
            divInputView.setSelection(divInputView.length());
        } else {
            if (z10) {
                return;
            }
            this.focusedInputTag = null;
            lastFocused = null;
        }
    }

    public final boolean isFocusedOnInput() {
        return this.focusedInputTag != null;
    }

    public final void removeFocusFromFocusedInput() {
        View view;
        WeakReference<View> weakReference = lastFocused;
        if (weakReference == null || (view = weakReference.get()) == null) {
            return;
        }
        view.clearFocus();
        DivActionTypedUtilsKt.closeKeyboard(view);
    }

    public final void requestFocusIfNeeded(@NotNull View view) {
        if (view.getTag() != null && p.f(view.getTag(), this.focusedInputTag) && this.changingState) {
            this.divDataChangedObserver.setFocusRequestedDuringChangeState(true);
            view.requestFocus();
        }
    }
}
