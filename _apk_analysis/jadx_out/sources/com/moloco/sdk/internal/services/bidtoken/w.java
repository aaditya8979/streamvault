package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 0)
public final class w implements y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f47316e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47317f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.bidtoken.b f47318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.j f47319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public n f47320d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenCacheImpl", f = "ServerBidTokenCache.kt", l = {62}, m = "tokenStatus")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f47322b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f47324d;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47322b = obj;
            this.f47324d |= Integer.MIN_VALUE;
            return w.this.a(this);
        }
    }

    @jn.d(c = "com.moloco.sdk.internal.services.bidtoken.ServerBidTokenCacheImpl", f = "ServerBidTokenCache.kt", l = {95, 98}, m = "updateCache")
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47325a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47326b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f47327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f47328d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f47330f;

        public c(hn.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47328d = obj;
            this.f47330f |= Integer.MIN_VALUE;
            return w.this.a(null, this);
        }
    }

    public w(@NotNull com.moloco.sdk.internal.bidtoken.b bVar, @NotNull com.moloco.sdk.internal.services.j jVar) {
        tn.p.k(bVar, "bidTokenParser");
        tn.p.k(jVar, "timeProviderService");
        this.f47318b = bVar;
        this.f47319c = jVar;
        this.f47320d = new n("", "", g.a());
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.y
    @NotNull
    public n a() {
        return this.f47320d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.y
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.internal.services.bidtoken.n r8, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r9) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.w.a(com.moloco.sdk.internal.services.bidtoken.n, hn.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.internal.services.bidtoken.y
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.internal.services.bidtoken.B> r13) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.w.a(hn.c):java.lang.Object");
    }

    public final void b(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }
}
