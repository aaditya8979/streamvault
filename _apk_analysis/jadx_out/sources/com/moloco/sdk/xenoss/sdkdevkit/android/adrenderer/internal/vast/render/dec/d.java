package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C3978d4;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f50506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<String> f50507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<String> f50508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public List<String> f50509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final s f50510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final y f50511f;

    public d(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull s sVar, @NotNull y yVar) {
        p.k(aVar, "customUserEventBuilderService");
        p.k(sVar, "buttonTracker");
        p.k(yVar, "vastTracker");
        this.f50506a = aVar;
        this.f50507b = list;
        this.f50508c = list2;
        this.f50509d = list3;
        this.f50510e = sVar;
        this.f50511f = yVar;
    }

    public /* synthetic */ d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, List list3, s sVar, y yVar, int i10, i iVar) {
        this(aVar, list, list2, list3, (i10 & 16) != 0 ? w.a() : sVar, (i10 & 32) != 0 ? a0.e() : yVar);
    }

    public final void a() {
        List<String> list = this.f50508c;
        if (list != null) {
            y.a.a(this.f50511f, list, null, null, null, 14, null);
            this.f50508c = null;
        }
    }

    public final void b(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        p.k(enumC0698a, "buttonType");
        this.f50510e.o(enumC0698a);
    }

    public final void c(@NotNull a.AbstractC0696a.c cVar) {
        p.k(cVar, "button");
        this.f50510e.l(cVar);
    }

    public final void d(@NotNull a.AbstractC0696a.f fVar) {
        p.k(fVar, C3978d4.i.L);
        List<String> list = this.f50507b;
        if (list != null) {
            y.a.b(this.f50511f, list, null, null, null, this.f50510e.p(), this.f50506a, fVar, 14, null);
            this.f50507b = null;
        }
    }

    public final void e() {
        List<String> list = this.f50509d;
        if (list != null) {
            y.a.a(this.f50511f, list, null, null, null, 14, null);
            this.f50509d = null;
        }
    }
}
