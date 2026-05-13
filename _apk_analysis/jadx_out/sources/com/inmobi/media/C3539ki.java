package com.inmobi.media;

import android.content.Context;
import android.view.View;
import androidx.webkit.Profile;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3539ki extends GestureDetectorOnGestureListenerC3337ci {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final byte f27480i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final C3605n9 f27481j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final String f27482k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f27483l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final C3514ji f27484m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3539ki(Context context, byte b10, C3605n9 c3605n9, C3621o0 c3621o0, ko koVar, Di di2, AdConfig adConfig) {
        super(context, b10, null, null, c3621o0.f27730r, 0L, c3621o0.f27731s, c3605n9, di2, koVar, c3621o0, adConfig, 92);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3621o0, "adMetaData");
        tn.p.k(koVar, "webViewFactory");
        tn.p.k(di2, "route");
        tn.p.k(adConfig, "adConfig");
        this.f27480i1 = b10;
        this.f27481j1 = c3605n9;
        this.f27482k1 = "RenderViewSibling - " + di2.f25331b;
        koVar.getClass();
        tn.p.k("default", "id");
        this.f27483l1 = (GestureDetectorOnGestureListenerC3337ci) koVar.f27501b.get("default");
        this.f27484m1 = new C3514ji(this, koVar, di2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC3337ci getAdRenderView() {
        C3605n9 c3605n9;
        if (this.f27483l1 == null && (c3605n9 = this.f27481j1) != null) {
            c3605n9.b(this.f27482k1, "Ad RenderView not found for id: " + getRoute().f25331b);
        }
        return this.f27483l1;
    }

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci
    public final void C() {
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C3605n9 c3605n9 = this.f27481j1;
        if (c3605n9 != null) {
            c3605n9.a(this.f27482k1, "initialize RenderViewSibling");
        }
        a(this.f27484m1);
        GestureDetectorOnGestureListenerC3337ci adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC3337ci adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC3337ci adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof C3539ki)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C3605n9 c3605n92 = this.f27481j1;
        if (c3605n92 != null) {
            c3605n92.a(this.f27482k1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(kotlin.collections.a.C(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci
    public final void a(Ff ff2) {
        tn.p.k(ff2, "orientationProperties");
        C3605n9 c3605n9 = this.f27481j1;
        if (c3605n9 != null) {
            c3605n9.a(this.f27482k1, "setOrientationProperties " + this);
        }
        setOrientationProperties(ff2);
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci, com.inmobi.media.C
    public final void b() {
        j();
        removeAllViews();
        tn.p.i(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    @Nullable
    public final InterfaceC3580m9 getLogger() {
        return this.f27481j1;
    }

    public final byte getMPlacementType() {
        return this.f27480i1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci, com.inmobi.media.C
    @NotNull
    public Fn getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new D9(this, this, new C3678q7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.f27481j1), this.f27481j1));
        }
        Fn mViewableAd = getMViewableAd();
        tn.p.h(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci
    public final void m() {
        C3605n9 c3605n9 = this.f27481j1;
        if (c3605n9 != null) {
            c3605n9.a(this.f27482k1, "dismissCurrentViewContainer " + this);
        }
        C3832wc mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C3459hc c3459hc = mediaProcessor.f28431c;
            if (c3459hc != null) {
                c3459hc.b();
            }
            mediaProcessor.f28431c = null;
        }
        if (tn.p.f(Profile.DEFAULT_PROFILE_NAME, getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        ko webViewFactory = getWebViewFactory();
        String str = getRoute().f25330a;
        webViewFactory.getClass();
        tn.p.k(str, "id");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webViewFactory.f27501b.get(str);
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            c(gestureDetectorOnGestureListenerC3337ci, getRoute().f25331b);
            return;
        }
        C3605n9 c3605n9 = this.f27481j1;
        if (c3605n9 != null) {
            c3605n9.b(this.f27482k1, "Not able to give show success as the source view is not present");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci, com.inmobi.media.AbstractC3872y2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC3337ci
    public final void u() {
    }
}
