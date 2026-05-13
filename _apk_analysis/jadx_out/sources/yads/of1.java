package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class of1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f93207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public cw0 f93208b = new cw0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f93209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f93210d;

    public of1(Object obj) {
        this.f93207a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || of1.class != obj.getClass()) {
            return false;
        }
        return this.f93207a.equals(((of1) obj).f93207a);
    }

    public final int hashCode() {
        return this.f93207a.hashCode();
    }
}
