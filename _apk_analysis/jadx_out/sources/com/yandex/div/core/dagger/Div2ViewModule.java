package com.yandex.div.core.dagger;

import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Div2ViewModule.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface Div2ViewModule {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: Div2ViewModule.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DivStateSwitcher provideStateSwitcher(boolean z10, @NotNull ym.a<DivJoinedStateSwitcher> aVar, @NotNull ym.a<DivMultipleStateSwitcher> aVar2) {
            return z10 ? aVar2.get() : aVar.get();
        }
    }

    @NotNull
    static DivStateSwitcher provideStateSwitcher(boolean z10, @NotNull ym.a<DivJoinedStateSwitcher> aVar, @NotNull ym.a<DivMultipleStateSwitcher> aVar2) {
        return Companion.provideStateSwitcher(z10, aVar, aVar2);
    }
}
