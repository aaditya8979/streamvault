package com.unity3d.services.core.domain.task;

import bn.r;
import hn.c;
import in.a;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {40}, m = "doWork-gIAlu-s")
public final class InitializeSDK$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$1(InitializeSDK initializeSDK, c<? super InitializeSDK$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7258doWorkgIAlus = this.this$0.m7258doWorkgIAlus((EmptyParams) null, (c<? super Result<r>>) this);
        return objM7258doWorkgIAlus == a.g() ? objM7258doWorkgIAlus : Result.m7533boximpl(objM7258doWorkgIAlus);
    }
}
