package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import hn.c;
import in.a;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
public final class BaseTask$invoke$1<P extends BaseParams, R> extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public BaseTask$invoke$1(c<? super BaseTask$invoke$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM7254invokegIAlus = BaseTask.DefaultImpls.m7254invokegIAlus(null, null, this);
        return objM7254invokegIAlus == a.g() ? objM7254invokegIAlus : Result.m7533boximpl(objM7254invokegIAlus);
    }
}
