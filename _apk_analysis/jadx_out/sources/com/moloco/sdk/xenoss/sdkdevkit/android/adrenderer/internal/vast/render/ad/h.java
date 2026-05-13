package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<String> f50062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<String> f50063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<String> f50064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final y f50065d;

    public h(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull y yVar) {
        p.k(yVar, "vastTracker");
        this.f50062a = list;
        this.f50063b = list2;
        this.f50064c = list3;
        this.f50065d = yVar;
    }

    public /* synthetic */ h(List list, List list2, List list3, y yVar, int i10, tn.i iVar) {
        this(list, list2, list3, (i10 & 8) != 0 ? a0.e() : yVar);
    }

    public final void a() {
        List<String> list = this.f50063b;
        if (list != null) {
            y.a.a(this.f50065d, list, null, null, null, 14, null);
            this.f50063b = null;
        }
    }

    public final void b(@Nullable x xVar) {
        List<String> list = this.f50064c;
        if (list != null) {
            y.a.a(this.f50065d, list, xVar, null, null, 12, null);
        }
    }

    public final boolean c() {
        List<String> list = this.f50062a;
        if (list == null) {
            return false;
        }
        y.a.a(this.f50065d, list, null, null, null, 14, null);
        this.f50062a = null;
        return true;
    }
}
