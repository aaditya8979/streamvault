package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.internal.i;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.model.AppearanceParams;
import io.bidmachine.rendering.model.FontStyleType;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public class b extends View implements io.bidmachine.rendering.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f70624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f70625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f70626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f70627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f70628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f70629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f70630g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f70631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Runnable f70632i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f70633j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f70634k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f70635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f70636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f70637n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte f70638o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f70639p;

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.view.b$b, reason: collision with other inner class name */
    public class C0840b implements n {
        private C0840b() {
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public void onRun() {
            boolean z10 = !b.this.c() || b.this.isShown();
            c cVar = b.this.f70629f;
            if (z10) {
                cVar.j();
            } else {
                cVar.i();
            }
            long jB = b.this.f70629f.b();
            long jC = b.this.f70629f.c();
            if (z10) {
                b.this.a((jC * 100.0f) / jB, (int) Math.ceil((jB - jC) / 1000.0d));
            }
            if (b.this.f70629f.e()) {
                b.this.d();
            } else {
                UiUtils.onUiThread(this, 16L);
            }
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f70641a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f70642b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f70643c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f70644d = 0;

        public long a() {
            return SystemClock.elapsedRealtime();
        }

        public void a(long j10) {
            this.f70642b = j10;
            g();
        }

        public long b() {
            return this.f70642b;
        }

        public long c() {
            return this.f70643c;
        }

        public boolean d() {
            return this.f70641a;
        }

        public boolean e() {
            return this.f70643c >= this.f70642b;
        }

        public void f() {
            this.f70641a = false;
        }

        public void g() {
            this.f70643c = 0L;
            this.f70644d = a();
        }

        public void h() {
            this.f70641a = true;
            this.f70644d = a();
        }

        public void i() {
            this.f70644d = a();
        }

        public void j() {
            if (d()) {
                long jA = a();
                this.f70643c = Math.min(this.f70642b, this.f70643c + (jA - this.f70644d));
                this.f70644d = jA;
            }
        }
    }

    public interface d {
        void a();
    }

    public b(Context context) {
        super(context);
        this.f70627d = new RectF();
        this.f70628e = new RectF();
        this.f70629f = new c();
        this.f70630g = new AtomicBoolean(false);
        this.f70636m = 100.0f;
        this.f70638o = (byte) -1;
        this.f70639p = false;
        Paint paint = new Paint(1);
        this.f70624a = paint;
        paint.setColor(i.f70456d);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.f70625b = paint2;
        int i10 = i.f70455c;
        paint2.setColor(i10);
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.f70626c = paint3;
        paint3.setColor(i10);
        paint3.setStyle(style);
        paint3.setAntiAlias(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        a(context);
    }

    private void a(Context context) {
        setLayerType(1, null);
        this.f70633j = UiUtils.dpToPx(context, 54.0f);
        this.f70634k = UiUtils.dpToPx(context, 54.0f);
        float fDpToPx = UiUtils.dpToPx(context, 3.0f);
        this.f70635l = fDpToPx;
        this.f70625b.setStrokeWidth(fDpToPx);
        a();
    }

    private void a(Canvas canvas) {
        float f10 = this.f70638o * (360.0f - ((this.f70636m * 360.0f) * 0.01f));
        canvas.drawArc(this.f70627d, 0.0f, 360.0f, false, this.f70624a);
        canvas.drawArc(this.f70628e, 270.0f, f10, false, this.f70625b);
    }

    private void b(Canvas canvas) {
        canvas.drawText(String.valueOf(this.f70637n), this.f70633j, this.f70634k - ((this.f70626c.descent() + this.f70626c.ascent()) / 2.0f), this.f70626c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        d dVar;
        if (this.f70630g.compareAndSet(false, true) && (dVar = this.f70631h) != null) {
            dVar.a();
        }
    }

    public float a(RectF rectF, boolean z10) {
        float fWidth = rectF.width();
        if (z10) {
            fWidth -= this.f70635l * 2.0f;
        }
        return fWidth * 0.70710677f * 0.9f;
    }

    public void a() {
        float width = (getWidth() - r0) / 2.0f;
        float height = (getHeight() - r0) / 2.0f;
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f70627d.set(width, height, width + fMin, fMin + height);
        this.f70633j = this.f70627d.centerX();
        this.f70634k = this.f70627d.centerY();
        float f10 = this.f70635l / 2.0f;
        RectF rectF = this.f70628e;
        RectF rectF2 = this.f70627d;
        rectF.set(rectF2.left + f10, rectF2.top + f10, rectF2.right - f10, rectF2.bottom - f10);
        this.f70626c.setTextSize(a(this.f70627d, true));
    }

    public void a(float f10, int i10) {
        if (f10 >= 0.0f || f10 <= 100.0f) {
            this.f70636m = f10;
        }
        this.f70637n = i10;
        postInvalidate();
    }

    @Override // io.bidmachine.rendering.internal.e
    public void a(AppearanceParams appearanceParams) {
        FontStyleType fontStyleType = appearanceParams.getFontStyleType();
        if (fontStyleType != null) {
            this.f70626c.setTypeface(Typeface.create(Typeface.DEFAULT, fontStyleType.getTypeface()));
        }
        Integer fillColor = appearanceParams.getFillColor();
        if (fillColor != null) {
            this.f70624a.setColor(fillColor.intValue());
        }
        Integer strokeWidthPx = appearanceParams.getStrokeWidthPx(getContext());
        if (strokeWidthPx != null) {
            float fIntValue = strokeWidthPx.intValue();
            this.f70635l = fIntValue;
            this.f70625b.setStrokeWidth(fIntValue);
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.f70625b.setColor(strokeColor.intValue());
        }
        a();
    }

    public void b() {
        g();
        this.f70631h = null;
    }

    public boolean c() {
        return this.f70639p;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public void e() {
        g();
        if (this.f70630g.get()) {
            return;
        }
        this.f70629f.h();
        C0840b c0840b = new C0840b();
        this.f70632i = c0840b;
        UiUtils.onUiThread(c0840b, 16L);
    }

    public void f() {
        this.f70630g.set(false);
        this.f70629f.g();
        e();
    }

    public void g() {
        this.f70629f.f();
        Runnable runnable = this.f70632i;
        if (runnable == null) {
            return;
        }
        UiUtils.cancelOnUiThread(runnable);
        this.f70632i = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || this.f70637n == 0) {
            return;
        }
        a(canvas);
        b(canvas);
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
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public void setClockwise(boolean z10) {
        this.f70638o = z10 ? (byte) -1 : (byte) 1;
    }

    public void setDuration(long j10) {
        this.f70629f.a(j10);
    }

    public void setListener(@Nullable d dVar) {
        this.f70631h = dVar;
    }

    public void setOnlyVisibleWork(boolean z10) {
        this.f70639p = z10;
    }
}
