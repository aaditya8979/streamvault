package com.unity3d.ads.core.utils;

import com.unity3d.ads.core.data.model.exception.ExposureException;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import hn.c;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContinuationFromCallback.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ContinuationFromCallback extends WebViewCallback {

    @NotNull
    private final c<Object> continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContinuationFromCallback(@NotNull c<Object> cVar) {
        super("", 0);
        p.k(cVar, "continuation");
        this.continuation = cVar;
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void error(@Nullable Enum<?> r52, @NotNull Object... objArr) {
        p.k(objArr, "params");
        c<Object> cVar = this.continuation;
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(new ExposureException("Invocation failed with: " + r52, objArr))));
    }

    @Override // com.unity3d.services.core.webview.bridge.WebViewCallback
    public void invoke(@NotNull Object... objArr) {
        p.k(objArr, "params");
        this.continuation.resumeWith(Result.m7534constructorimpl(objArr));
    }
}
