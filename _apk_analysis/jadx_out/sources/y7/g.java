package y7;

import com.google.common.base.Optional;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MoreObjects.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: compiled from: MoreObjects.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1107b f87343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C1107b f87344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f87345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f87346e;

        /* JADX INFO: compiled from: MoreObjects.java */
        public static final class a extends C1107b {
            public a() {
            }
        }

        /* JADX INFO: renamed from: y7.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MoreObjects.java */
        public static class C1107b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f87347a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f87348b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C1107b f87349c;
        }

        public b(String str) {
            C1107b c1107b = new C1107b();
            this.f87343b = c1107b;
            this.f87344c = c1107b;
            this.f87345d = false;
            this.f87346e = false;
            this.f87342a = (String) l.m(str);
        }

        public static boolean i(Object obj) {
            return obj instanceof CharSequence ? ((CharSequence) obj).length() == 0 : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj instanceof Optional ? !((Optional) obj).isPresent() : obj.getClass().isArray() && Array.getLength(obj) == 0;
        }

        public b a(String str, int i10) {
            return g(str, String.valueOf(i10));
        }

        public b b(String str, Object obj) {
            return e(str, obj);
        }

        public final C1107b c() {
            C1107b c1107b = new C1107b();
            this.f87344c.f87349c = c1107b;
            this.f87344c = c1107b;
            return c1107b;
        }

        public final b d(Object obj) {
            c().f87348b = obj;
            return this;
        }

        public final b e(String str, Object obj) {
            C1107b c1107bC = c();
            c1107bC.f87348b = obj;
            c1107bC.f87347a = (String) l.m(str);
            return this;
        }

        public final a f() {
            a aVar = new a();
            this.f87344c.f87349c = aVar;
            this.f87344c = aVar;
            return aVar;
        }

        public final b g(String str, Object obj) {
            a aVarF = f();
            aVarF.f87348b = obj;
            aVarF.f87347a = (String) l.m(str);
            return this;
        }

        public b h(Object obj) {
            return d(obj);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r8 = this;
                boolean r0 = r8.f87345d
                boolean r1 = r8.f87346e
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r3 = 32
                r2.<init>(r3)
                java.lang.String r3 = r8.f87342a
                r2.append(r3)
                r3 = 123(0x7b, float:1.72E-43)
                r2.append(r3)
                y7.g$b$b r3 = r8.f87343b
                y7.g$b$b r3 = r3.f87349c
                java.lang.String r4 = ""
            L1b:
                if (r3 == 0) goto L66
                java.lang.Object r5 = r3.f87348b
                boolean r6 = r3 instanceof y7.g.b.a
                if (r6 != 0) goto L30
                if (r5 != 0) goto L28
                if (r0 != 0) goto L63
                goto L30
            L28:
                if (r1 == 0) goto L30
                boolean r6 = i(r5)
                if (r6 != 0) goto L63
            L30:
                r2.append(r4)
                java.lang.String r4 = r3.f87347a
                if (r4 == 0) goto L3f
                r2.append(r4)
                r4 = 61
                r2.append(r4)
            L3f:
                if (r5 == 0) goto L5e
                java.lang.Class r4 = r5.getClass()
                boolean r4 = r4.isArray()
                if (r4 == 0) goto L5e
                r4 = 1
                java.lang.Object[] r6 = new java.lang.Object[r4]
                r7 = 0
                r6[r7] = r5
                java.lang.String r5 = java.util.Arrays.deepToString(r6)
                int r6 = r5.length()
                int r6 = r6 - r4
                r2.append(r5, r4, r6)
                goto L61
            L5e:
                r2.append(r5)
            L61:
                java.lang.String r4 = ", "
            L63:
                y7.g$b$b r3 = r3.f87349c
                goto L1b
            L66:
                r0 = 125(0x7d, float:1.75E-43)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.g.b.toString():java.lang.String");
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
