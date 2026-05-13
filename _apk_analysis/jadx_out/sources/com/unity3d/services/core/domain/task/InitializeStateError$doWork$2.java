package com.unity3d.services.core.domain.task;

import bn.r;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateError;
import com.unity3d.services.core.log.DeviceLog;
import hn.c;
import in.a;
import java.util.concurrent.CancellationException;
import jn.d;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: InitializeStateError.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateError$doWork$2", f = "InitializeStateError.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateError$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends r>>, Object> {
    public final /* synthetic */ InitializeStateError.Params $params;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$2(InitializeStateError.Params params, c<? super InitializeStateError$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new InitializeStateError$doWork$2(this.$params, cVar);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull l0 l0Var, @Nullable c<? super Result<r>> cVar) {
        return ((InitializeStateError$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
    }

    @Override // sn.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo2invoke(l0 l0Var, c<? super Result<? extends r>> cVar) {
        return invoke2(l0Var, (c<? super Result<r>>) cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objM7534constructorimpl;
        a.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(obj);
        InitializeStateError.Params params = this.$params;
        try {
            Result.a aVar = Result.Companion;
            DeviceLog.error("Unity Ads init: halting init in " + params.getErrorState().getMetricName() + ": " + params.getException().getMessage());
            Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            for (Class cls : moduleConfigurationList) {
                IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    jn.a.a(moduleConfiguration.initErrorState(params.getConfig(), params.getErrorState(), params.getException().getMessage()));
                }
            }
            objM7534constructorimpl = Result.m7534constructorimpl(r.f5635a);
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
