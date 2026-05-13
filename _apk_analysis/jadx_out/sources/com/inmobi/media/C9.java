package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class C9 extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gn f25254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3678q7 f25255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3580m9 f25256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f25257g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Gn gn2, C3678q7 c3678q7, InterfaceC3580m9 interfaceC3580m9) {
        super(gestureDetectorOnGestureListenerC3337ci);
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "container");
        tn.p.k(gn2, "mViewableAd");
        tn.p.k(c3678q7, "htmlAdTracker");
        this.f25254d = gn2;
        this.f25255e = c3678q7;
        this.f25256f = interfaceC3580m9;
        this.f25257g = C9.class.getSimpleName();
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f25256f;
        if (interfaceC3580m9 != null) {
            String str = this.f25257g;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "destroy");
        }
        View viewB = this.f25254d.b();
        if (viewB != null) {
            this.f25255e.a(viewB);
            this.f25255e.b(viewB);
        }
        WeakReference weakReference = this.f25484b;
        if (weakReference != null) {
            weakReference.clear();
        }
        WeakReference weakReference2 = this.f25254d.f25484b;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        InterfaceC3580m9 interfaceC3580m9 = this.f25256f;
        if (interfaceC3580m9 != null) {
            String str = this.f25257g;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "onActivityStateChanged - state - " + ((int) b10));
        }
        try {
            if (b10 == 0) {
                this.f25255e.a();
            } else if (b10 == 1) {
                C3678q7 c3678q7 = this.f25255e;
                InterfaceC3580m9 interfaceC3580m92 = c3678q7.f27947f;
                if (interfaceC3580m92 != null) {
                    ((C3605n9) interfaceC3580m92).c("HtmlAdTracker", "onActivityStopped");
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
                }
            } else if (b10 == 2) {
                C3678q7 c3678q72 = this.f25255e;
                InterfaceC3580m9 interfaceC3580m93 = c3678q72.f27947f;
                if (interfaceC3580m93 != null) {
                    ((C3605n9) interfaceC3580m93).c("HtmlAdTracker", "onActivityDestroyed");
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
            } else {
                tn.p.j(this.f25257g, "TAG");
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m94 = this.f25256f;
            if (interfaceC3580m94 != null) {
                String str2 = this.f25257g;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m94).b(str2, "Exception in onActivityStateChanged with message : " + e10.getMessage());
            }
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
        } finally {
            this.f25254d.getClass();
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        tn.p.k(view, "childView");
        if (view instanceof C3539ki) {
            return;
        }
        this.f25254d.a(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        tn.p.k(view, "childView");
        tn.p.k(friendlyObstructionPurpose, "obstructionCode");
        if (view instanceof C3539ki) {
            InterfaceC3580m9 interfaceC3580m9 = this.f25256f;
            if (interfaceC3580m9 != null) {
                String str = this.f25257g;
                tn.p.j(str, "TAG");
                ((C3605n9) interfaceC3580m9).a(str, "Ignoring RenderViewSibling as friendly view");
                return;
            }
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f25256f;
        if (interfaceC3580m92 != null) {
            String str2 = this.f25257g;
            tn.p.j(str2, "TAG");
            ((C3605n9) interfaceC3580m92).a(str2, "Adding friendly view: " + view.getClass().getSimpleName() + " with obstruction code: " + friendlyObstructionPurpose);
        }
        this.f25254d.a(view, friendlyObstructionPurpose);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3580m9 interfaceC3580m9 = this.f25256f;
        if (interfaceC3580m9 != null) {
            String str = this.f25257g;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "startTrackingForImpression with " + (map != null ? Integer.valueOf(map.size()) : null) + " friendly views");
        }
        View viewB = this.f25254d.b();
        if (viewB != null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f25256f;
            if (interfaceC3580m92 != null) {
                String str2 = this.f25257g;
                tn.p.j(str2, "TAG");
                ((C3605n9) interfaceC3580m92).a(str2, "start tracking");
            }
            AdConfig.ViewabilityConfig viewability = this.f25485c.getViewability();
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f25483a;
            tn.p.i(gestureDetectorOnGestureListenerC3337ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC3337ci.setFriendlyViews(map);
            C3678q7 c3678q7 = this.f25255e;
            c3678q7.getClass();
            tn.p.k(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            tn.p.k(viewB, "token");
            tn.p.k(viewability, "viewabilityConfig");
            InterfaceC3580m9 interfaceC3580m93 = c3678q7.f27947f;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).c("HtmlAdTracker", "startTrackingForImpression");
            }
            if (c3678q7.f27942a == 0) {
                InterfaceC3580m9 interfaceC3580m94 = c3678q7.f27947f;
                if (interfaceC3580m94 != null) {
                    ((C3605n9) interfaceC3580m94).b("HtmlAdTracker", "impression type is loaded. return");
                }
            } else if (tn.p.f(c3678q7.f27943b, "video") || tn.p.f(c3678q7.f27943b, "audio")) {
                InterfaceC3580m9 interfaceC3580m95 = c3678q7.f27947f;
                if (interfaceC3580m95 != null) {
                    ((C3605n9) interfaceC3580m95).b("HtmlAdTracker", "creative type is video and audio. return");
                }
            } else {
                J8 j8A = c3678q7.a(c3678q7.f27942a, viewability);
                InterfaceC3580m9 interfaceC3580m96 = c3678q7.f27947f;
                if (interfaceC3580m96 != null) {
                    ((C3605n9) interfaceC3580m96).c("HtmlAdTracker", "impression tracker add view");
                }
                int i10 = c3678q7.f27945d;
                int i11 = c3678q7.f27944c;
                tn.p.k(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                tn.p.k(viewB, "token");
                H8 h82 = (H8) j8A.f25700a.get(viewB);
                if (!tn.p.f(h82 != null ? h82.f25584a : null, viewB)) {
                    tn.p.k(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    j8A.f25700a.remove(viewB);
                    j8A.f25701b.remove(viewB);
                    j8A.f25702c.a(viewB);
                    j8A.f25700a.put(viewB, new H8(viewB, i10, i11));
                    T7 t72 = j8A.f25702c;
                    t72.getClass();
                    tn.p.k(viewB, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    t72.a(viewB, viewB, viewB, i10);
                }
            }
            this.f25255e.a(viewB, viewB, gestureDetectorOnGestureListenerC3337ci.getVISIBILITY_CHANGE_LISTENER(), viewability, false);
            this.f25254d.getClass();
        }
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f25254d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        return this.f25254d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        InterfaceC3580m9 interfaceC3580m9 = this.f25256f;
        if (interfaceC3580m9 != null) {
            String str = this.f25257g;
            tn.p.j(str, "TAG");
            ((C3605n9) interfaceC3580m9).a(str, "stopTrackingForImpression");
        }
        View viewB = this.f25254d.b();
        if (viewB != null) {
            this.f25255e.a(viewB);
            this.f25254d.getClass();
        }
    }
}
