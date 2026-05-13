package com.ironsource;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.W2;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class W2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4171ng f30619a;

    public static final class a implements InterfaceC4171ng {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View view) {
            tn.p.k(view, "$this_apply");
            view.setEnabled(false);
            view.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W0 w02, long j10) {
            tn.p.k(w02, "$adTools");
            w02.e().h().a(false, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(W2 w22, View view, View view2) {
            tn.p.k(w22, "this$0");
            tn.p.k(view2, "$this_apply");
            w22.removeView(view);
            view2.setEnabled(true);
            view2.setClickable(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(W0 w02, long j10) {
            tn.p.k(w02, "$adTools");
            w02.e().h().a(true, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final W0 w02, final long j10) {
            tn.p.k(w02, "$adTools");
            w02.d(new Runnable() { // from class: com.ironsource.uj
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.d(w02, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(W0 w02, long j10) {
            tn.p.k(w02, "$adTools");
            w02.e().h().a(j10);
        }

        @Override // com.ironsource.InterfaceC4171ng
        public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull final W0 w02) {
            tn.p.k(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            tn.p.k(layoutParams, "layoutParams");
            tn.p.k(w02, "adTools");
            final View childAt = W2.this.getChildAt(0);
            final long jB = Lb.f29764s.d().g().b();
            if (jB <= 0) {
                W2.this.removeView(childAt);
                W2.this.addView(view, layoutParams);
                w02.d(new Runnable() { // from class: com.ironsource.pj
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(w02, jB);
                    }
                });
                return;
            }
            w02.d(new Runnable() { // from class: com.ironsource.qj
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.b(w02, jB);
                }
            });
            view.setAlpha(0.0f);
            W2.this.addView(view, layoutParams);
            if (childAt != null) {
                final W2 w22 = W2.this;
                childAt.animate().alpha(0.0f).setDuration(jB).withStartAction(new Runnable() { // from class: com.ironsource.rj
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.sj
                    @Override // java.lang.Runnable
                    public final void run() {
                        W2.a.a(w22, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(jB).withEndAction(new Runnable() { // from class: com.ironsource.tj
                @Override // java.lang.Runnable
                public final void run() {
                    W2.a.c(w02, jB);
                }
            }).start();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W2(@NotNull Context context) {
        super(context);
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        this.f30619a = new a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f53132f, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final InterfaceC4171ng getViewBinder() {
        return this.f30619a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
