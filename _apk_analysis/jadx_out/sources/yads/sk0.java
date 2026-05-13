package yads;

import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public interface sk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qk0 f94854a = new qk0();

    int a(mx0 mx0Var);

    default rk0 a(ok0 ok0Var, mx0 mx0Var) {
        return rk0.f94473a;
    }

    void a(Looper looper, ye2 ye2Var);

    mk0 b(ok0 ok0Var, mx0 mx0Var);

    default void prepare() {
    }

    default void release() {
    }
}
