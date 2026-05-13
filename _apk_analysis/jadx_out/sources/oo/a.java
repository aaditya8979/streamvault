package oo;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final C0909a f76505d = new C0909a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f76506e = new a(new byte[0], null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final char[] f76507f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final byte[] f76508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76509c;

    /* JADX INFO: renamed from: oo.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ByteString.kt */
    public static final class C0909a {
        public C0909a() {
        }

        public /* synthetic */ C0909a(i iVar) {
            this();
        }

        @NotNull
        public final a a() {
            return a.f76506e;
        }

        @NotNull
        public final a b(@NotNull byte[] bArr) {
            p.k(bArr, "byteArray");
            i iVar = null;
            return new a(bArr, iVar, iVar);
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        p.j(charArray, "toCharArray(...)");
        f76507f = charArray;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull byte[] bArr, int i10, int i11) {
        this(cn.p.q(bArr, i10, i11), null);
        p.k(bArr, "data");
    }

    public /* synthetic */ a(byte[] bArr, int i10, int i11, int i12, i iVar) {
        this(bArr, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? bArr.length : i11);
    }

    public a(byte[] bArr, Object obj) {
        this.f76508b = bArr;
    }

    public /* synthetic */ a(byte[] bArr, Object obj, i iVar) {
        this(bArr, obj);
    }

    public static /* synthetic */ a g(a aVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = aVar.e();
        }
        return aVar.f(i10, i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull a aVar) {
        p.k(aVar, "other");
        if (aVar == this) {
            return 0;
        }
        byte[] bArr = this.f76508b;
        byte[] bArr2 = aVar.f76508b;
        int iMin = Math.min(e(), aVar.e());
        for (int i10 = 0; i10 < iMin; i10++) {
            int iM = p.m(bn.i.b(bArr[i10]) & 255, bn.i.b(bArr2[i10]) & 255);
            if (iM != 0) {
                return iM;
            }
        }
        return p.m(e(), aVar.e());
    }

    public final byte c(int i10) {
        if (i10 >= 0 && i10 < e()) {
            return this.f76508b[i10];
        }
        throw new IndexOutOfBoundsException("index (" + i10 + ") is out of byte string bounds: [0.." + e() + ')');
    }

    @NotNull
    public final byte[] d() {
        return this.f76508b;
    }

    public final int e() {
        return this.f76508b.length;
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        byte[] bArr = aVar.f76508b;
        int length = bArr.length;
        byte[] bArr2 = this.f76508b;
        if (length != bArr2.length) {
            return false;
        }
        int i11 = aVar.f76509c;
        if (i11 == 0 || (i10 = this.f76509c) == 0 || i11 == i10) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    @NotNull
    public final a f(int i10, int i11) {
        return i10 == i11 ? f76506e : new a(this.f76508b, i10, i11);
    }

    public int hashCode() {
        int i10 = this.f76509c;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f76508b);
        this.f76509c = iHashCode;
        return iHashCode;
    }

    @NotNull
    public String toString() {
        if (c.c(this)) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(e());
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 22 + (e() * 2));
        sb2.append("ByteString(size=");
        sb2.append(strValueOf);
        sb2.append(" hex=");
        byte[] bArr = this.f76508b;
        int iE = e();
        for (int i10 = 0; i10 < iE; i10++) {
            byte b10 = bArr[i10];
            char[] cArr = f76507f;
            sb2.append(cArr[(b10 >>> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        sb2.append(')');
        String string = sb2.toString();
        p.j(string, "toString(...)");
        return string;
    }
}
