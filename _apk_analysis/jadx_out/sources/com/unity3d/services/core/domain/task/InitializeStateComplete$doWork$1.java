package com.unity3d.services.core.domain.task;

import bn.r;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import hn.c;
import in.a;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", l = {21}, m = "doWork-gIAlu-s")
public final class InitializeStateComplete$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, c<? super InitializeStateComplete$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7259doWorkgIAlus = this.this$0.m7259doWorkgIAlus((InitializeStateComplete.Params) null, (c<? super Result<r>>) this);
        return objM7259doWorkgIAlus == a.g() ? objM7259doWorkgIAlus : Result.m7533boximpl(objM7259doWorkgIAlus);
    }
}
