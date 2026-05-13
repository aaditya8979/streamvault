package ur;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: NamedServiceType.java */
/* JADX INFO: loaded from: classes2.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f85818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f85819b;

    public p(z zVar, s sVar) {
        this.f85818a = zVar;
        this.f85819b = sVar;
    }

    public static p c(String str) throws InvalidValueException {
        String[] strArrSplit = str.split("::");
        if (strArrSplit.length != 2) {
            throw new InvalidValueException("Can't parse UDN::ServiceType from: " + str);
        }
        try {
            return new p(z.b(strArrSplit[0]), s.d(strArrSplit[1]));
        } catch (Exception unused) {
            throw new InvalidValueException("Can't parse UDN: " + strArrSplit[0]);
        }
    }

    public s a() {
        return this.f85819b;
    }

    public z b() {
        return this.f85818a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f85819b.equals(pVar.f85819b) && this.f85818a.equals(pVar.f85818a);
    }

    public int hashCode() {
        return (this.f85818a.hashCode() * 31) + this.f85819b.hashCode();
    }

    public String toString() {
        return b().toString() + "::" + a().toString();
    }
}
