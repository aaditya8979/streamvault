package ur;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: HostPort.java */
/* JADX INFO: loaded from: classes12.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85814b;

    public m() {
    }

    public m(String str, int i10) {
        this.f85813a = str;
        this.f85814b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f85814b == mVar.f85814b && this.f85813a.equals(mVar.f85813a);
    }

    public int hashCode() {
        return (this.f85813a.hashCode() * 31) + this.f85814b;
    }

    public String toString() {
        return this.f85813a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f85814b;
    }
}
