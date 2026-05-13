package sg.bigo.ads.common.view.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import sg.bigo.ads.common.utils.k;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes12.dex */
public final class d<T extends View> implements c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f82714a = r.f82514a.a(1) / 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f82715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f82716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sg.bigo.ads.common.view.a.a f82717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f82719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f82720g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final sg.bigo.ads.common.c.a f82722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Canvas f82723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Bitmap f82724k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f82725l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f82726m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewTreeObserver.OnPreDrawListener f82721h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.common.view.a.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - d.this.f82726m) < d.f82714a) {
                return true;
            }
            d.b(d.this);
            d.this.f82726m = jElapsedRealtime;
            return true;
        }
    };

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f82727n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final WeakHashMap<TextureView, Object> f82728o = new WeakHashMap<>();

    public static class a extends BitmapDrawable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f82731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Paint f82732b;

        private a(d dVar, Bitmap bitmap) {
            super(dVar.f82715b.getResources(), bitmap);
            this.f82731a = dVar;
            this.f82732b = new Paint();
        }

        public /* synthetic */ a(d dVar, Bitmap bitmap, byte b10) {
            this(dVar, bitmap);
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            b bVar = this.f82731a.f82717d.f82702b;
            if (bVar != null) {
                this.f82732b.setColor(bVar.b());
                canvas.drawRect(getBounds(), this.f82732b);
            }
        }
    }

    public d(T t10) {
        this.f82715b = t10;
        Context context = t10.getContext();
        this.f82716c = context;
        this.f82722i = new sg.bigo.ads.common.c.b(context);
        this.f82717d = new sg.bigo.ads.common.view.a.a();
    }

    public static /* synthetic */ void b(d dVar) {
        b bVar;
        Bitmap bitmap;
        if (dVar.f82718e) {
            return;
        }
        sg.bigo.ads.common.view.a.a aVar = dVar.f82717d;
        Drawable drawable = aVar.f82225a;
        byte b10 = 0;
        if ((drawable == null || (drawable instanceof a)) && (bVar = aVar.f82702b) != null && bVar.c() > 0.0f && u.c(dVar.f82715b) && sg.bigo.ads.common.ab.a.a(dVar.f82715b, new Rect())) {
            b bVar2 = dVar.f82717d.f82702b;
            if (bVar2 == null) {
                dVar.b();
                return;
            }
            View view = dVar.f82719f;
            if (view == null || !dVar.f82715b.isShown()) {
                dVar.b();
                return;
            }
            Rect rect = new Rect();
            bVar2.a(rect);
            if (dVar.f82723j == null || dVar.f82725l == null || dVar.f82724k == null) {
                dVar.b();
                int measuredWidth = (dVar.f82715b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (dVar.f82715b.getMeasuredHeight() - rect.top) - rect.bottom;
                int iMax = Math.max(1, (int) (measuredWidth / bVar2.d()));
                int iMax2 = Math.max(1, (int) (measuredHeight / bVar2.d()));
                dVar.f82724k = sg.bigo.ads.common.utils.d.a(iMax, iMax2, Bitmap.Config.ARGB_8888);
                dVar.f82725l = new a(dVar, sg.bigo.ads.common.utils.d.a(iMax, iMax2, Bitmap.Config.ARGB_8888), b10);
                if (dVar.f82724k == null) {
                    return;
                }
                dVar.f82723j = new Canvas(dVar.f82724k);
                dVar.f82717d.a(dVar.f82725l);
                if (!dVar.f82722i.a(dVar.f82724k, bVar2.c())) {
                    return;
                }
            }
            Point pointA = u.a(view, dVar.f82715b);
            dVar.f82724k.eraseColor(bVar2.b() & (-1));
            float alpha = dVar.f82715b.getAlpha();
            dVar.f82715b.setAlpha(0.0f);
            dVar.f82718e = true;
            float fD = 1.0f / bVar2.d();
            int iSave = dVar.f82723j.save();
            try {
                dVar.f82723j.scale(fD, fD);
                dVar.f82723j.translate((-pointA.x) - rect.left, (-pointA.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(dVar.f82723j);
                }
                view.draw(dVar.f82723j);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                dVar.f82723j.restoreToCount(iSave);
                throw th2;
            }
            dVar.f82723j.restoreToCount(iSave);
            dVar.a();
            Set<TextureView> setKeySet = dVar.f82728o.keySet();
            if (!k.a(setKeySet)) {
                int i10 = pointA.x;
                Rect rect2 = new Rect(rect.left + i10, pointA.y + rect.top, (i10 + dVar.f82715b.getMeasuredWidth()) - rect.right, (pointA.y + dVar.f82715b.getMeasuredHeight()) - rect.bottom);
                Iterator<TextureView> it = setKeySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TextureView next = it.next();
                    if (next != null && next.isOpaque() && u.d(next)) {
                        Point pointA2 = u.a(view, next);
                        int i11 = pointA2.x;
                        Rect rect3 = new Rect(i11, pointA2.y, next.getMeasuredWidth() + i11, pointA2.y + next.getMeasuredHeight());
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = next.getBitmap()) != null) {
                            int i12 = rect4.left - rect3.left;
                            int i13 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i12, i13, rect4.width() + i12, rect4.height() + i13);
                            int i14 = rect4.left - rect2.left;
                            int i15 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i14, i15, rect4.width() + i14, rect4.height() + i15);
                            int iSave2 = dVar.f82723j.save();
                            try {
                                dVar.f82723j.scale(fD, fD);
                                dVar.f82723j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } catch (Throwable th3) {
                                dVar.f82723j.restoreToCount(iSave2);
                                throw th3;
                            }
                            dVar.f82723j.restoreToCount(iSave2);
                            break;
                        }
                    }
                }
            }
            dVar.f82718e = false;
            dVar.f82715b.setAlpha(alpha);
            dVar.f82722i.a(dVar.f82724k, dVar.f82725l.getBitmap());
            dVar.f82717d.invalidateSelf();
        }
    }

    public static /* synthetic */ int d(d dVar) {
        int i10 = dVar.f82727n;
        dVar.f82727n = i10 + 1;
        return i10;
    }

    public final void a() {
        if (!(this.f82719f instanceof ViewGroup) || this.f82727n == this.f82728o.size()) {
            return;
        }
        this.f82727n = 0;
        this.f82728o.clear();
        u.a((ViewGroup) this.f82719f, new sg.bigo.ads.common.d<View>() { // from class: sg.bigo.ads.common.view.a.d.2
            @Override // sg.bigo.ads.common.d
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    d.this.f82728o.put((TextureView) view2, d.this);
                    d.d(d.this);
                }
            }
        });
    }

    public final void b() {
        Bitmap bitmap = this.f82724k;
        if (bitmap != null) {
            bitmap.recycle();
            this.f82724k = null;
        }
        if (this.f82725l != null) {
            this.f82725l = null;
        }
        this.f82722i.a();
    }

    @Override // sg.bigo.ads.common.view.a.c
    public final void setBlurStyle(b bVar) {
        sg.bigo.ads.common.view.a.a aVar = this.f82717d;
        boolean z10 = false;
        if ((bVar != null || aVar.f82702b != null) && bVar != aVar.f82702b) {
            aVar.f82702b = bVar;
            aVar.invalidateSelf();
            z10 = true;
        }
        if (z10) {
            this.f82726m = 0L;
            b();
        }
    }
}
