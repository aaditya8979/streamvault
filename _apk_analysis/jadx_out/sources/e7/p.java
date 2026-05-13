package e7;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: MediaPeriodId.java */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f60899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f60902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f60903e;

    public p(p pVar) {
        this.f60899a = pVar.f60899a;
        this.f60900b = pVar.f60900b;
        this.f60901c = pVar.f60901c;
        this.f60902d = pVar.f60902d;
        this.f60903e = pVar.f60903e;
    }

    public p(Object obj) {
        this(obj, -1L);
    }

    public p(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public p(Object obj, int i10, int i11, long j10, int i12) {
        this.f60899a = obj;
        this.f60900b = i10;
        this.f60901c = i11;
        this.f60902d = j10;
        this.f60903e = i12;
    }

    public p(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public p(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }

    public p a(Object obj) {
        return this.f60899a.equals(obj) ? this : new p(obj, this.f60900b, this.f60901c, this.f60902d, this.f60903e);
    }

    public boolean b() {
        return this.f60900b != -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f60899a.equals(pVar.f60899a) && this.f60900b == pVar.f60900b && this.f60901c == pVar.f60901c && this.f60902d == pVar.f60902d && this.f60903e == pVar.f60903e;
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f60899a.hashCode()) * 31) + this.f60900b) * 31) + this.f60901c) * 31) + ((int) this.f60902d)) * 31) + this.f60903e;
    }
}
