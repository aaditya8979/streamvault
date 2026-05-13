package ia;

/* JADX INFO: compiled from: FileDownloadProperties.java */
/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f64039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64041h;

    /* JADX INFO: compiled from: FileDownloadProperties.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f64042a = new e();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad A[Catch: all -> 0x0294, TryCatch #5 {all -> 0x0294, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[Catch: all -> 0x0294, TRY_LEAVE, TryCatch #5 {all -> 0x0294, blocks: (B:7:0x0036, B:8:0x003d, B:9:0x0041, B:10:0x0045, B:11:0x0049, B:12:0x004d, B:13:0x0051, B:14:0x0055, B:50:0x00a9, B:52:0x00ad, B:54:0x00b1, B:56:0x00bf), top: B:137:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.e.<init>():void");
    }

    public static e a() {
        return b.f64042a;
    }

    public static int b(int i10) {
        if (i10 > 12) {
            d.i(e.class, "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto", Integer.valueOf(i10), 12, 12);
            return 12;
        }
        if (i10 >= 1) {
            return i10;
        }
        d.i(e.class, "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto", Integer.valueOf(i10), 1, 1);
        return 1;
    }
}
