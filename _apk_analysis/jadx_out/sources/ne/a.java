package ne;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ArrowDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class a extends me.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75861c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75862d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f75863e = new Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.f75861c != iWidth || this.f75862d != iHeight) {
            this.f75863e.reset();
            float f10 = (iWidth * 30) / 225;
            float f11 = f10 * 0.70710677f;
            float f12 = f10 / 0.70710677f;
            float f13 = iWidth;
            float f14 = f13 / 2.0f;
            float f15 = iHeight;
            this.f75863e.moveTo(f14, f15);
            float f16 = f15 / 2.0f;
            this.f75863e.lineTo(0.0f, f16);
            float f17 = f16 - f11;
            this.f75863e.lineTo(f11, f17);
            float f18 = f10 / 2.0f;
            float f19 = f14 - f18;
            float f20 = (f15 - f12) - f18;
            this.f75863e.lineTo(f19, f20);
            this.f75863e.lineTo(f19, 0.0f);
            float f21 = f14 + f18;
            this.f75863e.lineTo(f21, 0.0f);
            this.f75863e.lineTo(f21, f20);
            this.f75863e.lineTo(f13 - f11, f17);
            this.f75863e.lineTo(f13, f16);
            this.f75863e.close();
            this.f75861c = iWidth;
            this.f75862d = iHeight;
        }
        canvas.drawPath(this.f75863e, this.f74119b);
    }
}
