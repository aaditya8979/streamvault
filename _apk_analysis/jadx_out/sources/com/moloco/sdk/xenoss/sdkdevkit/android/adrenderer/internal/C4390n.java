package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C4390n implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n f48485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.error.b f48486b;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.n$a */
    @d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.DECLoaderImpl", f = "DECLoader.kt", l = {31}, m = "load")
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f48487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f48488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f48489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f48490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f48491e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f48493g;

        public a(hn.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48491e = obj;
            this.f48493g |= Integer.MIN_VALUE;
            return C4390n.this.a(null, null, this);
        }
    }

    public C4390n(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n nVar, @NotNull com.moloco.sdk.internal.error.b bVar) {
        tn.p.k(nVar, "mediaCacheRepository");
        tn.p.k(bVar, "errorReportingService");
        this.f48485a = nVar;
        this.f48486b = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0 r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.NotNull hn.c<? super com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0> r24) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4390n.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o0, java.lang.String, hn.c):java.lang.Object");
    }
}
