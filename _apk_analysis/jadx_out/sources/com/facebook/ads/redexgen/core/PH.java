package com.facebook.ads.redexgen.core;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
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
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$DecorView;
import com.facebook.ads.internal.androidx.support.v4.view.ViewPager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PH extends ViewGroup {
    public static byte[] A0s;
    public static String[] A0t = {"e0WzfCgg5XcVfGi", "ISw7K0NC0JjGKw3aqLZnEeCyQmnJarTP", "Hy7VicQaJFFlWaz3OdTjA4ZWS7Vff8v7", "WcFZxi67WO2ZtzqmgJX02c4dryVYoE5T", "rF0iooiSTOADQgiXw4j324HAbDkNAAle", "vgT88YiEWUZNicvmty9GpsXkAZSLF8rx", "LdGmA2eGd1B3SK0OmViQAh3pNWcZcixS", "9ZqOeGgvX4TfhHbWbTIbZxI4Pt81j06N"};
    public static final int[] A0u;
    public static final Interpolator A0v;
    public static final PG A0w;
    public static final Comparator<P9> A0x;
    public int A00;
    public AbstractC2032Oo A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public Drawable A0S;
    public Parcelable A0T;
    public VelocityTracker A0U;
    public EdgeEffect A0V;
    public EdgeEffect A0W;
    public Scroller A0X;
    public PC A0Y;
    public PE A0Z;
    public ClassLoader A0a;
    public ArrayList<View> A0b;
    public List<ViewPager.OnAdapterChangeListener> A0c;
    public List<PC> A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public boolean A0n;
    public final Rect A0o;
    public final P9 A0p;
    public final Runnable A0q;
    public final ArrayList<P9> A0r;

    static {
        A0C();
        A0u = new int[]{R.attr.layout_gravity};
        A0x = new P5();
        A0v = new P6();
        A0w = new PG();
    }

    public PH(Context context) {
        super(context);
        this.A0r = new ArrayList<>();
        this.A0p = new P9();
        this.A0o = new Rect();
        this.A0O = -1;
        this.A0T = null;
        this.A0a = null;
        this.A02 = -3.4028235E38f;
        this.A07 = Float.MAX_VALUE;
        this.A0L = 1;
        this.A08 = -1;
        this.A0g = true;
        this.A0l = false;
        this.A0q = new P7(this);
        this.A0P = 0;
        A0D();
    }

    private final float A00(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private int A01(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.A0H || Math.abs(i11) <= this.A0K) {
            i10 = ((int) (f10 + (i10 >= this.A00 ? 0.4f : 0.6f))) + i10;
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.A0r.size() > 0) {
            return Math.max(this.A0r.get(0).A02, Math.min(i10, this.A0r.get(this.A0r.size() - 1).A02));
        }
        return i10;
    }

    private Rect A02(Rect rect, View view) {
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
            int i10 = rect.bottom;
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[5] = "TxsWzRbkVVm53KJb0hYxYLTaFP4RvuCR";
            strArr2[3] = "7IWTmTKlEE0GT3GusYYvAPWFxogbhPhf";
            rect.bottom = i10 + viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private P9 A03() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f10 = clientWidth > 0 ? this.A0M / clientWidth : 0.0f;
        int i10 = -1;
        float f11 = 0.0f;
        float f12 = 0.0f;
        boolean z10 = true;
        P9 p92 = null;
        int i11 = 0;
        while (i11 < this.A0r.size()) {
            P9 p93 = this.A0r.get(i11);
            if (!z10 && p93.A02 != i10 + 1) {
                p93 = this.A0p;
                p93.A00 = f11 + f12 + f10;
                p93.A02 = i10 + 1;
                p93.A01 = this.A01.A00(p93.A02);
                i11--;
            }
            f11 = p93.A00;
            float f13 = p93.A01 + f11;
            String[] strArr = A0t;
            if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A0t[0] = "anv8UthCgv3bxkb";
            float f14 = f13 + f10;
            if (!z10 && scrollX < f11) {
                return p92;
            }
            if (scrollX < f14 || i11 == this.A0r.size() - 1) {
                return p93;
            }
            z10 = false;
            i10 = p93.A02;
            f12 = p93.A01;
            p92 = p93;
            i11++;
        }
        return p92;
    }

    private final P9 A04(int i10) {
        for (int i11 = 0; i11 < this.A0r.size(); i11++) {
            P9 p92 = this.A0r.get(i11);
            int i12 = p92.A02;
            if (A0t[6].charAt(18) == '5') {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[5] = "FTW8lMLV1WF1uT7A98mx1WW44JTpX4mD";
            strArr[3] = "8smTuGxWqqiqky02WbAruJcj0nAU8eAT";
            if (i12 == i10) {
                return p92;
            }
        }
        return null;
    }

    private final P9 A05(int i10, int i11) {
        P9 p92 = new P9();
        p92.A02 = i10;
        p92.A03 = this.A01.A04(this, i10);
        p92.A01 = this.A01.A00(i10);
        if (i11 < 0 || i11 >= this.A0r.size()) {
            this.A0r.add(p92);
        } else {
            this.A0r.add(i11, p92);
        }
        return p92;
    }

    private final P9 A06(View view) {
        while (true) {
            Object parent = view.getParent();
            if (A0t[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "Cp8HLsoEDfOeEYMqWHrr049HoHROoinV";
            strArr[2] = "T0VfZL8wtEwZV1iGxV5Hd4QPubsH4Hu8";
            if (parent == this) {
                return A07(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    private final P9 A07(View view) {
        for (int i10 = 0; i10 < this.A0r.size(); i10++) {
            P9 p92 = this.A0r.get(i10);
            if (this.A01.A08(view, p92.A03)) {
                return p92;
            }
        }
        return null;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0s, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 113);
        }
        return new String(bArrCopyOfRange);
    }

    private void A09() {
        this.A0i = false;
        this.A0k = false;
        if (this.A0U != null) {
            this.A0U.recycle();
            this.A0U = null;
        }
    }

    private void A0A() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((PA) getChildAt(i10).getLayoutParams()).A05) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void A0B() {
        if (this.A0F != 0) {
            if (this.A0b == null) {
                this.A0b = new ArrayList<>();
            } else {
                this.A0b.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.A0b.add(getChildAt(i10));
            }
            Collections.sort(this.A0b, A0w);
        }
    }

    public static void A0C() {
        A0s = new byte[]{-32, -3, -2, -32, -6, ExifInterface.START_CODE, 59, 65, 63, 76, -6, 61, 70, 59, 77, 77, 20, -6, -88, -40, -23, -17, -19, -6, -88, -15, -20, -62, -88, 11, 59, 93, 90, 77, 87, 80, 88, 76, 95, 84, 78, 11, 76, 79, 76, 91, 95, 80, 93, 37, 11, -66, 18, 13, 13, -66, 17, 11, -1, 10, 10, ExifInterface.MARKER_EOI, -66, 2, 3, 4, -1, 19, 10, 18, 7, 12, 5, -66, 18, 13, -66, 16, 4, 74, 83, 89, 82, 72, 30, 4, -49, -19, -6, -6, -5, 0, -84, -19, -16, -16, -84, -4, -19, -13, -15, -2, -84, -16, -15, -17, -5, -2, -84, 2, -11, -15, 3, -84, -16, 1, -2, -11, -6, -13, -84, -8, -19, 5, -5, 1, 0, 61, 80, 92, 96, 80, 94, 95, 80, 79, 11, 90, 81, 81, 94, 78, 93, 80, 80, 89, 11, 91, 76, 82, 80, 11, 87, 84, 88, 84, 95, 11, -57, -37, -40, -109, -44, -29, -29, -33, -36, -42, -44, -25, -36, -30, ExifInterface.MARKER_APP1, -102, -26, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -109, -42, -37, -44, ExifInterface.MARKER_APP1, -38, -40, -41, -109, -25, -37, -40, -109, -44, -41, -44, -29, -25, -40, -27, -102, -26, -109, -42, -30, ExifInterface.MARKER_APP1, -25, -40, ExifInterface.MARKER_APP1, -25, -26, -109, -22, -36, -25, -37, -30, -24, -25, -109, -42, -44, -33, -33, -36, ExifInterface.MARKER_APP1, -38, -109, -61, -44, -38, -40, -27, -76, -41, -44, -29, -25, -40, -27, -106, ExifInterface.MARKER_APP1, -30, -25, -36, ExifInterface.MARKER_EOI, -20, -73, -44, -25, -44, -58, -40, -25, -74, -37, -44, ExifInterface.MARKER_APP1, -38, -40, -41, -108, -109, -72, -21, -29, -40, -42, -25, -40, -41, -109, -44, -41, -44, -29, -25, -40, -27, -109, -36, -25, -40, -32, -109, -42, -30, -24, ExifInterface.MARKER_APP1, -25, -83, -109, 16, 35, 31, 49, 10, 27, 33, 31, 44, -3, 14, 14, 11, 19, -17, -1, 14, 11, 8, 8, -68, 16, 14, 5, 1, 0, -68, 16, 11, -68, 2, 5, 10, 0, -68, 2, 11, -1, 17, 15, -68, -2, -3, 15, 1, 0, -68, 11, 10, -68, 10, 11, 10, -55, -1, 4, 5, 8, 0, -68, -1, 17, 14, 14, 1, 10, 16, -68, 2, 11, -1, 17, 15, 1, 0, -68, 18, 5, 1, 19, -68, 67, 66, 21, 56, 53, 68, 72, 57, 70, 23, 60, 53, 66, 59, 57, 56, 1, 0, -30, -13, -7, -9, -27, -11, 4, 1, -2, -2, -9, -10, -78, -10, -5, -10, -78, 0, 1, 6, -78, -11, -13, -2, -2, -78, 5, 7, 2, -9, 4, -11, -2, -13, 5, 5, -78, -5, -1, 2, -2, -9, -1, -9, 0, 6, -13, 6, -5, 1, 0, 96, 94, 77, 90, 95, 82, 91, 94, 89, 60, 77, 83, 81};
    }

    private final void A0D() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.A0X = new Scroller(context, A0v);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A0R = viewConfiguration.getScaledPagingTouchSlop();
        this.A0K = (int) (400.0f * f10);
        this.A0J = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0V = new EdgeEffect(context);
        this.A0W = new EdgeEffect(context);
        this.A0H = (int) (25.0f * f10);
        this.A0C = (int) (2.0f * f10);
        this.A0E = (int) (16.0f * f10);
        P3.A0B(this, new C2721gV(this));
        if (P3.A00(this) == 0) {
            P3.A09(this, 1);
        }
        P3.A0C(this, new C2722gW(this));
    }

    private void A0E(int i10) {
        List<PC> list = this.A0d;
        String[] strArr = A0t;
        if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0t;
        strArr2[1] = "BVTy00cMA02UZPGNllJjIH3AYkDj1BkJ";
        strArr2[7] = "OotLKoFjxgYdGdzuGdwdV1ikaCSVhdo5";
        if (list != null) {
            int size = this.A0d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0d.get(i11);
            }
        }
    }

    private void A0F(int i10) {
        if (this.A0d != null) {
            int size = this.A0d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0d.get(i11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ad A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0G(int r17) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PH.A0G(int):void");
    }

    private void A0H(int i10, float f10, int i11) {
        if (this.A0d != null) {
            int size = this.A0d.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.A0d.get(i12);
            }
        }
    }

    private final void A0I(int i10, float f10, int i11) {
        int iMax;
        if (this.A0D > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                PA pa2 = (PA) childAt.getLayoutParams();
                if (A0t[6].charAt(18) != '5') {
                    A0t[0] = "eLb4kWjiyFzQgYZ";
                    if (pa2.A05) {
                        switch (pa2.A04 & 7) {
                            case 1:
                                iMax = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                                break;
                            case 2:
                            case 4:
                            default:
                                iMax = paddingLeft;
                                break;
                            case 3:
                                iMax = paddingLeft;
                                paddingLeft += childAt.getWidth();
                                break;
                            case 5:
                                iMax = (width - paddingRight) - childAt.getMeasuredWidth();
                                paddingRight += childAt.getMeasuredWidth();
                                break;
                        }
                        int left = (iMax + scrollX) - childAt.getLeft();
                        String[] strArr = A0t;
                        if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                            String[] strArr2 = A0t;
                            strArr2[5] = "8dfGriTrd9bOdESwE5mGPvbaI7ots8HA";
                            strArr2[3] = "OX1hZuxAiPsPngs8SIDO4tRfQKy4SqJm";
                            if (left != 0) {
                                childAt.offsetLeftAndRight(left);
                            }
                        }
                    }
                }
                throw new RuntimeException();
            }
        }
        A0H(i10, f10, i11);
        if (0 != 0) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = getChildAt(i13);
                String[] strArr3 = A0t;
                if (strArr3[5].charAt(3) == strArr3[3].charAt(3)) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0t;
                strArr4[4] = "xqiTxeHFqkAvCvaAoyIYw4ze8LixE8Bg";
                strArr4[2] = "dxU2iatDRuS97WdbX1MSD4wOgw4tArLe";
                if (!((PA) childAt2.getLayoutParams()).A05) {
                    childAt2.getLeft();
                    getClientWidth();
                    throw new NullPointerException(A08(450, 13, 123));
                }
            }
        }
        this.A0e = true;
    }

    private final void A0J(int i10, int i11, int i12) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if ((this.A0X == null || this.A0X.isFinished()) ? false : true) {
            scrollX = this.A0j ? this.A0X.getCurrX() : this.A0X.getStartX();
            this.A0X.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i13 = i10 - scrollX;
        if (A0t[6].charAt(18) == '5') {
            throw new RuntimeException();
        }
        String[] strArr = A0t;
        strArr[4] = "Z0LZClJ0au8nSBm1r5wZo4UlFxtb531d";
        strArr[2] = "ZltNMTIOlLDzNXpQzZy3241df7YiJdYF";
        int i14 = i11 - scrollY;
        if (i13 == 0 && i14 == 0) {
            A0R(false);
            A0f();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float fA00 = i15 + (i15 * A00(Math.min(1.0f, (Math.abs(i13) * 1.0f) / clientWidth)));
        int iAbs = Math.abs(i12);
        int iMin = Math.min(iAbs > 0 ? Math.round(Math.abs(fA00 / iAbs) * 1000.0f) * 4 : (int) ((1.0f + (Math.abs(i13) / (this.A0M + (clientWidth * this.A01.A00(this.A00))))) * 100.0f), 600);
        this.A0j = false;
        this.A0X.startScroll(scrollX, scrollY, i13, i14, iMin);
        P3.A07(this);
    }

    private void A0K(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.A0r.isEmpty()) {
            if (!this.A0X.isFinished()) {
                this.A0X.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((((i10 - getPaddingLeft()) - getPaddingRight()) + i12) * (getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13))), getScrollY());
                return;
            }
        }
        int i14 = this.A00;
        String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0t[6] = "zbIyuU4nFdtSfTRFogYOf2jKfKMbfeaA";
        P9 p9A04 = A04(i14);
        int paddingLeft = (int) (((i10 - getPaddingLeft()) - getPaddingRight()) * (p9A04 != null ? Math.min(p9A04.A00, this.A07) : 0.0f));
        if (paddingLeft != getScrollX()) {
            A0R(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private final void A0L(int i10, boolean z10) {
        this.A0m = false;
        A0N(i10, z10, false);
    }

    private void A0M(int i10, boolean z10, int i11, boolean z11) {
        P9 p9A04 = A04(i10);
        int clientWidth = p9A04 != null ? (int) (getClientWidth() * Math.max(this.A02, Math.min(p9A04.A00, this.A07))) : 0;
        if (z10) {
            A0J(clientWidth, 0, i11);
            if (z11) {
                A0E(i10);
                return;
            }
            return;
        }
        if (z11) {
            A0E(i10);
        }
        A0R(false);
        scrollTo(clientWidth, 0);
        A0Z(clientWidth);
    }

    private final void A0N(int i10, boolean z10, boolean z11) {
        A0O(i10, z10, z11, 0);
    }

    private final void A0O(int i10, boolean z10, boolean z11, int i11) {
        if (this.A01 == null || this.A01.A01() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.A00 == i10) {
            int size = this.A0r.size();
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            A0t[0] = "caHeuZPLB8pjODm";
            if (size != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.A01.A01()) {
            i10 = this.A01.A01() - 1;
        }
        int i12 = this.A0L;
        if (i10 > this.A00 + i12 || i10 < this.A00 - i12) {
            for (int i13 = 0; i13 < this.A0r.size(); i13++) {
                this.A0r.get(i13).A04 = true;
            }
        }
        boolean z12 = this.A00 != i10;
        if (!this.A0g) {
            A0G(i10);
            A0M(i10, z10, i11, z12);
        } else {
            this.A00 = i10;
            if (z12) {
                A0E(i10);
            }
            requestLayout();
        }
    }

    private void A0P(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A08) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.A05 = motionEvent.getX(i10);
            this.A08 = motionEvent.getPointerId(i10);
            if (this.A0U != null) {
                VelocityTracker velocityTracker = this.A0U;
                if (A0t[6].charAt(18) == '5') {
                    throw new RuntimeException();
                }
                String[] strArr = A0t;
                strArr[4] = "bDxXC3oviTuOT7HziZkEX4OVFsay8yQk";
                strArr[2] = "Td40sAmtginQL7DIEYzsL4IjnbfuGR0u";
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r6 >= r7.A02) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        r3 = r3 + (r12.A01.A00(r6) + r5);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        r7.A00 = r3;
        r3 = r3 + (r7.A01 + r5);
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0Q(com.facebook.ads.redexgen.core.P9 r13, int r14, com.facebook.ads.redexgen.core.P9 r15) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PH.A0Q(com.facebook.ads.redexgen.X.P9, int, com.facebook.ads.redexgen.X.P9):void");
    }

    private void A0R(boolean z10) {
        boolean z11 = this.A0P == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.A0X.isFinished()) {
                this.A0X.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A0X.getCurrX();
                int currY = this.A0X.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0Z(currX);
                    }
                }
            }
        }
        this.A0m = false;
        for (int i10 = 0; i10 < this.A0r.size(); i10++) {
            P9 p92 = this.A0r.get(i10);
            if (p92.A04) {
                z11 = true;
                p92.A04 = false;
            }
        }
        if (z11) {
            if (z10) {
                P3.A0D(this, this.A0q);
            } else {
                this.A0q.run();
            }
        }
    }

    private void A0S(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.A0N : 0, null);
        }
    }

    private void A0T(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean A0U() {
        this.A08 = -1;
        A09();
        this.A0V.onRelease();
        this.A0W.onRelease();
        return this.A0V.isFinished() || this.A0W.isFinished();
    }

    private final boolean A0V() {
        if (this.A00 <= 0) {
            return false;
        }
        A0L(this.A00 - 1, true);
        return true;
    }

    private final boolean A0W() {
        if (this.A01 == null || this.A00 >= this.A01.A01() - 1) {
            return false;
        }
        A0L(this.A00 + 1, true);
        return true;
    }

    private boolean A0X(float f10) {
        boolean z10 = false;
        float f11 = this.A05 - f10;
        this.A05 = f10;
        float scrollX = getScrollX() + f11;
        int clientWidth = getClientWidth();
        float f12 = clientWidth * this.A02;
        float f13 = clientWidth * this.A07;
        boolean z11 = true;
        boolean z12 = true;
        P9 p92 = this.A0r.get(0);
        P9 p93 = this.A0r.get(this.A0r.size() - 1);
        if (p92.A02 != 0) {
            z11 = false;
            f12 = p92.A00 * clientWidth;
        }
        if (p93.A02 != this.A01.A01() - 1) {
            z12 = false;
            f13 = p93.A00 * clientWidth;
        }
        if (scrollX < f12) {
            if (z11) {
                float f14 = f12 - scrollX;
                if (A0t[6].charAt(18) == '5') {
                    throw new RuntimeException();
                }
                A0t[6] = "BqGUV6FWN85Kb3W2SyX26JGUB7qlw7kS";
                this.A0V.onPull(Math.abs(f14) / clientWidth);
                z10 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z12) {
                this.A0W.onPull(Math.abs(scrollX - f13) / clientWidth);
                z10 = true;
            }
            scrollX = f13;
        }
        this.A05 += scrollX - ((int) scrollX);
        scrollTo((int) scrollX, getScrollY());
        A0Z((int) scrollX);
        return z10;
    }

    private final boolean A0Y(float f10, float f11) {
        return (f10 < ((float) this.A0I) && f11 > 0.0f) || (f10 > ((float) (getWidth() - this.A0I)) && f11 < 0.0f);
    }

    private boolean A0Z(int i10) {
        int size = this.A0r.size();
        String strA08 = A08(397, 53, 33);
        if (size == 0) {
            if (this.A0g) {
                return false;
            }
            this.A0e = false;
            A0I(0, 0.0f, 0);
            if (this.A0e) {
                return false;
            }
            throw new IllegalStateException(strA08);
        }
        P9 p9A03 = A03();
        int clientWidth = getClientWidth();
        int i11 = this.A0M + clientWidth;
        int i12 = p9A03.A02;
        float f10 = ((i10 / clientWidth) - p9A03.A00) / (p9A03.A01 + (this.A0M / clientWidth));
        this.A0e = false;
        A0I(i12, f10, (int) (i11 * f10));
        if (this.A0e) {
            return true;
        }
        throw new IllegalStateException(strA08);
    }

    private final boolean A0a(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            boolean z10 = false;
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
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
                    sb2.append(A08(0, 4, 79)).append(parent2.getClass().getSimpleName());
                }
                Log.e(A08(300, 9, 73), A08(309, 72, 43) + sb2.toString());
                viewFindFocus = null;
            }
        }
        boolean zA0V = false;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zA0V = A0V();
            } else if (i10 == 66 || i10 == 2) {
                zA0V = A0W();
            }
        } else if (i10 == 17) {
            zA0V = (viewFindFocus == null || A02(this.A0o, viewFindNextFocus).left < A02(this.A0o, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : A0V();
        } else if (i10 == 66) {
            zA0V = (viewFindFocus == null || A02(this.A0o, viewFindNextFocus).left > A02(this.A0o, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : A0W();
        }
        if (zA0V) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zA0V;
    }

    private final boolean A0b(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                if (!keyEvent.hasModifiers(2)) {
                }
                break;
            case 22:
                if (!keyEvent.hasModifiers(2)) {
                }
                break;
            case 61:
                if (!keyEvent.hasNoModifiers()) {
                    if (keyEvent.hasModifiers(1)) {
                    }
                }
                break;
        }
        return false;
    }

    public static boolean A0c(View view) {
        return view.getClass().getAnnotation(ViewPager$DecorView.class) != null;
    }

    private final boolean A0d(View view, boolean z10, int i10, int i11, int i12) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i11 + scrollX >= childAt.getLeft() && i11 + scrollX < childAt.getRight() && i12 + scrollY >= childAt.getTop() && i12 + scrollY < childAt.getBottom() && A0d(childAt, true, i10, (i11 + scrollX) - childAt.getLeft(), (i12 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.A0n != z10) {
            this.A0n = z10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0e() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PH.A0e():void");
    }

    public final void A0f() {
        A0G(this.A00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        P9 p9A07;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            int i12 = 0;
            while (true) {
                int childCount = getChildCount();
                if (A0t[6].charAt(18) == '5') {
                    throw new RuntimeException();
                }
                A0t[0] = "IpvXuWuZmfdtaN6";
                if (i12 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (p9A07 = A07(childAt)) != null && p9A07.A02 == this.A00) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
                i12++;
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if (((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        P9 p9A07;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (p9A07 = A07(childAt)) != null && p9A07.A02 == this.A00) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        PA pa2 = (PA) layoutParams;
        boolean z10 = pa2.A05;
        String[] strArr = A0t;
        if (strArr[4].charAt(21) != strArr[2].charAt(21)) {
            throw new RuntimeException();
        }
        A0t[6] = "0hKurRTmjdCHvNVYXWivI507L49T3Iz9";
        pa2.A05 = z10 | A0c(view);
        if (!this.A0h) {
            super.addView(view, i10, layoutParams);
        } else {
            if (pa2 != null && pa2.A05) {
                throw new IllegalStateException(A08(86, 41, 27));
            }
            pa2.A03 = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.A01 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.A02)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.A07));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof PA) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0j = true;
        if (this.A0X.isFinished() || !this.A0X.computeScrollOffset()) {
            A0R(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.A0X.getCurrX();
        int currY = this.A0X.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A0Z(currX)) {
                this.A0X.abortAnimation();
                scrollTo(0, currY);
            }
        }
        P3.A07(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0b(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            boolean zDispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            String[] strArr = A0t;
            if (strArr[1].charAt(20) != strArr[7].charAt(20)) {
                String[] strArr2 = A0t;
                strArr2[5] = "SnNuJhKin8DS21TzQefDZ7b1qeceX1Jv";
                strArr2[3] = "R0wvzxNXSAt5doStTJlFm1lxESFLXhHC";
                return zDispatchPopulateAccessibilityEvent;
            }
        } else {
            int childCount = getChildCount();
            if (A0t[0].length() == 15) {
                A0t[6] = "LA2rc0K0poOotSQUO6QKpLGNHvEBCZdG";
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        P9 p9A07 = A07(childAt);
                        String[] strArr3 = A0t;
                        if (strArr3[1].charAt(20) == strArr3[7].charAt(20)) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0t;
                        strArr4[1] = "08daBwAiC3e1eMunN04MWwSicEkZtb5w";
                        strArr4[7] = "VX7AcKsgdRXMMXDzaUN7bbmrPcZJNGdB";
                        if (p9A07 != null && p9A07.A02 == this.A00 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        throw new RuntimeException();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        boolean zDraw = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.A01 != null && this.A01.A01() > 1)) {
            EdgeEffect edgeEffect = this.A0V;
            if (A0t[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0t;
            strArr[4] = "05N514BeFeDJgHlm81yP34LPQc7rkHPA";
            strArr[2] = "pzL9ltF7r1sXjfs3WepY84pTO2WENAbf";
            if (!edgeEffect.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.A02 * width);
                this.A0V.setSize(height, width);
                zDraw = false | this.A0V.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.A0W.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A07 + 1.0f)) * width2);
                this.A0W.setSize(height2, width2);
                zDraw |= this.A0W.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.A0V.finish();
            this.A0W.finish();
        }
        if (zDraw) {
            P3.A07(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0S;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new PA();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new PA(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC2032Oo getAdapter() {
        return this.A01;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        return ((PA) this.A0b.get(this.A0F == 2 ? (i10 - 1) - i11 : i11).getLayoutParams()).A01;
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getOffscreenPageLimit() {
        return this.A0L;
    }

    public int getPageMargin() {
        return this.A0M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0g = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.A0q);
        if (this.A0X != null && !this.A0X.isFinished()) {
            this.A0X.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        super.onDraw(canvas);
        if (this.A0M <= 0 || this.A0S == null || this.A0r.size() <= 0 || this.A01 == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = this.A0M / width;
        int i10 = 0;
        P9 p92 = this.A0r.get(0);
        float f12 = p92.A00;
        int size = this.A0r.size();
        int i11 = this.A0r.get(size - 1).A02;
        for (int i12 = p92.A02; i12 < i11; i12++) {
            while (i12 > p92.A02 && i10 < size) {
                i10++;
                p92 = this.A0r.get(i10);
            }
            if (i12 == p92.A02) {
                f10 = (p92.A00 + p92.A01) * width;
                f12 = p92.A00 + p92.A01 + f11;
            } else {
                float fA00 = this.A01.A00(i12);
                f10 = (f12 + fA00) * width;
                f12 += fA00 + f11;
            }
            if (this.A0M + f10 > scrollX) {
                this.A0S.setBounds(Math.round(f10), this.A0Q, Math.round(this.A0M + f10), this.A09);
                this.A0S.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[PHI: r1
      0x0073: PHI (r1v19 float) = (r1v12 float), (r1v20 float) binds: [B:35:0x00a0, B:27:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PH.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        P9 p9A07;
        int iMax;
        int iMax2;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = 8;
            if (i17 >= childCount) {
                int i19 = (i14 - paddingLeft) - paddingRight;
                int i20 = 0;
                while (i20 < childCount) {
                    View childAt = getChildAt(i20);
                    if (childAt.getVisibility() != i18) {
                        PA pa2 = (PA) childAt.getLayoutParams();
                        if (!pa2.A05 && (p9A07 = A07(childAt)) != null) {
                            int i21 = paddingLeft + ((int) (i19 * p9A07.A00));
                            if (pa2.A03) {
                                pa2.A03 = false;
                                childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (i19 * pa2.A00), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                            }
                            int measuredWidth = childAt.getMeasuredWidth() + i21;
                            paddingTop = paddingTop;
                            int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            String[] strArr = A0t;
                            if (strArr[1].charAt(20) != strArr[7].charAt(20)) {
                                String[] strArr2 = A0t;
                                strArr2[1] = "z1EGVKAINgCK1pWg9AJjq4tA4jzMvRMS";
                                strArr2[7] = "NHHZP3L5Wb2TlMM1gmFw9TkZDHFcmZzw";
                                childAt.layout(i21, paddingTop, measuredWidth, measuredHeight);
                            } else {
                                childAt.layout(i21, paddingTop, measuredWidth, measuredHeight);
                            }
                        }
                    }
                    i20++;
                    i18 = 8;
                }
                this.A0Q = paddingTop;
                this.A09 = i15 - paddingBottom;
                this.A0D = i16;
                if (this.A0g) {
                    z11 = false;
                    A0M(this.A00, false, 0, false);
                } else {
                    z11 = false;
                }
                this.A0g = z11;
                return;
            }
            View childAt2 = getChildAt(i17);
            if (childAt2.getVisibility() != 8) {
                PA pa3 = (PA) childAt2.getLayoutParams();
                if (pa3.A05) {
                    int i22 = pa3.A04 & 7;
                    int i23 = pa3.A04 & 112;
                    switch (i22) {
                        case 1:
                            iMax = Math.max((i14 - childAt2.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 2:
                        case 4:
                        default:
                            iMax = paddingLeft;
                            break;
                        case 3:
                            iMax = paddingLeft;
                            int measuredWidth2 = childAt2.getMeasuredWidth();
                            String[] strArr3 = A0t;
                            if (strArr3[1].charAt(20) == strArr3[7].charAt(20)) {
                                throw new RuntimeException();
                            }
                            A0t[0] = "4DhY9NaEfbkSZ9C";
                            paddingLeft += measuredWidth2;
                            break;
                            break;
                        case 5:
                            iMax = (i14 - paddingRight) - childAt2.getMeasuredWidth();
                            paddingRight += childAt2.getMeasuredWidth();
                            break;
                    }
                    switch (i23) {
                        case 16:
                            iMax2 = Math.max((i15 - childAt2.getMeasuredHeight()) / 2, paddingTop);
                            break;
                        case 48:
                            iMax2 = paddingTop;
                            paddingTop += childAt2.getMeasuredHeight();
                            break;
                        case 80:
                            iMax2 = (i15 - paddingBottom) - childAt2.getMeasuredHeight();
                            paddingBottom += childAt2.getMeasuredHeight();
                            break;
                        default:
                            iMax2 = paddingTop;
                            break;
                    }
                    int i24 = iMax + scrollX;
                    childAt2.layout(i24, iMax2, i24 + childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + iMax2);
                    i16++;
                } else {
                    continue;
                }
            }
            i17++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PH.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        P9 p9A07;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i11 = 0;
            i12 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            childCount = -1;
        }
        while (i11 != childCount) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (p9A07 = A07(childAt)) != null && p9A07.A02 == this.A00 && childAt.requestFocus(i10, rect)) {
                if (A0t[6].charAt(18) == '5') {
                    throw new RuntimeException();
                }
                String[] strArr = A0t;
                strArr[4] = "Znu0WDOQkx79zIIXKJQFb47iIrfdw3ED";
                strArr[2] = "SboSqac50StP5vJHTPKGX42Xta1ZIbyJ";
                return true;
            }
            i11 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof WrappedParcelable)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            classLoader = getContext().getClassLoader();
        }
        Parcelable parcelableUnwrap = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (!(parcelableUnwrap instanceof ViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelableUnwrap);
            return;
        }
        ViewPager$SavedState viewPager$SavedState = (ViewPager$SavedState) parcelableUnwrap;
        super.onRestoreInstanceState(viewPager$SavedState.A02());
        if (this.A01 != null) {
            A0N(viewPager$SavedState.A00, false, true);
            return;
        }
        this.A0O = viewPager$SavedState.A00;
        this.A0T = viewPager$SavedState.A01;
        this.A0a = viewPager$SavedState.A02;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager$SavedState viewPager$SavedState = new ViewPager$SavedState(super.onSaveInstanceState());
        viewPager$SavedState.A00 = this.A00;
        if (this.A01 != null) {
            viewPager$SavedState.A01 = this.A01.A03();
        }
        return new WrappedParcelable(viewPager$SavedState);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            A0K(i10, i12, this.A0M, this.A0M);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164 A[PHI: r1 r2 r5
      0x0164: PHI (r1v14 float) = (r1v13 float), (r1v25 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r2v11 float) = (r2v10 float), (r2v16 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x0164: PHI (r5v4 float) = (r5v3 float), (r5v5 float) binds: [B:56:0x01c3, B:44:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.PH.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0h) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC2032Oo abstractC2032Oo) {
        if (this.A01 != null) {
            this.A01.A06(null);
            for (int i10 = 0; i10 < this.A0r.size(); i10++) {
                P9 p92 = this.A0r.get(i10);
                this.A01.A07(this, p92.A02, p92.A03);
            }
            ArrayList<P9> arrayList = this.A0r;
            String[] strArr = A0t;
            if (strArr[5].charAt(3) == strArr[3].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0t;
            strArr2[5] = "5tjoWE4Q5tO0E95pkDqQ6gCRa23v2VF9";
            strArr2[3] = "zPJLPuVWeZXbdPcD4tg2pz6GDm3T23cV";
            arrayList.clear();
            A0A();
            this.A00 = 0;
            scrollTo(0, 0);
        }
        this.A01 = abstractC2032Oo;
        this.A0G = 0;
        if (this.A01 != null) {
            if (this.A0Z == null) {
                this.A0Z = new PE(this);
            }
            this.A01.A06(this.A0Z);
            this.A0m = false;
            boolean z10 = this.A0g;
            this.A0g = true;
            this.A0G = this.A01.A01();
            if (this.A0O >= 0) {
                A0N(this.A0O, false, true);
                this.A0O = -1;
                this.A0T = null;
                this.A0a = null;
            } else if (z10) {
                requestLayout();
            } else {
                A0f();
            }
        }
        if (this.A0c == null || this.A0c.isEmpty() || 0 >= this.A0c.size()) {
            return;
        }
        this.A0c.get(0);
        throw new NullPointerException(A08(381, 16, 99));
    }

    public void setCurrentItem(int i10) {
        this.A0m = false;
        A0N(i10, !this.A0g, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w(A08(300, 9, 73), A08(127, 31, 122) + i10 + A08(51, 26, 45) + 1);
            i10 = 1;
        }
        if (i10 != this.A0L) {
            this.A0L = i10;
            A0f();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(PC pc2) {
        this.A0Y = pc2;
    }

    public void setPageMargin(int i10) {
        int i11 = this.A0M;
        this.A0M = i10;
        int width = getWidth();
        A0K(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        setPageMarginDrawable(OK.A00(getContext(), i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.A0S = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i10) {
        if (this.A0P == i10) {
            return;
        }
        this.A0P = i10;
        if (0 != 0) {
            A0S(i10 != 0);
        }
        A0F(i10);
        if (A0t[6].charAt(18) == '5') {
            throw new RuntimeException();
        }
        A0t[0] = "blMFZWDPlO2VlWf";
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0S;
    }
}
