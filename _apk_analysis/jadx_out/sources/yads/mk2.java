package yads;

import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class mk2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FloatBuffer f92420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f92421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92422d;

    public mk2(jk2 jk2Var) {
        this.f92419a = jk2Var.a();
        this.f92420b = sz0.a(jk2Var.f91264c);
        this.f92421c = sz0.a(jk2Var.f91265d);
        int i10 = jk2Var.f91263b;
        if (i10 == 1) {
            this.f92422d = 5;
        } else if (i10 != 2) {
            this.f92422d = 4;
        } else {
            this.f92422d = 6;
        }
    }
}
