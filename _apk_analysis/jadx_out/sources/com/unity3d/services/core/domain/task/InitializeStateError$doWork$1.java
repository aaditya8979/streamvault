package com.unity3d.services.core.domain.task;

import bn.r;
import com.unity3d.services.core.domain.task.InitializeStateError;
import hn.c;
import in.a;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InitializeStateError.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", l = {27}, m = "doWork-gIAlu-s")
public final class InitializeStateError$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$1(InitializeStateError initializeStateError, c<? super InitializeStateError$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7264doWorkgIAlus = this.this$0.m7264doWorkgIAlus((InitializeStateError.Params) null, (c<? super Result<r>>) this);
        return objM7264doWorkgIAlus == a.g() ? objM7264doWorkgIAlus : Result.m7533boximpl(objM7264doWorkgIAlus);
    }
}
