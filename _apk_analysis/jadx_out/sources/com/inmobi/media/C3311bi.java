package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.inmobi.media.bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3311bi extends uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3337ci f26871a;

    public C3311bi(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        this.f26871a = gestureDetectorOnGestureListenerC3337ci;
    }

    @Override // com.inmobi.media.uo
    public final void a(Df df2, wo woVar) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci;
        tn.p.k(df2, "orientation");
        tn.p.k(woVar, "finalInsets");
        this.f26871a.a(df2, woVar);
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f26871a;
        gestureDetectorOnGestureListenerC3337ci2.getClass();
        woVar.getClass();
        tn.p.k(df2, "orientation");
        vo voVar = (vo) woVar.f28471a.get(df2);
        if (voVar == null) {
            return;
        }
        if (voVar.f28394b == 0 && voVar.f28395c == 0) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ci2.setCloseAssetArea(voVar);
        bn.g gVar = AbstractC3763ti.f28193a;
        tn.p.k(gestureDetectorOnGestureListenerC3337ci2, "<this>");
        if (tn.p.f(gestureDetectorOnGestureListenerC3337ci2.getRoute().f25331b, "default")) {
            gestureDetectorOnGestureListenerC3337ci = gestureDetectorOnGestureListenerC3337ci2;
        } else {
            ko webViewFactory = gestureDetectorOnGestureListenerC3337ci2.getWebViewFactory();
            webViewFactory.getClass();
            tn.p.k("default", "id");
            gestureDetectorOnGestureListenerC3337ci = (GestureDetectorOnGestureListenerC3337ci) webViewFactory.f27501b.get("default");
        }
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            tn.p.k(gestureDetectorOnGestureListenerC3337ci, "renderView");
            vo voVar2 = gestureDetectorOnGestureListenerC3337ci2.f26949d1;
            tn.p.k(voVar2, "insets");
            View viewFindViewById = gestureDetectorOnGestureListenerC3337ci.getRootView().findViewById(65531);
            C3501j5 c3501j5 = viewFindViewById instanceof C3501j5 ? (C3501j5) viewFindViewById : null;
            if (c3501j5 == null) {
                return;
            }
            View viewFindViewById2 = gestureDetectorOnGestureListenerC3337ci.getRootView().findViewById(65531);
            C3501j5 c3501j52 = viewFindViewById2 instanceof C3501j5 ? (C3501j5) viewFindViewById2 : null;
            if (c3501j52 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = c3501j5.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = c3501j52.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 == null) {
                return;
            }
            layoutParams2.setMargins(0, voVar2.f28394b, voVar2.f28395c, 0);
            layoutParams4.setMargins(0, voVar2.f28394b, voVar2.f28395c, 0);
        }
    }

    @Override // com.inmobi.media.uo
    public final boolean a() {
        return !tn.p.f("Hidden", this.f26871a.getViewState());
    }
}
