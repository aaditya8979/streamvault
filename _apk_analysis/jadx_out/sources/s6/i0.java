package s6;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: TsPayloadReader.java */
/* JADX INFO: loaded from: classes8.dex */
public interface i0 {

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f79214c;

        public a(String str, int i10, byte[] bArr) {
            this.f79212a = str;
            this.f79213b = i10;
            this.f79214c = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f79215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f79216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f79217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f79218d;

        public b(int i10, @Nullable String str, @Nullable List<a> list, byte[] bArr) {
            this.f79215a = i10;
            this.f79216b = str;
            this.f79217c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f79218d = bArr;
        }
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public interface c {
        @Nullable
        i0 a(int i10, b bVar);

        SparseArray<i0> createInitialPayloadReaders();
    }

    /* JADX INFO: compiled from: TsPayloadReader.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f79220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f79221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f79222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f79223e;

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
            this.f79219a = str;
            this.f79220b = i11;
            this.f79221c = i12;
            this.f79222d = Integer.MIN_VALUE;
            this.f79223e = "";
        }

        public void a() {
            int i10 = this.f79222d;
            this.f79222d = i10 == Integer.MIN_VALUE ? this.f79220b : i10 + this.f79221c;
            this.f79223e = this.f79219a + this.f79222d;
        }

        public String b() {
            d();
            return this.f79223e;
        }

        public int c() {
            d();
            return this.f79222d;
        }

        public final void d() {
            if (this.f79222d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a(s7.a0 a0Var, int i10) throws ParserException;

    void b(s7.j0 j0Var, i6.m mVar, d dVar);

    void seek();
}
