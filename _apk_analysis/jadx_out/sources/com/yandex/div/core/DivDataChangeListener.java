package com.yandex.div.core;

import com.yandex.div.core.view2.Div2View;
import com.yandex.div2.DivData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivDataChangeListener.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface DivDataChangeListener {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivDataChangeListener STUB = new DivDataChangeListener() { // from class: com.yandex.div.core.DivDataChangeListener$Companion$STUB$1
        @Override // com.yandex.div.core.DivDataChangeListener
        public void afterAnimatedDataChange(@NotNull Div2View div2View, @NotNull DivData divData) {
        }

        @Override // com.yandex.div.core.DivDataChangeListener
        public void beforeAnimatedDataChange(@NotNull Div2View div2View, @NotNull DivData divData) {
        }
    };

    /* JADX INFO: compiled from: DivDataChangeListener.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void afterAnimatedDataChange(@NotNull Div2View div2View, @NotNull DivData divData);

    void beforeAnimatedDataChange(@NotNull Div2View div2View, @NotNull DivData divData);
}
