package com.yandex.div.internal.widget;

import android.view.View;
import androidx.core.view.ViewKt;
import ao.i;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import java.util.Iterator;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: TransientView.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class TransientViewMixin implements TransientView {
    private int transitionCount;

    private final void invalidateView(View view) {
        view.invalidate();
        i iVarZ = SequencesKt___SequencesKt.z(ViewKt.getAllViews(view), new l<Object, Boolean>() { // from class: com.yandex.div.internal.widget.TransientViewMixin$invalidateView$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.l
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                return Boolean.valueOf(obj instanceof DivBorderSupports);
            }
        });
        p.i(iVarZ, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator it = iVarZ.iterator();
        while (it.hasNext()) {
            ((DivBorderSupports) it.next()).invalidateBorder();
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.transitionCount != 0;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(@NotNull View view) {
        int i10 = this.transitionCount;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.transitionCount = i11;
            if (i11 == 0) {
                invalidateView(view);
            }
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(@NotNull View view) {
        int i10 = this.transitionCount + 1;
        this.transitionCount = i10;
        if (i10 == 1) {
            invalidateView(view);
        }
    }
}
