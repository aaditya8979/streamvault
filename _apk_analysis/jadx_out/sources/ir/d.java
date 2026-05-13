package ir;

import java.util.Date;

/* JADX INFO: compiled from: ExpirationDetails.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f71767c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f71768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f71769b;

    public d() {
        this.f71768a = 0;
        this.f71769b = a();
    }

    public d(int i10) {
        this.f71768a = 0;
        this.f71769b = a();
        this.f71768a = i10;
    }

    public long a() {
        return new Date().getTime() / 1000;
    }

    public int b() {
        return this.f71768a;
    }

    public long c() {
        int i10 = this.f71768a;
        if (i10 == 0) {
            return 2147483647L;
        }
        return (this.f71769b + ((long) i10)) - a();
    }

    public boolean d() {
        return e(false);
    }

    public boolean e(boolean z10) {
        int i10 = this.f71768a;
        if (i10 != 0) {
            if (this.f71769b + ((long) (i10 / (z10 ? 2 : 1))) < a()) {
                return true;
            }
        }
        return false;
    }

    public void f(long j10) {
        this.f71769b = j10;
    }

    public void g() {
        f(a());
    }

    public String toString() {
        return "(" + f71767c + ") MAX AGE: " + this.f71768a;
    }
}
