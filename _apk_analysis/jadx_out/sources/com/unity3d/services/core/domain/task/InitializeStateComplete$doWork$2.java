package com.unity3d.services.core.domain.task;

import androidx.datastore.core.DataStore;
import bn.r;
import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
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

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2", f = "InitializeStateComplete.kt", l = {26}, m = "invokeSuspend")
public final class InitializeStateComplete$doWork$2 extends SuspendLambda implements p<l0, c<? super Result<? extends r>>, Object> {
    public final /* synthetic */ InitializeStateComplete.Params $params;
    public int label;
    public final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$2(InitializeStateComplete.Params params, InitializeStateComplete initializeStateComplete, c<? super InitializeStateComplete$doWork$2> cVar) {
        super(2, cVar);
        this.$params = params;
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new InitializeStateComplete$doWork$2(this.$params, this.this$0, cVar);
    }

    @Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@NotNull l0 l0Var, @Nullable c<? super Result<r>> cVar) {
        return ((InitializeStateComplete$doWork$2) create(l0Var, cVar)).invokeSuspend(r.f5635a);
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
        Object objG = a.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                kotlin.c.b(obj);
                InitializeStateComplete.Params params = this.$params;
                InitializeStateComplete initializeStateComplete = this.this$0;
                Result.a aVar = Result.Companion;
                Class[] moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                tn.p.j(moduleConfigurationList, "params.config.moduleConfigurationList");
                for (Class cls : moduleConfigurationList) {
                    IModuleConfiguration moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        jn.a.a(moduleConfiguration.initCompleteState(params.getConfig()));
                    }
                }
                DataStore dataStore = initializeStateComplete.dataStore;
                InitializeStateComplete$doWork$2$1$1 initializeStateComplete$doWork$2$1$1 = new InitializeStateComplete$doWork$2$1$1(null);
                this.label = 1;
                if (dataStore.updateData(initializeStateComplete$doWork$2$1$1, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
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
