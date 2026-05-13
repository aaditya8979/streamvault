package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class D9 extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3539ki f25308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3678q7 f25309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3605n9 f25310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25311g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D9(C3539ki c3539ki, C3539ki c3539ki2, C3678q7 c3678q7, C3605n9 c3605n9) {
        super(c3539ki);
        tn.p.k(c3539ki, "container");
        tn.p.k(c3539ki2, "renderView");
        tn.p.k(c3678q7, "htmlAdTracker");
        this.f25308d = c3539ki2;
        this.f25309e = c3678q7;
        this.f25310f = c3605n9;
        this.f25311g = D9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        C3605n9 c3605n9 = this.f25310f;
        if (c3605n9 != null) {
            String str = this.f25311g;
            tn.p.j(str, "tag");
            c3605n9.a(str, "destroy");
        }
        if (b() != null) {
            C3605n9 c3605n92 = this.f25310f;
            if (c3605n92 != null) {
                String str2 = this.f25311g;
                tn.p.j(str2, "tag");
                c3605n92.a(str2, "stopTrackingForVisibility");
            }
            C3678q7 c3678q7 = this.f25309e;
            View viewB = b();
            if (viewB != null) {
                c3678q7.b(viewB);
            }
        }
        WeakReference weakReference = this.f25484b;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        C3605n9 c3605n9 = this.f25310f;
        if (c3605n9 != null) {
            String str = this.f25311g;
            tn.p.j(str, "tag");
            c3605n9.a(str, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f25309e.a();
                return;
            }
            if (b10 == 1) {
                C3678q7 c3678q7 = this.f25309e;
                InterfaceC3580m9 interfaceC3580m9 = c3678q7.f27947f;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).c("HtmlAdTracker", "onActivityStopped");
                }
                J8 j82 = c3678q7.f27948g;
                if (j82 != null) {
                    tn.p.j(j82.f25703d, "TAG");
                    j82.f25702c.a();
                    j82.f25704e.removeCallbacksAndMessages(null);
                    j82.f25701b.clear();
                }
                T7 t72 = c3678q7.f27949h;
                if (t72 != null) {
                    t72.d();
                    return;
                }
                return;
            }
            if (b10 != 2) {
                tn.p.j(this.f25311g, "tag");
                return;
            }
            C3678q7 c3678q72 = this.f25309e;
            InterfaceC3580m9 interfaceC3580m92 = c3678q72.f27947f;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).c("HtmlAdTracker", "onActivityDestroyed");
            }
            J8 j83 = c3678q72.f27948g;
            if (j83 != null) {
                j83.f25700a.clear();
                j83.f25701b.clear();
                j83.f25702c.a();
                j83.f25704e.removeMessages(0);
                j83.f25702c.b();
            }
            c3678q72.f27948g = null;
            T7 t73 = c3678q72.f27949h;
            if (t73 != null) {
                t73.b();
            }
            c3678q72.f27949h = null;
        } catch (Exception e10) {
            C3605n9 c3605n92 = this.f25310f;
            if (c3605n92 != null) {
                String str2 = this.f25311g;
                tn.p.j(str2, "tag");
                c3605n92.b(str2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        tn.p.k(view, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f25308d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(view);
        }
        U exposureTracker = this.f25308d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        tn.p.k(view, "childView");
        tn.p.k(friendlyObstructionPurpose, "obstructionCode");
        C3605n9 c3605n9 = this.f25310f;
        if (c3605n9 != null) {
            String str = this.f25311g;
            tn.p.j(str, "tag");
            c3605n9.a(str, "addFriendlyView - childView: " + view + ", obstructionCode: " + friendlyObstructionPurpose);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f25308d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(view, friendlyObstructionPurpose);
        }
        U exposureTracker = this.f25308d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        View viewB;
        C3605n9 c3605n9 = this.f25310f;
        if (c3605n9 != null) {
            String str = this.f25311g;
            tn.p.j(str, "tag");
            c3605n9.a(str, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        this.f25308d.setFriendlyViews(map);
        C3605n9 c3605n92 = this.f25310f;
        if (c3605n92 != null) {
            String str2 = this.f25311g;
            tn.p.j(str2, "tag");
            c3605n92.a(str2, "startTrackingVisibility");
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f25483a;
        C3539ki c3539ki = gestureDetectorOnGestureListenerC3337ci instanceof C3539ki ? (C3539ki) gestureDetectorOnGestureListenerC3337ci : null;
        if (c3539ki == null) {
            return;
        }
        C3678q7 c3678q7 = this.f25309e;
        View viewB2 = b();
        if (viewB2 == null || (viewB = b()) == null) {
            return;
        }
        c3678q7.a(viewB2, viewB, c3539ki.getVISIBILITY_CHANGE_LISTENER(), this.f25485c.getViewability(), true);
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.f25484b = new WeakReference(this.f25308d);
        return this.f25308d;
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        C3605n9 c3605n9 = this.f25310f;
        if (c3605n9 != null) {
            String str = this.f25311g;
            tn.p.j(str, "tag");
            c3605n9.a(str, "stopTrackingForImpression");
        }
        C3605n9 c3605n92 = this.f25310f;
        if (c3605n92 != null) {
            String str2 = this.f25311g;
            tn.p.j(str2, "tag");
            c3605n92.a(str2, "stopTrackingForVisibility");
        }
        C3678q7 c3678q7 = this.f25309e;
        View viewB = b();
        if (viewB == null) {
            return;
        }
        c3678q7.b(viewB);
    }
}
