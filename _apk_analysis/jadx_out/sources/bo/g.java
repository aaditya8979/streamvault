package bo;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f5664d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final g f5665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final g f5666f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f5668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f5669c;

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public static final C0124a f5670j = new C0124a(null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public static final a f5671k = new a(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f5674c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f5675d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f5676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f5677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f5678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f5679h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f5680i;

        /* JADX INFO: renamed from: bo.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class C0124a {
            public C0124a() {
            }

            public /* synthetic */ C0124a(tn.i iVar) {
                this();
            }

            @NotNull
            public final a a() {
                return a.f5671k;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r4, int r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8, @org.jetbrains.annotations.NotNull java.lang.String r9) {
            /*
                r3 = this;
                java.lang.String r0 = "groupSeparator"
                tn.p.k(r6, r0)
                java.lang.String r0 = "byteSeparator"
                tn.p.k(r7, r0)
                java.lang.String r0 = "bytePrefix"
                tn.p.k(r8, r0)
                java.lang.String r0 = "byteSuffix"
                tn.p.k(r9, r0)
                r3.<init>()
                r3.f5672a = r4
                r3.f5673b = r5
                r3.f5674c = r6
                r3.f5675d = r7
                r3.f5676e = r8
                r3.f5677f = r9
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1 = 0
                r2 = 1
                if (r4 != r0) goto L2e
                if (r5 != r0) goto L2e
                r4 = r2
                goto L2f
            L2e:
                r4 = r1
            L2f:
                r3.f5678g = r4
                int r4 = r8.length()
                if (r4 != 0) goto L39
                r4 = r2
                goto L3a
            L39:
                r4 = r1
            L3a:
                if (r4 == 0) goto L4f
                int r4 = r9.length()
                if (r4 != 0) goto L44
                r4 = r2
                goto L45
            L44:
                r4 = r1
            L45:
                if (r4 == 0) goto L4f
                int r4 = r7.length()
                if (r4 > r2) goto L4f
                r4 = r2
                goto L50
            L4f:
                r4 = r1
            L50:
                r3.f5679h = r4
                boolean r4 = bo.h.a(r6)
                if (r4 != 0) goto L6a
                boolean r4 = bo.h.a(r7)
                if (r4 != 0) goto L6a
                boolean r4 = bo.h.a(r8)
                if (r4 != 0) goto L6a
                boolean r4 = bo.h.a(r9)
                if (r4 == 0) goto L6b
            L6a:
                r1 = r2
            L6b:
                r3.f5680i = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.g.a.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb2, @NotNull String str) {
            tn.p.k(sb2, "sb");
            tn.p.k(str, "indent");
            sb2.append(str);
            sb2.append("bytesPerLine = ");
            sb2.append(this.f5672a);
            sb2.append(StringUtils.COMMA);
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytesPerGroup = ");
            sb2.append(this.f5673b);
            sb2.append(StringUtils.COMMA);
            sb2.append('\n');
            sb2.append(str);
            sb2.append("groupSeparator = \"");
            sb2.append(this.f5674c);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSeparator = \"");
            sb2.append(this.f5675d);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("bytePrefix = \"");
            sb2.append(this.f5676e);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("byteSuffix = \"");
            sb2.append(this.f5677f);
            sb2.append("\"");
            return sb2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BytesHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final g a() {
            return g.f5665e;
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    public static final class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final a f5681h = new a(null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public static final c f5682i = new c("", "", false, 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f5683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f5684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f5685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5686d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f5687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f5689g;

        /* JADX INFO: compiled from: HexFormat.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final c a() {
                return c.f5682i;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull java.lang.String r4, boolean r5, int r6) {
            /*
                r2 = this;
                java.lang.String r0 = "prefix"
                tn.p.k(r3, r0)
                java.lang.String r0 = "suffix"
                tn.p.k(r4, r0)
                r2.<init>()
                r2.f5683a = r3
                r2.f5684b = r4
                r2.f5685c = r5
                r2.f5686d = r6
                int r5 = r3.length()
                r0 = 0
                r1 = 1
                if (r5 != 0) goto L1f
                r5 = r1
                goto L20
            L1f:
                r5 = r0
            L20:
                if (r5 == 0) goto L2f
                int r5 = r4.length()
                if (r5 != 0) goto L2a
                r5 = r1
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r5 == 0) goto L2f
                r5 = r1
                goto L30
            L2f:
                r5 = r0
            L30:
                r2.f5687e = r5
                if (r5 == 0) goto L38
                if (r6 != r1) goto L38
                r5 = r1
                goto L39
            L38:
                r5 = r0
            L39:
                r2.f5688f = r5
                boolean r3 = bo.h.a(r3)
                if (r3 != 0) goto L47
                boolean r3 = bo.h.a(r4)
                if (r3 == 0) goto L48
            L47:
                r0 = r1
            L48:
                r2.f5689g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bo.g.c.<init>(java.lang.String, java.lang.String, boolean, int):void");
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb2, @NotNull String str) {
            tn.p.k(sb2, "sb");
            tn.p.k(str, "indent");
            sb2.append(str);
            sb2.append("prefix = \"");
            sb2.append(this.f5683a);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("suffix = \"");
            sb2.append(this.f5684b);
            sb2.append("\",");
            sb2.append('\n');
            sb2.append(str);
            sb2.append("removeLeadingZeros = ");
            sb2.append(this.f5685c);
            sb2.append(',');
            sb2.append('\n');
            sb2.append(str);
            sb2.append("minLength = ");
            sb2.append(this.f5686d);
            return sb2;
        }

        public final boolean c() {
            return this.f5689g;
        }

        @NotNull
        public final String d() {
            return this.f5683a;
        }

        @NotNull
        public final String e() {
            return this.f5684b;
        }

        public final boolean f() {
            return this.f5687e;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NumberHexFormat(");
            sb2.append('\n');
            b(sb2, "    ").append('\n');
            sb2.append(")");
            return sb2.toString();
        }
    }

    static {
        a.C0124a c0124a = a.f5670j;
        a aVarA = c0124a.a();
        c.a aVar = c.f5681h;
        f5665e = new g(false, aVarA, aVar.a());
        f5666f = new g(true, c0124a.a(), aVar.a());
    }

    public g(boolean z10, @NotNull a aVar, @NotNull c cVar) {
        tn.p.k(aVar, "bytes");
        tn.p.k(cVar, "number");
        this.f5667a = z10;
        this.f5668b = aVar;
        this.f5669c = cVar;
    }

    @NotNull
    public final c b() {
        return this.f5669c;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HexFormat(");
        sb2.append('\n');
        sb2.append("    upperCase = ");
        sb2.append(this.f5667a);
        sb2.append(StringUtils.COMMA);
        sb2.append('\n');
        sb2.append("    bytes = BytesHexFormat(");
        sb2.append('\n');
        this.f5668b.b(sb2, "        ").append('\n');
        sb2.append("    ),");
        sb2.append('\n');
        sb2.append("    number = NumberHexFormat(");
        sb2.append('\n');
        this.f5669c.b(sb2, "        ").append('\n');
        sb2.append("    )");
        sb2.append('\n');
        sb2.append(")");
        return sb2.toString();
    }
}
