package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.inmobi.media.Ee;
import com.inmobi.media.ads.nativeAd.MediaView;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class Ee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f25388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3793un f25389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Be f25390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f25391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f25392e;

    public Ee(p000do.l0 l0Var, C3793un c3793un) {
        tn.p.k(l0Var, "coroutineScope");
        tn.p.k(c3793un, "viewabilityModel");
        this.f25388a = l0Var;
        this.f25389b = c3793un;
        this.f25391d = new AtomicBoolean(false);
        this.f25392e = new ArrayList();
        Fe fe2 = new Fe(new C3843wn(c3793un.f28292a, c3793un.f28294c), new C3843wn(c3793un.f28293b, c3793un.f28295d));
        ViewGroup parentView$media_release = c3793un.f28296e.f26319a.getParentView$media_release();
        ImageView iconView$media_release = c3793un.f28296e.f26319a.getIconView$media_release();
        Sg sg2 = c3793un.f28296e;
        MediaView mediaView = sg2.f26320b;
        tn.p.k(sg2, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        MediaView mediaView2 = sg2.f26320b;
        if (mediaView2 != null) {
            linkedHashSet.add(mediaView2);
        }
        View view = sg2.f26321c;
        if (view != null) {
            linkedHashSet.add(view);
        }
        View ctaView$media_release = sg2.f26319a.getCtaView$media_release();
        if (ctaView$media_release != null) {
            linkedHashSet.add(ctaView$media_release);
        }
        ImageView iconView$media_release2 = sg2.f26319a.getIconView$media_release();
        if (iconView$media_release2 != null) {
            linkedHashSet.add(iconView$media_release2);
        }
        View titleView$media_release = sg2.f26319a.getTitleView$media_release();
        if (titleView$media_release != null) {
            linkedHashSet.add(titleView$media_release);
        }
        View descriptionView$media_release = sg2.f26319a.getDescriptionView$media_release();
        if (descriptionView$media_release != null) {
            linkedHashSet.add(descriptionView$media_release);
        }
        View ratingView$media_release = sg2.f26319a.getRatingView$media_release();
        if (ratingView$media_release != null) {
            linkedHashSet.add(ratingView$media_release);
        }
        View advertiserView$media_release = sg2.f26319a.getAdvertiserView$media_release();
        if (advertiserView$media_release != null) {
            linkedHashSet.add(advertiserView$media_release);
        }
        linkedHashSet.addAll(sg2.f26319a.getExtraViews$media_release());
        this.f25390c = new Be(parentView$media_release, iconView$media_release, mediaView, cn.f0.g1(linkedHashSet), fe2);
    }

    public static final bn.r a(Ee ee2, boolean z10) {
        ee2.f25390c.f25218e.f25437a.f28469b = z10;
        return bn.r.f5635a;
    }

    public static final bn.r b(Ee ee2, boolean z10) {
        ee2.f25390c.f25218e.f25438b.f28469b = z10;
        return bn.r.f5635a;
    }

    public final void a() {
        if (this.f25391d.getAndSet(true)) {
            return;
        }
        ViewGroup parentView$media_release = this.f25389b.f28296e.f26319a.getParentView$media_release();
        a(this.f25389b.f28296e.f26319a.getIconView$media_release(), parentView$media_release, this.f25389b.f28292a, new sn.l() { // from class: n9.a0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Ee.a(this.f75279b, ((Boolean) obj).booleanValue());
            }
        });
        C3793un c3793un = this.f25389b;
        a(c3793un.f28296e.f26320b, parentView$media_release, c3793un.f28293b, new sn.l() { // from class: n9.b0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Ee.b(this.f75293b, ((Boolean) obj).booleanValue());
            }
        });
    }

    public final void a(View view, ViewGroup viewGroup, boolean z10, sn.l lVar) {
        if (view == null || !z10) {
            return;
        }
        p000do.l0 l0Var = this.f25388a;
        tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(viewGroup, "parentView");
        tn.p.k(l0Var, "coroutineScope");
        this.f25392e.add(p000do.i.d(this.f25388a, null, null, new De(go.f.M(go.f.C(go.f.f(new C3768tn(view, viewGroup, null)), p000do.w0.c()), l0Var, kotlinx.coroutines.flow.a.f73397a.d(), Boolean.valueOf(AbstractC3818vn.b(view, viewGroup))), null, lVar), 3, null));
    }

    public final void b() {
        if (this.f25391d.getAndSet(false)) {
            ArrayList arrayList = this.f25392e;
            tn.p.k(arrayList, "<this>");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                H6.a((kotlinx.coroutines.g) it.next());
            }
            arrayList.clear();
            this.f25392e.clear();
        }
    }
}
