package yads;

import android.graphics.Color;

/* JADX INFO: loaded from: classes3.dex */
public final class f33 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f89466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f89467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f89468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f89469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f89470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f89472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f89473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f89474j;

    public f33(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f89465a = str;
        this.f89466b = i10;
        this.f89467c = num;
        this.f89468d = num2;
        this.f89469e = f10;
        this.f89470f = z10;
        this.f89471g = z11;
        this.f89472h = z12;
        this.f89473i = z13;
        this.f89474j = i11;
    }

    public static boolean a(String str) {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            ih1.d("SsaStyle", ih1.a("Failed to parse boolean value: '" + str + "'", e10));
            return false;
        }
    }

    public static Integer b(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            if (j10 > 4294967295L) {
                throw new IllegalArgumentException();
            }
            return Integer.valueOf(Color.argb(td1.a(((j10 >> 24) & 255) ^ 255), td1.a(j10 & 255), td1.a((j10 >> 8) & 255), td1.a((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            ih1.d("SsaStyle", ih1.a("Failed to parse color expression: '" + str + "'", e10));
            return null;
        }
    }
}
