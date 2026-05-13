package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3810vf extends En {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f28366g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Fn f28367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC3397f1 f28368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3580m9 f28369f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3810vf(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, Fn fn2, InterfaceC3397f1 interfaceC3397f1, InterfaceC3580m9 interfaceC3580m9) {
        super(gestureDetectorOnGestureListenerC3337ci);
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "adContainer");
        tn.p.k(fn2, "mViewableAd");
        this.f28367d = fn2;
        this.f28368e = interfaceC3397f1;
        this.f28369f = interfaceC3580m9;
    }

    @Override // com.inmobi.media.Fn
    public final void a() {
        InterfaceC3580m9 interfaceC3580m9 = this.f28369f;
        if (interfaceC3580m9 != null) {
            tn.p.j("vf", "TAG");
            ((C3605n9) interfaceC3580m9).c("vf", "destroy");
        }
        WeakReference weakReference = this.f25484b;
        if (weakReference != null) {
            weakReference.clear();
        }
        try {
            this.f28368e = null;
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28369f;
            if (interfaceC3580m92 != null) {
                tn.p.j("vf", "TAG");
                ((C3605n9) interfaceC3580m92).a("vf", "Exception in destroy with message", e10);
            }
        } finally {
            this.f28367d.a();
        }
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f28367d.a(context, b10);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        AdSession adSession;
        tn.p.k(view, "childView");
        InterfaceC3397f1 interfaceC3397f1 = this.f28368e;
        if (interfaceC3397f1 != null) {
            C3511jf c3511jf = (C3511jf) interfaceC3397f1;
            tn.p.k(view, "childView");
            if (C3511jf.a(c3511jf.f27408e) && (adSession = c3511jf.f27409f) != null) {
                adSession.removeFriendlyObstruction(view);
            }
        }
        this.f28367d.a(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession;
        tn.p.k(view, "childView");
        tn.p.k(friendlyObstructionPurpose, "obstructionCode");
        InterfaceC3580m9 interfaceC3580m9 = this.f28369f;
        if (interfaceC3580m9 != null) {
            tn.p.j("vf", "TAG");
            ((C3605n9) interfaceC3580m9).a("vf", "addFriendlyView with obstruction code: " + friendlyObstructionPurpose);
        }
        InterfaceC3397f1 interfaceC3397f1 = this.f28368e;
        if (interfaceC3397f1 != null) {
            C3511jf c3511jf = (C3511jf) interfaceC3397f1;
            tn.p.k(view, "childView");
            tn.p.k(friendlyObstructionPurpose, "obstructionCode");
            if (C3511jf.a(c3511jf.f27408e) && (adSession = c3511jf.f27409f) != null) {
                adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
            }
        }
        this.f28367d.a(view, friendlyObstructionPurpose);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
        InterfaceC3580m9 interfaceC3580m9 = this.f28369f;
        if (interfaceC3580m9 != null) {
            tn.p.j("vf", "TAG");
            ((C3605n9) interfaceC3580m9).a("vf", "startTrackingForImpression");
        }
        try {
            if (this.f25485c.getViewability().getOmidConfig().isOmidEnabled()) {
                Bf.f25219a.getClass();
                if (Omid.isActive()) {
                    View viewB = this.f28367d.b();
                    WebView webView = viewB instanceof WebView ? (WebView) viewB : null;
                    if (webView != null) {
                        InterfaceC3580m9 interfaceC3580m92 = this.f28369f;
                        if (interfaceC3580m92 != null) {
                            tn.p.j("vf", "TAG");
                            ((C3605n9) interfaceC3580m92).a("vf", "creating OMSDK session");
                        }
                        InterfaceC3397f1 interfaceC3397f1 = this.f28368e;
                        if (interfaceC3397f1 != null) {
                            ((C3511jf) interfaceC3397f1).a(webView, map);
                        }
                    }
                }
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f28369f;
            if (interfaceC3580m93 != null) {
                tn.p.j("vf", "TAG");
                ((C3605n9) interfaceC3580m93).b("vf", "Exception in startTrackingForImpression with message : " + e10.getMessage());
            }
        } finally {
            this.f28367d.a(map);
        }
    }

    @Override // com.inmobi.media.Fn
    public final View b() {
        return this.f28367d.b();
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        InterfaceC3580m9 interfaceC3580m9 = this.f28369f;
        if (interfaceC3580m9 != null) {
            tn.p.j("vf", "TAG");
            ((C3605n9) interfaceC3580m9).c("vf", "inflateView called");
        }
        return this.f28367d.c();
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
        try {
            InterfaceC3580m9 interfaceC3580m9 = this.f28369f;
            if (interfaceC3580m9 != null) {
                tn.p.j("vf", "TAG");
                ((C3605n9) interfaceC3580m9).a("vf", "stopTrackingForImpression");
            }
            InterfaceC3397f1 interfaceC3397f1 = this.f28368e;
            if (interfaceC3397f1 != null) {
                C3511jf c3511jf = (C3511jf) interfaceC3397f1;
                if (C3511jf.a(c3511jf.f27408e, (byte) 2)) {
                    AdSession adSession = c3511jf.f27409f;
                    if (adSession != null) {
                        adSession.finish();
                    }
                    c3511jf.f27409f = null;
                    c3511jf.f27408e = (byte) 3;
                }
            }
        } catch (Exception e10) {
            InterfaceC3580m9 interfaceC3580m92 = this.f28369f;
            if (interfaceC3580m92 != null) {
                tn.p.j("vf", "TAG");
                ((C3605n9) interfaceC3580m92).b("vf", "Exception in stopTrackingForImpression with message : " + e10.getMessage());
            }
        } finally {
            this.f28367d.d();
        }
    }
}
