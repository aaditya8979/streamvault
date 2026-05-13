package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final o f47160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.publisher.v f47161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f47162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f47163d;

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.BidTokenHandlerImpl", f = "BidTokenHandler.kt", l = {60}, m = "handleBidTokenRequest")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47166c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f47167d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f47168e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f47170g;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47168e = obj;
            this.f47170g |= Integer.MIN_VALUE;
            return i.this.a(null, null, null, this);
        }
    }

    public i(@NotNull o oVar, @NotNull com.moloco.sdk.internal.publisher.v vVar, @NotNull com.moloco.sdk.internal.services.j jVar) {
        tn.p.k(oVar, "bidTokenService");
        tn.p.k(vVar, "initializationHandler");
        tn.p.k(jVar, "timeProviderService");
        this.f47160a = oVar;
        this.f47161b = vVar;
        this.f47162c = jVar;
        this.f47163d = "BidTokenHandlerImpl";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.moloco.sdk.internal.services.bidtoken.k
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.acm.recorder.a r18, @org.jetbrains.annotations.NotNull com.moloco.sdk.publisher.MediationInfo r19, @org.jetbrains.annotations.NotNull com.moloco.sdk.publisher.MolocoBidTokenListener r20, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r21) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.i.a(com.moloco.sdk.acm.recorder.a, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.publisher.MolocoBidTokenListener, hn.c):java.lang.Object");
    }
}
