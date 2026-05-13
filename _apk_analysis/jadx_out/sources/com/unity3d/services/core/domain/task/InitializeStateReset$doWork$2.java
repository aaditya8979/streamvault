package com.unity3d.services.core.domain.task;

import bn.r;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import hn.c;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends Configuration>>, Object> {
    public final /* synthetic */ InitializeStateReset.Params $params;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, c<? super InitializeStateReset$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, cVar);
    }

    @Override // sn.p
    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo2invoke(@NotNull l0 l0Var, @Nullable c<? super Result<? extends Configuration>> cVar) {
        return ((InitializeStateReset$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be A[Catch: all -> 0x00c6, CancellationException -> 0x00ef, TryCatch #2 {CancellationException -> 0x00ef, all -> 0x00c6, blocks: (B:6:0x0014, B:22:0x005d, B:27:0x006b, B:29:0x007a, B:31:0x0080, B:33:0x008e, B:34:0x0090, B:36:0x0093, B:38:0x009f, B:39:0x00aa, B:40:0x00ad, B:41:0x00b6, B:42:0x00bd, B:43:0x00be, B:44:0x00c5, B:25:0x0063, B:26:0x006a, B:11:0x0027, B:13:0x0034, B:15:0x0039, B:18:0x0041), top: B:57:0x0008 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
