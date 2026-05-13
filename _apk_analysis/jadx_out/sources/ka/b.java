package ka;

import android.content.Context;
import oa.h;

/* JADX INFO: compiled from: PictureAppMaster.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f73049b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f73050a;

    public static b c() {
        if (f73049b == null) {
            synchronized (b.class) {
                if (f73049b == null) {
                    f73049b = new b();
                }
            }
        }
        return f73049b;
    }

    @Override // ka.a
    public h a() {
        a aVar = this.f73050a;
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    @Override // ka.a
    public Context b() {
        a aVar = this.f73050a;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }
}
