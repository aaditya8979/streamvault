package com.yandex.div.core;

import android.view.View;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivCustom;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivCustomContainerViewAdapter.kt */
/* JADX INFO: loaded from: classes12.dex */
public interface DivCustomContainerViewAdapter {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    @NotNull
    public static final DivCustomContainerViewAdapter STUB = new DivCustomContainerViewAdapter() { // from class: com.yandex.div.core.DivCustomContainerViewAdapter$Companion$STUB$1
        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void bindView(@NotNull View view, @NotNull DivCustom divCustom, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        @NotNull
        public View createView(@NotNull DivCustom divCustom, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public boolean isCustomTypeSupported(@NotNull String str) {
            return false;
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        @NotNull
        public DivPreloader.PreloadReference preload(@NotNull DivCustom divCustom, @NotNull DivPreloader.Callback callback) {
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }

        @Override // com.yandex.div.core.DivCustomContainerViewAdapter
        public void release(@NotNull View view, @NotNull DivCustom divCustom) {
        }
    };

    /* JADX INFO: compiled from: DivCustomContainerViewAdapter.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void bindView(@NotNull View view, @NotNull DivCustom divCustom, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath);

    @NotNull
    View createView(@NotNull DivCustom divCustom, @NotNull Div2View div2View, @NotNull ExpressionResolver expressionResolver, @NotNull DivStatePath divStatePath);

    boolean isCustomTypeSupported(@NotNull String str);

    @NotNull
    default DivPreloader.PreloadReference preload(@NotNull DivCustom divCustom, @NotNull DivPreloader.Callback callback) {
        return DivPreloader.PreloadReference.Companion.getEMPTY();
    }

    void release(@NotNull View view, @NotNull DivCustom divCustom);
}
