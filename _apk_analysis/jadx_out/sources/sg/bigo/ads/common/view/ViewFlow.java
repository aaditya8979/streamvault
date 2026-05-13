package sg.bigo.ads.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes12.dex */
public class ViewFlow extends sg.bigo.ads.common.view.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Interpolator f82636s = new Interpolator() { // from class: sg.bigo.ads.common.view.ViewFlow.1
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private float A;
    private float B;
    private int C;
    private VelocityTracker D;
    private int E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private final Runnable J;
    private int K;
    private boolean L;
    private boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f82641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f82642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f82643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f82644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final a f82647k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f82648l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f82649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f82650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f82651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d f82652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private p f82653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f82654r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Scroller f82655t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f82656u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f82657v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f82658w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f82659x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f82660y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f82661z;

    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f82665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewFlow f82667c;

        private a(ViewFlow viewFlow) {
            this.f82666b = 0;
            this.f82667c = viewFlow;
        }

        public /* synthetic */ a(ViewFlow viewFlow, byte b10) {
            this(viewFlow);
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i10) {
            this.f82667c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i11 = aVar.f82666b;
                    int i12 = i10;
                    if (i11 == i12) {
                        return;
                    }
                    aVar.f82666b = i12;
                    c cVar = aVar.f82665a;
                    if (cVar != null) {
                        cVar.a(i12);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(final int i10, final int i11) {
            this.f82667c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.4
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f82665a;
                    if (cVar != null) {
                        cVar.a(i10, i11);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i10) {
            this.f82667c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f82665a;
                    if (cVar != null) {
                        cVar.a(view, i10);
                    }
                }
            });
        }

        @Override // sg.bigo.ads.common.view.ViewFlow.c
        public final void a(@NonNull final View view, final int i10, final float f10) {
            this.f82667c.post(new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = a.this.f82665a;
                    if (cVar != null) {
                        cVar.a(view, i10, f10);
                    }
                }
            });
        }
    }

    public static class b extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f82680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f82682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f82683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f82684e;

        public b() {
            this((byte) 0);
        }

        private b(byte b10) {
            super(-1, -1);
            this.f82684e = 17;
        }
    }

    public interface c {
        void a(int i10);

        void a(int i10, int i11);

        void a(@NonNull View view, int i10);

        void a(@NonNull View view, int i10, float f10);
    }

    public interface d {
        void a();
    }

    public ViewFlow(Context context) {
        this(context, null);
    }

    public ViewFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82647k = new a(this, (byte) 0);
        this.f82637a = 0;
        this.f82638b = 0;
        this.f82648l = 0;
        this.f82639c = 3;
        this.f82654r = true;
        this.f82643g = false;
        this.f82644h = false;
        this.C = -1;
        this.I = true;
        this.J = new Runnable() { // from class: sg.bigo.ads.common.view.ViewFlow.2
            @Override // java.lang.Runnable
            public final void run() {
                ViewFlow.this.setScrollState(0);
            }
        };
        this.K = 0;
        this.M = false;
        removeAllViews();
        setFocusable(true);
        setOverScrollMode(2);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        Context context2 = getContext();
        this.f82655t = new Scroller(context2, f82636s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f82659x = viewConfiguration.getScaledPagingTouchSlop();
        this.E = (int) (400.0f * f10);
        this.F = viewConfiguration.getScaledMaximumFlingVelocity();
        this.G = (int) (25.0f * f10);
        this.H = (int) (2.0f * f10);
        this.f82645i = (int) (f10 * 16.0f);
    }

    private void a(int i10, int i11) {
        int scrollX;
        if (this.f82638b == 0) {
            return;
        }
        Scroller scroller = this.f82655t;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f82656u ? this.f82655t.getCurrX() : this.f82655t.getStartX();
            this.f82655t.abortAnimation();
        } else {
            scrollX = getScrollX();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i10 - i12;
        int i14 = 0 - scrollY;
        if (i13 == 0 && i14 == 0) {
            a(false);
            setScrollState(0);
            return;
        }
        setScrollState(2);
        int measuredWidth = getMeasuredWidth();
        float f10 = measuredWidth / 2;
        float fB = f10 + (b(Math.min(1.0f, (Math.abs(i13) * 1.0f) / measuredWidth)) * f10);
        int iAbs = Math.abs(i11);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fB / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / getChildAt(this.f82637a).getWidth()) + 1.0f) * 100.0f), 600);
        this.f82656u = false;
        this.f82655t.startScroll(i12, scrollY, i13, i14, iMin);
        sg.bigo.ads.common.e.a.a(this);
    }

    private void a(@IntRange(from = 0) int i10, boolean z10, int i11) {
        int measuredWidth;
        int measuredWidth2;
        if (this.f82638b <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(0, i10), this.f82638b - 1);
        View childAt = getChildAt(0);
        if (childAt != null && childAt == this.f82641e) {
            iMin++;
        }
        View childAt2 = getChildAt(iMin);
        int left = childAt2 != null ? f() ? childAt2.getLeft() - ((getMeasuredWidth() - childAt2.getMeasuredWidth()) / 2) : childAt2.getLeft() - Math.max(this.f82640d, this.f82649m) : 0;
        if (getChildAt(getChildCount() - 1) != null) {
            if (this.f82642f != null) {
                measuredWidth = this.f82650n - getMeasuredWidth();
                measuredWidth2 = this.f82642f.getMeasuredWidth();
            } else {
                measuredWidth = this.f82650n;
                measuredWidth2 = getMeasuredWidth();
            }
            left = (int) Math.max(0.0f, Math.min(left, measuredWidth - measuredWidth2));
        }
        if (left == getScrollX()) {
            return;
        }
        if (z10) {
            a(left, i11);
        } else {
            a(false);
            scrollTo(left, 0);
        }
    }

    private void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f82660y = motionEvent.getX(i10);
            this.C = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.D;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static /* synthetic */ void a(ViewFlow viewFlow) {
        int scrollX = viewFlow.getScrollX();
        if (viewFlow.f82641e != null) {
            View childAt = viewFlow.getChildAt(0);
            View view = viewFlow.f82641e;
            if (childAt == view && scrollX < view.getRight()) {
                viewFlow.c(0);
                return;
            }
        }
        if (viewFlow.f82642f != null) {
            View childAt2 = viewFlow.getChildAt(viewFlow.getChildCount() - 1);
            View view2 = viewFlow.f82642f;
            if (childAt2 != view2 || scrollX <= view2.getLeft() - viewFlow.getMeasuredWidth()) {
                return;
            }
            viewFlow.c(viewFlow.getItemCount() - 1);
        }
    }

    private void a(boolean z10) {
        boolean z11 = this.K == 2;
        if (z11 && (true ^ this.f82655t.isFinished())) {
            this.f82655t.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f82655t.getCurrX();
            int currY = this.f82655t.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        if (z11) {
            if (z10) {
                sg.bigo.ads.common.e.a.a(this, this.J);
            } else {
                this.J.run();
            }
        }
    }

    private boolean a(float f10) {
        float f11 = this.f82660y - f10;
        this.f82660y = f10;
        float fMax = Math.max(0.0f, Math.min(getScrollX() + f11, getScrollRange()));
        sg.bigo.ads.common.t.a.b("ViewFlow", "performDrag, getScrollRange()=" + getScrollRange() + ", scrollX=" + fMax);
        int i10 = (int) fMax;
        this.f82660y = this.f82660y + (fMax - ((float) i10));
        scrollTo(i10, getScrollY());
        return false;
    }

    private static float b(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void c(@IntRange(from = 0) int i10) {
        a(i10, true, -20);
    }

    private boolean f() {
        int i10 = this.f82639c;
        return i10 == 2 || i10 == 3;
    }

    private boolean g() {
        this.C = -1;
        i();
        return true;
    }

    private int getScrollRange() {
        return Math.max(0, this.f82650n - getMeasuredWidth());
    }

    private void h() {
        this.f82644h = false;
        this.f82657v = true;
    }

    private void i() {
        this.f82657v = false;
        this.f82658w = false;
        this.f82644h = false;
        VelocityTracker velocityTracker = this.D;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.D = null;
        }
    }

    private void j() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final int a(View view) {
        if (view == null) {
            return -1;
        }
        List<View> items = getItems();
        for (int i10 = 0; i10 < items.size(); i10++) {
            if (items.get(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    @Nullable
    public final View a(int i10) {
        List<View> items = getItems();
        if (i10 < 0 || i10 >= items.size()) {
            return null;
        }
        return items.get(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    @Override // sg.bigo.ads.common.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            int r0 = r6.getItemCount()
            r1 = 1
            if (r0 > r1) goto L8
            return
        L8:
            int r2 = r6.getCurrentItem()
            boolean r3 = r6.L
            r4 = 0
            if (r3 == 0) goto L1a
            if (r2 != 0) goto L17
            int r2 = r2 + r1
            r6.L = r4
            goto L3d
        L17:
            int r2 = r2 + (-1)
            goto L3d
        L1a:
            int r0 = r0 - r1
            if (r2 == r0) goto L39
            android.view.View r0 = r6.f82642f
            int r3 = r6.f82650n
            if (r0 == 0) goto L28
            int r0 = r0.getMeasuredWidth()
            int r3 = r3 - r0
        L28:
            int r0 = r6.getScrollX()
            int r5 = r6.getMeasuredWidth()
            int r0 = r0 + r5
            if (r0 < r3) goto L34
            r4 = r1
        L34:
            if (r4 == 0) goto L37
            goto L39
        L37:
            int r2 = r2 + r1
            goto L3d
        L39:
            int r2 = r2 + (-1)
            r6.L = r1
        L3d:
            r6.c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.a():void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (i10 < 0) {
            View childAt = getChildAt(getChildCount() - 1);
            if (childAt != null && childAt == this.f82642f) {
                i10 = getChildCount() - 1;
            }
        } else {
            View childAt2 = getChildAt(0);
            if (childAt2 != null && childAt2 == this.f82641e) {
                i10++;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b(int i10) {
        this.f82637a = i10;
        if (this.I) {
            requestLayout();
        } else {
            c(i10);
        }
    }

    @Override // sg.bigo.ads.common.view.a
    public final boolean b() {
        return !this.f82657v;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof b) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f82656u = true;
        if (this.f82655t.isFinished() || !this.f82655t.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f82655t.getCurrX();
        int currY = this.f82655t.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
        }
        sg.bigo.ads.common.e.a.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.f82643g = true;
        if (!this.M) {
            onTouchEvent(motionEvent);
        }
        return zDispatchTouchEvent;
    }

    public final boolean e() {
        int measuredWidth = this.f82650n;
        View view = this.f82641e;
        if (view != null) {
            measuredWidth -= view.getRight();
        }
        View view2 = this.f82642f;
        if (view2 != null) {
            measuredWidth -= view2.getMeasuredWidth();
        }
        return getWidth() >= measuredWidth;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public int getContentMaxWidthSpace() {
        return this.f82640d;
    }

    @IntRange(from = 0)
    public int getCurrentItem() {
        return this.f82637a;
    }

    @IntRange(from = 0)
    public int getItemCount() {
        return this.f82638b;
    }

    @NonNull
    public List<View> getItems() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f82641e && childAt != this.f82642f) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public c getOnItemChangeListener() {
        return this.f82647k.f82665a;
    }

    public int getViewStyle() {
        return this.f82639c;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override // sg.bigo.ads.common.view.a, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.J);
        Scroller scroller = this.f82655t;
        if (scroller != null && !scroller.isFinished()) {
            this.f82655t.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M = false;
        if (this.f82654r) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            g();
            return false;
        }
        if (action != 0) {
            if (this.f82657v) {
                return true;
            }
            if (this.f82658w) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.A = x10;
            this.f82660y = x10;
            float y10 = motionEvent.getY();
            this.B = y10;
            this.f82661z = y10;
            this.C = motionEvent.getPointerId(0);
            this.f82658w = false;
            this.f82656u = true;
            this.f82655t.computeScrollOffset();
            if (this.K != 2 || Math.abs(this.f82655t.getFinalX() - this.f82655t.getCurrX()) <= this.H) {
                a(false);
                this.f82657v = false;
            } else {
                this.f82655t.abortAnimation();
                h();
                j();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.C;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.f82660y;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.B);
                if (f10 != 0.0f) {
                    float f11 = this.f82660y;
                    if (!((f11 < ((float) this.f82646j) && f10 > 0.0f) || (f11 > ((float) (getWidth() - this.f82646j)) && f10 < 0.0f))) {
                        if (getWidth() < this.f82650n) {
                            this.f82660y = x11;
                            this.f82661z = y11;
                            this.f82658w = true;
                            return false;
                        }
                    }
                }
                int i11 = this.f82659x;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    h();
                    j();
                    setScrollState(1);
                    float f12 = this.A;
                    float f13 = this.f82659x;
                    this.f82660y = f10 > 0.0f ? f12 + f13 : f12 - f13;
                    this.f82661z = y11;
                } else if (fAbs2 > i11) {
                    this.f82658w = true;
                }
                if (this.f82657v) {
                    a(x11);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.D == null) {
            this.D = VelocityTracker.obtain();
        }
        this.D.addMovement(motionEvent);
        return this.f82657v;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        int iMin;
        int i14;
        super.onScrollChanged(i10, i11, i12, i13);
        View childAt = getChildAt(0);
        if (childAt == null || childAt != this.f82641e) {
            iMin = i10;
            i14 = 0;
        } else {
            iMin = Math.max(childAt.getRight(), i10);
            i14 = 1;
        }
        int childCount = getChildCount();
        View childAt2 = getChildAt(childCount - 1);
        if (childAt2 != null && childAt2 == this.f82642f) {
            iMin = Math.min(childAt2.getLeft() - getMeasuredWidth(), iMin);
            childCount--;
        }
        float measuredWidth = f() ? iMin + ((getMeasuredWidth() * 1.0f) / 2.0f) : iMin + this.f82640d;
        View childAt3 = getChildAt(this.f82637a + i14);
        int measuredWidth2 = (childAt3 == null || childAt3.getMeasuredWidth() <= 0) ? getMeasuredWidth() - (this.f82640d * 2) : childAt3.getMeasuredWidth();
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- begin -----");
        for (int i15 = i14; i15 < childCount; i15++) {
            View childAt4 = getChildAt(i15);
            if (childAt4 != null) {
                float fMax = Math.max(-1.0f, Math.min(1.0f, (f() ? (int) (((childAt4.getLeft() + ((childAt4.getMeasuredWidth() * 1.0f) / 2.0f)) - measuredWidth) + 0.5f) : childAt4.getLeft() - measuredWidth) / measuredWidth2));
                int i16 = i15 - i14;
                if (((float) childAt4.getLeft()) < measuredWidth && ((float) childAt4.getRight()) > measuredWidth) {
                    this.f82648l = i16;
                }
                this.f82647k.a(childAt4, i16, fMax);
                if (fMax == 0.0f && this.f82637a != i16) {
                    this.f82637a = i16;
                    this.f82648l = i16;
                    this.f82647k.a(childAt4, i16);
                }
            }
        }
        sg.bigo.ads.common.t.a.a("ViewFlow", "computeScrollOffset, ----- end -----");
        a aVar = this.f82647k;
        if (aVar != null) {
            aVar.a(i10, getScrollRange());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0214 A[PHI: r1
      0x0214: PHI (r1v12 sg.bigo.ads.common.view.ViewFlow$d) = (r1v11 sg.bigo.ads.common.view.ViewFlow$d), (r1v13 sg.bigo.ads.common.view.ViewFlow$d) binds: [B:125:0x0239, B:115:0x0212] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.ViewFlow.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == this.f82642f || view == this.f82641e || view == null) {
            return;
        }
        this.f82638b++;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f82642f || view == this.f82641e || view == null) {
            return;
        }
        this.f82638b--;
    }

    public void setContentMaxWidthSpace(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f82640d != iMax) {
            this.f82640d = iMax;
            requestLayout();
        }
    }

    public void setDividerWidth(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f82649m != iMax) {
            this.f82649m = iMax;
            if (this.f82639c != 3) {
                requestLayout();
            }
        }
    }

    public void setEndView(View view) {
        View view2 = this.f82642f;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f82642f = view;
            if (view != null) {
                addView(view);
            }
            requestLayout();
        }
    }

    public void setMainChildSize(p pVar) {
        this.f82653q = pVar;
    }

    public void setOnEndViewShowListener(d dVar) {
        this.f82652p = dVar;
    }

    public void setOnItemChangeListener(c cVar) {
        this.f82647k.f82665a = cVar;
    }

    public void setOnStartViewShowListener(d dVar) {
        this.f82651o = dVar;
    }

    public void setScrollEnabled(boolean z10) {
        this.f82654r = z10;
    }

    public void setScrollState(int i10) {
        if (this.K == i10) {
            return;
        }
        this.K = i10;
    }

    public void setStartView(View view) {
        View view2 = this.f82641e;
        if (view != view2) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f82641e = view;
            if (view != null) {
                addView(view, 0);
            }
            requestLayout();
        }
    }

    public void setViewStyle(int i10) {
        if (this.f82639c != i10) {
            this.f82639c = i10;
            requestLayout();
        }
    }
}
