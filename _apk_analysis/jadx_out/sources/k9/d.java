package k9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: EmojiconSpan.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends DynamicDrawableSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f73040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f73044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f73045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f73046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f73047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public WeakReference<Drawable> f73048j;

    public d(Context context, int i10, int i11, int i12, int i13) {
        super(i12);
        this.f73040b = context;
        this.f73041c = i10;
        this.f73042d = i11;
        this.f73044f = i11;
        this.f73045g = i11;
        this.f73043e = i13;
    }

    public final Drawable a() {
        WeakReference<Drawable> weakReference = this.f73048j;
        if (weakReference == null || weakReference.get() == null) {
            this.f73048j = new WeakReference<>(getDrawable());
        }
        return this.f73048j.get();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Drawable drawableA = a();
        canvas.save();
        int i15 = i14 - drawableA.getBounds().bottom;
        if (((DynamicDrawableSpan) this).mVerticalAlignment == 1) {
            i15 = ((i12 + ((i14 - i12) / 2)) - ((drawableA.getBounds().bottom - drawableA.getBounds().top) / 2)) - this.f73046h;
        }
        canvas.translate(f10, i15);
        drawableA.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan
    public Drawable getDrawable() {
        if (this.f73047i == null) {
            try {
                Drawable drawable = this.f73040b.getResources().getDrawable(this.f73041c);
                this.f73047i = drawable;
                int i10 = this.f73042d;
                this.f73044f = i10;
                int intrinsicWidth = (i10 * drawable.getIntrinsicWidth()) / this.f73047i.getIntrinsicHeight();
                this.f73045g = intrinsicWidth;
                int i11 = this.f73043e;
                int i12 = this.f73044f;
                int i13 = (i11 - i12) / 2;
                this.f73046h = i13;
                this.f73047i.setBounds(0, i13, intrinsicWidth, i12 + i13);
            } catch (Exception unused) {
            }
        }
        return this.f73047i;
    }
}
