package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f50122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<String> f50123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<String> f50124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final s f50125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final y f50126e;

    public i(@NotNull com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, @Nullable List<String> list, @Nullable List<String> list2, @NotNull s sVar, @NotNull y yVar) {
        p.k(aVar, "customUserEventBuilderService");
        p.k(sVar, "buttonTracker");
        p.k(yVar, "vastTracker");
        this.f50122a = aVar;
        this.f50123b = list;
        this.f50124c = list2;
        this.f50125d = sVar;
        this.f50126e = yVar;
    }

    public /* synthetic */ i(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, List list, List list2, s sVar, y yVar, int i10, tn.i iVar) {
        this(aVar, list, list2, (i10 & 8) != 0 ? w.a() : sVar, (i10 & 16) != 0 ? a0.e() : yVar);
    }

    public final void a() {
        List<String> list = this.f50124c;
        if (list != null) {
            y.a.a(this.f50126e, list, null, null, null, 14, null);
            this.f50124c = null;
        }
    }

    public final void b(@NotNull a.AbstractC0696a.c.EnumC0698a enumC0698a) {
        p.k(enumC0698a, "buttonType");
        this.f50125d.o(enumC0698a);
    }

    public final void c(@NotNull a.AbstractC0696a.c cVar) {
        p.k(cVar, "button");
        this.f50125d.l(cVar);
    }

    public final void d(@NotNull a.AbstractC0696a.f fVar) {
        p.k(fVar, "lastClickPosition");
        List<String> list = this.f50123b;
        if (list != null) {
            y.a.b(this.f50126e, list, null, null, null, this.f50125d.p(), this.f50122a, fVar, 14, null);
            this.f50123b = null;
        }
    }
}
