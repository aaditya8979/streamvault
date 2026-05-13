package com.yandex.div.core.util;

import android.view.View;
import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;

/* JADX INFO: compiled from: Views.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SingleTimeOnAttachCallback {

    @Nullable
    private a<r> onAttachAction;

    public SingleTimeOnAttachCallback(@NotNull View view, @Nullable a<r> aVar) {
        this.onAttachAction = aVar;
        if (view.isAttachedToWindow()) {
            onAttach();
        }
    }

    public final void cancel() {
        this.onAttachAction = null;
    }

    public final void onAttach() {
        a<r> aVar = this.onAttachAction;
        if (aVar != null) {
            aVar.invoke();
        }
        this.onAttachAction = null;
    }
}
