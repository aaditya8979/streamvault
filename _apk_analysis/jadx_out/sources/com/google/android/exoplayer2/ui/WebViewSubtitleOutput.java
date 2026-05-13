package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
final class WebViewSubtitleOutput extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CanvasSubtitleOutput f22717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebView f22718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<g7.b> f22719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.google.android.exoplayer2.ui.b f22720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f22721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f22722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f22723h;

    public class a extends WebView {
        public a(WebViewSubtitleOutput webViewSubtitleOutput, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(i10, i11);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22724a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f22724a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22724a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22724a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public WebViewSubtitleOutput(Context context) {
        this(context, null);
    }

    public WebViewSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22719d = Collections.emptyList();
        this.f22720e = com.google.android.exoplayer2.ui.b.f22729g;
        this.f22721f = 0.0533f;
        this.f22722g = 0;
        this.f22723h = 0.08f;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, attributeSet);
        this.f22717b = canvasSubtitleOutput;
        a aVar = new a(this, context, attributeSet);
        this.f22718c = aVar;
        aVar.setBackgroundColor(0);
        addView(canvasSubtitleOutput);
        addView(aVar);
    }

    public static int a(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? 0 : -100;
        }
        return -50;
    }

    public static String b(@Nullable Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i10 = b.f22724a[alignment.ordinal()];
        return i10 != 1 ? i10 != 2 ? "center" : "end" : "start";
    }

    public static String c(com.google.android.exoplayer2.ui.b bVar) {
        int i10 = bVar.f22733d;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "unset" : s7.m0.z("-0.05em -0.05em 0.15em %s", f.b(bVar.f22734e)) : s7.m0.z("0.06em 0.08em 0.15em %s", f.b(bVar.f22734e)) : s7.m0.z("0.1em 0.12em 0.15em %s", f.b(bVar.f22734e)) : s7.m0.z("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", f.b(bVar.f22734e));
    }

    public static String e(int i10) {
        return i10 != 1 ? i10 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    public static String g(g7.b bVar) {
        float f10 = bVar.f62153r;
        if (f10 == 0.0f) {
            return "";
        }
        int i10 = bVar.f62152q;
        return s7.m0.z("%s(%.2fdeg)", (i10 == 2 || i10 == 1) ? "skewY" : "skewX", Float.valueOf(f10));
    }

    public final String d(int i10, float f10) {
        float fH = k0.h(i10, f10, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fH == -3.4028235E38f ? "unset" : s7.m0.z("%.2fpx", Float.valueOf(fH / getContext().getResources().getDisplayMetrics().density));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void f() {
        this.f22718c.destroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.WebViewSubtitleOutput.h():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!z10 || this.f22719d.isEmpty()) {
            return;
        }
        h();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void update(List<g7.b> list, com.google.android.exoplayer2.ui.b bVar, float f10, int i10, float f11) {
        this.f22720e = bVar;
        this.f22721f = f10;
        this.f22722g = i10;
        this.f22723h = f11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            g7.b bVar2 = list.get(i11);
            if (bVar2.f62140e != null) {
                arrayList.add(bVar2);
            } else {
                arrayList2.add(bVar2);
            }
        }
        if (!this.f22719d.isEmpty() || !arrayList2.isEmpty()) {
            this.f22719d = arrayList2;
            h();
        }
        this.f22717b.update(arrayList, bVar, f10, i10, f11);
        invalidate();
    }
}
