package com.inmobi.media;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C3873y3;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3873y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f28564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f28566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3580m9 f28567d;

    public C3873y3(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, boolean z10, boolean z11, InterfaceC3580m9 interfaceC3580m9) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
        this.f28564a = gestureDetectorOnGestureListenerC3337ci;
        this.f28565b = z10;
        this.f28566c = z11;
        this.f28567d = interfaceC3580m9;
    }

    public static final void a(C3873y3 c3873y3, View view) {
        try {
            c3873y3.f28564a.m();
        } catch (Exception e10) {
            e10.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.inmobi.media.C3873y3 r13, android.view.ViewGroup r14, com.inmobi.media.vo r15) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3873y3.a(com.inmobi.media.y3, android.view.ViewGroup, com.inmobi.media.vo):void");
    }

    public final Pair a() {
        float f10 = J5.d().f25857c;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: n9.nc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3873y3.a(this.f75529b, view);
            }
        };
        int i10 = (int) (50 * f10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i10);
        layoutParams.addRule(11);
        return bn.h.a(onClickListener, layoutParams);
    }

    public final void a(View view) {
        Fn viewableAd;
        ko webViewFactory = this.f28564a.getWebViewFactory();
        webViewFactory.getClass();
        tn.p.k("default", "id");
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webViewFactory.f27501b.get("default");
        if (gestureDetectorOnGestureListenerC3337ci == null || (viewableAd = gestureDetectorOnGestureListenerC3337ci.getViewableAd()) == null) {
            return;
        }
        viewableAd.a(view, FriendlyObstructionPurpose.CLOSE_AD);
    }

    public final void a(final vo voVar) {
        Handler handler;
        tn.p.k(voVar, "insets");
        final ViewGroup viewGroup = (ViewGroup) this.f28564a.getRootView().findViewById(65534);
        if (viewGroup == null || (handler = viewGroup.getHandler()) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: n9.mc
            @Override // java.lang.Runnable
            public final void run() {
                C3873y3.a(this.f75509b, viewGroup, voVar);
            }
        });
    }
}
