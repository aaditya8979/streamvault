package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ya implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f97050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa3 f97051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f97052d;

    public ya(String str, wa3 wa3Var, Map map) {
        this.f97050b = str;
        this.f97051c = wa3Var;
        this.f97052d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f97050b.length() > 0) {
            this.f97051c.a(this.f97050b, this.f97052d);
        }
    }
}
