package com.yandex.div.core.view2.state;

import androidx.core.view.OneShotPreDrawListener;
import androidx.transition.Transition;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivStateTransitionHolder.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivStateTransitionHolder {
    private boolean cleanScheduled;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final List<Transition> transitions = new ArrayList();

    public DivStateTransitionHolder(@NotNull Div2View div2View) {
        this.div2View = div2View;
    }

    private void scheduleClean() {
        if (this.cleanScheduled) {
            return;
        }
        final Div2View div2View = this.div2View;
        OneShotPreDrawListener.add(div2View, new Runnable() { // from class: com.yandex.div.core.view2.state.DivStateTransitionHolder$scheduleClean$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.clear();
            }
        });
        this.cleanScheduled = true;
    }

    public void append(@NotNull Transition transition) {
        this.transitions.add(transition);
        scheduleClean();
    }

    public void clear() {
        this.transitions.clear();
    }
}
