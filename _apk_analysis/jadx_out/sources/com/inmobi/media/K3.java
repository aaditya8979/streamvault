package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.inmobi.media.K3;
import com.squareup.picasso.Picasso;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public final class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f25782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V3 f25783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3605n9 f25784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final go.k f25785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.g f25786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f25787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C3592ml f25788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3615nj f25789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public P3 f25790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U3 f25791j;

    public K3(Context context, p000do.l0 l0Var, V3 v32, C3605n9 c3605n9) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(v32, "companionTelemetryHelper");
        this.f25782a = l0Var;
        this.f25783b = v32;
        this.f25784c = c3605n9;
        this.f25785d = go.q.b(0, 0, null, 7, null);
        this.f25790i = M3.f25929a;
        this.f25791j = new U3(context, c3605n9);
    }

    public static final void a(K3 k32, View view) {
        C3592ml c3592ml = k32.f25788g;
        if (c3592ml != null) {
            List listO0 = cn.f0.O0(c3592ml.f27641b, c3592ml.f27642c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listO0) {
                if (tn.p.f(((C3809ve) obj).f28365b, "click")) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(cn.x.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C3809ve) it.next()).f28364a);
            }
            P4.a(k32.f25785d, k32.f25782a, new Q3(arrayList2));
        }
    }

    public final void a() {
        ViewParent parent;
        C3605n9 c3605n9 = this.f25784c;
        if (c3605n9 != null) {
            c3605n9.a("CompanionAdManager", "destroy");
        }
        C3615nj c3615nj = this.f25789h;
        if (c3615nj != null) {
            Picasso picasso = Qf.f26183a;
            Qf.b(c3615nj.f27702a).cancelTag(c3615nj.f27704c);
        }
        H6.a(this.f25786e);
        View view = this.f25787f;
        if (view != null && (parent = view.getParent()) != null) {
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f25787f);
            }
        }
        this.f25786e = null;
        this.f25789h = null;
        this.f25787f = null;
        this.f25790i = M3.f25929a;
    }

    public final void a(ArrayList arrayList) {
        tn.p.k(arrayList, "companionAds");
        if (arrayList.isEmpty()) {
            return;
        }
        if (!tn.p.f(this.f25790i, M3.f25929a)) {
            Objects.toString(this.f25790i);
            return;
        }
        Map mapA = AbstractC3491ik.a(this.f25783b.f26469a);
        Wj wj2 = Wj.f26549a;
        Wj.b("CompanionAdAvailable", mapA, EnumC3287ak.f26805a);
        this.f25786e = p000do.i.d(this.f25782a, null, null, new J3(this, arrayList, null), 3, null);
    }

    public final void b() {
        View view = this.f25787f;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: n9.g2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    K3.a(this.f75382b, view2);
                }
            });
        }
    }
}
