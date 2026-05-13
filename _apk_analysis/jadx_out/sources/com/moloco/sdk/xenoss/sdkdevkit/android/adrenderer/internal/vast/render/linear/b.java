package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.y;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public List<String> f50582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<String> f50583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final y f50584c;

    public b(@Nullable List<String> list, @Nullable List<String> list2, @NotNull y yVar) {
        p.k(yVar, "vastTracker");
        this.f50582a = list;
        this.f50583b = list2;
        this.f50584c = yVar;
    }

    public /* synthetic */ b(List list, List list2, y yVar, int i10, tn.i iVar) {
        this(list, list2, (i10 & 4) != 0 ? a0.e() : yVar);
    }

    public final void a(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50582a;
        if (list != null) {
            this.f50584c.a(list, null, num, str);
            this.f50582a = null;
        }
    }

    public final void b(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f50583b;
        if (list != null) {
            this.f50584c.a(list, null, num, str);
            this.f50583b = null;
        }
    }
}
