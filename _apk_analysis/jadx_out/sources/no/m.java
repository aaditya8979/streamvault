package no;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Segment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f75931h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f75932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public n f75935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f75936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public m f75937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public m f75938g;

    /* JADX INFO: compiled from: Segment.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public final /* synthetic */ m a() {
            return new m(null);
        }

        public final /* synthetic */ m b(byte[] bArr, int i10, int i11, n nVar, boolean z10) {
            tn.p.k(bArr, "data");
            return new m(bArr, i10, i11, nVar, z10, null);
        }
    }

    public m() {
        this.f75932a = new byte[8192];
        this.f75936e = true;
        this.f75935d = null;
    }

    public /* synthetic */ m(tn.i iVar) {
        this();
    }

    public m(byte[] bArr, int i10, int i11, n nVar, boolean z10) {
        this.f75932a = bArr;
        this.f75933b = i10;
        this.f75934c = i11;
        this.f75935d = nVar;
        this.f75936e = z10;
    }

    public /* synthetic */ m(byte[] bArr, int i10, int i11, n nVar, boolean z10, tn.i iVar) {
        this(bArr, i10, i11, nVar, z10);
    }

    @NotNull
    public final m a() {
        int i10;
        m mVar = this.f75938g;
        if (!(mVar != null)) {
            throw new IllegalStateException("cannot compact".toString());
        }
        tn.p.h(mVar);
        if (!mVar.f75936e) {
            return this;
        }
        int i11 = this.f75934c - this.f75933b;
        m mVar2 = this.f75938g;
        tn.p.h(mVar2);
        int i12 = 8192 - mVar2.f75934c;
        m mVar3 = this.f75938g;
        tn.p.h(mVar3);
        if (mVar3.i()) {
            i10 = 0;
        } else {
            m mVar4 = this.f75938g;
            tn.p.h(mVar4);
            i10 = mVar4.f75933b;
        }
        if (i11 > i12 + i10) {
            return this;
        }
        m mVar5 = this.f75938g;
        tn.p.h(mVar5);
        y(mVar5, i11);
        if (!(l() == null)) {
            throw new IllegalStateException("Check failed.");
        }
        p.d(this);
        return mVar5;
    }

    public final /* synthetic */ byte[] b(boolean z10) {
        return this.f75932a;
    }

    @Nullable
    public final n c() {
        return this.f75935d;
    }

    public final /* synthetic */ int d() {
        return this.f75934c;
    }

    public final /* synthetic */ m e() {
        return this.f75937f;
    }

    public final /* synthetic */ int f() {
        return this.f75933b;
    }

    public final /* synthetic */ m g() {
        return this.f75938g;
    }

    public final int h() {
        return this.f75932a.length - this.f75934c;
    }

    public final boolean i() {
        n nVar = this.f75935d;
        if (nVar != null) {
            return nVar.b();
        }
        return false;
    }

    public final int j() {
        return this.f75934c - this.f75933b;
    }

    public final byte k(int i10) {
        return this.f75932a[this.f75933b + i10];
    }

    @Nullable
    public final m l() {
        m mVar = this.f75937f;
        m mVar2 = this.f75938g;
        if (mVar2 != null) {
            tn.p.h(mVar2);
            mVar2.f75937f = this.f75937f;
        }
        m mVar3 = this.f75937f;
        if (mVar3 != null) {
            tn.p.h(mVar3);
            mVar3.f75938g = this.f75938g;
        }
        this.f75937f = null;
        this.f75938g = null;
        return mVar;
    }

    @NotNull
    public final m m(@NotNull m mVar) {
        tn.p.k(mVar, "segment");
        mVar.f75938g = this;
        mVar.f75937f = this.f75937f;
        m mVar2 = this.f75937f;
        if (mVar2 != null) {
            tn.p.h(mVar2);
            mVar2.f75938g = mVar;
        }
        this.f75937f = mVar;
        return mVar;
    }

    public final byte n() {
        byte[] bArr = this.f75932a;
        int i10 = this.f75933b;
        this.f75933b = i10 + 1;
        return bArr[i10];
    }

    public final void o(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "dst");
        int i12 = i11 - i10;
        byte[] bArr2 = this.f75932a;
        int i13 = this.f75933b;
        cn.p.g(bArr2, bArr, i10, i13, i13 + i12);
        this.f75933b += i12;
    }

    public final /* synthetic */ void p(int i10) {
        this.f75934c = i10;
    }

    public final /* synthetic */ void q(m mVar) {
        this.f75937f = mVar;
    }

    public final /* synthetic */ void r(int i10) {
        this.f75933b = i10;
    }

    public final /* synthetic */ void s(m mVar) {
        this.f75938g = mVar;
    }

    @NotNull
    public final m t() {
        n nVarH = this.f75935d;
        if (nVarH == null) {
            nVarH = p.h();
            this.f75935d = nVarH;
        }
        n nVar = nVarH;
        byte[] bArr = this.f75932a;
        int i10 = this.f75933b;
        int i11 = this.f75934c;
        nVar.a();
        bn.r rVar = bn.r.f5635a;
        return new m(bArr, i10, i11, nVar, false);
    }

    @NotNull
    public final m u(int i10) {
        m mVarF;
        if (!(i10 > 0 && i10 <= this.f75934c - this.f75933b)) {
            throw new IllegalArgumentException("byteCount out of range".toString());
        }
        if (i10 >= 1024) {
            mVarF = t();
        } else {
            mVarF = p.f();
            byte[] bArr = this.f75932a;
            byte[] bArr2 = mVarF.f75932a;
            int i11 = this.f75933b;
            cn.p.m(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        mVarF.f75934c = mVarF.f75933b + i10;
        this.f75933b += i10;
        m mVar = this.f75938g;
        if (mVar != null) {
            tn.p.h(mVar);
            mVar.m(mVarF);
        } else {
            mVarF.f75937f = this;
            this.f75938g = mVarF;
        }
        return mVarF;
    }

    public final void v(@NotNull byte[] bArr, int i10, int i11) {
        tn.p.k(bArr, "src");
        cn.p.g(bArr, this.f75932a, this.f75934c, i10, i11);
        this.f75934c += i11 - i10;
    }

    public final /* synthetic */ void w(byte[] bArr, int i10) {
        tn.p.k(bArr, "data");
    }

    public final void x(byte b10) {
        byte[] bArr = this.f75932a;
        int i10 = this.f75934c;
        this.f75934c = i10 + 1;
        bArr[i10] = b10;
    }

    public final void y(@NotNull m mVar, int i10) {
        tn.p.k(mVar, "sink");
        if (!mVar.f75936e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        if (mVar.f75934c + i10 > 8192) {
            if (mVar.i()) {
                throw new IllegalArgumentException();
            }
            int i11 = mVar.f75934c;
            int i12 = mVar.f75933b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = mVar.f75932a;
            cn.p.m(bArr, bArr, 0, i12, i11, 2, null);
            mVar.f75934c -= mVar.f75933b;
            mVar.f75933b = 0;
        }
        byte[] bArr2 = this.f75932a;
        byte[] bArr3 = mVar.f75932a;
        int i13 = mVar.f75934c;
        int i14 = this.f75933b;
        cn.p.g(bArr2, bArr3, i13, i14, i14 + i10);
        mVar.f75934c += i10;
        this.f75933b += i10;
    }
}
