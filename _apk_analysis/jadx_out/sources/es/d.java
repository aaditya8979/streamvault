package es;

/* JADX INFO: compiled from: PositionInfo.java */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public org.fourthline.cling.model.types.b f61350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f61351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f61354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f61357h;

    public d() {
        this.f61350a = new org.fourthline.cling.model.types.b(0L);
        this.f61351b = "00:00:00";
        this.f61352c = "NOT_IMPLEMENTED";
        this.f61353d = "";
        this.f61354e = "00:00:00";
        this.f61355f = "00:00:00";
        this.f61356g = Integer.MAX_VALUE;
        this.f61357h = Integer.MAX_VALUE;
    }

    public d(long j10, String str, String str2) {
        this.f61350a = new org.fourthline.cling.model.types.b(0L);
        this.f61351b = "00:00:00";
        this.f61352c = "NOT_IMPLEMENTED";
        this.f61353d = "";
        this.f61354e = "00:00:00";
        this.f61355f = "00:00:00";
        this.f61356g = Integer.MAX_VALUE;
        this.f61357h = Integer.MAX_VALUE;
        this.f61350a = new org.fourthline.cling.model.types.b(j10);
        this.f61352c = str;
        this.f61353d = str2;
    }

    public d(long j10, String str, String str2, String str3, String str4) {
        this.f61350a = new org.fourthline.cling.model.types.b(0L);
        this.f61351b = "00:00:00";
        this.f61352c = "NOT_IMPLEMENTED";
        this.f61353d = "";
        this.f61354e = "00:00:00";
        this.f61355f = "00:00:00";
        this.f61356g = Integer.MAX_VALUE;
        this.f61357h = Integer.MAX_VALUE;
        this.f61350a = new org.fourthline.cling.model.types.b(j10);
        this.f61351b = str;
        this.f61353d = str2;
        this.f61354e = str3;
        this.f61355f = str4;
    }

    public int a() {
        long jF = f();
        long jE = e();
        if (jF == 0 || jE == 0) {
            return 0;
        }
        return new Double(jF / (jE / 100.0d)).intValue();
    }

    public String b() {
        return this.f61354e;
    }

    public org.fourthline.cling.model.types.b c() {
        return this.f61350a;
    }

    public String d() {
        return this.f61351b;
    }

    public long e() {
        if (d() == null) {
            return 0L;
        }
        return ir.f.c(d());
    }

    public long f() {
        if (b() == null || b().equals("NOT_IMPLEMENTED")) {
            return 0L;
        }
        return ir.f.c(b());
    }

    public String g() {
        return this.f61352c;
    }

    public String h() {
        return this.f61353d;
    }

    public String toString() {
        return "(PositionInfo) Track: " + c() + " RelTime: " + b() + " Duration: " + d() + " Percent: " + a();
    }
}
