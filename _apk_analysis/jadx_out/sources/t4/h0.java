package t4;

import android.util.SparseArray;
import com.google.android.exoplayer.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes12.dex */
public interface h0 {

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f84743c;

        public a(String str, int i10, byte[] bArr) {
            this.f84741a = str;
            this.f84742b = i10;
            this.f84743c = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f84744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84745b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f84746c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f84747d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f84744a = i10;
            this.f84745b = str;
            this.f84746c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f84747d = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface c {
        h0 a(int i10, b bVar);

        SparseArray<h0> createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f84749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f84750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f84751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f84752e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f84748a = str;
            this.f84749b = i11;
            this.f84750c = i12;
            this.f84751d = Integer.MIN_VALUE;
        }

        public void a() {
            int i10 = this.f84751d;
            this.f84751d = i10 == Integer.MIN_VALUE ? this.f84749b : i10 + this.f84750c;
            this.f84752e = this.f84748a + this.f84751d;
        }

        public String b() {
            d();
            return this.f84752e;
        }

        public int c() {
            d();
            return this.f84751d;
        }

        public final void d() {
            if (this.f84751d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a(a6.t tVar, int i10) throws ParserException;

    void b(a6.g0 g0Var, k4.i iVar, d dVar);

    void seek();
}
