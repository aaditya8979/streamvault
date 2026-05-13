package yads;

import java.util.ArrayList;
import java.util.Comparator;
import yads.a13;
import yads.b13;

/* JADX INFO: loaded from: classes9.dex */
public final class b13 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f87868h = new Comparator() { // from class: bt.g
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b13.a((a13) obj, (a13) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f87869i = new Comparator() { // from class: bt.h
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((a13) obj).f87549c, ((a13) obj2).f87549c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f87870a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f87874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f87875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87876g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a13[] f87872c = new a13[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f87871b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87873d = -1;

    public b13(int i10) {
        this.f87870a = i10;
    }

    public static /* synthetic */ int a(a13 a13Var, a13 a13Var2) {
        return a13Var.f87547a - a13Var2.f87547a;
    }
}
