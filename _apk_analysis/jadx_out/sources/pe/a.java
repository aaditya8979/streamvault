package pe;

/* JADX INFO: compiled from: DimensionStatus.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f77270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f77271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f77272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f77273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f77274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f77275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f77276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f77277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f77278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f77279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f77280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f77281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a[] f77282o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f77283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77284b;

    static {
        a aVar = new a(0, false);
        f77270c = aVar;
        a aVar2 = new a(1, true);
        f77271d = aVar2;
        a aVar3 = new a(2, false);
        f77272e = aVar3;
        a aVar4 = new a(3, true);
        f77273f = aVar4;
        a aVar5 = new a(4, false);
        f77274g = aVar5;
        a aVar6 = new a(5, true);
        f77275h = aVar6;
        a aVar7 = new a(6, false);
        f77276i = aVar7;
        a aVar8 = new a(7, true);
        f77277j = aVar8;
        a aVar9 = new a(8, false);
        f77278k = aVar9;
        a aVar10 = new a(9, true);
        f77279l = aVar10;
        a aVar11 = new a(10, false);
        f77280m = aVar11;
        a aVar12 = new a(10, true);
        f77281n = aVar12;
        f77282o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    public a(int i10, boolean z10) {
        this.f77283a = i10;
        this.f77284b = z10;
    }

    public boolean a(a aVar) {
        int i10 = this.f77283a;
        int i11 = aVar.f77283a;
        return i10 < i11 || ((!this.f77284b || f77279l == this) && i10 == i11);
    }

    public a b() {
        return !this.f77284b ? f77282o[this.f77283a + 1] : this;
    }

    public a c() {
        if (!this.f77284b) {
            return this;
        }
        a aVar = f77282o[this.f77283a - 1];
        return !aVar.f77284b ? aVar : f77270c;
    }
}
