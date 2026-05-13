package com.fyber.inneractive.sdk.flow;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends x implements NativeAdContent, com.fyber.inneractive.sdk.flow.nativead.u {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f16678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f16682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Uri f16683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public MediaView f16684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f16685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Float f16686p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f16687q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.r f16688r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t0 f16689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final HashMap f16690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.j f16691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.a f16692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f16693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f16694x;

    public w0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
        this.f16687q = new ArrayList();
        this.f16690t = new HashMap();
        this.f16693w = new ArrayList();
        this.f16694x = new ArrayList();
    }

    public final void b(String str) {
        com.fyber.inneractive.sdk.util.g gVar;
        if (str == null || str.trim().isEmpty()) {
            str = NativeAdContent.ViewTag.OTHER;
        }
        IAlog.c("%s : handleClick(): %s", "w0", str);
        if (this.f16691u != null) {
            switch (str) {
                case "CTA":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_CTA;
                    break;
                case "TITLE":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_TITLE;
                    break;
                case "DESCRIPTION":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_DESCRIPTION;
                    break;
                case "RATING":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_RATING;
                    break;
                case "MEDIA_VIEW":
                    if (!isVideoAd()) {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_IMAGE;
                        break;
                    } else {
                        gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_VIDEO;
                        break;
                    }
                    break;
                case "ICON":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ICON;
                    break;
                case "ROOT":
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE_AD_ROOT;
                    break;
                case "OTHER":
                default:
                    gVar = com.fyber.inneractive.sdk.util.g.NATIVE;
                    break;
            }
            com.fyber.inneractive.sdk.flow.nativead.i iVar = (com.fyber.inneractive.sdk.flow.nativead.i) this.f16690t.get(str);
            com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f16691u;
            if (iVar == null) {
                iVar = jVar.f16462a;
            }
            if (iVar == null) {
                jVar.getClass();
                IAlog.a("%s : No active link (no root and object related links), origin: %s", com.fyber.inneractive.sdk.flow.nativead.j.f16461d, gVar);
            } else {
                com.fyber.inneractive.sdk.flow.nativead.p pVar = jVar.f16464c;
                pVar.getClass();
                com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.flow.nativead.m(pVar, iVar, false, gVar));
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void bindMediaView(MediaView mediaView) {
        this.f16684n = mediaView;
        com.fyber.inneractive.sdk.flow.nativead.a aVar = this.f16692v;
        if (aVar != null) {
            aVar.bind(mediaView);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        t0 t0Var = this.f16689s;
        if (t0Var != null) {
            t0Var.destroy();
            this.f16689s = null;
        }
        com.fyber.inneractive.sdk.flow.nativead.j jVar = this.f16691u;
        if (jVar != null) {
            jVar.f16463b = null;
            jVar.f16464c.f16492a = null;
            this.f16691u = null;
        }
        if (this.f16692v != null) {
            this.f16692v = null;
        }
        for (View view : this.f16687q) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        for (View view2 : this.f16687q) {
            if (view2 != null) {
                view2.setOnTouchListener(null);
            }
        }
        this.f16688r = null;
        this.f16687q.clear();
        this.f16681k = null;
        this.f16685o = null;
        this.f16682l = null;
        this.f16677g = null;
        this.f16683m = null;
        this.f16684n = null;
        this.f16678h = null;
        this.f16680j = null;
        this.f16679i = null;
        this.f16686p = null;
        this.f16690t.clear();
        this.f16693w.clear();
        this.f16694x.clear();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return (this.f16683m == null && this.f16684n == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdCallToAction() {
        return this.f16679i;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdDescription() {
        return this.f16678h;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdTitle() {
        return this.f16677g;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getAdvertiserName() {
        return this.f16680j;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Uri getAppIcon() {
        return this.f16682l;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getMediaAspectRatio() {
        return this.f16686p;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final MediaView getMediaView() {
        return this.f16684n;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final String getPrice() {
        return this.f16681k;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final Float getRating() {
        return this.f16685o;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return this.f16689s != null;
    }

    @Override // com.fyber.inneractive.sdk.external.NativeAdContent
    public final void registerViewsForInteraction(ViewGroup viewGroup, MediaView mediaView, ImageView imageView, Collection collection) {
        this.f16687q.clear();
        if (collection != null) {
            this.f16687q.addAll(collection);
        }
        if (viewGroup != null && !this.f16687q.contains(viewGroup)) {
            this.f16687q.add(viewGroup);
        }
        if (mediaView != null && !this.f16687q.contains(mediaView)) {
            this.f16687q.add(mediaView);
        }
        if (imageView != null && !this.f16687q.contains(imageView)) {
            this.f16687q.add(imageView);
        }
        MediaView mediaView2 = this.f16684n;
        if (mediaView2 == null || mediaView2.getContext() == null) {
            IAlog.b("%sCould not attach NativeAdViewGestureDetector, MediaView or its context are null", "w0");
            return;
        }
        this.f16688r = new com.fyber.inneractive.sdk.flow.nativead.r(this.f16684n.getContext(), this);
        for (View view : this.f16687q) {
            if (view != null) {
                view.setOnTouchListener(this.f16688r);
            }
        }
    }
}
