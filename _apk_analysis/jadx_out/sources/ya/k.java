package ya;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: compiled from: PhotoViewAttacher.java */
/* JADX INFO: loaded from: classes10.dex */
public class k implements View.OnTouchListener, View.OnLayoutChangeListener {
    public float C;
    public final ya.c F;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImageView f87489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public GestureDetector f87490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ya.b f87491k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ya.d f87497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ya.f f87498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ya.e f87499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public j f87500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View.OnClickListener f87501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View.OnLongClickListener f87502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g f87503w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f87504x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f87505y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public f f87506z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Interpolator f87482b = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87483c = 200;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f87484d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f87485e = 1.75f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f87486f = 3.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f87487g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f87488h = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f87492l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f87493m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Matrix f87494n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RectF f87495o = new RectF();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f87496p = new float[9];
    public int A = 2;
    public int B = 2;
    public boolean D = true;
    public ImageView.ScaleType E = ImageView.ScaleType.FIT_CENTER;

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class a implements ya.c {
        public a() {
        }

        @Override // ya.c
        public void a(float f10, float f11) {
            if (k.this.f87491k.e()) {
                return;
            }
            if (k.this.f87505y != null) {
                k.this.f87505y.a(f10, f11);
            }
            k.this.f87494n.postTranslate(f10, f11);
            k.this.z();
            ViewParent parent = k.this.f87489i.getParent();
            if (!k.this.f87487g || k.this.f87491k.e() || k.this.f87488h) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((k.this.A == 2 || ((k.this.A == 0 && f10 >= 1.0f) || ((k.this.A == 1 && f10 <= -1.0f) || ((k.this.B == 0 && f11 >= 1.0f) || (k.this.B == 1 && f11 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // ya.c
        public void b(float f10, float f11, float f12, float f13, float f14) {
            if (k.this.K() < k.this.f87486f || f10 < 1.0f) {
                if (k.this.f87503w != null) {
                    k.this.f87503w.a(f10, f11, f12);
                }
                k.this.f87494n.postScale(f10, f10, f11, f12);
                k.this.f87494n.postTranslate(f13, f14);
                k.this.z();
            }
        }

        @Override // ya.c
        public void c(float f10, float f11, float f12, float f13) {
            k kVar = k.this;
            kVar.f87506z = kVar.new f(kVar.f87489i.getContext());
            f fVar = k.this.f87506z;
            k kVar2 = k.this;
            int iG = kVar2.G(kVar2.f87489i);
            k kVar3 = k.this;
            fVar.b(iG, kVar3.F(kVar3.f87489i), (int) f12, (int) f13);
            k.this.f87489i.post(k.this.f87506z);
        }

        @Override // ya.c
        public void d(float f10, float f11, float f12) {
            b(f10, f11, f12, 0.0f, 0.0f);
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (k.this.f87504x == null || k.this.K() > 1.0f || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1) {
                return false;
            }
            return k.this.f87504x.onFling(motionEvent, motionEvent2, f10, f11);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (k.this.f87502v != null) {
                k.this.f87502v.onLongClick(k.this.f87489i);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float fK = k.this.K();
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                if (fK < k.this.I()) {
                    k kVar = k.this;
                    kVar.g0(kVar.I(), x10, y10, true);
                } else if (fK < k.this.I() || fK >= k.this.H()) {
                    k kVar2 = k.this;
                    kVar2.g0(kVar2.J(), x10, y10, true);
                } else {
                    k kVar3 = k.this;
                    kVar3.g0(kVar3.H(), x10, y10, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (k.this.f87501u != null) {
                k.this.f87501u.onClick(k.this.f87489i);
            }
            RectF rectFB = k.this.B();
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (k.this.f87500t != null) {
                k.this.f87500t.a(k.this.f87489i, x10, y10);
            }
            if (rectFB == null) {
                return false;
            }
            if (!rectFB.contains(x10, y10)) {
                if (k.this.f87499s == null) {
                    return false;
                }
                k.this.f87499s.a(k.this.f87489i);
                return false;
            }
            float fWidth = (x10 - rectFB.left) / rectFB.width();
            float fHeight = (y10 - rectFB.top) / rectFB.height();
            if (k.this.f87498r == null) {
                return true;
            }
            k.this.f87498r.a(k.this.f87489i, fWidth, fHeight);
            return true;
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87510a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f87510a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87510a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87510a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87510a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f87511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f87512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f87513d = System.currentTimeMillis();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f87514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f87515f;

        public e(float f10, float f11, float f12, float f13) {
            this.f87511b = f12;
            this.f87512c = f13;
            this.f87514e = f10;
            this.f87515f = f11;
        }

        public final float a() {
            return k.this.f87482b.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f87513d) * 1.0f) / k.this.f87483c));
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = a();
            float f10 = this.f87514e;
            k.this.F.d((f10 + ((this.f87515f - f10) * fA)) / k.this.K(), this.f87511b, this.f87512c);
            if (fA < 1.0f) {
                ya.a.a(k.this.f87489i, this);
            }
        }
    }

    /* JADX INFO: compiled from: PhotoViewAttacher.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OverScroller f87517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f87518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f87519d;

        public f(Context context) {
            this.f87517b = new OverScroller(context);
        }

        public void a() {
            this.f87517b.forceFinished(true);
        }

        public void b(int i10, int i11, int i12, int i13) {
            int i14;
            int iRound;
            int i15;
            int iRound2;
            RectF rectFB = k.this.B();
            if (rectFB == null) {
                return;
            }
            int iRound3 = Math.round(-rectFB.left);
            float f10 = i10;
            if (f10 < rectFB.width()) {
                iRound = Math.round(rectFB.width() - f10);
                i14 = 0;
            } else {
                i14 = iRound3;
                iRound = i14;
            }
            int iRound4 = Math.round(-rectFB.top);
            float f11 = i11;
            if (f11 < rectFB.height()) {
                iRound2 = Math.round(rectFB.height() - f11);
                i15 = 0;
            } else {
                i15 = iRound4;
                iRound2 = i15;
            }
            this.f87518c = iRound3;
            this.f87519d = iRound4;
            if (iRound3 == iRound && iRound4 == iRound2) {
                return;
            }
            this.f87517b.fling(iRound3, iRound4, i12, i13, i14, iRound, i15, iRound2, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f87517b.isFinished() && this.f87517b.computeScrollOffset()) {
                int currX = this.f87517b.getCurrX();
                int currY = this.f87517b.getCurrY();
                k.this.f87494n.postTranslate(this.f87518c - currX, this.f87519d - currY);
                k.this.z();
                this.f87518c = currX;
                this.f87519d = currY;
                ya.a.a(k.this.f87489i, this);
            }
        }
    }

    public k(ImageView imageView) {
        a aVar = new a();
        this.F = aVar;
        this.f87489i = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.C = 0.0f;
        this.f87491k = new ya.b(imageView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f87490j = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public final boolean A() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF rectFC = C(D());
        if (rectFC == null) {
            return false;
        }
        float fHeight = rectFC.height();
        float fWidth = rectFC.width();
        float F = F(this.f87489i);
        float f15 = 0.0f;
        if (fHeight <= F) {
            int i10 = d.f87510a[this.E.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (F - fHeight) / 2.0f;
                    f14 = rectFC.top;
                } else {
                    f13 = F - fHeight;
                    f14 = rectFC.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -rectFC.top;
            }
            this.B = 2;
        } else {
            float f16 = rectFC.top;
            if (f16 > 0.0f) {
                this.B = 0;
                f10 = -f16;
            } else {
                float f17 = rectFC.bottom;
                if (f17 < F) {
                    this.B = 1;
                    f10 = F - f17;
                } else {
                    this.B = -1;
                    f10 = 0.0f;
                }
            }
        }
        float fG = G(this.f87489i);
        if (fWidth <= fG) {
            int i11 = d.f87510a[this.E.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (fG - fWidth) / 2.0f;
                    f12 = rectFC.left;
                } else {
                    f11 = fG - fWidth;
                    f12 = rectFC.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -rectFC.left;
            }
            this.A = 2;
        } else {
            float f18 = rectFC.left;
            if (f18 > 0.0f) {
                this.A = 0;
                f15 = -f18;
            } else {
                float f19 = rectFC.right;
                if (f19 < fG) {
                    f15 = fG - f19;
                    this.A = 1;
                } else {
                    this.A = -1;
                }
            }
        }
        this.f87494n.postTranslate(f15, f10);
        return true;
    }

    public RectF B() {
        A();
        return C(D());
    }

    public final RectF C(Matrix matrix) {
        if (this.f87489i.getDrawable() == null) {
            return null;
        }
        this.f87495o.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f87495o);
        return this.f87495o;
    }

    public final Matrix D() {
        this.f87493m.set(this.f87492l);
        this.f87493m.postConcat(this.f87494n);
        return this.f87493m;
    }

    public Matrix E() {
        return this.f87493m;
    }

    public final int F(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int G(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float H() {
        return this.f87486f;
    }

    public float I() {
        return this.f87485e;
    }

    public float J() {
        return this.f87484d;
    }

    public float K() {
        return (float) Math.sqrt(((float) Math.pow(M(this.f87494n, 0), 2.0d)) + ((float) Math.pow(M(this.f87494n, 3), 2.0d)));
    }

    public ImageView.ScaleType L() {
        return this.E;
    }

    public final float M(Matrix matrix, int i10) {
        matrix.getValues(this.f87496p);
        return this.f87496p[i10];
    }

    public final void N() {
        this.f87494n.reset();
        d0(this.C);
        P(D());
        A();
    }

    public void O(boolean z10) {
        this.f87487g = z10;
    }

    public final void P(Matrix matrix) {
        RectF rectFC;
        this.f87489i.setImageMatrix(matrix);
        if (this.f87497q == null || (rectFC = C(matrix)) == null) {
            return;
        }
        this.f87497q.a(rectFC);
    }

    public void Q(float f10) {
        l.a(this.f87484d, this.f87485e, f10);
        this.f87486f = f10;
    }

    public void R(float f10) {
        l.a(this.f87484d, f10, this.f87486f);
        this.f87485e = f10;
    }

    public void S(float f10) {
        l.a(f10, this.f87485e, this.f87486f);
        this.f87484d = f10;
    }

    public void T(View.OnClickListener onClickListener) {
        this.f87501u = onClickListener;
    }

    public void U(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f87490j.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void V(View.OnLongClickListener onLongClickListener) {
        this.f87502v = onLongClickListener;
    }

    public void W(ya.d dVar) {
        this.f87497q = dVar;
    }

    public void X(ya.e eVar) {
        this.f87499s = eVar;
    }

    public void Y(ya.f fVar) {
        this.f87498r = fVar;
    }

    public void Z(g gVar) {
        this.f87503w = gVar;
    }

    public void a0(h hVar) {
        this.f87504x = hVar;
    }

    public void b0(i iVar) {
        this.f87505y = iVar;
    }

    public void c0(j jVar) {
        this.f87500t = jVar;
    }

    public void d0(float f10) {
        this.f87494n.postRotate(f10 % 360.0f);
        z();
    }

    public void e0(float f10) {
        this.f87494n.setRotate(f10 % 360.0f);
        z();
    }

    public void f0(float f10) {
        h0(f10, false);
    }

    public void g0(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f87484d || f10 > this.f87486f) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f87489i.post(new e(K(), f10, f11, f12));
        } else {
            this.f87494n.setScale(f10, f10, f11, f12);
            z();
        }
    }

    public void h0(float f10, boolean z10) {
        g0(f10, this.f87489i.getRight() / 2, this.f87489i.getBottom() / 2, z10);
    }

    public void i0(ImageView.ScaleType scaleType) {
        if (!l.d(scaleType) || scaleType == this.E) {
            return;
        }
        this.E = scaleType;
        update();
    }

    public void j0(int i10) {
        this.f87483c = i10;
    }

    public void k0(boolean z10) {
        this.D = z10;
        update();
    }

    public final void l0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float fG = G(this.f87489i);
        float F = F(this.f87489i);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f87492l.reset();
        float f10 = intrinsicWidth;
        float f11 = fG / f10;
        float f12 = intrinsicHeight;
        float f13 = F / f12;
        ImageView.ScaleType scaleType = this.E;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f87492l.postTranslate((fG - f10) / 2.0f, (F - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f11, f13);
            this.f87492l.postScale(fMax, fMax);
            this.f87492l.postTranslate((fG - (f10 * fMax)) / 2.0f, (F - (f12 * fMax)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f11, f13));
            this.f87492l.postScale(fMin, fMin);
            this.f87492l.postTranslate((fG - (f10 * fMin)) / 2.0f, (F - (f12 * fMin)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, fG, F);
            if (((int) this.C) % BaseTransientBottomBar.ANIMATION_FADE_DURATION != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f87510a[this.E.ordinal()];
            if (i10 == 1) {
                this.f87492l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.f87492l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.f87492l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.f87492l.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        N();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        l0(this.f87489i.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.D
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lbe
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = ya.l.c(r0)
            if (r0 == 0) goto Lbe
            int r0 = r12.getAction()
            if (r0 == 0) goto L6e
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 == r3) goto L1b
            goto L7a
        L1b:
            float r0 = r10.K()
            float r3 = r10.f87484d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L44
            android.graphics.RectF r0 = r10.B()
            if (r0 == 0) goto L7a
            ya.k$e r9 = new ya.k$e
            float r5 = r10.K()
            float r6 = r10.f87484d
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L6c
        L44:
            float r0 = r10.K()
            float r3 = r10.f87486f
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7a
            android.graphics.RectF r0 = r10.B()
            if (r0 == 0) goto L7a
            ya.k$e r9 = new ya.k$e
            float r5 = r10.K()
            float r6 = r10.f87486f
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L6c:
            r11 = r2
            goto L7b
        L6e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L77
            r11.requestDisallowInterceptTouchEvent(r2)
        L77:
            r10.y()
        L7a:
            r11 = r1
        L7b:
            ya.b r0 = r10.f87491k
            if (r0 == 0) goto Lb2
            boolean r11 = r0.e()
            ya.b r0 = r10.f87491k
            boolean r0 = r0.d()
            ya.b r3 = r10.f87491k
            boolean r3 = r3.f(r12)
            if (r11 != 0) goto L9b
            ya.b r11 = r10.f87491k
            boolean r11 = r11.e()
            if (r11 != 0) goto L9b
            r11 = r2
            goto L9c
        L9b:
            r11 = r1
        L9c:
            if (r0 != 0) goto La8
            ya.b r0 = r10.f87491k
            boolean r0 = r0.d()
            if (r0 != 0) goto La8
            r0 = r2
            goto La9
        La8:
            r0 = r1
        La9:
            if (r11 == 0) goto Lae
            if (r0 == 0) goto Lae
            r1 = r2
        Lae:
            r10.f87488h = r1
            r1 = r3
            goto Lb3
        Lb2:
            r1 = r11
        Lb3:
            android.view.GestureDetector r11 = r10.f87490j
            if (r11 == 0) goto Lbe
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lbe
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void update() {
        if (this.D) {
            l0(this.f87489i.getDrawable());
        } else {
            N();
        }
    }

    public final void y() {
        f fVar = this.f87506z;
        if (fVar != null) {
            fVar.a();
            this.f87506z = null;
        }
    }

    public final void z() {
        if (A()) {
            P(D());
        }
    }
}
