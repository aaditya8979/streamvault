package dq;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetSocketAddress;

/* JADX INFO: compiled from: Address.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59937b;

    public b(String str, int i10) {
        if (str == null) {
            throw new IllegalArgumentException("Host is null");
        }
        this.f59936a = str.trim();
        this.f59937b = i10;
    }

    public String a() {
        return this.f59936a;
    }

    public int b() {
        return this.f59937b;
    }

    public InetSocketAddress c() {
        return new InetSocketAddress(a(), b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f59936a.equals(bVar.f59936a) && this.f59937b == bVar.f59937b;
    }

    public int hashCode() {
        return (this.f59936a.hashCode() * 31) + this.f59937b;
    }

    public String toString() {
        return this.f59936a + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f59937b;
    }
}
