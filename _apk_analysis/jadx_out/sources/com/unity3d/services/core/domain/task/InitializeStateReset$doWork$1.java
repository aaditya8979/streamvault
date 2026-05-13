package com.unity3d.services.core.domain.task;

import hn.c;
import in.a;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
public final class InitializeStateReset$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, c<? super InitializeStateReset$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7268doWorkgIAlus$suspendImpl = InitializeStateReset.m7268doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM7268doWorkgIAlus$suspendImpl == a.g() ? objM7268doWorkgIAlus$suspendImpl : Result.m7533boximpl(objM7268doWorkgIAlus$suspendImpl);
    }
}
