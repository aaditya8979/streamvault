package com.moloco.sdk.internal.services.init;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import bn.r;
import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.MediationInfo;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;
import sn.p;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class l implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.init.d f47492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g f47493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final l0 f47494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Init$SDKInitResponse f47495d;

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", l = {94, 107}, m = "fetchInitResponse")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f47500e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f47502g;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47500e = obj;
            this.f47502g |= Integer.MIN_VALUE;
            return l.this.c(null, null, null, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitServiceImpl$fetchInitResponse$3", f = "InitService.kt", l = {100}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements p<l0, hn.c<? super r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f47503a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediationInfo f47506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f47507e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, MediationInfo mediationInfo, com.moloco.sdk.acm.recorder.a aVar, hn.c<? super b> cVar) {
            super(2, cVar);
            this.f47505c = str;
            this.f47506d = mediationInfo;
            this.f47507e = aVar;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super r> cVar) {
            return ((b) create(l0Var, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<r> create(Object obj, hn.c<?> cVar) {
            return l.this.new b(this.f47505c, this.f47506d, this.f47507e, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG = in.a.g();
            int i10 = this.f47503a;
            if (i10 == 0) {
                kotlin.c.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitService", "Async fetching init response", null, false, 12, null);
                l lVar = l.this;
                String str = this.f47505c;
                MediationInfo mediationInfo = this.f47506d;
                com.moloco.sdk.acm.recorder.a aVar = this.f47507e;
                this.f47503a = 1;
                if (lVar.d(str, mediationInfo, aVar, true, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", l = {135, 144, 146, 183, 196}, m = "fetchServerInitResponse$moloco_sdk_release")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f47512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f47513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f47514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f47515h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f47516i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f47517j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f47518k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f47520m;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47518k = obj;
            this.f47520m |= Integer.MIN_VALUE;
            return l.this.d(null, null, null, false, this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.init.InitServiceImpl", f = "InitService.kt", l = {68}, m = "performInit")
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f47523c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47525e;

        public d(hn.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47523c = obj;
            this.f47525e |= Integer.MIN_VALUE;
            return l.this.a(null, null, this);
        }
    }

    public l(@NotNull com.moloco.sdk.internal.services.init.d dVar, @NotNull g gVar, @NotNull l0 l0Var) {
        tn.p.k(dVar, "initApi");
        tn.p.k(gVar, "initCache");
        tn.p.k(l0Var, "scope");
        this.f47492a = dVar;
        this.f47493b = gVar;
        this.f47494c = l0Var;
    }

    @Override // com.moloco.sdk.internal.services.init.j
    @VisibleForTesting(otherwise = 5)
    @Nullable
    public Object a(@NotNull hn.c<? super r> cVar) {
        this.f47495d = null;
        Object objA = this.f47493b.a(cVar);
        return objA == in.a.g() ? objA : r.f5635a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.init.j
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull com.moloco.sdk.publisher.MediationInfo r7, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>> r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.l.a(java.lang.String, com.moloco.sdk.publisher.MediationInfo, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r24, com.moloco.sdk.publisher.MediationInfo r25, com.moloco.sdk.acm.recorder.a r26, hn.c<? super com.moloco.sdk.internal.services.init.c> r27) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.l.c(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.a, hn.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0375  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0351 -> B:79:0x035e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull com.moloco.sdk.publisher.MediationInfo r32, @org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r33, boolean r34, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.g0<com.moloco.sdk.Init$SDKInitResponse, com.moloco.sdk.internal.services.init.i>> r35) {
        /*
            Method dump skipped, instruction units count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.init.l.d(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.acm.recorder.a, boolean, hn.c):java.lang.Object");
    }
}
