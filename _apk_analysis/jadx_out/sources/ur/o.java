package ur;

import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: NamedDeviceType.java */
/* JADX INFO: loaded from: classes12.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f85816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f85817b;

    public o(z zVar, j jVar) {
        this.f85816a = zVar;
        this.f85817b = jVar;
    }

    public static o c(String str) throws InvalidValueException {
        String[] strArrSplit = str.split("::");
        if (strArrSplit.length != 2) {
            throw new InvalidValueException("Can't parse UDN::DeviceType from: " + str);
        }
        try {
            return new o(z.b(strArrSplit[0]), j.d(strArrSplit[1]));
        } catch (Exception unused) {
            throw new InvalidValueException("Can't parse UDN: " + strArrSplit[0]);
        }
    }

    public j a() {
        return this.f85817b;
    }

    public z b() {
        return this.f85816a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f85817b.equals(oVar.f85817b) && this.f85816a.equals(oVar.f85816a);
    }

    public int hashCode() {
        return (this.f85816a.hashCode() * 31) + this.f85817b.hashCode();
    }

    public String toString() {
        return b().toString() + "::" + a().toString();
    }
}
