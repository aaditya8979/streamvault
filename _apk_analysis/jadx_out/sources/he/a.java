package he;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import he.b;

/* JADX INFO: compiled from: ClipHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f63486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuffXfermode f63487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuffXfermode f63488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Path f63489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f63490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f63491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f63492g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f63493h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f63494i;

    public a() {
        Paint paint = new Paint(1);
        this.f63486a = paint;
        this.f63487b = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.f63488c = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f63489d = new Path();
        this.f63490e = new Path();
        this.f63491f = new b();
        this.f63492g = true;
        paint.setAntiAlias(true);
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
    }

    public final void a(int i10, int i11) {
        this.f63490e.reset();
        this.f63490e.addRect(0.0f, 0.0f, d().getWidth() * 1.0f, d().getHeight() * 1.0f, Path.Direction.CW);
        if (i10 > 0 && i11 > 0) {
            this.f63491f.c(i10, i11);
            this.f63489d.reset();
            this.f63489d.set(this.f63491f.a());
            if (Build.VERSION.SDK_INT > 27) {
                this.f63490e.op(this.f63489d, Path.Op.DIFFERENCE);
            }
            if (ViewCompat.getElevation(d()) > 0.0f) {
                try {
                    d().setOutlineProvider(d().getOutlineProvider());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        d().postInvalidate();
    }

    public boolean b() {
        return d() != null && (d() instanceof ViewGroup) && this.f63494i;
    }

    public void c(Canvas canvas) {
        if (b()) {
            if (this.f63492g) {
                a(canvas.getWidth(), canvas.getHeight());
                this.f63492g = false;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 27) {
                canvas.drawPath(this.f63489d, this.f63486a);
            } else {
                canvas.drawPath(this.f63490e, this.f63486a);
            }
            if (i10 <= 27) {
                d().setLayerType(2, null);
            }
        }
    }

    public View d() {
        return this.f63493h;
    }

    public void e(View view, boolean z10, b.a aVar) {
        this.f63493h = view;
        this.f63494i = z10;
        if (b()) {
            d().setDrawingCacheEnabled(true);
            d().setWillNotDraw(false);
            if (Build.VERSION.SDK_INT <= 27) {
                this.f63486a.setXfermode(this.f63488c);
                d().setLayerType(1, this.f63486a);
            } else {
                this.f63486a.setXfermode(this.f63487b);
                d().setLayerType(1, null);
            }
            this.f63491f.b(aVar);
            g();
        }
    }

    public void f(boolean z10, int i10, int i11, int i12, int i13) {
        if (b() && z10) {
            g();
        }
    }

    public void g() {
        this.f63492g = true;
        d().postInvalidate();
    }
}
