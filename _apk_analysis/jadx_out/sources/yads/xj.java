package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f96784a;

    public xj(int i10) {
        this.f96784a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f96784a);
    }
}
