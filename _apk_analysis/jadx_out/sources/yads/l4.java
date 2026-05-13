package yads;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91881d;

    public l4(int i10, String str, String str2, String str3) {
        this.f91878a = i10;
        this.f91879b = str;
        this.f91880c = str2;
        this.f91881d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f91878a == l4Var.f91878a && tn.p.f(this.f91879b, l4Var.f91879b) && tn.p.f(this.f91880c, l4Var.f91880c) && tn.p.f(this.f91881d, l4Var.f91881d);
    }

    public final int hashCode() {
        int iA = k4.a(this.f91880c, k4.a(this.f91879b, Integer.hashCode(this.f91878a) * 31, 31), 31);
        String str = this.f91881d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        tn.x xVar = tn.x.f85368a;
        String str = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f91878a), this.f91879b, this.f91881d, this.f91880c}, 4));
        tn.p.j(str, "format(...)");
        return str;
    }
}
