package com.luck.picture.lib.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class SlideSelectTouchListener implements RecyclerView.OnItemTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f35267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35270h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35271i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f35272j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f35273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f35274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public OverScroller f35275m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f35277o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f35278p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35279q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f35280r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f35287y;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Runnable f35276n = new a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f35281s = 16;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f35282t = (int) (Resources.getSystem().getDisplayMetrics().density * 56.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f35283u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f35284v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f35285w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f35286x = true;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SlideSelectTouchListener.this.f35275m == null || !SlideSelectTouchListener.this.f35275m.computeScrollOffset()) {
                return;
            }
            SlideSelectTouchListener slideSelectTouchListener = SlideSelectTouchListener.this;
            slideSelectTouchListener.l(slideSelectTouchListener.f35268f);
            ViewCompat.postOnAnimation(SlideSelectTouchListener.this.f35274l, SlideSelectTouchListener.this.f35276n);
        }
    }

    public interface b extends c {
        void a(int i10);

        void b(int i10);
    }

    public interface c {
        void c(int i10, int i11, boolean z10);
    }

    public SlideSelectTouchListener() {
        k();
    }

    public final void f(RecyclerView recyclerView, float f10, float f11) {
        int childAdapterPosition;
        View viewFindChildViewUnder = recyclerView.findChildViewUnder(f10, f11);
        if (viewFindChildViewUnder == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder) - this.f35287y) == -1 || this.f35265c == childAdapterPosition) {
            return;
        }
        this.f35265c = childAdapterPosition;
        i();
    }

    public final void g(RecyclerView recyclerView, MotionEvent motionEvent) {
        f(recyclerView, motionEvent.getX(), motionEvent.getY());
    }

    public final void h(Context context) {
        if (this.f35275m == null) {
            this.f35275m = new OverScroller(context, new LinearInterpolator());
        }
    }

    public final void i() {
        int i10;
        int i11;
        if (this.f35273k == null || (i10 = this.f35264b) == -1 || (i11 = this.f35265c) == -1) {
            return;
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(this.f35264b, this.f35265c);
        if (iMin < 0) {
            return;
        }
        int i12 = this.f35271i;
        if (i12 != -1 && this.f35272j != -1) {
            if (iMin > i12) {
                this.f35273k.c(i12, iMin - 1, false);
            } else if (iMin < i12) {
                this.f35273k.c(iMin, i12 - 1, true);
            }
            int i13 = this.f35272j;
            if (iMax > i13) {
                this.f35273k.c(i13 + 1, iMax, true);
            } else if (iMax < i13) {
                this.f35273k.c(iMax + 1, i13, false);
            }
        } else if (iMax - iMin == 1) {
            this.f35273k.c(iMin, iMin, true);
        } else {
            this.f35273k.c(iMin, iMax, true);
        }
        this.f35271i = iMin;
        this.f35272j = iMax;
    }

    public final void j(MotionEvent motionEvent) {
        int y10 = (int) motionEvent.getY();
        int i10 = this.f35277o;
        if (y10 >= i10 && y10 <= this.f35278p) {
            this.f35269g = motionEvent.getX();
            this.f35270h = motionEvent.getY();
            int i11 = this.f35278p;
            int i12 = this.f35277o;
            this.f35268f = (int) (this.f35281s * (((i11 - i12) - (y10 - i12)) / (i11 - i12)) * (-1.0f));
            if (this.f35266d) {
                return;
            }
            this.f35266d = true;
            o();
            return;
        }
        if (this.f35285w && y10 < i10) {
            this.f35269g = motionEvent.getX();
            this.f35270h = motionEvent.getY();
            this.f35268f = this.f35281s * (-1);
            if (this.f35266d) {
                return;
            }
            this.f35266d = true;
            o();
            return;
        }
        if (y10 >= this.f35279q && y10 <= this.f35280r) {
            this.f35269g = motionEvent.getX();
            this.f35270h = motionEvent.getY();
            float f10 = y10;
            int i13 = this.f35279q;
            this.f35268f = (int) (this.f35281s * ((f10 - i13) / (this.f35280r - i13)));
            if (this.f35267e) {
                return;
            }
            this.f35267e = true;
            o();
            return;
        }
        if (!this.f35286x || y10 <= this.f35280r) {
            this.f35267e = false;
            this.f35266d = false;
            this.f35269g = Float.MIN_VALUE;
            this.f35270h = Float.MIN_VALUE;
            q();
            return;
        }
        this.f35269g = motionEvent.getX();
        this.f35270h = motionEvent.getY();
        this.f35268f = this.f35281s;
        if (this.f35266d) {
            return;
        }
        this.f35266d = true;
        o();
    }

    public final void k() {
        m(false);
        c cVar = this.f35273k;
        if (cVar != null && (cVar instanceof b)) {
            ((b) cVar).a(this.f35265c);
        }
        this.f35264b = -1;
        this.f35265c = -1;
        this.f35271i = -1;
        this.f35272j = -1;
        this.f35266d = false;
        this.f35267e = false;
        this.f35269g = Float.MIN_VALUE;
        this.f35270h = Float.MIN_VALUE;
        q();
    }

    public final void l(int i10) {
        this.f35274l.scrollBy(0, i10 > 0 ? Math.min(i10, this.f35281s) : Math.max(i10, -this.f35281s));
        float f10 = this.f35269g;
        if (f10 != Float.MIN_VALUE) {
            float f11 = this.f35270h;
            if (f11 != Float.MIN_VALUE) {
                f(this.f35274l, f10, f11);
            }
        }
    }

    public void m(boolean z10) {
        this.f35263a = z10;
    }

    public SlideSelectTouchListener n(int i10) {
        this.f35287y = i10;
        return this;
    }

    public void o() {
        RecyclerView recyclerView = this.f35274l;
        if (recyclerView == null) {
            return;
        }
        h(recyclerView.getContext());
        if (this.f35275m.isFinished()) {
            this.f35274l.removeCallbacks(this.f35276n);
            OverScroller overScroller = this.f35275m;
            overScroller.startScroll(0, overScroller.getCurrY(), 0, 5000, 100000);
            ViewCompat.postOnAnimation(this.f35274l, this.f35276n);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (!this.f35263a || recyclerView.getAdapter() == null || recyclerView.getAdapter().getItemCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0 || action == 5) {
            k();
        }
        this.f35274l = recyclerView;
        int height = recyclerView.getHeight();
        int i10 = this.f35283u;
        this.f35277o = i10;
        int i11 = this.f35282t;
        this.f35278p = i10 + i11;
        int i12 = this.f35284v;
        this.f35279q = (height + i12) - i11;
        this.f35280r = height + i12;
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (!this.f35263a) {
            k();
            return;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                if (!this.f35266d && !this.f35267e) {
                    g(recyclerView, motionEvent);
                }
                j(motionEvent);
                return;
            }
            if (action != 3 && action != 6) {
                return;
            }
        }
        k();
    }

    public void p(int i10) {
        m(true);
        this.f35264b = i10;
        this.f35265c = i10;
        this.f35271i = i10;
        this.f35272j = i10;
        c cVar = this.f35273k;
        if (cVar == null || !(cVar instanceof b)) {
            return;
        }
        ((b) cVar).b(i10);
    }

    public void q() {
        try {
            OverScroller overScroller = this.f35275m;
            if (overScroller == null || overScroller.isFinished()) {
                return;
            }
            this.f35274l.removeCallbacks(this.f35276n);
            this.f35275m.abortAnimation();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public SlideSelectTouchListener r(c cVar) {
        this.f35273k = cVar;
        return this;
    }
}
