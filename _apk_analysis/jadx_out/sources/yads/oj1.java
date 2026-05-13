package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class oj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f93236b;

    public oj1(String str, float f10) {
        this.f93235a = str;
        this.f93236b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj1)) {
            return false;
        }
        oj1 oj1Var = (oj1) obj;
        return tn.p.f(this.f93235a, oj1Var.f93235a) && Float.compare(this.f93236b, oj1Var.f93236b) == 0;
    }

    public final int hashCode() {
        String str = this.f93235a;
        return Float.hashCode(this.f93236b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Media(htmlContent=" + this.f93235a + ", aspectRatio=" + this.f93236b + ")";
    }
}
