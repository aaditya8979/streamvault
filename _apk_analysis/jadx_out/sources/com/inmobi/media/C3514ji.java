package com.inmobi.media;

import com.inmobi.media.C3514ji;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3514ji extends AbstractC3388ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3539ki f27416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ko f27417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Di f27418c;

    public C3514ji(C3539ki c3539ki, ko koVar, Di di2) {
        this.f27416a = c3539ki;
        this.f27417b = koVar;
        this.f27418c = di2;
    }

    public static final void a(C3539ki c3539ki, Di di2, boolean z10) {
        if (c3539ki.getWvStateMachine().a(4) != null) {
            c3539ki.a("loadWebView", AbstractC3763ti.a(di2.f25331b, 307));
        }
        GestureDetectorOnGestureListenerC3337ci adRenderView = c3539ki.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, z10);
        }
    }

    public static final void a(ko koVar, Di di2, C3539ki c3539ki, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        String str = di2.f25330a;
        koVar.getClass();
        tn.p.k(str, "id");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) koVar.f27501b.get(str);
        if (gestureDetectorOnGestureListenerC3337ci2 == null) {
            InterfaceC3580m9 logger = c3539ki.getLogger();
            if (logger != null) {
                ((C3605n9) logger).b(c3539ki.f27482k1, "Source RenderView not found for id: " + di2.f25330a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3337ci.getWvStateMachine().a(3);
        if (numA != null) {
            int iIntValue = numA.intValue();
            InterfaceC3580m9 logger2 = c3539ki.getLogger();
            if (logger2 != null) {
                ((C3605n9) logger2).b(c3539ki.f27482k1, "Failed to transition to FIRE_AD_FAILED state: " + iIntValue);
            }
            gestureDetectorOnGestureListenerC3337ci2.a("loadWebView", AbstractC3763ti.a(gestureDetectorOnGestureListenerC3337ci.getRoute().f25331b, iIntValue));
        }
    }

    public static final void b(ko koVar, Di di2, C3539ki c3539ki, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) throws JSONException {
        String str = di2.f25330a;
        koVar.getClass();
        tn.p.k(str, "id");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) koVar.f27501b.get(str);
        if (gestureDetectorOnGestureListenerC3337ci2 == null) {
            InterfaceC3580m9 logger = c3539ki.getLogger();
            if (logger != null) {
                ((C3605n9) logger).b(c3539ki.f27482k1, "Source RenderView not found for id: " + di2.f25330a);
                return;
            }
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3337ci.getWvStateMachine().a(2);
        if (numA == null) {
            c3539ki.b(gestureDetectorOnGestureListenerC3337ci2, di2.f25331b);
            return;
        }
        int iIntValue = numA.intValue();
        InterfaceC3580m9 logger2 = c3539ki.getLogger();
        if (logger2 != null) {
            ((C3605n9) logger2).b(c3539ki.f27482k1, "Failed to transition to FIRE_AD_READY state: " + iIntValue);
        }
        gestureDetectorOnGestureListenerC3337ci2.a("loadWebView", AbstractC3763ti.a(gestureDetectorOnGestureListenerC3337ci.getRoute().f25331b, iIntValue));
    }

    @Override // com.inmobi.media.AbstractC3388ei, com.inmobi.media.InterfaceC3288al
    public final void a() {
        AbstractC3388ei listener;
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a();
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(V1 v12) {
        AbstractC3388ei listener;
        tn.p.k(v12, "audioStatusInternal");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(v12);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str, Map map) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        tn.p.k(str, "trackerName");
        tn.p.k(map, "macros");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().a(adRenderView, str, map);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, final boolean z10) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        final C3539ki c3539ki = this.f27416a;
        final Di di2 = this.f27418c;
        Runnable runnable = new Runnable() { // from class: n9.u8
            @Override // java.lang.Runnable
            public final void run() {
                C3514ji.a(c3539ki, di2, z10);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(C3442gk c3442gk) {
        AbstractC3388ei listener;
        tn.p.k(c3442gk, "telemetryOnAdImpression");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(c3442gk);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(String str) {
        AbstractC3388ei listener;
        tn.p.k(str, "data");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(str);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(String str, HashMap map) {
        AbstractC3388ei listener;
        tn.p.k(str, "eventType");
        tn.p.k(map, "kv");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(str, map);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(HashMap map) {
        tn.p.k(map, "params");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.a(map);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void a(boolean z10) {
        AbstractC3388ei listener;
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView == null || (listener = adRenderView.getListener()) == null) {
            return;
        }
        listener.a(z10);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void b(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().b(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void c() {
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void e(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().e(adRenderView);
        }
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void f(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void g(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void h(final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        final ko koVar = this.f27417b;
        final Di di2 = this.f27418c;
        final C3539ki c3539ki = this.f27416a;
        Runnable runnable = new Runnable() { // from class: n9.v8
            @Override // java.lang.Runnable
            public final void run() {
                C3514ji.a(koVar, di2, c3539ki, gestureDetectorOnGestureListenerC3337ci);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void i(final GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        Wb wb2 = (Wb) AbstractC3627o6.f27756e.getValue();
        final ko koVar = this.f27417b;
        final Di di2 = this.f27418c;
        final C3539ki c3539ki = this.f27416a;
        Runnable runnable = new Runnable() { // from class: n9.w8
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                C3514ji.b(koVar, di2, c3539ki, gestureDetectorOnGestureListenerC3337ci);
            }
        };
        wb2.getClass();
        tn.p.k(runnable, "runnable");
        wb2.f26536a.post(runnable);
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void j(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
    }

    @Override // com.inmobi.media.AbstractC3388ei
    public final void k(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        GestureDetectorOnGestureListenerC3337ci adRenderView = this.f27416a.getAdRenderView();
        if (adRenderView != null) {
            adRenderView.getListener().k(adRenderView);
        }
    }
}
