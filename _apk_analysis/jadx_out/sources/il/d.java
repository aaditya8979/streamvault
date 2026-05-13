package il;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CharArrayBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements CharSequence, Appendable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final wl.f<char[]> f64301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public List<char[]> f64302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public char[] f64303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f64304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f64306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f64307h;

    /* JADX INFO: compiled from: CharArrayBuilder.kt */
    public final class a implements CharSequence {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String f64310d;

        public a(int i10, int i11) {
            this.f64308b = i10;
            this.f64309c = i11;
        }

        public char a(int i10) {
            int i11 = this.f64308b + i10;
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("index is negative: " + i10).toString());
            }
            if (i11 < this.f64309c) {
                return d.this.j(i11);
            }
            throw new IllegalArgumentException(("index (" + i10 + ") should be less than length (" + length() + ')').toString());
        }

        public int b() {
            return this.f64309c - this.f64308b;
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ char charAt(int i10) {
            return a(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof CharSequence)) {
                return false;
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence.length() != length()) {
                return false;
            }
            return d.this.n(this.f64308b, charSequence, 0, length());
        }

        public int hashCode() {
            String str = this.f64310d;
            return str != null ? str.hashCode() : d.this.l(this.f64308b, this.f64309c);
        }

        @Override // java.lang.CharSequence
        public final /* bridge */ int length() {
            return b();
        }

        @Override // java.lang.CharSequence
        @NotNull
        public CharSequence subSequence(int i10, int i11) {
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(("start is negative: " + i10).toString());
            }
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
            }
            int i12 = this.f64309c;
            int i13 = this.f64308b;
            if (i11 <= i12 - i13) {
                return i10 == i11 ? "" : d.this.new a(i10 + i13, i13 + i11);
            }
            throw new IllegalArgumentException(("end should be less than length (" + length() + ')').toString());
        }

        @Override // java.lang.CharSequence
        @NotNull
        public String toString() {
            String str = this.f64310d;
            if (str != null) {
                return str;
            }
            String string = d.this.g(this.f64308b, this.f64309c).toString();
            this.f64310d = string;
            return string;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public d(@NotNull wl.f<char[]> fVar) {
        p.k(fVar, "pool");
        this.f64301b = fVar;
    }

    public /* synthetic */ d(wl.f fVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f.a() : fVar);
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(char c10) {
        char[] cArrM = m();
        char[] cArr = this.f64303d;
        p.h(cArr);
        int length = cArr.length;
        int i10 = this.f64306g;
        cArrM[length - i10] = c10;
        this.f64304e = null;
        this.f64306g = i10 - 1;
        this.f64307h = length() + 1;
        return this;
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence) {
        return charSequence == null ? this : append(charSequence, 0, charSequence.length());
    }

    @Override // java.lang.Appendable
    @NotNull
    public Appendable append(@Nullable CharSequence charSequence, int i10, int i11) {
        if (charSequence == null) {
            return this;
        }
        int i12 = i10;
        while (i12 < i11) {
            char[] cArrM = m();
            int length = cArrM.length;
            int i13 = this.f64306g;
            int i14 = length - i13;
            int iMin = Math.min(i11 - i12, i13);
            for (int i15 = 0; i15 < iMin; i15++) {
                cArrM[i14 + i15] = charSequence.charAt(i12 + i15);
            }
            i12 += iMin;
            this.f64306g -= iMin;
        }
        this.f64304e = null;
        this.f64307h = length() + (i11 - i10);
        return this;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return i(i10);
    }

    public final char[] e() {
        char[] cArrE = this.f64301b.E();
        char[] cArr = this.f64303d;
        this.f64303d = cArrE;
        this.f64306g = cArrE.length;
        this.f64305f = false;
        if (cArr != null) {
            List<char[]> list = this.f64302c;
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f64302c = arrayList;
                arrayList.add(cArr);
                list2 = arrayList;
            }
            list2.add(cArrE);
        }
        return cArrE;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CharSequence)) {
            return false;
        }
        CharSequence charSequence = (CharSequence) obj;
        if (length() != charSequence.length()) {
            return false;
        }
        return n(0, charSequence, 0, length());
    }

    public final char[] f(int i10) {
        List<char[]> list = this.f64302c;
        if (list != null) {
            char[] cArr = this.f64303d;
            p.h(cArr);
            return list.get(i10 / cArr.length);
        }
        if (i10 >= 2048) {
            p(i10);
            throw new KotlinNothingValueException();
        }
        char[] cArr2 = this.f64303d;
        if (cArr2 != null) {
            return cArr2;
        }
        p(i10);
        throw new KotlinNothingValueException();
    }

    public final CharSequence g(int i10, int i11) {
        if (i10 == i11) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i11 - i10);
        for (int i12 = i10 - (i10 % 2048); i12 < i11; i12 += 2048) {
            char[] cArrF = f(i12);
            int iMin = Math.min(i11 - i12, 2048);
            for (int iMax = Math.max(0, i10 - i12); iMax < iMin; iMax++) {
                sb2.append(cArrF[iMax]);
            }
        }
        return sb2;
    }

    public final int h() {
        char[] cArr = this.f64303d;
        p.h(cArr);
        return cArr.length - this.f64306g;
    }

    public int hashCode() {
        String str = this.f64304e;
        return str != null ? str.hashCode() : l(0, length());
    }

    public char i(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("index is negative: " + i10).toString());
        }
        if (i10 < length()) {
            return j(i10);
        }
        throw new IllegalArgumentException(("index " + i10 + " is not in range [0, " + length() + ')').toString());
    }

    public final char j(int i10) {
        char[] cArrF = f(i10);
        char[] cArr = this.f64303d;
        p.h(cArr);
        return cArrF[i10 % cArr.length];
    }

    public int k() {
        return this.f64307h;
    }

    public final int l(int i10, int i11) {
        int iJ = 0;
        while (i10 < i11) {
            iJ = (iJ * 31) + j(i10);
            i10++;
        }
        return iJ;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return k();
    }

    public final char[] m() {
        if (this.f64306g == 0) {
            return e();
        }
        char[] cArr = this.f64303d;
        p.h(cArr);
        return cArr;
    }

    public final boolean n(int i10, CharSequence charSequence, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (j(i10 + i13) != charSequence.charAt(i11 + i13)) {
                return false;
            }
        }
        return true;
    }

    public final void o() {
        List<char[]> list = this.f64302c;
        if (list != null) {
            this.f64303d = null;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f64301b.r(list.get(i10));
            }
        } else {
            char[] cArr = this.f64303d;
            if (cArr != null) {
                this.f64301b.r(cArr);
            }
            this.f64303d = null;
        }
        this.f64305f = true;
        this.f64302c = null;
        this.f64304e = null;
        this.f64307h = 0;
        this.f64306g = 0;
    }

    public final Void p(int i10) {
        if (this.f64305f) {
            throw new IllegalStateException("Buffer is already released");
        }
        throw new IndexOutOfBoundsException(i10 + " is not in range [0; " + h() + ')');
    }

    @Override // java.lang.CharSequence
    @NotNull
    public CharSequence subSequence(int i10, int i11) {
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("startIndex (" + i10 + ") should be less or equal to endIndex (" + i11 + ')').toString());
        }
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("startIndex is negative: " + i10).toString());
        }
        if (i11 <= length()) {
            return new a(i10, i11);
        }
        throw new IllegalArgumentException(("endIndex (" + i11 + ") is greater than length (" + length() + ')').toString());
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        String str = this.f64304e;
        if (str != null) {
            return str;
        }
        String string = g(0, length()).toString();
        this.f64304e = string;
        return string;
    }
}
