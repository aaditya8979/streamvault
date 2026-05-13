package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.webkit.Profile;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C3702r7;
import com.inmobi.media.GestureDetectorOnGestureListenerC3337ci;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.r7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3702r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RelativeLayout f28036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Df f28037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f28040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f28041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RelativeLayout f28042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28043h;

    public C3702r7(WeakReference weakReference, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci, RelativeLayout relativeLayout) {
        tn.p.k(weakReference, "activityRef");
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "adContainer");
        tn.p.k(relativeLayout, "adBackgroundView");
        tn.p.k(relativeLayout, "adBackgroundView");
        this.f28036a = relativeLayout;
        this.f28037b = Ef.a(J5.g());
        this.f28038c = 1.0f;
        this.f28040e = weakReference;
        this.f28041f = gestureDetectorOnGestureListenerC3337ci;
        this.f28042g = relativeLayout;
    }

    public static final bn.r a(Df df2, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "it");
        gestureDetectorOnGestureListenerC3337ci.b(df2);
        return bn.r.f5635a;
    }

    public static final bn.r a(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "it");
        gestureDetectorOnGestureListenerC3337ci.r();
        return bn.r.f5635a;
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28041f;
        if (!(gestureDetectorOnGestureListenerC3337ci instanceof GestureDetectorOnGestureListenerC3337ci)) {
            gestureDetectorOnGestureListenerC3337ci = null;
        }
        if (gestureDetectorOnGestureListenerC3337ci == null) {
            return;
        }
        gestureDetectorOnGestureListenerC3337ci.getWebViewFactory().a(new sn.l() { // from class: n9.fa
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3702r7.a((GestureDetectorOnGestureListenerC3337ci) obj);
            }
        });
        if (gestureDetectorOnGestureListenerC3337ci.K) {
            return;
        }
        try {
            gestureDetectorOnGestureListenerC3337ci.m();
        } catch (Exception e10) {
            e10.getMessage();
            Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
        }
    }

    public final void a(final Df df2) {
        tn.p.k(df2, "orientation");
        tn.p.k(df2, "orientation");
        this.f28037b = df2;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28041f;
        tn.p.i(gestureDetectorOnGestureListenerC3337ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
        gestureDetectorOnGestureListenerC3337ci.getWebViewFactory().a(new sn.l() { // from class: n9.ea
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3702r7.a(df2, (GestureDetectorOnGestureListenerC3337ci) obj);
            }
        });
    }

    public final void b() {
        Activity activity = (Activity) this.f28040e.get();
        if (!(activity instanceof InMobiAdActivity) ? false : ((InMobiAdActivity) activity).f25119e) {
            try {
                B fullScreenEventsListener = this.f28041f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    Vh vh2 = (Vh) fullScreenEventsListener;
                    InterfaceC3580m9 interfaceC3580m9 = vh2.f26505a.f26958i;
                    if (interfaceC3580m9 != null) {
                        String str = GestureDetectorOnGestureListenerC3337ci.f26937g1;
                        tn.p.j(str, "access$getTAG$cp(...)");
                        ((C3605n9) interfaceC3580m9).a(str, com.ironsource.Mf.f29859m);
                    }
                    if (tn.p.f(Profile.DEFAULT_PROFILE_NAME, vh2.f26505a.getViewState())) {
                        vh2.f26505a.setAndUpdateViewState("Hidden");
                    }
                    vh2.f26505a.W();
                    bn.r rVar = bn.r.f5635a;
                }
            } catch (Exception e10) {
                e10.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
                bn.r rVar2 = bn.r.f5635a;
            }
        } else {
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci = this.f28041f;
            tn.p.i(gestureDetectorOnGestureListenerC3337ci, "null cannot be cast to non-null type com.inmobi.ads.containers.RenderView");
            gestureDetectorOnGestureListenerC3337ci.setFullScreenActivityContext(null);
            try {
                gestureDetectorOnGestureListenerC3337ci.m();
            } catch (Exception e11) {
                e11.getMessage();
                Kb.a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
            SparseArray sparseArray = InMobiAdActivity.f25113k;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci2 = this.f28041f;
            tn.p.k(gestureDetectorOnGestureListenerC3337ci2, "container");
            InMobiAdActivity.f25113k.remove(gestureDetectorOnGestureListenerC3337ci2.hashCode());
        }
        this.f28041f.b();
    }

    public final void c() {
        I5 i52;
        RelativeLayout.LayoutParams layoutParams;
        if (this.f28038c == 1.0f) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(10);
            this.f28036a.setLayoutParams(layoutParams2);
            return;
        }
        if (this.f28039d) {
            L5 l52 = J5.f25689a;
            Context context = this.f28036a.getContext();
            tn.p.j(context, "getContext(...)");
            i52 = J5.b(context);
        } else {
            L5 l53 = J5.f25689a;
            Context context2 = this.f28036a.getContext();
            tn.p.j(context2, "getContext(...)");
            tn.p.k(context2, GAMConfig.KEY_CONTEXT);
            Display displayA = J5.a(context2);
            if (displayA == null) {
                i52 = J5.f25690b;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                displayA.getMetrics(displayMetrics);
                i52 = new I5(displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
        }
        int i10 = i52.f25641a;
        Objects.toString(this.f28037b);
        if (Ef.b(this.f28037b)) {
            layoutParams = new RelativeLayout.LayoutParams(vn.c.d(i52.f25641a * this.f28038c), -1);
            layoutParams.addRule(9);
        } else {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, vn.c.d(i52.f25642b * this.f28038c));
            layoutParams3.addRule(10);
            layoutParams = layoutParams3;
        }
        this.f28036a.setLayoutParams(layoutParams);
    }

    public final void d() {
        this.f28042g.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        Fn viewableAd = this.f28041f.getViewableAd();
        View viewC = viewableAd != null ? viewableAd.c() : null;
        if (viewC != null) {
            ViewParent parent = viewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewC);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this.f28042g.getContext());
            relativeLayout.addView(viewC, new RelativeLayout.LayoutParams(-1, -1));
            this.f28042g.addView(relativeLayout, layoutParams);
            this.f28041f.a(relativeLayout);
        }
    }

    public final void e() {
        if (1 == this.f28041f.getPlacementType()) {
            try {
                HashMap map = new HashMap();
                Fn viewableAd = this.f28041f.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.a(map);
                }
            } catch (Exception e10) {
                e10.getMessage();
                B fullScreenEventsListener = this.f28041f.getFullScreenEventsListener();
                if (fullScreenEventsListener != null) {
                    ((Vh) fullScreenEventsListener).a();
                }
            }
        }
    }
}
