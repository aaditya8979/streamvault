package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.ads.network.common.model.InlineParams;
import com.ironsource.C4089j8;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Ti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ko f26376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3580m9 f26377b;

    public Ti(ko koVar, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(koVar, "wvFactory");
        this.f26376a = koVar;
        this.f26377b = interfaceC3580m9;
    }

    public static final C3539ki a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str, Ti ti2, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2, Context context, long j10) {
        C3621o0 c3621o0A;
        C3621o0 c3621o0;
        C3440gi c3440gi;
        C3621o0 adMetaData = gestureDetectorOnGestureListenerC3337ci.getAdMetaData();
        if (adMetaData != null) {
            C3440gi c3440gi2 = gestureDetectorOnGestureListenerC3337ci.getAdMetaData().f27731s;
            if (c3440gi2 != null) {
                C3795v0 c3795v0 = c3440gi2.f27230a;
                String str2 = c3440gi2.f27231b;
                String str3 = c3440gi2.f27232c;
                String str4 = c3440gi2.f27233d;
                int i10 = c3440gi2.f27234e;
                String str5 = c3440gi2.f27235f;
                String str6 = c3440gi2.f27236g;
                boolean z10 = c3440gi2.f27237h;
                int i11 = c3440gi2.f27238i;
                C3672q1 c3672q1 = c3440gi2.f27239j;
                C3564li c3564li = c3440gi2.f27240k;
                InlineParams inlineParams = c3440gi2.f27242m;
                tn.p.k(c3795v0, "placement");
                tn.p.k(str2, "markupType");
                tn.p.k(str3, "impressionId");
                tn.p.k(str4, "telemetryMetadataBlob");
                tn.p.k(str5, "creativeType");
                tn.p.k(str6, "creativeId");
                c3621o0 = adMetaData;
                c3440gi = new C3440gi(c3795v0, str2, str3, str4, i10, str5, str6, z10, i11, c3672q1, c3564li, str, inlineParams);
            } else {
                c3621o0 = adMetaData;
                c3440gi = null;
            }
            c3621o0A = C3621o0.a(c3621o0, c3440gi, 3665663);
        } else {
            c3621o0A = null;
        }
        if (c3621o0A == null) {
            InterfaceC3580m9 interfaceC3580m9 = ti2.f26377b;
            if (interfaceC3580m9 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m9).b("Ti", "AdMetaData is null, cannot initialize webview.");
            }
            return null;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = ti2.f26376a.a(new Di(gestureDetectorOnGestureListenerC3337ci2.getRoute().f25331b, str), context, (short) 1, c3621o0A, gestureDetectorOnGestureListenerC3337ci.getAdConfig());
        C3539ki c3539ki = gestureDetectorOnGestureListenerC3337ciA instanceof C3539ki ? (C3539ki) gestureDetectorOnGestureListenerC3337ciA : null;
        if (c3539ki != null) {
            Integer numA = c3539ki.getWvStateMachine().a(1);
            if (numA != null) {
                gestureDetectorOnGestureListenerC3337ci2.a("loadWebView", AbstractC3763ti.a(str, numA.intValue()));
            }
            c3539ki.Z();
            C3589mi renderViewTelemetry = c3539ki.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.f27632b = j10;
            }
            return c3539ki;
        }
        InterfaceC3580m9 interfaceC3580m92 = ti2.f26377b;
        if (interfaceC3580m92 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m92).b("Ti", "Failed to create Sibling WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC3337ci2.a("loadWebView", AbstractC3763ti.a(str, 313));
        return null;
    }

    public final GestureDetectorOnGestureListenerC3337ci a() {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a("default");
        if (gestureDetectorOnGestureListenerC3337ciA != null) {
            return gestureDetectorOnGestureListenerC3337ciA;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).b("Ti", "AdRenderView is null, cannot initialize webview.");
        }
        return null;
    }

    public final GestureDetectorOnGestureListenerC3337ci a(String str) {
        ko koVar = this.f26376a;
        koVar.getClass();
        tn.p.k(str, "id");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) koVar.f27501b.get(str);
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            return gestureDetectorOnGestureListenerC3337ci;
        }
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 == null) {
            return null;
        }
        tn.p.j("Ti", "TAG");
        ((C3605n9) interfaceC3580m9).b("Ti", "View with ID: " + str + " not found.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.inmobi.media.Fn] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View, com.inmobi.media.ci] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        ?? viewableAd;
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ti", "Add renderViewSibling as friendlyView for omsdkTracking  " + this);
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3337ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            gestureDetectorOnGestureListenerC3337ci = viewGroup;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        if (gestureDetectorOnGestureListenerC3337ciA == null || (viewableAd = gestureDetectorOnGestureListenerC3337ciA.getViewableAd()) == 0) {
            return;
        }
        viewableAd.a(gestureDetectorOnGestureListenerC3337ci, FriendlyObstructionPurpose.OTHER);
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2, String str) throws JSONException {
        ViewParent parent = gestureDetectorOnGestureListenerC3337ci.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = gestureDetectorOnGestureListenerC3337ci;
        }
        ViewParent parent2 = viewGroup.getParent();
        ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
        if (viewGroup2 == null) {
            gestureDetectorOnGestureListenerC3337ci2.a("showWebView", AbstractC3763ti.a(str, 307));
            return;
        }
        if (viewGroup2.indexOfChild(viewGroup) != -1) {
            viewGroup2.bringChildToFront(viewGroup);
            InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
            if (interfaceC3580m9 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m9).a("Ti", "Sibling view brought to front: " + gestureDetectorOnGestureListenerC3337ci);
            }
        } else {
            InterfaceC3580m9 interfaceC3580m92 = this.f26377b;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m92).b("Ti", "Sibling view not found in parent: " + gestureDetectorOnGestureListenerC3337ci);
            }
        }
        gestureDetectorOnGestureListenerC3337ci2.c(gestureDetectorOnGestureListenerC3337ci2, str);
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, C3539ki c3539ki) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ti", "setUpLayoutForAd " + this);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a();
        Context containerContext = gestureDetectorOnGestureListenerC3337ciA != null ? gestureDetectorOnGestureListenerC3337ciA.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26377b;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m92).b("Ti", "Context is null, cannot initialize webview.");
            }
            containerContext = null;
        }
        if (containerContext == null) {
            return;
        }
        if (!(containerContext instanceof InMobiAdActivity)) {
            InterfaceC3580m9 interfaceC3580m93 = this.f26377b;
            if (interfaceC3580m93 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m93).b("Ti", "Context is not an instance of InMobiAdActivity.");
            }
            a(gestureDetectorOnGestureListenerC3337ci, c3539ki.getRoute().f25331b, "loadWebView");
            return;
        }
        c3539ki.setFullScreenActivityContext((Activity) containerContext);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        InterfaceC3580m9 interfaceC3580m94 = this.f26377b;
        if (interfaceC3580m94 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m94).a("Ti", "target View's Viewable ad - " + c3539ki.getViewableAd());
        }
        View viewC = c3539ki.getViewableAd().c();
        ViewGroup viewGroup = (ViewGroup) ((InMobiAdActivity) containerContext).findViewById(65534);
        Context context = viewGroup.getContext();
        tn.p.j(context, "getContext(...)");
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        if ((viewC != null ? viewC.getParent() : null) != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewC);
            }
        }
        relativeLayout.addView(viewC, layoutParams2);
        viewGroup.addView(relativeLayout, layoutParams);
        c3539ki.a(relativeLayout);
        InterfaceC3580m9 interfaceC3580m95 = this.f26377b;
        if (interfaceC3580m95 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m95).a("Ti", "Target View added - the inflatedView is - " + viewC);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, String str, String str2) {
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).b("Ti", "Cannot perform operations on default WebView with ID: " + str);
        }
        gestureDetectorOnGestureListenerC3337ci.a(str2, AbstractC3763ti.a(str, 303));
    }

    public final void a(String str, String str2) throws JSONException {
        tn.p.k(str, "sourceId");
        tn.p.k(str2, "targetId");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a(str);
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA2 = a(str2);
        if (gestureDetectorOnGestureListenerC3337ciA2 == null) {
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            gestureDetectorOnGestureListenerC3337ciA.a("destroyWebView", jSONObjectA);
            return;
        }
        if (tn.p.f(str2, "default")) {
            a(gestureDetectorOnGestureListenerC3337ciA, str2, "destroyWebView");
            return;
        }
        Integer numA = gestureDetectorOnGestureListenerC3337ciA2.getWvStateMachine().a(8);
        if (numA != null) {
            int iIntValue = numA.intValue();
            bn.g gVar2 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC3337ciA.a("destroyWebView", jSONObjectA2);
            return;
        }
        gestureDetectorOnGestureListenerC3337ciA2.b();
        gestureDetectorOnGestureListenerC3337ciA.a(gestureDetectorOnGestureListenerC3337ciA, str2);
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ti", "WebView with ID: " + str2 + " removed from parent.");
        }
    }

    public final void a(String str, String str2, String str3) throws JSONException {
        Context context;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA;
        tn.p.k(str, "sourceId");
        tn.p.k(str2, "targetId");
        tn.p.k(str3, CreativeInfo.f52467al);
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ti", "loadWebView " + this);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA2 = a();
        Context containerContext = gestureDetectorOnGestureListenerC3337ciA2 != null ? gestureDetectorOnGestureListenerC3337ciA2.getContainerContext() : null;
        if (containerContext == null) {
            InterfaceC3580m9 interfaceC3580m92 = this.f26377b;
            if (interfaceC3580m92 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m92).b("Ti", "Context is null, cannot initialize webview.");
            }
            context = null;
        } else {
            context = containerContext;
        }
        if (context == null || (gestureDetectorOnGestureListenerC3337ciA = a(str)) == null) {
            return;
        }
        if (tn.p.f(str2, "default")) {
            a(gestureDetectorOnGestureListenerC3337ciA, str2, "loadWebView");
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA3 = a();
        if (gestureDetectorOnGestureListenerC3337ciA3 == null) {
            gestureDetectorOnGestureListenerC3337ciA.a("loadWebView", AbstractC3763ti.a(str2, 304));
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA4 = a(str2);
        if (gestureDetectorOnGestureListenerC3337ciA4 == null) {
            C3539ki c3539kiA = a(gestureDetectorOnGestureListenerC3337ciA3, str2, this, gestureDetectorOnGestureListenerC3337ciA, context, SystemClock.elapsedRealtime());
            if (c3539kiA != null) {
                c3539kiA.h(str3);
                return;
            }
            return;
        }
        int i10 = gestureDetectorOnGestureListenerC3337ciA4.getWvStateMachine().f27244b;
        bn.g gVar = AbstractC3763ti.f28193a;
        JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        gestureDetectorOnGestureListenerC3337ciA.a("loadWebView", jSONObjectA);
    }

    public final void b(String str, String str2) throws JSONException {
        Object next;
        Integer numA;
        tn.p.k(str, "sourceId");
        tn.p.k(str2, "targetId");
        InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
        if (interfaceC3580m9 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m9).a("Ti", "showWebView " + this);
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a(str);
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA2 = a(str2);
        if (gestureDetectorOnGestureListenerC3337ciA2 == null) {
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            gestureDetectorOnGestureListenerC3337ciA.a("showWebView", jSONObjectA);
            return;
        }
        if (tn.p.f(str2, "default")) {
            a(gestureDetectorOnGestureListenerC3337ciA, str2, "showWebView");
            return;
        }
        if (!(gestureDetectorOnGestureListenerC3337ciA2 instanceof C3539ki)) {
            bn.g gVar2 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, 305);
            gestureDetectorOnGestureListenerC3337ciA.a("showWebView", jSONObjectA2);
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA3 = a();
        if (gestureDetectorOnGestureListenerC3337ciA3 != null && !gestureDetectorOnGestureListenerC3337ciA3.isAttachedToWindow()) {
            bn.g gVar3 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA3 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA3.put(IronSourceConstants.EVENTS_ERROR_CODE, 305);
            gestureDetectorOnGestureListenerC3337ciA.a("showWebView", jSONObjectA3);
            return;
        }
        Integer numA2 = gestureDetectorOnGestureListenerC3337ciA2.getWvStateMachine().a(5);
        if (numA2 != null) {
            int iIntValue = numA2.intValue();
            bn.g gVar4 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA4 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA4.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue);
            gestureDetectorOnGestureListenerC3337ciA.a("showWebView", jSONObjectA4);
            return;
        }
        Iterator it = kotlin.collections.a.z(this.f26376a.f27501b).values().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) next;
            if (gestureDetectorOnGestureListenerC3337ci.getWvStateMachine().f27244b == 105 && !tn.p.f(gestureDetectorOnGestureListenerC3337ci, gestureDetectorOnGestureListenerC3337ciA2) && !tn.p.f(gestureDetectorOnGestureListenerC3337ci.getRoute().f25331b, "default")) {
                break;
            }
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = (GestureDetectorOnGestureListenerC3337ci) next;
        if (gestureDetectorOnGestureListenerC3337ci2 != null && (numA = gestureDetectorOnGestureListenerC3337ci2.getWvStateMachine().a(7)) != null) {
            int iIntValue2 = numA.intValue();
            bn.g gVar5 = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA5 = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA5.put(IronSourceConstants.EVENTS_ERROR_CODE, iIntValue2);
            gestureDetectorOnGestureListenerC3337ciA.a("showWebView", jSONObjectA5);
        }
        C3539ki c3539ki = (C3539ki) gestureDetectorOnGestureListenerC3337ciA2;
        if (c3539ki.isAttachedToWindow()) {
            a(gestureDetectorOnGestureListenerC3337ciA2, gestureDetectorOnGestureListenerC3337ciA, str2);
            return;
        }
        a(gestureDetectorOnGestureListenerC3337ciA, c3539ki);
        a(gestureDetectorOnGestureListenerC3337ciA2);
        Fn viewableAd = c3539ki.getViewableAd();
        Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC3337ciA2.getFriendlyViews();
        if (friendlyViews == null) {
            friendlyViews = new HashMap<>();
        }
        viewableAd.a(friendlyViews);
    }

    public final void b(String str, String str2, String str3) throws JSONException {
        tn.p.k(str, "sourceId");
        tn.p.k(str2, "targetId");
        tn.p.k(str3, "message");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA = a(str);
        if (gestureDetectorOnGestureListenerC3337ciA == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciA2 = a(str2);
        if (gestureDetectorOnGestureListenerC3337ciA2 == null) {
            bn.g gVar = AbstractC3763ti.f28193a;
            JSONObject jSONObjectA = Si.a(str2, "targetViewId", "id", str2);
            jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, 304);
            gestureDetectorOnGestureListenerC3337ciA.a(C4089j8.f32053j, jSONObjectA);
            return;
        }
        int i10 = gestureDetectorOnGestureListenerC3337ciA2.getWvStateMachine().f27244b;
        if (tn.p.f(gestureDetectorOnGestureListenerC3337ciA2.getRoute().f25331b, "default") || !cn.w.p(101, 104, 107).contains(Integer.valueOf(i10))) {
            InterfaceC3580m9 interfaceC3580m9 = this.f26377b;
            if (interfaceC3580m9 != null) {
                tn.p.j("Ti", "TAG");
                ((C3605n9) interfaceC3580m9).a("Ti", "Sending message to WebView ID: " + str2);
            }
            gestureDetectorOnGestureListenerC3337ciA2.g(str3);
            return;
        }
        InterfaceC3580m9 interfaceC3580m92 = this.f26377b;
        if (interfaceC3580m92 != null) {
            tn.p.j("Ti", "TAG");
            ((C3605n9) interfaceC3580m92).b("Ti", "WebView is not in state to receive messages: " + str2);
        }
        int i11 = gestureDetectorOnGestureListenerC3337ciA2.getWvStateMachine().f27244b;
        bn.g gVar2 = AbstractC3763ti.f28193a;
        JSONObject jSONObjectA2 = Si.a(str2, "targetViewId", "id", str2);
        jSONObjectA2.put(IronSourceConstants.EVENTS_ERROR_CODE, i11);
        gestureDetectorOnGestureListenerC3337ciA.a(C4089j8.f32053j, jSONObjectA2);
    }
}
