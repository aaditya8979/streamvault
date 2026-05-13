package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.l0;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
public final class m implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f49834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l0 f49835b;

    @jn.d(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastTrackerImpl$track$1", f = "VastTracker.kt", l = {105}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements sn.p<l0, hn.c<? super bn.r>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f49836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f49837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f49838c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f49839d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f49840e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f49841f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f49842g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f49843h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f49844i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ List<String> f49845j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f49846k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a.AbstractC0696a.f f49847l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ m f49848m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<a.AbstractC0696a.c> f49849n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x f49850o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Integer f49851p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f49852q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<String> list, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0696a.f fVar, m mVar, List<a.AbstractC0696a.c> list2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, Integer num, String str, hn.c<? super a> cVar) {
            super(2, cVar);
            this.f49845j = list;
            this.f49846k = aVar;
            this.f49847l = fVar;
            this.f49848m = mVar;
            this.f49849n = list2;
            this.f49850o = xVar;
            this.f49851p = num;
            this.f49852q = str;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo2invoke(l0 l0Var, hn.c<? super bn.r> cVar) {
            return ((a) create(l0Var, cVar)).invokeSuspend(bn.r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final hn.c<bn.r> create(Object obj, hn.c<?> cVar) {
            return new a(this.f49845j, this.f49846k, this.f49847l, this.f49848m, this.f49849n, this.f49850o, this.f49851p, this.f49852q, cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
        
            r13 = r13;
            r14 = r14;
            r11 = r11;
            r12 = r12;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009b -> B:18:0x00a3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l lVar) {
        tn.p.k(lVar, "persistentHttpRequest");
        this.f49834a = lVar;
        this.f49835b = kotlinx.coroutines.d.a(com.moloco.sdk.internal.scheduling.c.a().getDefault());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y
    public void a(@NotNull List<String> list, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, @Nullable Integer num, @Nullable String str) {
        tn.p.k(list, "urls");
        f(list, xVar, num, str, cn.w.m(), null, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y
    public void b(@NotNull List<String> list, @Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, @Nullable Integer num, @Nullable String str, @NotNull List<a.AbstractC0696a.c> list2, @NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @NotNull a.AbstractC0696a.f fVar) {
        tn.p.k(list, "urls");
        tn.p.k(list2, "renderedButtons");
        tn.p.k(aVar, "customUserEventBuilderService");
        tn.p.k(fVar, "lastClickPosition");
        f(list, xVar, num, str, list2, aVar, fVar);
    }

    public final Object e(String str, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0696a.f fVar, long j10, List<a.AbstractC0696a.c> list, hn.c<? super String> cVar) {
        return aVar.a(j10, new a.AbstractC0696a.d(fVar, null, null, list, 6, null), str, cVar);
    }

    public final void f(List<String> list, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x xVar, Integer num, String str, List<a.AbstractC0696a.c> list2, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, a.AbstractC0696a.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        p000do.i.d(this.f49835b, null, null, new a(list, aVar, fVar, this, list2, xVar, num, str, null), 3, null);
    }
}
