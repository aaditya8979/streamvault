package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import chuangyuan.ycj.videolibrary.R$styleable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ExoVideoAnim extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<b> f6630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f6631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f6632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RectF f6633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6636h;

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6640d;

        public b() {
        }
    }

    public ExoVideoAnim(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6631c = new int[]{-14848, -15415176, -16590337};
        this.f6632d = new Paint();
        this.f6633e = new RectF();
        this.f6636h = 2;
        v.b bVar = new v.b(getContext());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.exoVideoAnim);
        this.f6634f = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.exoVideoAnim_circleRadius, bVar.a());
        this.f6635g = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.exoVideoAnim_circleSpacing, bVar.b());
        int i10 = (int) ((((double) this.f6634f) * 2.0d) / ((double) ((int) (((((double) (typedArrayObtainStyledAttributes.getInt(R$styleable.exoVideoAnim_cycle, 2000) / 2)) * 1.0d) / 1000.0d) * 83.0d))));
        this.f6636h = i10;
        this.f6636h = i10 <= 0 ? 1 : i10;
        a();
    }

    private int getDefaultHeight() {
        return this.f6634f * 2;
    }

    private int getDefaultWidth() {
        return (this.f6634f * 2 * this.f6630b.size()) + ((this.f6630b.size() - 1) * this.f6635g);
    }

    public final void a() {
        this.f6630b = new ArrayList();
        int i10 = this.f6634f * 2;
        b bVar = new b();
        bVar.f6637a = i10;
        bVar.f6638b = i10;
        bVar.f6639c = bVar.f6638b;
        bVar.f6640d = -1;
        this.f6630b.add(bVar);
        b bVar2 = new b();
        bVar2.f6637a = i10;
        double d10 = i10;
        bVar2.f6638b = (int) (0.75d * d10);
        bVar2.f6639c = bVar2.f6638b;
        bVar2.f6640d = 1;
        this.f6630b.add(bVar2);
        b bVar3 = new b();
        bVar3.f6637a = i10;
        bVar3.f6638b = (int) (d10 * 0.5d);
        bVar3.f6639c = bVar3.f6638b;
        bVar3.f6640d = 1;
        this.f6630b.add(bVar3);
    }

    public final void b(Canvas canvas) {
        this.f6632d.setColor(this.f6631c[0]);
        b bVar = this.f6630b.get(0);
        bVar.f6639c += bVar.f6640d * this.f6636h;
        if (bVar.f6639c >= bVar.f6637a) {
            bVar.f6640d = -1;
            bVar.f6639c = bVar.f6637a;
        }
        if (bVar.f6639c <= 0) {
            bVar.f6640d = 1;
            bVar.f6639c = 0;
        }
        int width = ((getWidth() / 2) - ((((this.f6634f * 2) * this.f6630b.size()) + ((this.f6630b.size() - 1) * this.f6635g)) / 2)) + this.f6634f;
        int height = getHeight() / 2;
        this.f6633e.left = width - (bVar.f6639c / 2);
        this.f6633e.top = height - (bVar.f6639c / 2);
        RectF rectF = this.f6633e;
        rectF.right = rectF.left + bVar.f6639c;
        RectF rectF2 = this.f6633e;
        rectF2.bottom = rectF2.top + bVar.f6639c;
        canvas.drawArc(this.f6633e, 0.0f, 360.0f, false, this.f6632d);
    }

    public final void c(Canvas canvas) {
        this.f6632d.setColor(this.f6631c[1]);
        b bVar = this.f6630b.get(1);
        b bVar2 = this.f6630b.get(0);
        if (bVar2.f6639c == bVar2.f6638b) {
            bVar.f6639c = bVar.f6638b;
        } else {
            bVar.f6639c += bVar.f6640d * this.f6636h;
            if (bVar.f6639c >= bVar.f6637a) {
                bVar.f6640d = -1;
                bVar.f6639c = bVar.f6637a;
            }
            if (bVar.f6639c <= 0) {
                bVar.f6640d = 1;
                bVar.f6639c = 0;
            }
        }
        int width = ((getWidth() / 2) - ((((this.f6634f * 2) * this.f6630b.size()) + ((this.f6630b.size() - 1) * this.f6635g)) / 2)) + ((bVar.f6637a + this.f6635g) * 1) + this.f6634f;
        int height = getHeight() / 2;
        this.f6633e.left = width - (bVar.f6639c / 2);
        this.f6633e.top = height - (bVar.f6639c / 2);
        RectF rectF = this.f6633e;
        rectF.right = rectF.left + bVar.f6639c;
        RectF rectF2 = this.f6633e;
        rectF2.bottom = rectF2.top + bVar.f6639c;
        canvas.drawArc(this.f6633e, 0.0f, 360.0f, false, this.f6632d);
    }

    public final void d(Canvas canvas) {
        this.f6632d.setColor(this.f6631c[2]);
        b bVar = this.f6630b.get(2);
        b bVar2 = this.f6630b.get(0);
        if (bVar2.f6639c == bVar2.f6638b) {
            bVar.f6639c = bVar.f6638b;
        } else {
            bVar.f6639c += bVar.f6640d * this.f6636h;
            if (bVar.f6639c >= bVar.f6637a) {
                bVar.f6640d = -1;
                bVar.f6639c = bVar.f6637a;
            }
            if (bVar.f6639c <= 0) {
                bVar.f6640d = 1;
                bVar.f6639c = 0;
            }
        }
        int width = ((getWidth() / 2) - ((((this.f6634f * 2) * this.f6630b.size()) + ((this.f6630b.size() - 1) * this.f6635g)) / 2)) + ((bVar.f6637a + this.f6635g) * 2) + this.f6634f;
        int height = getHeight() / 2;
        this.f6633e.left = width - (bVar.f6639c / 2);
        this.f6633e.top = height - (bVar.f6639c / 2);
        RectF rectF = this.f6633e;
        rectF.right = rectF.left + bVar.f6639c;
        RectF rectF2 = this.f6633e;
        rectF2.bottom = rectF2.top + bVar.f6639c;
        canvas.drawArc(this.f6633e, 0.0f, 360.0f, false, this.f6632d);
    }

    public final int e(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int defaultHeight = getDefaultHeight();
        return mode == Integer.MIN_VALUE ? Math.min(defaultHeight, size) : defaultHeight;
    }

    public final int f(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int defaultWidth = getDefaultWidth();
        return mode == Integer.MIN_VALUE ? Math.min(defaultWidth, size) : defaultWidth;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6632d.setAntiAlias(true);
        this.f6632d.setStyle(Paint.Style.FILL);
        b(canvas);
        c(canvas);
        d(canvas);
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(f(i10), e(i11));
    }

    public void setColors(@ColorRes int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int[] iArr2 = this.f6631c;
            if (i10 >= iArr2.length) {
                return;
            }
            iArr2[i10] = iArr[i10];
        }
    }
}
