package com.unity3d.services.store.core;

import af.l;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: StoreWebViewError.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StoreWebViewError extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreWebViewError(@Nullable Enum<?> r22, @Nullable String str, @NotNull Object... objArr) {
        super(r22, str, Arrays.copyOf(objArr, objArr.length));
        p.k(objArr, "errorArguments");
    }

    @Override // af.l
    @NotNull
    public String getDomain() {
        return WebViewEventCategory.STORE.name();
    }
}
