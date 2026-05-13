package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.w2;

/* JADX INFO: loaded from: classes9.dex */
@so.k
public final class mu1 {

    @NotNull
    public static final lu1 Companion = new lu1();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final KSerializer[] f92571f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f92575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f92576e;

    static {
        w2 w2Var = w2.f86635a;
        f92571f = new KSerializer[]{null, null, null, new wo.a1(w2Var, to.a.t(w2Var)), null};
    }

    public /* synthetic */ mu1(int i10, long j10, String str, String str2, Map map, String str3) {
        if (31 != (i10 & 31)) {
            wo.c2.a(i10, 31, ku1.f91752a.getDescriptor());
        }
        this.f92572a = j10;
        this.f92573b = str;
        this.f92574c = str2;
        this.f92575d = map;
        this.f92576e = str3;
    }

    public mu1(long j10, String str, String str2, Map map, String str3) {
        this.f92572a = j10;
        this.f92573b = str;
        this.f92574c = str2;
        this.f92575d = map;
        this.f92576e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) obj;
        return this.f92572a == mu1Var.f92572a && tn.p.f(this.f92573b, mu1Var.f92573b) && tn.p.f(this.f92574c, mu1Var.f92574c) && tn.p.f(this.f92575d, mu1Var.f92575d) && tn.p.f(this.f92576e, mu1Var.f92576e);
    }

    public final int hashCode() {
        int iA = k4.a(this.f92574c, k4.a(this.f92573b, Long.hashCode(this.f92572a) * 31, 31), 31);
        Map map = this.f92575d;
        int iHashCode = (iA + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f92576e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkRequestLog(timestamp=" + this.f92572a + ", method=" + this.f92573b + ", url=" + this.f92574c + ", headers=" + this.f92575d + ", body=" + this.f92576e + ")";
    }
}
