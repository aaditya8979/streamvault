package yads;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@so.k
public final class g50 {

    @NotNull
    public static final f50 Companion = new f50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89816c;

    public /* synthetic */ g50(int i10, String str, String str2, String str3) {
        if ((i10 & 1) == 0) {
            this.f89814a = null;
        } else {
            this.f89814a = str;
        }
        if ((i10 & 2) == 0) {
            this.f89815b = null;
        } else {
            this.f89815b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f89816c = null;
        } else {
            this.f89816c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g50)) {
            return false;
        }
        g50 g50Var = (g50) obj;
        return tn.p.f(this.f89814a, g50Var.f89814a) && tn.p.f(this.f89815b, g50Var.f89815b) && tn.p.f(this.f89816c, g50Var.f89816c);
    }

    public final int hashCode() {
        String str = this.f89814a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f89815b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89816c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DebugPanelAlert(title=" + this.f89814a + ", message=" + this.f89815b + ", type=" + this.f89816c + ")";
    }
}
