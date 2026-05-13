package com.yandex.div.internal.viewpool;

import android.view.View;
import com.yandex.div.internal.util.UtilsKt;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PseudoViewPool.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class PseudoViewPool implements ViewPool {

    @NotNull
    private final ConcurrentHashMap<String, ViewFactory<? extends View>> factoryMap = new ConcurrentHashMap<>();

    @Override // com.yandex.div.internal.viewpool.ViewPool
    @NotNull
    public <T extends View> T obtain(@NotNull String str) {
        T t10 = (T) ((ViewFactory) UtilsKt.getOrThrow$default(this.factoryMap, str, null, 2, null)).createView();
        p.i(t10, "null cannot be cast to non-null type T of com.yandex.div.internal.viewpool.PseudoViewPool.obtain");
        return t10;
    }

    @Override // com.yandex.div.internal.viewpool.ViewPool
    public <T extends View> void register(@NotNull String str, @NotNull ViewFactory<T> viewFactory, int i10) {
        this.factoryMap.put(str, viewFactory);
    }
}
