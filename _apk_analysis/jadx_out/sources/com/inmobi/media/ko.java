package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3580m9 f27500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27501b = new ConcurrentHashMap();

    public ko(InterfaceC3580m9 interfaceC3580m9) {
        this.f27500a = interfaceC3580m9;
    }

    public final GestureDetectorOnGestureListenerC3337ci a(Di di2, Context context, short s10, C3621o0 c3621o0, AdConfig adConfig) {
        Di di3;
        GestureDetectorOnGestureListenerC3337ci c3539ki;
        tn.p.k(di2, "route");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(c3621o0, "adMetaData");
        tn.p.k(adConfig, "adConfig");
        if (s10 == 0) {
            InterfaceC3580m9 interfaceC3580m9 = this.f27500a;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("SiblingWebViewManager", "Creating standard WebView with ID: " + di2.f25331b);
            }
            c3539ki = new GestureDetectorOnGestureListenerC3337ci(context, c3621o0.f27727o, c3621o0.f27728p, c3621o0.f27729q, c3621o0.f27730r, 0L, c3621o0.f27731s, c3621o0.f27732t, di2, this, c3621o0, adConfig, 80);
            di3 = di2;
        } else {
            if (s10 != 1) {
                InterfaceC3580m9 interfaceC3580m92 = this.f27500a;
                if (interfaceC3580m92 != null) {
                    ((C3605n9) interfaceC3580m92).b("SiblingWebViewManager", "Unsupported WebView type: " + ((int) s10));
                }
                throw new IllegalArgumentException("Unsupported WebView type: " + ((int) s10));
            }
            InterfaceC3580m9 interfaceC3580m93 = this.f27500a;
            di3 = di2;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).a("SiblingWebViewManager", "Creating Sibling WebView with ID: " + di3.f25331b);
            }
            c3539ki = new C3539ki(context, c3621o0.f27727o, c3621o0.f27732t, C3621o0.a(c3621o0, null, 4194047), this, di2, adConfig);
        }
        a(c3539ki, di3.f25331b);
        return c3539ki;
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str) {
        this.f27501b.put(str, gestureDetectorOnGestureListenerC3337ci);
        InterfaceC3580m9 interfaceC3580m9 = this.f27500a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("SiblingWebViewManager", "Registered bridge for WebView ID: " + str);
        }
    }

    public final void a(String str) {
        tn.p.k(str, "id");
        this.f27501b.remove(str);
        InterfaceC3580m9 interfaceC3580m9 = this.f27500a;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("SiblingWebViewManager", "Unregistered bridge for WebView ID: " + str);
        }
    }

    public final void a(sn.l lVar) {
        tn.p.k(lVar, "action");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) this.f27501b.get("default");
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            lVar.invoke(gestureDetectorOnGestureListenerC3337ci);
        }
        ConcurrentHashMap concurrentHashMap = this.f27501b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!tn.p.f(entry.getKey(), "default")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            lVar.invoke((GestureDetectorOnGestureListenerC3337ci) ((Map.Entry) it.next()).getValue());
        }
    }

    public final void b(sn.l lVar) {
        tn.p.k(lVar, "action");
        ConcurrentHashMap concurrentHashMap = this.f27501b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((GestureDetectorOnGestureListenerC3337ci) entry.getValue()) instanceof C3539ki) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) ((Map.Entry) it.next()).getValue();
            tn.p.i(gestureDetectorOnGestureListenerC3337ci, "null cannot be cast to non-null type com.inmobi.ads.containers.companions.RenderViewSibling");
            lVar.invoke((C3539ki) gestureDetectorOnGestureListenerC3337ci);
        }
    }
}
