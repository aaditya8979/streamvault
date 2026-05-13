package com.yandex.div.core.state;

import com.yandex.div.core.view2.Div2View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivStateChangeListener.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface DivStateChangeListener {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivStateChangeListener STUB = new DivStateChangeListener() { // from class: com.yandex.div.core.state.DivStateChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.state.DivStateChangeListener
        public void onDivAnimatedStateChanged(@NotNull Div2View div2View) {
        }
    };

    /* JADX INFO: compiled from: DivStateChangeListener.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void onDivAnimatedStateChanged(@NotNull Div2View div2View);
}
