package com.unity3d.services.core.domain.task;

import bn.r;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import hn.c;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, 71}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    public final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, c<? super InitializeStateLoadWeb$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, cVar);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull l0 l0Var, @Nullable c<? super Result<InitializeStateLoadWeb.LoadWebResult>> cVar) {
        return ((InitializeStateLoadWeb$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(l0 l0Var, c<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>> cVar) {
        return invoke2(l0Var, (c<? super Result<InitializeStateLoadWeb.LoadWebResult>>) cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0167 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0189 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b3 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3 A[Catch: all -> 0x01ed, CancellationException -> 0x0216, TryCatch #6 {CancellationException -> 0x0216, all -> 0x01ed, blocks: (B:8:0x0018, B:51:0x0186, B:55:0x01a9, B:57:0x01b3, B:60:0x01be, B:61:0x01d0, B:63:0x01d3, B:64:0x01df, B:46:0x0161, B:48:0x0167, B:52:0x0189, B:53:0x019b, B:45:0x0157, B:38:0x0129, B:54:0x019c, B:37:0x011f, B:23:0x006f, B:13:0x0037, B:43:0x014e, B:40:0x012f), top: B:80:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
