package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class oo3 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ko3 f93298c;

    public oo3(int i10, ko3 ko3Var) {
        this.f93297b = i10;
        this.f93298c = ko3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f93297b, ((oo3) obj).f93297b);
    }
}
