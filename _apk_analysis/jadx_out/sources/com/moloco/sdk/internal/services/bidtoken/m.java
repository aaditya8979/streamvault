package com.moloco.sdk.internal.services.bidtoken;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@VisibleForTesting(otherwise = 2)
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final b0 f47179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u f47180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f47181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final mo.a f47182d;

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenServiceImpl", f = "BidTokenService.kt", l = {117, 53, 60}, m = "bidToken")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f47186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f47187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f47188f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f47190h;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47188f = obj;
            this.f47190h |= Integer.MIN_VALUE;
            return m.this.a(null, this);
        }
    }

    public m(@NotNull b0 b0Var, @NotNull u uVar) {
        tn.p.k(b0Var, "serverBidTokenService");
        tn.p.k(uVar, "clientBidTokenService");
        this.f47179a = b0Var;
        this.f47180b = uVar;
        this.f47181c = "BidTokenServiceImpl";
        this.f47182d = mo.g.b(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:21:0x006c, B:34:0x00c4, B:36:0x00d0), top: B:59:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100 A[Catch: all -> 0x0051, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0046, B:40:0x00f1, B:43:0x00f8, B:45:0x0100, B:51:0x012e, B:46:0x0112), top: B:61:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0112 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #1 {all -> 0x0051, blocks: (B:14:0x0046, B:40:0x00f1, B:43:0x00f8, B:45:0x0100, B:51:0x012e, B:46:0x0112), top: B:61:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.internal.services.bidtoken.o
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r19, @org.jetbrains.annotations.NotNull hn.c<? super java.lang.String> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.m.a(com.moloco.sdk.acm.recorder.a, hn.c):java.lang.Object");
    }

    public final void b(com.moloco.sdk.acm.e eVar, com.moloco.sdk.acm.recorder.a aVar, String str) {
        if (str == null) {
            com.moloco.sdk.acm.b bVar = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45959r.c());
            com.moloco.sdk.internal.client_metrics_data.d dVar = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
            aVar.b(bVar.e(dVar.c(), "success"));
            aVar.a(eVar.f(dVar.c(), "success"));
            return;
        }
        com.moloco.sdk.acm.b bVar2 = new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.f45959r.c());
        com.moloco.sdk.internal.client_metrics_data.d dVar2 = com.moloco.sdk.internal.client_metrics_data.d.f45971d;
        com.moloco.sdk.acm.b bVarE = bVar2.e(dVar2.c(), "failure");
        com.moloco.sdk.internal.client_metrics_data.d dVar3 = com.moloco.sdk.internal.client_metrics_data.d.f45969b;
        aVar.b(bVarE.e(dVar3.c(), str));
        aVar.a(eVar.f(dVar2.c(), "failure").f(dVar3.c(), str));
    }
}
