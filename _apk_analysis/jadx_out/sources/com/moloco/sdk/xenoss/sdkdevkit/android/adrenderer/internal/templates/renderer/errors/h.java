package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import androidx.compose.runtime.internal.StabilityInferred;
import cn.p0;
import cn.w;
import cn.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.m;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import zn.n;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
public abstract class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f48758f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final bn.g<Map<String, h>> f48759g = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g
        @Override // sn.a
        public final Object invoke() {
            return h.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f48760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f48761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48764e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final h a(@NotNull String str) {
            p.k(str, UnifiedMediationParams.KEY_DESCRIPTION);
            h hVar = b().get(str);
            return hVar == null ? b.f48765h : hVar;
        }

        @NotNull
        public final Map<String, h> b() {
            return (Map) h.f48759g.getValue();
        }
    }

    @StabilityInferred(parameters = 1)
    public static final class b extends h {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final b f48765h = new b();

        public b() {
            super(Integer.MIN_VALUE, "UNKNOWN", false, true, false, 16, null);
        }

        public boolean equals(@Nullable Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2068672870;
        }

        @NotNull
        public String toString() {
            return "UndocumentedTemplateError";
        }
    }

    public h(int i10, String str, boolean z10, boolean z11, boolean z12) {
        this.f48760a = i10;
        this.f48761b = str;
        this.f48762c = z10;
        this.f48763d = z11;
        this.f48764e = z12;
    }

    public /* synthetic */ h(int i10, String str, boolean z10, boolean z11, boolean z12, int i11, tn.i iVar) {
        this(i10, str, z10, z11, (i11 & 16) != 0 ? false : z12, null);
    }

    public /* synthetic */ h(int i10, String str, boolean z10, boolean z11, boolean z12, tn.i iVar) {
        this(i10, str, z10, z11, z12);
    }

    public static final Map b() {
        List listP = w.p(a.C0633a.f48739i, m.c.f48784j, m.a.f48782j, m.b.f48783j, m.d.f48785j, m.e.f48786j, m.f.f48787j, m.g.f48788j, c.C0635c.f48749i, c.b.f48748i, c.a.f48747i, d.a.f48751i, b.a.f48741i, b.c.f48743i, b.d.f48744i, b.C0634b.f48742i, b.e.f48745i, j.a.f48767i, j.b.f48768i, e.a.f48753i, k.a.f48770i, f.a.f48755i, f.b.f48756i, f.c.f48757i);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(p0.f(x.x(listP, 10)), 16));
        for (Object obj : listP) {
            linkedHashMap.put(((h) obj).c(), obj);
        }
        return linkedHashMap;
    }

    @NotNull
    public String c() {
        return this.f48761b;
    }

    public boolean d() {
        return this.f48764e;
    }

    public boolean e() {
        return this.f48762c;
    }

    public boolean f() {
        return this.f48763d;
    }
}
