package com.bytedance.adsdk.ugeno.pno;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class lh extends ViewGroup {
    private final vt bly;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    private int f11774bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f11775cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f11776cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private EdgeEffect f11777cj;
    private final Runnable coz;
    private int ex;
    private float ey;
    private float fak;
    public List<yu> fkw;
    private int fqk;
    private int fvf;
    private int hun;
    private boolean jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private Scroller f11778jg;
    private int jqy;
    private VelocityTracker jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private boolean f11779kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f11780ko;
    private boolean ksc;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.pno.vt f11781lh;
    private int lso;
    private int lvd;
    private List<Object> mt;
    private ClassLoader mwh;
    private int myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private ArrayList<View> f11782ng;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f11783od;
    private float osn;
    private int ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private int f11784pd;
    private final ArrayList<vt> pno;
    private EdgeEffect pv;
    private int qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private le f11785rn;
    private int rrs;
    private Parcelable ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private boolean f11786tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private int f11787th;
    private final Rect tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private boolean f11788ub;
    private boolean ucs;
    private float uoy;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    private boolean f11789uq;
    private int ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f11790vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private Drawable f11791vm;
    private float vpp;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    private boolean f11792wp;
    private fkw xdk;
    private yu yhj;
    private yu yib;
    public int yu;
    private int zih;
    private float zin;
    private int zvq;
    public static final int[] vt = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private static final Comparator<vt> f11772le = new Comparator<vt>() { // from class: com.bytedance.adsdk.ugeno.pno.lh.1
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(vt vtVar, vt vtVar2) {
            return vtVar.vt - vtVar2.vt;
        }
    };

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static final Interpolator f11773ra = new Interpolator() { // from class: com.bytedance.adsdk.ugeno.pno.lh.2
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    };
    private static final pno fwd = new pno();

    public interface fkw {
        void ouw(View view, float f10);
    }

    public class le extends DataSetObserver {
        public le() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            lh.this.ouw();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            lh.this.ouw();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.pno.lh$lh, reason: collision with other inner class name */
    public static class C0180lh extends ViewGroup.LayoutParams {
        public int fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public int f11793le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11794lh;
        public boolean ouw;
        public int vt;
        public boolean yu;

        public C0180lh() {
            super(-1, -1);
            this.f11794lh = 0.0f;
        }

        public C0180lh(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f11794lh = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lh.vt);
            this.vt = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ouw {
    }

    public static class pno implements Comparator<View> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            C0180lh c0180lh = (C0180lh) view.getLayoutParams();
            C0180lh c0180lh2 = (C0180lh) view2.getLayoutParams();
            boolean z10 = c0180lh.ouw;
            return z10 != c0180lh2.ouw ? z10 ? 1 : -1 : c0180lh.fkw - c0180lh2.fkw;
        }
    }

    public static class ra extends com.bytedance.adsdk.ugeno.pno.ouw {
        public static final Parcelable.Creator<ra> CREATOR = new Parcelable.ClassLoaderCreator<ra>() { // from class: com.bytedance.adsdk.ugeno.pno.lh.ra.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new ra(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ ra createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ra(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
                return new ra[i10];
            }
        };
        public ClassLoader fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f11795lh;
        public Parcelable yu;

        public ra(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? ra.class.getClassLoader() : classLoader;
            this.f11795lh = parcel.readInt();
            this.yu = parcel.readParcelable(classLoader);
            this.fkw = classLoader;
        }

        public ra(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f11795lh + h.f52302e;
        }

        @Override // com.bytedance.adsdk.ugeno.pno.ouw, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f11795lh);
            parcel.writeParcelable(this.yu, i10);
        }
    }

    public static class vt {
        public float fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f11796lh;
        public Object ouw;
        public int vt;
        public float yu;
    }

    public interface yu {
        void bly(int i10);

        void ouw(int i10, float f10, int i11);

        void tlj(int i10);
    }

    public lh(Context context) {
        super(context);
        this.pno = new ArrayList<>();
        this.bly = new vt();
        this.tlj = new Rect();
        this.f11776cf = -1;
        this.ryl = null;
        this.mwh = null;
        this.zin = -3.4028235E38f;
        this.vpp = Float.MAX_VALUE;
        this.f11783od = 1;
        this.rrs = -1;
        this.f11792wp = true;
        this.f11779kn = false;
        this.coz = new Runnable() { // from class: com.bytedance.adsdk.ugeno.pno.lh.3
            @Override // java.lang.Runnable
            public final void run() {
                lh.this.setScrollState(0);
                lh.this.vt();
            }
        };
        this.lvd = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.f11778jg = new Scroller(context2, f11773ra);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.f11774bs = viewConfiguration.getScaledPagingTouchSlop();
        this.fqk = (int) (400.0f * f10);
        this.hun = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f11777cj = new EdgeEffect(context2);
        this.pv = new EdgeEffect(context2);
        this.ux = (int) (25.0f * f10);
        this.lso = (int) (2.0f * f10);
        this.f11784pd = (int) (f10 * 16.0f);
    }

    private boolean bly() {
        com.bytedance.adsdk.ugeno.pno.vt vtVar = this.f11781lh;
        if (vtVar == null || this.yu >= vtVar.ouw() - 1) {
            return false;
        }
        ouw(this.yu + 1, true);
        return true;
    }

    private void fkw() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean fkw(int r7) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.fkw(int):boolean");
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private vt le() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.zih / clientWidth : 0.0f;
        vt vtVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.pno.size()) {
            vt vtVar2 = this.pno.get(i11);
            if (!z10 && vtVar2.vt != (i10 = i12 + 1)) {
                vtVar2 = this.bly;
                vtVar2.fkw = f10 + f12 + f11;
                vtVar2.vt = i10;
                vtVar2.yu = this.f11781lh.vt();
                i11--;
            }
            f10 = vtVar2.fkw;
            float f13 = vtVar2.yu + f10 + f11;
            if (!z10 && scrollX < f10) {
                return vtVar;
            }
            if (scrollX < f13 || i11 == this.pno.size() - 1) {
                return vtVar2;
            }
            i12 = vtVar2.vt;
            f12 = vtVar2.yu;
            i11++;
            z10 = false;
            vtVar = vtVar2;
        }
        return vtVar;
    }

    private void lh() {
        if (this.myk != 0) {
            ArrayList<View> arrayList = this.f11782ng;
            if (arrayList == null) {
                this.f11782ng = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f11782ng.add(getChildAt(i10));
            }
            Collections.sort(this.f11782ng, fwd);
        }
    }

    private boolean lh(int i10) {
        if (this.pno.size() == 0) {
            if (this.f11792wp) {
                return false;
            }
            this.ucs = false;
            ouw(0, 0.0f, 0);
            if (this.ucs) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        vt vtVarLe = le();
        int clientWidth = getClientWidth();
        int i11 = this.zih;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = vtVarLe.vt;
        float f11 = ((i10 / f10) - vtVarLe.fkw) / (vtVarLe.yu + (i11 / f10));
        this.ucs = false;
        ouw(i13, f11, (int) (i12 * f11));
        if (this.ucs) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private static float ouw(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private Rect ouw(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private vt ouw(View view) {
        for (int i10 = 0; i10 < this.pno.size(); i10++) {
            vt vtVar = this.pno.get(i10);
            if (this.f11781lh.ouw(view, vtVar.ouw)) {
                return vtVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1 A[PHI: r7 r10 r15
      0x00f1: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:61:0x00e6, B:58:0x00d0, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:61:0x00e6, B:58:0x00d0, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:61:0x00e6, B:58:0x00d0, B:52:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(int r18) {
        /*
            Method dump skipped, instruction units count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.ouw(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ouw(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f11790vh
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            com.bytedance.adsdk.ugeno.pno.lh$lh r9 = (com.bytedance.adsdk.ugeno.pno.lh.C0180lh) r9
            boolean r10 = r9.ouw
            if (r10 == 0) goto L67
            int r9 = r9.vt
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            r12.vt(r13, r14, r15)
            com.bytedance.adsdk.ugeno.pno.lh$fkw r13 = r12.xdk
            if (r13 == 0) goto L9d
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L79:
            if (r1 >= r14) goto L9d
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            com.bytedance.adsdk.ugeno.pno.lh$lh r0 = (com.bytedance.adsdk.ugeno.pno.lh.C0180lh) r0
            boolean r0 = r0.ouw
            if (r0 != 0) goto L9a
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            com.bytedance.adsdk.ugeno.pno.lh$fkw r3 = r12.xdk
            r3.ouw(r15, r0)
        L9a:
            int r1 = r1 + 1
            goto L79
        L9d:
            r12.ucs = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.ouw(int, float, int):void");
    }

    private void ouw(int i10, int i11) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f11778jg;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f11780ko ? this.f11778jg.getCurrX() : this.f11778jg.getStartX();
            this.f11778jg.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i10 - i12;
        int i14 = 0 - scrollY;
        if (i13 == 0 && i14 == 0) {
            ouw(false);
            vt();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i15;
        float fOuw = f11 + (ouw(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11);
        int iAbs = Math.abs(i11);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fOuw / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / ((f10 * this.f11781lh.vt()) + this.zih)) + 1.0f) * 100.0f), 600);
        this.f11780ko = false;
        this.f11778jg.startScroll(i12, scrollY, i13, i14, iMin);
        postInvalidateOnAnimation();
    }

    private void ouw(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.pno.isEmpty()) {
            if (!this.f11778jg.isFinished()) {
                this.f11778jg.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        vt vtVarVt = vt(this.yu);
        int iMin = (int) ((vtVarVt != null ? Math.min(vtVarVt.fkw, this.vpp) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            ouw(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void ouw(int i10, boolean z10, int i11, boolean z11) {
        vt vtVarVt = vt(i10);
        int clientWidth = vtVarVt != null ? (int) (getClientWidth() * Math.max(this.zin, Math.min(vtVarVt.fkw, this.vpp))) : 0;
        if (z10) {
            ouw(clientWidth, i11);
            if (z11) {
                yu(i10);
                return;
            }
            return;
        }
        if (z11) {
            yu(i10);
        }
        ouw(false);
        scrollTo(clientWidth, 0);
        lh(clientWidth);
    }

    private void ouw(int i10, boolean z10, boolean z11) {
        ouw(i10, z10, z11, 0);
    }

    private void ouw(int i10, boolean z10, boolean z11, int i11) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar = this.f11781lh;
        if (vtVar == null || vtVar.ouw() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.yu == i10 && this.pno.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f11781lh.ouw()) {
            i10 = this.f11781lh.ouw() - 1;
        }
        int i12 = this.f11783od;
        int i13 = this.yu;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.pno.size(); i14++) {
                this.pno.get(i14).f11796lh = true;
            }
        }
        boolean z12 = this.yu != i10;
        if (!this.f11792wp) {
            ouw(i10);
            ouw(i10, z10, i11, z12);
        } else {
            this.yu = i10;
            if (z12) {
                yu(i10);
            }
            requestLayout();
        }
    }

    private void ouw(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.rrs) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.fak = motionEvent.getX(i10);
            this.rrs = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.jvy;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void ouw(vt vtVar, int i10, vt vtVar2) {
        int i11;
        int i12;
        vt vtVar3;
        vt vtVar4;
        int iOuw = this.f11781lh.ouw();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.zih / clientWidth : 0.0f;
        if (vtVar2 != null) {
            int i13 = vtVar2.vt;
            int i14 = vtVar.vt;
            if (i13 < i14) {
                float fVt = vtVar2.fkw + vtVar2.yu + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= vtVar.vt && i16 < this.pno.size()) {
                    vt vtVar5 = this.pno.get(i16);
                    while (true) {
                        vtVar4 = vtVar5;
                        if (i15 <= vtVar4.vt || i16 >= this.pno.size() - 1) {
                            break;
                        }
                        i16++;
                        vtVar5 = this.pno.get(i16);
                    }
                    while (i15 < vtVar4.vt) {
                        fVt += this.f11781lh.vt() + f10;
                        i15++;
                    }
                    vtVar4.fkw = fVt;
                    fVt += vtVar4.yu + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.pno.size() - 1;
                float fVt2 = vtVar2.fkw;
                while (true) {
                    i13--;
                    if (i13 < vtVar.vt || size < 0) {
                        break;
                    }
                    vt vtVar6 = this.pno.get(size);
                    while (true) {
                        vtVar3 = vtVar6;
                        if (i13 >= vtVar3.vt || size <= 0) {
                            break;
                        }
                        size--;
                        vtVar6 = this.pno.get(size);
                    }
                    while (i13 > vtVar3.vt) {
                        fVt2 -= this.f11781lh.vt() + f10;
                        i13--;
                    }
                    fVt2 -= vtVar3.yu + f10;
                    vtVar3.fkw = fVt2;
                }
            }
        }
        int size2 = this.pno.size();
        float fVt3 = vtVar.fkw;
        int i17 = vtVar.vt;
        int i18 = i17 - 1;
        this.zin = i17 == 0 ? fVt3 : -3.4028235E38f;
        int i19 = iOuw - 1;
        this.vpp = i17 == i19 ? (vtVar.yu + fVt3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            vt vtVar7 = this.pno.get(i20);
            while (true) {
                i12 = vtVar7.vt;
                if (i18 <= i12) {
                    break;
                }
                i18--;
                fVt3 -= this.f11781lh.vt() + f10;
            }
            fVt3 -= vtVar7.yu + f10;
            vtVar7.fkw = fVt3;
            if (i12 == 0) {
                this.zin = fVt3;
            }
            i20--;
            i18--;
        }
        float fVt4 = vtVar.fkw + vtVar.yu + f10;
        int i21 = vtVar.vt + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            vt vtVar8 = this.pno.get(i22);
            while (true) {
                i11 = vtVar8.vt;
                if (i21 >= i11) {
                    break;
                }
                i21++;
                fVt4 += this.f11781lh.vt() + f10;
            }
            if (i11 == i19) {
                this.vpp = (vtVar8.yu + fVt4) - 1.0f;
            }
            vtVar8.fkw = fVt4;
            fVt4 += vtVar8.yu + f10;
            i22++;
            i21++;
        }
        this.f11779kn = false;
    }

    private void ouw(boolean z10) {
        boolean z11 = this.lvd == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f11778jg.isFinished()) {
                this.f11778jg.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f11778jg.getCurrX();
                int currY = this.f11778jg.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        lh(currX);
                    }
                }
            }
        }
        this.jae = false;
        for (int i10 = 0; i10 < this.pno.size(); i10++) {
            vt vtVar = this.pno.get(i10);
            if (vtVar.f11796lh) {
                vtVar.f11796lh = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                postOnAnimation(this.coz);
            } else {
                this.coz.run();
            }
        }
    }

    private boolean ouw(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && ouw(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private boolean pno() {
        int i10 = this.yu;
        if (i10 <= 0) {
            return false;
        }
        ouw(i10 - 1, true);
        return true;
    }

    private void ra() {
        this.f11775cd = false;
        this.f11789uq = false;
        VelocityTracker velocityTracker = this.jvy;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.jvy = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.ksc != z10) {
            this.ksc = z10;
        }
    }

    private vt vt(int i10) {
        for (int i11 = 0; i11 < this.pno.size(); i11++) {
            vt vtVar = this.pno.get(i11);
            if (vtVar.vt == i10) {
                return vtVar;
            }
        }
        return null;
    }

    private vt vt(int i10, int i11) {
        vt vtVar = new vt();
        vtVar.vt = i10;
        vtVar.ouw = this.f11781lh.ouw(this, i10);
        vtVar.yu = this.f11781lh.vt();
        if (i11 < 0 || i11 >= this.pno.size()) {
            this.pno.add(vtVar);
        } else {
            this.pno.add(i11, vtVar);
        }
        return vtVar;
    }

    private vt vt(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return ouw(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    private void vt(int i10, float f10, int i11) {
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.ouw(i10, f10, i11);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                yu yuVar2 = this.fkw.get(i12);
                if (yuVar2 != null) {
                    yuVar2.ouw(i10, f10, i11);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.ouw(i10, f10, i11);
        }
    }

    private void vt(boolean z10, fkw fkwVar) {
        boolean z11 = fkwVar != null;
        boolean z12 = z11 != (this.xdk != null);
        this.xdk = fkwVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.myk = z10 ? 2 : 1;
            this.zvq = 2;
        } else {
            this.myk = 0;
        }
        if (z12) {
            vt();
        }
    }

    private boolean vt(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.fak - f10;
        this.fak = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.zin * clientWidth;
        float f13 = this.vpp * clientWidth;
        boolean z12 = false;
        vt vtVar = this.pno.get(0);
        ArrayList<vt> arrayList = this.pno;
        vt vtVar2 = arrayList.get(arrayList.size() - 1);
        if (vtVar.vt != 0) {
            f12 = vtVar.fkw * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (vtVar2.vt != this.f11781lh.ouw() - 1) {
            f13 = vtVar2.fkw * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f11777cj.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.pv.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.fak += scrollX - i10;
        scrollTo(i10, getScrollY());
        lh(i10);
        return z12;
    }

    private void yu(int i10) {
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.bly(i10);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                yu yuVar2 = this.fkw.get(i11);
                if (yuVar2 != null) {
                    yuVar2.bly(i10);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.bly(i10);
        }
    }

    private boolean yu() {
        this.rrs = -1;
        ra();
        this.f11777cj.onRelease();
        this.pv.onRelease();
        return this.f11777cj.isFinished() || this.pv.isFinished();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        vt vtVarOuw;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        vt vtVarOuw;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C0180lh c0180lh = (C0180lh) layoutParams;
        boolean z10 = c0180lh.ouw | (view.getClass().getAnnotation(ouw.class) != null);
        c0180lh.ouw = z10;
        if (!this.f11786tc) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c0180lh.yu = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f11781lh == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.zin)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.vpp));
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0180lh) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f11780ko = true;
        if (this.f11778jg.isFinished() || !this.f11778jg.computeScrollOffset()) {
            ouw(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f11778jg.getCurrX();
        int currY = this.f11778jg.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!lh(currX)) {
                this.f11778jg.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.fkw(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.fkw(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.bly()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.fkw(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.pno()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.fkw(r6)
            goto L5b
        L5a:
            r6 = r2
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        vt vtVarOuw;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (vtVar = this.f11781lh) != null && vtVar.ouw() > 1)) {
            if (!this.f11777cj.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.zin * width);
                this.f11777cj.setSize(height, width);
                zDraw = false | this.f11777cj.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.pv.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.vpp + 1.0f)) * width2);
                this.pv.setSize(height2, width2);
                zDraw |= this.pv.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f11777cj.finish();
            this.pv.finish();
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f11791vm;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0180lh();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0180lh(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public com.bytedance.adsdk.ugeno.pno.vt getAdapter() {
        return this.f11781lh;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.myk == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((C0180lh) this.f11782ng.get(i11).getLayoutParams()).f11793le;
    }

    public int getCurrentItem() {
        return this.yu;
    }

    public int getOffscreenPageLimit() {
        return this.f11783od;
    }

    public int getPageMargin() {
        return this.zih;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11792wp = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.coz);
        Scroller scroller = this.f11778jg;
        if (scroller != null && !scroller.isFinished()) {
            this.f11778jg.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.zih <= 0 || this.f11791vm == null || this.pno.size() <= 0 || this.f11781lh == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f12 = this.zih / width;
        int i11 = 0;
        vt vtVar = this.pno.get(0);
        float f13 = vtVar.fkw;
        int size = this.pno.size();
        int i12 = vtVar.vt;
        int i13 = this.pno.get(size - 1).vt;
        while (i12 < i13) {
            while (true) {
                i10 = vtVar.vt;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                vtVar = this.pno.get(i11);
            }
            if (i12 == i10) {
                float f14 = vtVar.fkw;
                float f15 = vtVar.yu;
                f10 = (f14 + f15) * width;
                f13 = f14 + f15 + f12;
            } else {
                float fVt = this.f11781lh.vt();
                f10 = (f13 + fVt) * width;
                f13 += fVt + f12;
            }
            if (this.zih + f10 > scrollX) {
                f11 = f12;
                this.f11791vm.setBounds(Math.round(f10), this.f11787th, Math.round(this.zih + f10), this.qbp);
                this.f11791vm.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + r2) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            yu();
            return false;
        }
        if (action != 0) {
            if (this.f11775cd) {
                return true;
            }
            if (this.f11789uq) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.osn = x10;
            this.fak = x10;
            float y10 = motionEvent.getY();
            this.ey = y10;
            this.uoy = y10;
            this.rrs = motionEvent.getPointerId(0);
            this.f11789uq = false;
            this.f11780ko = true;
            this.f11778jg.computeScrollOffset();
            if (this.lvd != 2 || Math.abs(this.f11778jg.getFinalX() - this.f11778jg.getCurrX()) <= this.lso) {
                ouw(false);
                this.f11775cd = false;
            } else {
                this.f11778jg.abortAnimation();
                this.jae = false;
                vt();
                this.f11775cd = true;
                fkw();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.rrs;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                float x11 = motionEvent.getX(iFindPointerIndex);
                float f10 = x11 - this.fak;
                float fAbs = Math.abs(f10);
                float y11 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y11 - this.ey);
                if (f10 != 0.0f) {
                    float f11 = this.fak;
                    if (!((f11 < ((float) this.fvf) && f10 > 0.0f) || (f11 > ((float) (getWidth() - this.fvf)) && f10 < 0.0f)) && ouw(this, false, (int) f10, (int) x11, (int) y11)) {
                        this.fak = x11;
                        this.uoy = y11;
                        this.f11789uq = true;
                        return false;
                    }
                }
                int i11 = this.f11774bs;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f11775cd = true;
                    fkw();
                    setScrollState(1);
                    this.fak = f10 > 0.0f ? this.osn + this.f11774bs : this.osn - this.f11774bs;
                    this.uoy = y11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.f11789uq = true;
                }
                if (this.f11775cd && vt(x11)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            ouw(motionEvent);
        }
        if (this.jvy == null) {
            this.jvy = VelocityTracker.obtain();
        }
        this.jvy.addMovement(motionEvent);
        return this.f11775cd;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.pno.lh.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        C0180lh c0180lh;
        C0180lh c0180lh2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.fvf = Math.min(measuredWidth / 10, this.f11784pd);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (c0180lh2 = (C0180lh) childAt.getLayoutParams()) != null && c0180lh2.ouw) {
                int i15 = c0180lh2.vt;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) c0180lh2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) c0180lh2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.jqy = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.ex = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f11786tc = true;
        vt();
        this.f11786tc = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((c0180lh = (C0180lh) childAt2.getLayoutParams()) == null || !c0180lh.ouw)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c0180lh.f11794lh), 1073741824), this.ex);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        vt vtVarOuw;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
        }
        while (i11 != i13) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (vtVarOuw = ouw(childAt)) != null && vtVarOuw.vt == this.yu && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ra)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ra raVar = (ra) parcelable;
        super.onRestoreInstanceState(raVar.vt);
        if (this.f11781lh != null) {
            ouw(raVar.f11795lh, false, true);
            return;
        }
        this.f11776cf = raVar.f11795lh;
        this.ryl = raVar.yu;
        this.mwh = raVar.fkw;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ra raVar = new ra(super.onSaveInstanceState());
        raVar.f11795lh = this.yu;
        if (this.f11781lh != null) {
            raVar.yu = com.bytedance.adsdk.ugeno.pno.vt.yu();
        }
        return raVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.zih;
            ouw(i10, i12, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar;
        int iFindPointerIndex;
        if (this.f11788ub) {
            return true;
        }
        boolean zYu = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (vtVar = this.f11781lh) == null || vtVar.ouw() == 0) {
            return false;
        }
        if (this.jvy == null) {
            this.jvy = VelocityTracker.obtain();
        }
        this.jvy.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f11778jg.abortAnimation();
            this.jae = false;
            vt();
            float x10 = motionEvent.getX();
            this.osn = x10;
            this.fak = x10;
            float y10 = motionEvent.getY();
            this.ey = y10;
            this.uoy = y10;
            this.rrs = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex != -1) {
                            this.fak = motionEvent.getX(actionIndex);
                            this.rrs = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (action == 6) {
                        ouw(motionEvent);
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.rrs);
                        if (iFindPointerIndex2 != -1) {
                            this.fak = motionEvent.getX(iFindPointerIndex2);
                        }
                    }
                } else if (this.f11775cd) {
                    ouw(this.yu, true, 0, false);
                    zYu = yu();
                }
            } else if (!this.f11775cd) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.rrs);
                if (iFindPointerIndex3 == -1) {
                    zYu = yu();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex3);
                    float fAbs = Math.abs(x11 - this.fak);
                    float y11 = motionEvent.getY(iFindPointerIndex3);
                    float fAbs2 = Math.abs(y11 - this.uoy);
                    if (fAbs > this.f11774bs && fAbs > fAbs2) {
                        this.f11775cd = true;
                        fkw();
                        float f10 = this.osn;
                        this.fak = x11 - f10 > 0.0f ? f10 + this.f11774bs : f10 - this.f11774bs;
                        this.uoy = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f11775cd) {
                        zYu = false | vt(motionEvent.getX(iFindPointerIndex));
                    }
                }
            } else if (this.f11775cd && (iFindPointerIndex = motionEvent.findPointerIndex(this.rrs)) != -1) {
                zYu = false | vt(motionEvent.getX(iFindPointerIndex));
            }
        } else if (this.f11775cd) {
            VelocityTracker velocityTracker = this.jvy;
            velocityTracker.computeCurrentVelocity(1000, this.hun);
            int xVelocity = (int) velocityTracker.getXVelocity(this.rrs);
            this.jae = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            vt vtVarLe = le();
            float f11 = clientWidth;
            int iMax = vtVarLe.vt;
            float f12 = ((scrollX / f11) - vtVarLe.fkw) / (vtVarLe.yu + (this.zih / f11));
            int iFindPointerIndex4 = motionEvent.findPointerIndex(this.rrs);
            if (iFindPointerIndex4 != -1) {
                if (Math.abs((int) (motionEvent.getX(iFindPointerIndex4) - this.osn)) <= this.ux || Math.abs(xVelocity) <= this.fqk) {
                    iMax += (int) (f12 + (iMax >= this.yu ? 0.4f : 0.6f));
                } else if (xVelocity <= 0) {
                    iMax++;
                }
                if (this.pno.size() > 0) {
                    vt vtVar2 = this.pno.get(0);
                    ArrayList<vt> arrayList = this.pno;
                    iMax = Math.max(vtVar2.vt, Math.min(iMax, arrayList.get(arrayList.size() - 1).vt));
                }
                ouw(iMax, true, true, xVelocity);
                zYu = yu();
            }
        }
        if (zYu) {
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final void ouw() {
        int iOuw = this.f11781lh.ouw();
        this.ouw = iOuw;
        boolean z10 = this.pno.size() < (this.f11783od * 2) + 1 && this.pno.size() < iOuw;
        int iMax = this.yu;
        int i10 = 0;
        while (i10 < this.pno.size()) {
            vt vtVar = this.pno.get(i10);
            int iLh = this.f11781lh.lh();
            if (iLh != -1) {
                if (iLh == -2) {
                    this.pno.remove(i10);
                    i10--;
                    this.f11781lh.ouw((ViewGroup) this, vtVar.ouw);
                    int i11 = this.yu;
                    if (i11 == vtVar.vt) {
                        iMax = Math.max(0, Math.min(i11, iOuw - 1));
                    }
                } else {
                    int i12 = vtVar.vt;
                    if (i12 != iLh) {
                        if (i12 == this.yu) {
                            iMax = iLh;
                        }
                        vtVar.vt = iLh;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        Collections.sort(this.pno, f11772le);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                C0180lh c0180lh = (C0180lh) getChildAt(i13).getLayoutParams();
                if (!c0180lh.ouw) {
                    c0180lh.f11794lh = 0.0f;
                }
            }
            ouw(iMax, false, true);
            requestLayout();
        }
    }

    public final void ouw(int i10, boolean z10) {
        this.jae = false;
        ouw(i10, z10, false);
    }

    public final void ouw(yu yuVar) {
        if (this.fkw == null) {
            this.fkw = new ArrayList();
        }
        this.fkw.add(yuVar);
    }

    public final void ouw(boolean z10, fkw fkwVar) {
        vt(z10, fkwVar);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f11786tc) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(com.bytedance.adsdk.ugeno.pno.vt vtVar) {
        com.bytedance.adsdk.ugeno.pno.vt vtVar2 = this.f11781lh;
        if (vtVar2 != null) {
            vtVar2.ouw(null);
            for (int i10 = 0; i10 < this.pno.size(); i10++) {
                this.f11781lh.ouw((ViewGroup) this, this.pno.get(i10).ouw);
            }
            this.pno.clear();
            int i11 = 0;
            while (i11 < getChildCount()) {
                if (!((C0180lh) getChildAt(i11).getLayoutParams()).ouw) {
                    removeViewAt(i11);
                    i11--;
                }
                i11++;
            }
            this.yu = 0;
            scrollTo(0, 0);
        }
        this.f11781lh = vtVar;
        this.ouw = 0;
        if (vtVar != null) {
            if (this.f11785rn == null) {
                this.f11785rn = new le();
            }
            this.f11781lh.ouw(this.f11785rn);
            this.jae = false;
            boolean z10 = this.f11792wp;
            this.f11792wp = true;
            this.ouw = this.f11781lh.ouw();
            int i12 = this.f11776cf;
            if (i12 >= 0) {
                ouw(i12, false, true);
                this.f11776cf = -1;
                this.ryl = null;
                this.mwh = null;
            } else if (z10) {
                requestLayout();
            } else {
                vt();
            }
        }
        List<Object> list = this.mt;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.mt.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.mt.get(i13);
        }
    }

    public void setCurrentItem(int i10) {
        this.jae = false;
        ouw(i10, !this.f11792wp, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f11783od) {
            this.f11783od = i10;
            vt();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(yu yuVar) {
        this.yib = yuVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.zih;
        this.zih = i10;
        int width = getWidth();
        ouw(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f11791vm = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.lvd == i10) {
            return;
        }
        this.lvd = i10;
        if (this.xdk != null) {
            boolean z10 = i10 != 0;
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).setLayerType(z10 ? this.zvq : 0, null);
            }
        }
        yu yuVar = this.yib;
        if (yuVar != null) {
            yuVar.tlj(i10);
        }
        List<yu> list = this.fkw;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                yu yuVar2 = this.fkw.get(i12);
                if (yuVar2 != null) {
                    yuVar2.tlj(i10);
                }
            }
        }
        yu yuVar3 = this.yhj;
        if (yuVar3 != null) {
            yuVar3.tlj(i10);
        }
    }

    public void setScroller(Scroller scroller) {
        this.f11778jg = scroller;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f11791vm;
    }

    public final void vt() {
        ouw(this.yu);
    }
}
