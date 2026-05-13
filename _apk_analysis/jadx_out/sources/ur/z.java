package ur;

import java.util.UUID;
import java.util.logging.Logger;

/* JADX INFO: compiled from: UDN.java */
/* JADX INFO: loaded from: classes2.dex */
public class z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f85845b = Logger.getLogger(z.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f85846a;

    public z(String str) {
        this.f85846a = str;
    }

    public z(UUID uuid) {
        this.f85846a = uuid.toString();
    }

    public static z b(String str) {
        if (str.startsWith("uuid:")) {
            str = str.substring(5);
        }
        return new z(str);
    }

    public String a() {
        return this.f85846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        return this.f85846a.equals(((z) obj).f85846a);
    }

    public int hashCode() {
        return this.f85846a.hashCode();
    }

    public String toString() {
        return "uuid:" + a();
    }
}
