package c8;

import java.util.logging.Logger;

/* JADX INFO: compiled from: LazyLogger.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Logger f6516b;

    public h(Class<?> cls) {
        this.f6515a = cls.getName();
    }

    public Logger a() {
        Logger logger = this.f6516b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            Logger logger2 = this.f6516b;
            if (logger2 != null) {
                return logger2;
            }
            Logger logger3 = Logger.getLogger(this.f6515a);
            this.f6516b = logger3;
            return logger3;
        }
    }
}
