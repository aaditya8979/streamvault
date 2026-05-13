package gn;

import bn.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Thread.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: gn.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Thread.kt */
    public static final class C0772a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.a<r> f62643b;

        public C0772a(sn.a<r> aVar) {
            this.f62643b = aVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f62643b.invoke();
        }
    }

    @NotNull
    public static final Thread a(boolean z10, boolean z11, @Nullable ClassLoader classLoader, @Nullable String str, int i10, @NotNull sn.a<r> aVar) {
        p.k(aVar, "block");
        C0772a c0772a = new C0772a(aVar);
        if (z11) {
            c0772a.setDaemon(true);
        }
        if (i10 > 0) {
            c0772a.setPriority(i10);
        }
        if (str != null) {
            c0772a.setName(str);
        }
        if (classLoader != null) {
            c0772a.setContextClassLoader(classLoader);
        }
        if (z10) {
            c0772a.start();
        }
        return c0772a;
    }

    public static /* synthetic */ Thread b(boolean z10, boolean z11, ClassLoader classLoader, String str, int i10, sn.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        boolean z13 = z11;
        ClassLoader classLoader2 = (i11 & 4) != 0 ? null : classLoader;
        String str2 = (i11 & 8) != 0 ? null : str;
        if ((i11 & 16) != 0) {
            i10 = -1;
        }
        return a(z12, z13, classLoader2, str2, i10, aVar);
    }
}
