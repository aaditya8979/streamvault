package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import wo.w2;

/* JADX INFO: loaded from: classes2.dex */
@so.k
public final class pu1 {

    @NotNull
    public static final ou1 Companion = new ou1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final KSerializer[] f93781e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f93783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f93784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f93785d;

    static {
        w2 w2Var = w2.f86635a;
        f93781e = new KSerializer[]{null, null, new wo.a1(w2Var, to.a.t(w2Var)), null};
    }

    public /* synthetic */ pu1(int i10, long j10, Integer num, Map map, String str) {
        if (15 != (i10 & 15)) {
            wo.c2.a(i10, 15, nu1.f92990a.getDescriptor());
        }
        this.f93782a = j10;
        this.f93783b = num;
        this.f93784c = map;
        this.f93785d = str;
    }

    public pu1(long j10, Integer num, Map map, String str) {
        this.f93782a = j10;
        this.f93783b = num;
        this.f93784c = map;
        this.f93785d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu1)) {
            return false;
        }
        pu1 pu1Var = (pu1) obj;
        return this.f93782a == pu1Var.f93782a && tn.p.f(this.f93783b, pu1Var.f93783b) && tn.p.f(this.f93784c, pu1Var.f93784c) && tn.p.f(this.f93785d, pu1Var.f93785d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f93782a) * 31;
        Integer num = this.f93783b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map map = this.f93784c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.f93785d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MobileAdsNetworkResponseLog(timestamp=" + this.f93782a + ", statusCode=" + this.f93783b + ", headers=" + this.f93784c + ", body=" + this.f93785d + ")";
    }
}
