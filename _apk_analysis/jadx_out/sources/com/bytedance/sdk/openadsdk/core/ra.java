package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class ra extends View implements jae.ouw {
    private final Handler bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f13907cf;
    private ouw fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Runnable f13908jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private View f13909le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private boolean f13910lh;
    private boolean mwh;
    public List<View> ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f13911ra;
    private boolean ryl;
    private final AtomicBoolean tlj;

    @Nullable
    public List<View> vt;
    private boolean yu;

    public interface ouw {
        void ouw();

        void ouw(View view);

        void ouw(boolean z10);

        void vt();
    }

    public ra(View view, boolean z10) {
        super(zih.ouw());
        this.bly = new com.bytedance.sdk.component.utils.jae(jg.vt().getLooper(), this);
        this.tlj = new AtomicBoolean(true);
        this.mwh = false;
        this.f13908jg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.3
            @Override // java.lang.Runnable
            public final void run() {
                if (ra.this.fkw != null) {
                    ra.this.fkw.ouw(ra.this.f13909le);
                }
            }
        };
        this.ryl = z10;
        this.f13909le = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        this.f13907cf = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.core.ra.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (ra.this.mwh) {
                    return;
                }
                ra.this.yu();
                ra.this.lh();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lh() {
        if (!this.yu || this.f13910lh) {
            return;
        }
        this.f13910lh = true;
        this.bly.sendEmptyMessage(1);
    }

    private void ouw() {
        ouw ouwVar;
        if (!this.tlj.getAndSet(false) || (ouwVar = this.fkw) == null) {
            return;
        }
        ouwVar.ouw();
    }

    public static void ouw(List<View> list, com.bytedance.sdk.openadsdk.core.lh.lh lhVar) {
        if (com.bytedance.sdk.component.utils.mwh.ouw(list)) {
            for (View view : list) {
                if (view != null) {
                    view.setOnClickListener(lhVar);
                    view.setOnTouchListener(lhVar);
                }
            }
        }
    }

    private void ouw(final boolean z10) {
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        com.bytedance.sdk.component.utils.bly.vt().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ra.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver2;
                if (ra.this.f13907cf != null && (viewTreeObserver2 = viewTreeObserver) != null) {
                    try {
                        viewTreeObserver2.removeOnGlobalLayoutListener(ra.this.f13907cf);
                    } catch (Exception unused) {
                    }
                }
                if (z10) {
                    ra.this.f13907cf = null;
                }
            }
        });
    }

    private void vt() {
        ouw ouwVar;
        if (this.tlj.getAndSet(true) || (ouwVar = this.fkw) == null) {
            return;
        }
        ouwVar.vt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yu() {
        if (this.f13910lh) {
            this.bly.removeCallbacksAndMessages(null);
            this.f13910lh = false;
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13911ra = false;
        ouw();
        if (this.f13907cf != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f13907cf);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu();
        this.f13911ra = true;
        vt();
        ouw(false);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        ouw();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        vt();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        ouw ouwVar = this.fkw;
        if (ouwVar != null) {
            ouwVar.ouw(z10);
        }
    }

    @Override // com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what == 1 && this.f13910lh) {
            View view = this.f13909le;
            if (!(view instanceof com.bytedance.sdk.openadsdk.core.bly.qbp ? ((com.bytedance.sdk.openadsdk.core.bly.qbp) view).f13447uq.get() : true) || !fak.ouw(this.f13909le, 20, this.pno, this.ryl)) {
                this.bly.sendEmptyMessageDelayed(1, 1000L);
                return;
            }
            yu();
            this.mwh = true;
            jg.lh().post(this.f13908jg);
            ouw(true);
        }
    }

    public final void setAdType(int i10) {
        this.pno = i10;
    }

    public final void setCallback(ouw ouwVar) {
        this.fkw = ouwVar;
    }

    public final void setNeedCheckingShow(boolean z10) {
        this.yu = z10;
        if (!z10 && this.f13910lh) {
            yu();
        } else {
            if (!z10 || this.f13910lh) {
                return;
            }
            lh();
        }
    }

    public final void setRefClickViews(List<View> list) {
        this.ouw = list;
    }

    public final void setRefCreativeViews(@Nullable List<View> list) {
        this.vt = list;
    }
}
