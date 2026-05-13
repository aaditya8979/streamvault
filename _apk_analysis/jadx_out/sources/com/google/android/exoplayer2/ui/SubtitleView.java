package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import g7.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<g7.b> f22690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f22691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f22693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f22698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f22699k;

    public interface a {
        void update(List<g7.b> list, b bVar, float f10, int i10, float f11);
    }

    public SubtitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22690b = Collections.emptyList();
        this.f22691c = b.f22729g;
        this.f22692d = 0;
        this.f22693e = 0.0533f;
        this.f22694f = 0.08f;
        this.f22695g = true;
        this.f22696h = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.f22698j = canvasSubtitleOutput;
        this.f22699k = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.f22697i = 1;
    }

    private List<g7.b> getCuesWithStylingPreferencesApplied() {
        if (this.f22695g && this.f22696h) {
            return this.f22690b;
        }
        ArrayList arrayList = new ArrayList(this.f22690b.size());
        for (int i10 = 0; i10 < this.f22690b.size(); i10++) {
            arrayList.add(a(this.f22690b.get(i10)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (s7.m0.f79487a < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private b getUserCaptionStyle() {
        if (s7.m0.f79487a < 19 || isInEditMode()) {
            return b.f22729g;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? b.f22729g : b.a(captioningManager.getUserStyle());
    }

    private <T extends View & a> void setView(T t10) {
        removeView(this.f22699k);
        View view = this.f22699k;
        if (view instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view).f();
        }
        this.f22699k = t10;
        this.f22698j = t10;
        addView(t10);
    }

    public final g7.b a(g7.b bVar) {
        b.C0768b c0768bB = bVar.b();
        if (!this.f22695g) {
            k0.e(c0768bB);
        } else if (!this.f22696h) {
            k0.f(c0768bB);
        }
        return c0768bB.a();
    }

    public void b(float f10, boolean z10) {
        c(z10 ? 1 : 0, f10);
    }

    public final void c(int i10, float f10) {
        this.f22692d = i10;
        this.f22693e = f10;
        f();
    }

    public void d() {
        setStyle(getUserCaptionStyle());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void f() {
        this.f22698j.update(getCuesWithStylingPreferencesApplied(), this.f22691c, this.f22693e, this.f22692d, this.f22694f);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setApplyEmbeddedFontSizes(boolean z10) {
        this.f22696h = z10;
        f();
    }

    public void setApplyEmbeddedStyles(boolean z10) {
        this.f22695g = z10;
        f();
    }

    public void setBottomPaddingFraction(float f10) {
        this.f22694f = f10;
        f();
    }

    public void setCues(@Nullable List<g7.b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f22690b = list;
        f();
    }

    public void setFractionalTextSize(float f10) {
        b(f10, false);
    }

    public void setStyle(b bVar) {
        this.f22691c = bVar;
        f();
    }

    public void setViewType(int i10) {
        if (this.f22697i == i10) {
            return;
        }
        if (i10 == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.f22697i = i10;
    }
}
