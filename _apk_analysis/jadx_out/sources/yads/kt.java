package yads;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class kt {
    public static final int[] A;
    public static final boolean[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final int[] F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f91715w = a(2, 2, 2, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f91716x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f91717y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f91718z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f91719a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f91720b = new SpannableStringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f91721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f91722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f91725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f91726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f91727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f91728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f91729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f91730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f91731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f91732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f91733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f91734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f91735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f91736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f91737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f91738t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f91739u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f91740v;

    static {
        int iA = a(0, 0, 0, 0);
        f91716x = iA;
        int iA2 = a(0, 0, 0, 3);
        f91717y = new int[]{0, 0, 0, 0, 0, 2, 0};
        f91718z = new int[]{0, 0, 0, 0, 0, 0, 2};
        A = new int[]{3, 3, 3, 3, 3, 3, 1};
        B = new boolean[]{false, false, false, true, true, true, false};
        C = new int[]{iA, iA2, iA, iA, iA2, iA, iA};
        D = new int[]{0, 1, 2, 3, 4, 3, 4};
        E = new int[]{0, 0, 0, 0, 0, 3, 3};
        F = new int[]{iA, iA, iA, iA, iA, iA2, iA2};
    }

    public kt() {
        b();
    }

    public static int a(int i10, int i11, int i12, int i13) {
        ni.a(i10, 4);
        ni.a(i11, 4);
        ni.a(i12, 4);
        ni.a(i13, 4);
        return Color.argb(i13 != 2 ? i13 != 3 ? 255 : 0 : 127, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
    }

    public final SpannableString a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f91720b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f91734p != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f91734p, length, 33);
            }
            if (this.f91735q != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f91735q, length, 33);
            }
            if (this.f91736r != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f91737s), this.f91736r, length, 33);
            }
            if (this.f91738t != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f91739u), this.f91738t, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void a(char c10) {
        if (c10 != '\n') {
            this.f91720b.append(c10);
            return;
        }
        this.f91719a.add(a());
        this.f91720b.clear();
        if (this.f91734p != -1) {
            this.f91734p = 0;
        }
        if (this.f91735q != -1) {
            this.f91735q = 0;
        }
        if (this.f91736r != -1) {
            this.f91736r = 0;
        }
        if (this.f91738t != -1) {
            this.f91738t = 0;
        }
        while (true) {
            if ((!this.f91729k || this.f91719a.size() < this.f91728j) && this.f91719a.size() < 15) {
                return;
            } else {
                this.f91719a.remove(0);
            }
        }
    }

    public final void a(int i10, int i11) {
        if (this.f91736r != -1 && this.f91737s != i10) {
            this.f91720b.setSpan(new ForegroundColorSpan(this.f91737s), this.f91736r, this.f91720b.length(), 33);
        }
        if (i10 != f91715w) {
            this.f91736r = this.f91720b.length();
            this.f91737s = i10;
        }
        if (this.f91738t != -1 && this.f91739u != i11) {
            this.f91720b.setSpan(new BackgroundColorSpan(this.f91739u), this.f91738t, this.f91720b.length(), 33);
        }
        if (i11 != f91716x) {
            this.f91738t = this.f91720b.length();
            this.f91739u = i11;
        }
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f91734p != -1) {
            if (!z10) {
                this.f91720b.setSpan(new StyleSpan(2), this.f91734p, this.f91720b.length(), 33);
                this.f91734p = -1;
            }
        } else if (z10) {
            this.f91734p = this.f91720b.length();
        }
        if (this.f91735q == -1) {
            if (z11) {
                this.f91735q = this.f91720b.length();
            }
        } else {
            if (z11) {
                return;
            }
            this.f91720b.setSpan(new UnderlineSpan(), this.f91735q, this.f91720b.length(), 33);
            this.f91735q = -1;
        }
    }

    public final void b() {
        this.f91719a.clear();
        this.f91720b.clear();
        this.f91734p = -1;
        this.f91735q = -1;
        this.f91736r = -1;
        this.f91738t = -1;
        this.f91740v = 0;
        this.f91721c = false;
        this.f91722d = false;
        this.f91723e = 4;
        this.f91724f = false;
        this.f91725g = 0;
        this.f91726h = 0;
        this.f91727i = 0;
        this.f91728j = 15;
        this.f91729k = true;
        this.f91730l = 0;
        this.f91731m = 0;
        this.f91732n = 0;
        int i10 = f91716x;
        this.f91733o = i10;
        this.f91737s = f91715w;
        this.f91739u = i10;
    }
}
