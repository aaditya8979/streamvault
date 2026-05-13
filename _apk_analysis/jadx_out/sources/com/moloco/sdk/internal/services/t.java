package com.moloco.sdk.internal.services;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w0;
import jn.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
public final class t implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f47538c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final w0 f47539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f47540b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    @d(c = "com.moloco.sdk.internal.services.ClickthroughServiceImpl", f = "ClickthroughService.kt", l = {73, 77}, m = "runClickThrough")
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f47541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f47542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f47543c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f47545e;

        public b(hn.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f47543c = obj;
            this.f47545e |= Integer.MIN_VALUE;
            return t.this.a(null, null, null, null, this);
        }
    }

    public t(@NotNull w0 w0Var, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
        tn.p.k(w0Var, "externalLinkHandler");
        tn.p.k(aVar, "customUserEventBuilderService");
        this.f47539a = w0Var;
        this.f47540b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.moloco.sdk.internal.services.f0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a r20, @org.jetbrains.annotations.NotNull com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s r21, @org.jetbrains.annotations.Nullable go.k<bn.r> r22, @org.jetbrains.annotations.NotNull hn.c<? super bn.r> r23) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.t.a(java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s, go.k, hn.c):java.lang.Object");
    }

    @Override // com.moloco.sdk.internal.services.f0
    @Nullable
    public Object b(@NotNull String str, @Nullable go.k<bn.r> kVar, @NotNull hn.c<? super bn.r> cVar) {
        w0 w0Var = this.f47539a;
        if (str == null) {
            str = "";
        }
        if (!w0Var.a(str) || kVar == null) {
            return bn.r.f5635a;
        }
        bn.r rVar = bn.r.f5635a;
        Object objEmit = kVar.emit(rVar, cVar);
        return objEmit == in.a.g() ? objEmit : rVar;
    }
}
