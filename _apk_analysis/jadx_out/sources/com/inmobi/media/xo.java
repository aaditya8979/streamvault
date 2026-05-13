package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public final class xo implements so {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final WeakHashMap f28543g = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uo f28544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f28545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f28546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f28547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f28548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Df f28549f;

    public xo(Activity activity, uo uoVar, InterfaceC3580m9 interfaceC3580m9) {
        Window window;
        tn.p.k(uoVar, "windowInsetListener");
        this.f28544a = uoVar;
        this.f28545b = interfaceC3580m9;
        this.f28547d = new ConcurrentHashMap();
        WeakReference weakReference = new WeakReference(activity);
        this.f28548e = weakReference;
        C3850x5.f28483a.getClass();
        if (!C3850x5.u()) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        Activity activity2 = (Activity) weakReference.get();
        View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            this.f28546c = decorView;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler", "startListeningToInsets");
            }
            WeakHashMap weakHashMap = f28543g;
            Object toVar = weakHashMap.get(decorView);
            if (toVar == null) {
                toVar = new to(decorView);
                weakHashMap.put(decorView, toVar);
            }
            tn.p.k(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ((to) toVar).f28212a.add(this);
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xo(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, uo uoVar, InterfaceC3580m9 interfaceC3580m9) {
        this((Activity) null, uoVar, interfaceC3580m9);
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        tn.p.k(uoVar, "windowInsetListener");
        C3850x5.f28483a.getClass();
        if (!C3850x5.u()) {
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler", "WindowInsetsHandler is not supported for this version");
                return;
            }
            return;
        }
        this.f28546c = gestureDetectorOnGestureListenerC3337ci;
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler", "startListeningToInsets");
        }
        WeakHashMap weakHashMap = f28543g;
        Object toVar = weakHashMap.get(gestureDetectorOnGestureListenerC3337ci);
        if (toVar == null) {
            toVar = new to(gestureDetectorOnGestureListenerC3337ci);
            weakHashMap.put(gestureDetectorOnGestureListenerC3337ci, toVar);
        }
        tn.p.k(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ((to) toVar).f28212a.add(this);
        if (interfaceC3580m9 != null) {
            ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler_INSTANCE", this + " created - " + weakHashMap.size());
        }
    }

    public final void a() {
        View view = this.f28546c;
        if (view != null) {
            WeakHashMap weakHashMap = f28543g;
            to toVar = (to) weakHashMap.get(view);
            if (toVar != null) {
                tn.p.k(this, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                toVar.f28212a.remove(this);
                if (toVar.f28212a.isEmpty()) {
                    toVar.a();
                    weakHashMap.remove(view);
                }
            }
            InterfaceC3580m9 interfaceC3580m9 = this.f28545b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler_INSTANCE", this + " destroy - " + weakHashMap.size());
            }
        }
        this.f28546c = null;
        this.f28547d.clear();
    }

    public final void a(WindowInsets windowInsets) {
        try {
            Activity activity = (Activity) this.f28548e.get();
            if (!this.f28544a.a()) {
                InterfaceC3580m9 interfaceC3580m9 = this.f28545b;
                if (interfaceC3580m9 != null) {
                    ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler", "listener is not interested in computing insets, skipping");
                    return;
                }
                return;
            }
            if (activity == null) {
                InterfaceC3580m9 interfaceC3580m92 = this.f28545b;
                if (interfaceC3580m92 != null) {
                    ((C3605n9) interfaceC3580m92).b("WindowInsetsHandler", "Activity is null, skipping safeArea computation");
                    return;
                }
                return;
            }
            vo voVarB = F3.a(activity) ? AbstractC3763ti.b(windowInsets) : AbstractC3763ti.a(windowInsets);
            Integer numF = J5.f();
            int iIntValue = numF != null ? numF.intValue() : J5.a(windowInsets);
            J5.a(Integer.valueOf(iIntValue));
            a(voVarB, iIntValue);
        } catch (Error e10) {
            InterfaceC3580m9 interfaceC3580m93 = this.f28545b;
            if (interfaceC3580m93 != null) {
                ((C3605n9) interfaceC3580m93).b("WindowInsetsHandler", "Error in getting safeArea " + e10.getMessage());
            }
        } catch (Exception e11) {
            InterfaceC3580m9 interfaceC3580m94 = this.f28545b;
            if (interfaceC3580m94 != null) {
                ((C3605n9) interfaceC3580m94).a("WindowInsetsHandler", "Exception in getting safeArea", e11);
            }
        }
    }

    public final void a(vo voVar, int i10) {
        Df dfA = Ef.a(J5.g());
        wo woVar = (wo) this.f28547d.get(Integer.valueOf(i10));
        if (woVar == null) {
            woVar = new wo();
            this.f28547d.put(Integer.valueOf(i10), woVar);
        }
        tn.p.k(dfA, "orientation");
        vo voVar2 = (vo) woVar.f28471a.get(dfA);
        if (voVar2 == null || !tn.p.f(voVar, voVar2)) {
            InterfaceC3580m9 interfaceC3580m9 = this.f28545b;
            if (interfaceC3580m9 != null) {
                ((C3605n9) interfaceC3580m9).a("WindowInsetsHandler", "safeArea - New value, updating to KV store");
            }
            tn.p.k(dfA, "orientation");
            tn.p.k(voVar, "insets");
            woVar.f28471a.put(dfA, voVar);
            ConcurrentHashMap concurrentHashMap = this.f28547d;
            LinkedHashMap linkedHashMap = new LinkedHashMap(cn.p0.f(concurrentHashMap.size()));
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((wo) entry.getValue()).a());
            }
            J5.a(linkedHashMap);
        } else {
            InterfaceC3580m9 interfaceC3580m92 = this.f28545b;
            if (interfaceC3580m92 != null) {
                ((C3605n9) interfaceC3580m92).a("WindowInsetsHandler", "SafeArea - Same value, no need to update");
            }
        }
        if (this.f28549f != dfA) {
            this.f28549f = dfA;
            uo uoVar = this.f28544a;
            Object obj = this.f28547d.get(Integer.valueOf(i10));
            tn.p.h(obj);
            uoVar.a(dfA, (wo) obj);
        }
    }
}
