package ir;

/* JADX INFO: compiled from: ValidationError.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f71787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f71788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f71789c;

    public k(Class cls, String str, String str2) {
        this.f71787a = cls;
        this.f71788b = str;
        this.f71789c = str2;
    }

    public Class a() {
        return this.f71787a;
    }

    public String b() {
        return this.f71788b;
    }

    public String toString() {
        return getClass().getSimpleName() + " (Class: " + a().getSimpleName() + ", propertyName: " + b() + "): " + this.f71789c;
    }
}
