package com.mgs.carparking.shorttk;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.VelocityTrackerCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import androidx.core.widget.EdgeEffectCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
public class VerticalViewPager extends ViewGroup {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f44474h0 = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final Comparator<d> f44475i0 = new a();

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Interpolator f44476j0 = new b();

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final h f44477k0 = new h();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public EdgeEffectCompat P;
    public EdgeEffectCompat Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public ViewPager.OnPageChangeListener V;
    public ViewPager.OnPageChangeListener W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f f44478a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44479b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ViewPager.PageTransformer f44480b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44481c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Method f44482c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<d> f44483d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f44484d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f44485e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ArrayList<View> f44486e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f44487f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Runnable f44488f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PagerAdapter f44489g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f44490g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Parcelable f44493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ClassLoader f44494k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Scroller f44495l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g f44496m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f44497n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f44498o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f44499p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f44500q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f44501r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f44502s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44503t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44504u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f44505v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f44506w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f44507x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f44508y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f44509z;

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f44510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44512c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f44513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44515f;

        public LayoutParams() {
            super(-1, -1);
            this.f44512c = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f44512c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, VerticalViewPager.f44474h0);
            this.f44511b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f44517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ClassLoader f44518d;

        public class a implements ParcelableCompatCreatorCallbacks<SavedState> {
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f44516b = parcel.readInt();
            this.f44517c = parcel.readParcelable(classLoader);
            this.f44518d = classLoader;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f44516b + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f52302e;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f44516b);
            parcel.writeParcelable(this.f44517c, i10);
        }
    }

    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f44521b - dVar2.f44521b;
        }
    }

    public class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VerticalViewPager.this.setScrollState(0);
            VerticalViewPager.this.D();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f44520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f44522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f44523d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f44524e;
    }

    public class e extends AccessibilityDelegateCompat {
        public e() {
        }

        public final boolean canScroll() {
            return VerticalViewPager.this.f44489g != null && VerticalViewPager.this.f44489g.getCount() > 1;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            AccessibilityRecordCompat accessibilityRecordCompatObtain = AccessibilityRecordCompat.obtain();
            accessibilityRecordCompatObtain.setScrollable(canScroll());
            if (accessibilityEvent.getEventType() != 4096 || VerticalViewPager.this.f44489g == null) {
                return;
            }
            accessibilityRecordCompatObtain.setItemCount(VerticalViewPager.this.f44489g.getCount());
            accessibilityRecordCompatObtain.setFromIndex(VerticalViewPager.this.f44491h);
            accessibilityRecordCompatObtain.setToIndex(VerticalViewPager.this.f44491h);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
            accessibilityNodeInfoCompat.setScrollable(canScroll());
            if (VerticalViewPager.this.v(1)) {
                accessibilityNodeInfoCompat.addAction(4096);
            }
            if (VerticalViewPager.this.v(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!VerticalViewPager.this.v(1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager = VerticalViewPager.this;
                verticalViewPager.setCurrentItem(verticalViewPager.f44491h + 1);
                return true;
            }
            if (i10 != 8192 || !VerticalViewPager.this.v(-1)) {
                return false;
            }
            VerticalViewPager verticalViewPager2 = VerticalViewPager.this;
            verticalViewPager2.setCurrentItem(verticalViewPager2.f44491h - 1);
            return true;
        }
    }

    public interface f {
        void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public class g extends DataSetObserver {
        public g() {
        }

        public /* synthetic */ g(VerticalViewPager verticalViewPager, a aVar) {
            this();
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            VerticalViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            VerticalViewPager.this.j();
        }
    }

    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z10 = layoutParams.f44510a;
            return z10 != layoutParams2.f44510a ? z10 ? 1 : -1 : layoutParams.f44514e - layoutParams2.f44514e;
        }
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44479b = 4096;
        this.f44483d = new ArrayList<>();
        this.f44485e = new d();
        this.f44487f = new Rect();
        this.f44492i = -1;
        this.f44493j = null;
        this.f44494k = null;
        this.f44501r = -3.4028235E38f;
        this.f44502s = Float.MAX_VALUE;
        this.f44508y = 1;
        this.I = -1;
        this.R = true;
        this.S = false;
        this.f44488f0 = new c();
        this.f44490g0 = 0;
        u();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollState(int i10) {
        if (this.f44490g0 == i10) {
            return;
        }
        this.f44490g0 = i10;
        if (this.f44480b0 != null) {
            m(i10 != 0);
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.V;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i10);
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.f44506w != z10) {
            this.f44506w = z10;
        }
    }

    public final boolean A(int i10) {
        if (this.f44483d.size() == 0) {
            this.T = false;
            x(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        d dVarS = s();
        int clientHeight = getClientHeight();
        int i11 = this.f44497n;
        int i12 = clientHeight + i11;
        float f10 = clientHeight;
        int i13 = dVarS.f44521b;
        float f11 = ((i10 / f10) - dVarS.f44524e) / (dVarS.f44523d + (i11 / f10));
        this.T = false;
        x(i13, f11, (int) (i12 * f11));
        if (this.T) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public boolean B() {
        int i10 = this.f44491h;
        if (i10 <= 0) {
            return false;
        }
        J(i10 - 1, true);
        return true;
    }

    public final boolean C(float f10) {
        boolean z10;
        float f11 = this.F - f10;
        this.F = f10;
        float scrollY = getScrollY() + f11;
        float clientHeight = getClientHeight();
        float f12 = this.f44501r * clientHeight;
        float f13 = this.f44502s * clientHeight;
        d dVar = this.f44483d.get(0);
        ArrayList<d> arrayList = this.f44483d;
        boolean z11 = true;
        d dVar2 = arrayList.get(arrayList.size() - 1);
        if (dVar.f44521b != 0) {
            f12 = dVar.f44524e * clientHeight;
            z10 = false;
        } else {
            z10 = true;
        }
        if (dVar2.f44521b != this.f44489g.getCount() - 1) {
            f13 = dVar2.f44524e * clientHeight;
            z11 = false;
        }
        if (scrollY < f12) {
            zOnPull = z10 ? this.P.onPull(Math.abs(f12 - scrollY) / clientHeight) : false;
            scrollY = f12;
        } else if (scrollY > f13) {
            zOnPull = z11 ? this.Q.onPull(Math.abs(scrollY - f13) / clientHeight) : false;
            scrollY = f13;
        }
        int i10 = (int) scrollY;
        this.E += scrollY - i10;
        scrollTo(getScrollX(), i10);
        A(i10);
        return zOnPull;
    }

    public void D() {
        E(this.f44491h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe A[PHI: r6 r8 r11
      0x00fe: PHI (r6v43 float) = (r6v41 float), (r6v42 float), (r6v10 float) binds: [B:64:0x00f3, B:61:0x00dd, B:55:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r8v6 int) = (r8v5 int), (r8v4 int), (r8v9 int) binds: [B:64:0x00f3, B:61:0x00dd, B:55:0x00c7] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r11v7 int) = (r11v1 int), (r11v6 int), (r11v10 int) binds: [B:64:0x00f3, B:61:0x00dd, B:55:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(int r18) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.shorttk.VerticalViewPager.E(int):void");
    }

    public final void F(int i10, int i11, int i12, int i13) {
        if (i11 <= 0 || this.f44483d.isEmpty()) {
            d dVarT = t(this.f44491h);
            int iMin = (int) ((dVarT != null ? Math.min(dVarT.f44524e, this.f44502s) : 0.0f) * ((i10 - getPaddingTop()) - getPaddingBottom()));
            if (iMin != getScrollY()) {
                i(false);
                scrollTo(getScrollX(), iMin);
                return;
            }
            return;
        }
        int scrollY = (int) ((getScrollY() / (((i11 - getPaddingTop()) - getPaddingBottom()) + i13)) * (((i10 - getPaddingTop()) - getPaddingBottom()) + i12));
        scrollTo(getScrollX(), scrollY);
        if (this.f44495l.isFinished()) {
            return;
        }
        this.f44495l.startScroll(0, scrollY, 0, (int) (t(this.f44491h).f44524e * i10), this.f44495l.getDuration() - this.f44495l.timePassed());
    }

    public final void G() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((LayoutParams) getChildAt(i10).getLayoutParams()).f44510a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void H(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    public final void I(int i10, boolean z10, int i11, boolean z11) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        ViewPager.OnPageChangeListener onPageChangeListener3;
        ViewPager.OnPageChangeListener onPageChangeListener4;
        d dVarT = t(i10);
        int clientHeight = dVarT != null ? (int) (getClientHeight() * Math.max(this.f44501r, Math.min(dVarT.f44524e, this.f44502s))) : 0;
        if (z10) {
            M(0, clientHeight, i11);
            if (z11 && (onPageChangeListener4 = this.V) != null) {
                onPageChangeListener4.onPageSelected(i10);
            }
            if (!z11 || (onPageChangeListener3 = this.W) == null) {
                return;
            }
            onPageChangeListener3.onPageSelected(i10);
            return;
        }
        if (z11 && (onPageChangeListener2 = this.V) != null) {
            onPageChangeListener2.onPageSelected(i10);
        }
        if (z11 && (onPageChangeListener = this.W) != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        i(false);
        scrollTo(0, clientHeight);
        A(clientHeight);
    }

    public void J(int i10, boolean z10) {
        this.f44507x = false;
        K(i10, z10, false);
    }

    public void K(int i10, boolean z10, boolean z11) {
        L(i10, z10, z11, 0);
    }

    public void L(int i10, boolean z10, boolean z11, int i11) {
        ViewPager.OnPageChangeListener onPageChangeListener;
        ViewPager.OnPageChangeListener onPageChangeListener2;
        PagerAdapter pagerAdapter = this.f44489g;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f44491h == i10 && this.f44483d.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f44489g.getCount()) {
            i10 = this.f44489g.getCount() - 1;
        }
        int i12 = this.f44508y;
        int i13 = this.f44491h;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f44483d.size(); i14++) {
                this.f44483d.get(i14).f44522c = true;
            }
        }
        boolean z12 = this.f44491h != i10;
        if (!this.R) {
            E(i10);
            I(i10, z10, i11, z12);
            return;
        }
        this.f44491h = i10;
        if (z12 && (onPageChangeListener2 = this.V) != null) {
            onPageChangeListener2.onPageSelected(i10);
        }
        if (z12 && (onPageChangeListener = this.W) != null) {
            onPageChangeListener.onPageSelected(i10);
        }
        requestLayout();
    }

    public void M(int i10, int i11, int i12) {
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            i(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientHeight = getClientHeight();
        int i15 = clientHeight / 2;
        float f10 = clientHeight;
        float f11 = i15;
        float fL = f11 + (l(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fL / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i13) / ((f10 * this.f44489g.getPageWidth(this.f44491h)) + this.f44497n)) + 1.0f) * 100.0f);
        }
        this.f44495l.startScroll(scrollX, scrollY, i13, i14, Math.min(iAbs, 600));
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public final void N() {
        if (this.f44484d0 != 0) {
            ArrayList<View> arrayList = this.f44486e0;
            if (arrayList == null) {
                this.f44486e0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f44486e0.add(getChildAt(i10));
            }
            Collections.sort(this.f44486e0, f44477k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        d dVarR;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f44521b == this.f44491h) {
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
        d dVarR;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f44521b == this.f44491h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z10 = layoutParams2.f44510a | false;
        layoutParams2.f44510a = z10;
        if (!this.f44505v) {
            super.addView(view, i10, layoutParams);
        } else {
            if (z10) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.f44513d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f44495l.isFinished() || !this.f44495l.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f44495l.getCurrX();
        int currY = this.f44495l.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currY)) {
                this.f44495l.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        ViewCompat.postInvalidateOnAnimation(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        d dVarR;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f44521b == this.f44491h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = ViewCompat.getOverScrollMode(this);
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.f44489g) != null && pagerAdapter.getCount() > 1)) {
            if (!this.P.isFinished()) {
                int iSave = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.f44501r * height);
                this.P.setSize(width, height);
                zDraw = false | this.P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Q.isFinished()) {
                int iSave2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.f44502s + 1.0f)) * height2);
                this.Q.setSize(width2, height2);
                zDraw |= this.Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.P.finish();
            this.Q.finish();
        }
        if (zDraw) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f44498o;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public d e(int i10, int i11) {
        d dVar = new d();
        dVar.f44521b = i10;
        dVar.f44520a = this.f44489g.instantiateItem((ViewGroup) this, i10);
        dVar.f44523d = this.f44489g.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.f44483d.size()) {
            this.f44483d.add(dVar);
        } else {
            this.f44483d.add(i11, dVar);
        }
        return dVar;
    }

    public boolean f(int i10) {
        boolean z10;
        boolean zRequestFocus;
        View viewFindFocus = findFocus();
        boolean zB = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z10 = false;
                    break;
                }
                if (parent == this) {
                    z10 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb2.append(" => ");
                    sb2.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb2.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus != null && viewFindNextFocus != viewFindFocus) {
            if (i10 == 33) {
                zRequestFocus = (viewFindFocus == null || p(this.f44487f, viewFindNextFocus).top < p(this.f44487f, viewFindFocus).top) ? viewFindNextFocus.requestFocus() : B();
            } else if (i10 == 130) {
                zRequestFocus = (viewFindFocus == null || p(this.f44487f, viewFindNextFocus).bottom > p(this.f44487f, viewFindFocus).bottom) ? viewFindNextFocus.requestFocus() : z();
            }
            zB = zRequestFocus;
        } else if (i10 == 33 || i10 == 1) {
            zB = B();
        } else if (i10 == 130 || i10 == 2) {
            zB = z();
        }
        if (zB) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zB;
    }

    public final void g(d dVar, int i10, d dVar2) {
        int i11;
        int i12;
        d dVar3;
        d dVar4;
        int count = this.f44489g.getCount();
        int clientHeight = getClientHeight();
        float f10 = clientHeight > 0 ? this.f44497n / clientHeight : 0.0f;
        if (dVar2 != null) {
            int i13 = dVar2.f44521b;
            int i14 = dVar.f44521b;
            if (i13 < i14) {
                float pageWidth = dVar2.f44524e + dVar2.f44523d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= dVar.f44521b && i16 < this.f44483d.size()) {
                    d dVar5 = this.f44483d.get(i16);
                    while (true) {
                        dVar4 = dVar5;
                        if (i15 <= dVar4.f44521b || i16 >= this.f44483d.size() - 1) {
                            break;
                        }
                        i16++;
                        dVar5 = this.f44483d.get(i16);
                    }
                    while (i15 < dVar4.f44521b) {
                        pageWidth += this.f44489g.getPageWidth(i15) + f10;
                        i15++;
                    }
                    dVar4.f44524e = pageWidth;
                    pageWidth += dVar4.f44523d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f44483d.size() - 1;
                float pageWidth2 = dVar2.f44524e;
                while (true) {
                    i13--;
                    if (i13 < dVar.f44521b || size < 0) {
                        break;
                    }
                    d dVar6 = this.f44483d.get(size);
                    while (true) {
                        dVar3 = dVar6;
                        if (i13 >= dVar3.f44521b || size <= 0) {
                            break;
                        }
                        size--;
                        dVar6 = this.f44483d.get(size);
                    }
                    while (i13 > dVar3.f44521b) {
                        pageWidth2 -= this.f44489g.getPageWidth(i13) + f10;
                        i13--;
                    }
                    pageWidth2 -= dVar3.f44523d + f10;
                    dVar3.f44524e = pageWidth2;
                }
            }
        }
        int size2 = this.f44483d.size();
        float pageWidth3 = dVar.f44524e;
        int i17 = dVar.f44521b;
        int i18 = i17 - 1;
        this.f44501r = i17 == 0 ? pageWidth3 : -3.4028235E38f;
        int i19 = count - 1;
        this.f44502s = i17 == i19 ? (dVar.f44523d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            d dVar7 = this.f44483d.get(i20);
            while (true) {
                i12 = dVar7.f44521b;
                if (i18 <= i12) {
                    break;
                }
                pageWidth3 -= this.f44489g.getPageWidth(i18) + f10;
                i18--;
            }
            pageWidth3 -= dVar7.f44523d + f10;
            dVar7.f44524e = pageWidth3;
            if (i12 == 0) {
                this.f44501r = pageWidth3;
            }
            i20--;
            i18--;
        }
        float pageWidth4 = dVar.f44524e + dVar.f44523d + f10;
        int i21 = dVar.f44521b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            d dVar8 = this.f44483d.get(i22);
            while (true) {
                i11 = dVar8.f44521b;
                if (i21 >= i11) {
                    break;
                }
                pageWidth4 += this.f44489g.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f44502s = (dVar8.f44523d + pageWidth4) - 1.0f;
            }
            dVar8.f44524e = pageWidth4;
            pageWidth4 += dVar8.f44523d + f10;
            i22++;
            i21++;
        }
        this.S = false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public PagerAdapter getAdapter() {
        return this.f44489g;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (this.f44484d0 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((LayoutParams) this.f44486e0.get(i11).getLayoutParams()).f44515f;
    }

    public int getCurrentItem() {
        return this.f44491h;
    }

    public int getOffscreenPageLimit() {
        return this.f44508y;
    }

    public int getPageMargin() {
        return this.f44497n;
    }

    public boolean h(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i12 + scrollY;
                if (i14 >= childAt.getTop() && i14 < childAt.getBottom() && (i13 = i11 + scrollX) >= childAt.getLeft() && i13 < childAt.getRight() && h(childAt, true, i10, i13 - childAt.getLeft(), i14 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && ViewCompat.canScrollVertically(view, -i10);
    }

    public final void i(boolean z10) {
        boolean z11 = this.f44490g0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            this.f44495l.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.f44495l.getCurrX();
            int currY = this.f44495l.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
            }
        }
        this.f44507x = false;
        for (int i10 = 0; i10 < this.f44483d.size(); i10++) {
            d dVar = this.f44483d.get(i10);
            if (dVar.f44522c) {
                dVar.f44522c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                ViewCompat.postOnAnimation(this, this.f44488f0);
            } else {
                this.f44488f0.run();
            }
        }
    }

    public void j() {
        int count = this.f44489g.getCount();
        this.f44481c = count;
        boolean z10 = this.f44483d.size() < (this.f44508y * 2) + 1 && this.f44483d.size() < count;
        int iMax = this.f44491h;
        int i10 = 0;
        boolean z11 = false;
        while (i10 < this.f44483d.size()) {
            d dVar = this.f44483d.get(i10);
            int itemPosition = this.f44489g.getItemPosition(dVar.f44520a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f44483d.remove(i10);
                    i10--;
                    if (!z11) {
                        this.f44489g.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f44489g.destroyItem((ViewGroup) this, dVar.f44521b, dVar.f44520a);
                    int i11 = this.f44491h;
                    if (i11 == dVar.f44521b) {
                        iMax = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = dVar.f44521b;
                    if (i12 != itemPosition) {
                        if (i12 == this.f44491h) {
                            iMax = itemPosition;
                        }
                        dVar.f44521b = itemPosition;
                    }
                }
                z10 = true;
            }
            i10++;
        }
        if (z11) {
            this.f44489g.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f44483d, f44475i0);
        if (z10) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i13).getLayoutParams();
                if (!layoutParams.f44510a) {
                    layoutParams.f44512c = 0.0f;
                }
            }
            K(iMax, false, true);
            requestLayout();
        }
    }

    public final int k(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.M || Math.abs(i11) <= this.K) {
            i10 = (int) (i10 + f10 + (i10 >= this.f44491h ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f44483d.size() <= 0) {
            return i10;
        }
        return Math.max(this.f44483d.get(0).f44521b, Math.min(i10, this.f44483d.get(r4.size() - 1).f44521b));
    }

    public float l(float f10) {
        return (float) Math.sin((float) (((double) (f10 - 0.5f)) * 0.4712389167638204d));
    }

    public final void m(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            ViewCompat.setLayerType(getChildAt(i10), z10 ? 2 : 0, null);
        }
    }

    public final void n() {
        this.f44509z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
    }

    public boolean o(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return f(17);
            }
            if (keyCode == 22) {
                return f(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return f(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return f(1);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f44488f0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.f44497n <= 0 || this.f44498o == null || this.f44483d.size() <= 0 || this.f44489g == null) {
            return;
        }
        int scrollY = getScrollY();
        float height = getHeight();
        float f12 = this.f44497n / height;
        int i11 = 0;
        d dVar = this.f44483d.get(0);
        float f13 = dVar.f44524e;
        int size = this.f44483d.size();
        int i12 = dVar.f44521b;
        int i13 = this.f44483d.get(size - 1).f44521b;
        while (i12 < i13) {
            while (true) {
                i10 = dVar.f44521b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                dVar = this.f44483d.get(i11);
            }
            if (i12 == i10) {
                float f14 = dVar.f44524e;
                float f15 = dVar.f44523d;
                f10 = (f14 + f15) * height;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f44489g.getPageWidth(i12);
                f10 = (f13 + pageWidth) * height;
                f13 += pageWidth + f12;
            }
            int i14 = this.f44497n;
            if (i14 + f10 > scrollY) {
                f11 = f12;
                this.f44498o.setBounds(this.f44499p, (int) f10, this.f44500q, (int) (i14 + f10 + 0.5f));
                this.f44498o.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollY + r2) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.f44509z = false;
            this.A = false;
            this.I = -1;
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.J = null;
            }
            return false;
        }
        if (action != 0) {
            if (this.f44509z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = MotionEventCompat.getPointerId(motionEvent, 0);
            this.A = false;
            this.f44495l.computeScrollOffset();
            if (this.f44490g0 != 2 || Math.abs(this.f44495l.getFinalY() - this.f44495l.getCurrY()) <= this.N) {
                i(false);
                this.f44509z = false;
            } else {
                this.f44495l.abortAnimation();
                this.f44507x = false;
                D();
                this.f44509z = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.I;
            if (i10 != -1) {
                int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, i10);
                float y11 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                float f10 = y11 - this.F;
                float fAbs = Math.abs(f10);
                float x11 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                float fAbs2 = Math.abs(x11 - this.G);
                if (f10 != 0.0f && !w(this.F, f10) && h(this, false, (int) f10, (int) x11, (int) y11)) {
                    this.E = x11;
                    this.F = y11;
                    this.A = true;
                    return false;
                }
                int i11 = this.D;
                if (fAbs > i11 && fAbs * 0.5f > fAbs2) {
                    this.f44509z = true;
                    H(true);
                    setScrollState(1);
                    this.F = f10 > 0.0f ? this.H + this.D : this.H - this.D;
                    this.E = x11;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i11) {
                    this.A = true;
                }
                if (this.f44509z && C(y11)) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.f44509z;
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
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.shorttk.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredHeight = getMeasuredHeight();
        this.C = Math.min(measuredHeight / 10, this.B);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f44510a) {
                int i15 = layoutParams2.f44511b;
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
                int i19 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = measuredWidth;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = measuredWidth;
                }
                int i20 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i20 == -2) {
                    i20 = paddingTop;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = paddingTop;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    paddingTop -= childAt.getMeasuredHeight();
                } else if (z10) {
                    measuredWidth -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f44503t = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.f44504u = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.f44505v = true;
        D();
        this.f44505v = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) != null || !layoutParams.f44510a)) {
                childAt2.measure(this.f44503t, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * layoutParams.f44512c), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        d dVarR;
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
            if (childAt.getVisibility() == 0 && (dVarR = r(childAt)) != null && dVarR.f44521b == this.f44491h && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.f44489g;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(savedState.f44517c, savedState.f44518d);
            K(savedState.f44516b, false, true);
        } else {
            this.f44492i = savedState.f44516b;
            this.f44493j = savedState.f44517c;
            this.f44494k = savedState.f44518d;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44516b = this.f44491h;
        PagerAdapter pagerAdapter = this.f44489g;
        if (pagerAdapter != null) {
            savedState.f44517c = pagerAdapter.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i11 != i13) {
            int i14 = this.f44497n;
            F(i11, i13, i14, i14);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        boolean zOnRelease;
        boolean zOnRelease2;
        if (this.O) {
            return true;
        }
        boolean zC = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.f44489g) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f44495l.abortAnimation();
            this.f44507x = false;
            D();
            float x10 = motionEvent.getX();
            this.G = x10;
            this.E = x10;
            float y10 = motionEvent.getY();
            this.H = y10;
            this.F = y10;
            this.I = MotionEventCompat.getPointerId(motionEvent, 0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f44509z) {
                    int iFindPointerIndex = MotionEventCompat.findPointerIndex(motionEvent, this.I);
                    float y11 = MotionEventCompat.getY(motionEvent, iFindPointerIndex);
                    float fAbs = Math.abs(y11 - this.F);
                    float x11 = MotionEventCompat.getX(motionEvent, iFindPointerIndex);
                    float fAbs2 = Math.abs(x11 - this.E);
                    if (fAbs > this.D && fAbs > fAbs2) {
                        this.f44509z = true;
                        H(true);
                        float f10 = this.H;
                        this.F = y11 - f10 > 0.0f ? f10 + this.D : f10 - this.D;
                        this.E = x11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.f44509z) {
                    zC = false | C(MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.I)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.F = MotionEventCompat.getY(motionEvent, actionIndex);
                    this.I = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                } else if (action == 6) {
                    y(motionEvent);
                    this.F = MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.I));
                }
            } else if (this.f44509z) {
                I(this.f44491h, true, 0, false);
                this.I = -1;
                n();
                zOnRelease = this.P.onRelease();
                zOnRelease2 = this.Q.onRelease();
                zC = zOnRelease | zOnRelease2;
            }
        } else if (this.f44509z) {
            VelocityTracker velocityTracker = this.J;
            velocityTracker.computeCurrentVelocity(1000, this.L);
            int yVelocity = (int) VelocityTrackerCompat.getYVelocity(velocityTracker, this.I);
            this.f44507x = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            d dVarS = s();
            L(k(dVarS.f44521b, ((scrollY / clientHeight) - dVarS.f44524e) / dVarS.f44523d, yVelocity, (int) (MotionEventCompat.getY(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.I)) - this.H)), true, true, yVelocity);
            this.I = -1;
            n();
            zOnRelease = this.P.onRelease();
            zOnRelease2 = this.Q.onRelease();
            zC = zOnRelease | zOnRelease2;
        }
        if (zC) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public final Rect p(Rect rect, View view) {
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

    public d q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public d r(View view) {
        for (int i10 = 0; i10 < this.f44483d.size(); i10++) {
            d dVar = this.f44483d.get(i10);
            if (this.f44489g.isViewFromObject(view, dVar.f44520a)) {
                return dVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f44505v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final d s() {
        int i10;
        int clientHeight = getClientHeight();
        float f10 = 0.0f;
        float scrollY = clientHeight > 0 ? getScrollY() / clientHeight : 0.0f;
        float f11 = clientHeight > 0 ? this.f44497n / clientHeight : 0.0f;
        d dVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.f44483d.size()) {
            d dVar2 = this.f44483d.get(i11);
            if (!z10 && dVar2.f44521b != (i10 = i12 + 1)) {
                dVar2 = this.f44485e;
                dVar2.f44524e = f10 + f12 + f11;
                dVar2.f44521b = i10;
                dVar2.f44523d = this.f44489g.getPageWidth(i10);
                i11--;
            }
            f10 = dVar2.f44524e;
            float f13 = dVar2.f44523d + f10 + f11;
            if (!z10 && scrollY < f10) {
                return dVar;
            }
            if (scrollY < f13 || i11 == this.f44483d.size() - 1) {
                return dVar2;
            }
            i12 = dVar2.f44521b;
            f12 = dVar2.f44523d;
            i11++;
            z10 = false;
            dVar = dVar2;
        }
        return dVar;
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.f44489g;
        if (pagerAdapter2 != null) {
            pagerAdapter2.unregisterDataSetObserver(this.f44496m);
            this.f44489g.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f44483d.size(); i10++) {
                d dVar = this.f44483d.get(i10);
                this.f44489g.destroyItem((ViewGroup) this, dVar.f44521b, dVar.f44520a);
            }
            this.f44489g.finishUpdate((ViewGroup) this);
            this.f44483d.clear();
            G();
            this.f44491h = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.f44489g;
        this.f44489g = pagerAdapter;
        this.f44481c = 0;
        if (pagerAdapter != null) {
            a aVar = null;
            if (this.f44496m == null) {
                this.f44496m = new g(this, aVar);
            }
            this.f44489g.registerDataSetObserver(this.f44496m);
            this.f44507x = false;
            boolean z10 = this.R;
            this.R = true;
            this.f44481c = this.f44489g.getCount();
            if (this.f44492i >= 0) {
                this.f44489g.restoreState(this.f44493j, this.f44494k);
                K(this.f44492i, false, true);
                this.f44492i = -1;
                this.f44493j = null;
                this.f44494k = null;
            } else if (z10) {
                requestLayout();
            } else {
                D();
            }
        }
        f fVar = this.f44478a0;
        if (fVar == null || pagerAdapter3 == pagerAdapter) {
            return;
        }
        fVar.a(pagerAdapter3, pagerAdapter);
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z10) {
        if (this.f44482c0 == null) {
            try {
                this.f44482c0 = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e10) {
                Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e10);
            }
        }
        try {
            this.f44482c0.invoke(this, Boolean.valueOf(z10));
        } catch (Exception e11) {
            Log.e("ViewPager", "Error changing children drawing order", e11);
        }
    }

    public void setCurrentItem(int i10) {
        this.f44507x = false;
        K(i10, !this.R, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.f44508y) {
            this.f44508y = i10;
            D();
        }
    }

    public void setOnAdapterChangeListener(f fVar) {
        this.f44478a0 = fVar;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.V = onPageChangeListener;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f44497n;
        this.f44497n = i10;
        int height = getHeight();
        F(height, height, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f44498o = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public d t(int i10) {
        for (int i11 = 0; i11 < this.f44483d.size(); i11++) {
            d dVar = this.f44483d.get(i11);
            if (dVar.f44521b == i10) {
                return dVar;
            }
        }
        return null;
    }

    public void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f44495l = new Scroller(context, f44476j0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.D = ViewConfigurationCompat.getScaledPagingTouchSlop(viewConfiguration);
        this.K = (int) (400.0f * f10);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffectCompat(context);
        this.Q = new EdgeEffectCompat(context);
        this.M = (int) (25.0f * f10);
        this.N = (int) (2.0f * f10);
        this.B = (int) (f10 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new e());
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
    }

    public boolean v(int i10) {
        if (this.f44489g == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        return i10 < 0 ? scrollY > ((int) (((float) clientHeight) * this.f44501r)) : i10 > 0 && scrollY < ((int) (((float) clientHeight) * this.f44502s));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f44498o;
    }

    public final boolean w(float f10, float f11) {
        return (f10 < ((float) this.C) && f11 > 0.0f) || (f10 > ((float) (getHeight() - this.C)) && f11 < 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void x(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.U
            r1 = 0
            if (r0 <= 0) goto L6e
            int r0 = r11.getScrollY()
            int r2 = r11.getPaddingTop()
            int r3 = r11.getPaddingBottom()
            int r4 = r11.getHeight()
            int r5 = r11.getChildCount()
            r6 = r1
        L1a:
            if (r6 >= r5) goto L6e
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            com.mgs.carparking.shorttk.VerticalViewPager$LayoutParams r8 = (com.mgs.carparking.shorttk.VerticalViewPager.LayoutParams) r8
            boolean r9 = r8.f44510a
            if (r9 != 0) goto L2b
            goto L6b
        L2b:
            int r8 = r8.f44511b
            r8 = r8 & 112(0x70, float:1.57E-43)
            r9 = 16
            if (r8 == r9) goto L50
            r9 = 48
            if (r8 == r9) goto L4a
            r9 = 80
            if (r8 == r9) goto L3d
            r8 = r2
            goto L5f
        L3d:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredHeight()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredHeight()
            int r3 = r3 + r9
            goto L5c
        L4a:
            int r8 = r7.getHeight()
            int r8 = r8 + r2
            goto L5f
        L50:
            int r8 = r7.getMeasuredHeight()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L5c:
            r10 = r8
            r8 = r2
            r2 = r10
        L5f:
            int r2 = r2 + r0
            int r9 = r7.getTop()
            int r2 = r2 - r9
            if (r2 == 0) goto L6a
            r7.offsetTopAndBottom(r2)
        L6a:
            r2 = r8
        L6b:
            int r6 = r6 + 1
            goto L1a
        L6e:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r11.V
            if (r0 == 0) goto L75
            r0.onPageScrolled(r12, r13, r14)
        L75:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r11.W
            if (r0 == 0) goto L7c
            r0.onPageScrolled(r12, r13, r14)
        L7c:
            androidx.viewpager.widget.ViewPager$PageTransformer r12 = r11.f44480b0
            if (r12 == 0) goto Lad
            int r12 = r11.getScrollY()
            int r13 = r11.getChildCount()
        L88:
            if (r1 >= r13) goto Lad
            android.view.View r14 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            com.mgs.carparking.shorttk.VerticalViewPager$LayoutParams r0 = (com.mgs.carparking.shorttk.VerticalViewPager.LayoutParams) r0
            boolean r0 = r0.f44510a
            if (r0 == 0) goto L99
            goto Laa
        L99:
            int r0 = r14.getTop()
            int r0 = r0 - r12
            float r0 = (float) r0
            int r2 = r11.getClientHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            androidx.viewpager.widget.ViewPager$PageTransformer r2 = r11.f44480b0
            r2.transformPage(r14, r0)
        Laa:
            int r1 = r1 + 1
            goto L88
        Lad:
            r12 = 1
            r11.T = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mgs.carparking.shorttk.VerticalViewPager.x(int, float, int):void");
    }

    public final void y(MotionEvent motionEvent) {
        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
        if (MotionEventCompat.getPointerId(motionEvent, actionIndex) == this.I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.F = MotionEventCompat.getY(motionEvent, i10);
            this.I = MotionEventCompat.getPointerId(motionEvent, i10);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean z() {
        PagerAdapter pagerAdapter = this.f44489g;
        if (pagerAdapter == null || this.f44491h >= pagerAdapter.getCount() - 1) {
            return false;
        }
        J(this.f44491h + 1, true);
        return true;
    }
}
