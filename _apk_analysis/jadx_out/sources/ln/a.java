package ln;

import java.lang.reflect.Method;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: ln.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    public static final class C0874a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0874a f73872a = new C0874a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public static final Method f73873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public static final Method f73874c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
        static {
            /*
                ln.a$a r0 = new ln.a$a
                r0.<init>()
                ln.a.C0874a.f73872a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                tn.p.h(r1)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L13:
                r5 = 0
                if (r4 >= r2) goto L40
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = tn.p.f(r7, r8)
                if (r7 == 0) goto L39
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "getParameterTypes(...)"
                tn.p.j(r7, r8)
                java.lang.Object r7 = cn.r.w0(r7)
                boolean r7 = tn.p.f(r7, r0)
                if (r7 == 0) goto L39
                r7 = 1
                goto L3a
            L39:
                r7 = r3
            L3a:
                if (r7 == 0) goto L3d
                goto L41
            L3d:
                int r4 = r4 + 1
                goto L13
            L40:
                r6 = r5
            L41:
                ln.a.C0874a.f73873b = r6
                int r0 = r1.length
            L44:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = tn.p.f(r4, r6)
                if (r4 == 0) goto L56
                r5 = r2
                goto L59
            L56:
                int r3 = r3 + 1
                goto L44
            L59:
                ln.a.C0874a.f73874c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ln.a.C0874a.<clinit>():void");
        }
    }

    public void a(@NotNull Throwable th2, @NotNull Throwable th3) {
        p.k(th2, "cause");
        p.k(th3, "exception");
        Method method = C0874a.f73873b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    @NotNull
    public Random b() {
        return new xn.b();
    }
}
