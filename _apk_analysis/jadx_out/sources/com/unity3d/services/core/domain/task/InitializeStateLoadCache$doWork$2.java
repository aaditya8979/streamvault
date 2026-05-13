package com.unity3d.services.core.domain.task;

import bn.r;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import hn.c;
import in.a;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateLoadCache$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends InitializeStateLoadCache.LoadCacheResult>>, Object> {
    public final /* synthetic */ InitializeStateLoadCache.Params $params;
    public int label;
    public final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, c<? super InitializeStateLoadCache$doWork$2> cVar) {
        super(2, cVar);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, cVar);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull l0 l0Var, @Nullable c<? super Result<InitializeStateLoadCache.LoadCacheResult>> cVar) {
        return ((InitializeStateLoadCache$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(l0 l0Var, c<? super Result<? extends InitializeStateLoadCache.LoadCacheResult>> cVar) {
        return invoke2(l0Var, (c<? super Result<InitializeStateLoadCache.LoadCacheResult>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM7534constructorimpl;
        InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        InitializeStateLoadCache.Params params = this.$params;
        try {
            Result.a aVar = Result.Companion;
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            byte[] webViewData = initializeStateLoadCache.getWebViewData();
            boolean z10 = true;
            if (webViewData == null) {
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                String strSha256 = Utilities.Sha256(webViewData);
                Charset charsetForName = Charset.forName("UTF-8");
                tn.p.j(charsetForName, "forName(\"UTF-8\")");
                String str = new String(webViewData, charsetForName);
                boolean z11 = strSha256 == null || !tn.p.f(strSha256, params.getConfig().getWebViewHash());
                if (!z11) {
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                }
                if (!z11) {
                    z10 = false;
                }
                loadCacheResult = new InitializeStateLoadCache.LoadCacheResult(z10, str);
            }
            objM7534constructorimpl = Result.m7534constructorimpl(loadCacheResult);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7540isSuccessimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = Result.m7534constructorimpl(objM7534constructorimpl);
        } else {
            Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7534constructorimpl);
            if (thM7537exceptionOrNullimpl != null) {
                objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(thM7537exceptionOrNullimpl));
            }
        }
        return Result.m7533boximpl(objM7534constructorimpl);
    }
}
