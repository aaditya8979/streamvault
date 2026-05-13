package e5;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import e4.v0;
import java.io.IOException;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes8.dex */
public interface r {

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f60579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f60580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f60581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f60582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f60583e;

        public a(Object obj) {
            this(obj, -1L);
        }

        public a(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        public a(Object obj, int i10, int i11, long j10, int i12) {
            this.f60579a = obj;
            this.f60580b = i10;
            this.f60581c = i11;
            this.f60582d = j10;
            this.f60583e = i12;
        }

        public a(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public a(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public a a(Object obj) {
            return this.f60579a.equals(obj) ? this : new a(obj, this.f60580b, this.f60581c, this.f60582d, this.f60583e);
        }

        public boolean b() {
            return this.f60580b != -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f60579a.equals(aVar.f60579a) && this.f60580b == aVar.f60580b && this.f60581c == aVar.f60581c && this.f60582d == aVar.f60582d && this.f60583e == aVar.f60583e;
        }

        public int hashCode() {
            return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f60579a.hashCode()) * 31) + this.f60580b) * 31) + this.f60581c) * 31) + ((int) this.f60582d)) * 31) + this.f60583e;
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface b {
        void b(r rVar, v0 v0Var);
    }

    void a(b bVar, @Nullable y5.q qVar);

    q b(a aVar, y5.b bVar, long j10);

    void c(Handler handler, b0 b0Var);

    void d(b bVar);

    void e(b bVar);

    void f(b0 b0Var);

    @Nullable
    default Object getTag() {
        return null;
    }

    void h(b bVar);

    void k(q qVar);

    void maybeThrowSourceInfoRefreshError() throws IOException;
}
