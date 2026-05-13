package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3539ki;
import com.inmobi.media.Gn;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class Gn extends Fn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f25561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gn(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        super(gestureDetectorOnGestureListenerC3337ci);
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "mRenderView");
        this.f25561d = gestureDetectorOnGestureListenerC3337ci;
    }

    public static final bn.r a(View view, C3539ki c3539ki) {
        tn.p.k(c3539ki, "it");
        c3539ki.getViewableAd().a(view, FriendlyObstructionPurpose.OTHER);
        U exposureTracker = c3539ki.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        return bn.r.f5635a;
    }

    public static final bn.r b(View view, C3539ki c3539ki) {
        tn.p.k(c3539ki, "it");
        c3539ki.getViewableAd().a(view);
        U exposureTracker = c3539ki.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        return bn.r.f5635a;
    }

    @Override // com.inmobi.media.Fn
    public final void a(Context context, byte b10) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view) {
        tn.p.k(view, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f25561d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(view);
        }
        U exposureTracker = this.f25561d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(view);
        }
        c(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        tn.p.k(view, "childView");
        tn.p.k(friendlyObstructionPurpose, "obstructionCode");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f25561d.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(view, friendlyObstructionPurpose);
        }
        U exposureTracker = this.f25561d.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(view);
        }
        b(view);
    }

    @Override // com.inmobi.media.Fn
    public final void a(Map map) {
    }

    public final void b(final View view) {
        this.f25561d.getWebViewFactory().b(new sn.l() { // from class: n9.y0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Gn.a(view, (C3539ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final View c() {
        this.f25484b = new WeakReference(this.f25561d);
        return this.f25561d;
    }

    public final void c(final View view) {
        this.f25561d.getWebViewFactory().b(new sn.l() { // from class: n9.x0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Gn.b(view, (C3539ki) obj);
            }
        });
    }

    @Override // com.inmobi.media.Fn
    public final void d() {
    }
}
