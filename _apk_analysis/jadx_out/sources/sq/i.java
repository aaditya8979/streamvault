package sq;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: DateCache.java */
/* JADX INFO: loaded from: classes9.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static long f84490o = 3600;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f84491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f84492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SimpleDateFormat f84493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f84494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SimpleDateFormat f84495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f84496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f84497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f84498h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f84499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f84500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84501k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f84502l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Locale f84503m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DateFormatSymbols f84504n;

    public i(String str) {
        this.f84499i = -1L;
        this.f84500j = -1L;
        this.f84501k = -1;
        this.f84502l = null;
        this.f84503m = null;
        this.f84504n = null;
        this.f84491a = str;
        e(TimeZone.getDefault());
    }

    public i(String str, Locale locale) {
        this.f84499i = -1L;
        this.f84500j = -1L;
        this.f84501k = -1;
        this.f84502l = null;
        this.f84504n = null;
        this.f84491a = str;
        this.f84503m = locale;
        e(TimeZone.getDefault());
    }

    public synchronized String a(long j10) {
        long j11 = j10 / 1000;
        long j12 = this.f84500j;
        if (j11 >= j12 && (j12 <= 0 || j11 <= f84490o + j12)) {
            if (j12 == j11) {
                return this.f84502l;
            }
            Date date = new Date(j10);
            long j13 = j11 / 60;
            if (this.f84499i != j13) {
                this.f84499i = j13;
                String str = this.f84495e.format(date);
                this.f84496f = str;
                int iIndexOf = str.indexOf("ss");
                this.f84497g = this.f84496f.substring(0, iIndexOf);
                this.f84498h = this.f84496f.substring(iIndexOf + 2);
            }
            this.f84500j = j11;
            StringBuilder sb2 = new StringBuilder(this.f84496f.length());
            sb2.append(this.f84497g);
            int i10 = (int) (j11 % 60);
            if (i10 < 10) {
                sb2.append('0');
            }
            sb2.append(i10);
            sb2.append(this.f84498h);
            String string = sb2.toString();
            this.f84502l = string;
            return string;
        }
        return this.f84493c.format(new Date(j10));
    }

    public int b() {
        return this.f84501k;
    }

    public String c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f84501k = (int) (jCurrentTimeMillis % 1000);
        return a(jCurrentTimeMillis);
    }

    public final void d() {
        if (this.f84492b.indexOf("ss.SSS") >= 0) {
            throw new IllegalStateException("ms not supported");
        }
        int iIndexOf = this.f84492b.indexOf("ss");
        this.f84494d = this.f84492b.substring(0, iIndexOf) + "'ss'" + this.f84492b.substring(iIndexOf + 2);
    }

    public synchronized void e(TimeZone timeZone) {
        f(timeZone);
        if (this.f84503m != null) {
            this.f84493c = new SimpleDateFormat(this.f84492b, this.f84503m);
            this.f84495e = new SimpleDateFormat(this.f84494d, this.f84503m);
        } else if (this.f84504n != null) {
            this.f84493c = new SimpleDateFormat(this.f84492b, this.f84504n);
            this.f84495e = new SimpleDateFormat(this.f84494d, this.f84504n);
        } else {
            this.f84493c = new SimpleDateFormat(this.f84492b);
            this.f84495e = new SimpleDateFormat(this.f84494d);
        }
        this.f84493c.setTimeZone(timeZone);
        this.f84495e.setTimeZone(timeZone);
        this.f84500j = -1L;
        this.f84499i = -1L;
    }

    public final synchronized void f(TimeZone timeZone) {
        int iIndexOf = this.f84491a.indexOf("ZZZ");
        if (iIndexOf >= 0) {
            String strSubstring = this.f84491a.substring(0, iIndexOf);
            String strSubstring2 = this.f84491a.substring(iIndexOf + 3);
            int rawOffset = timeZone.getRawOffset();
            StringBuilder sb2 = new StringBuilder(this.f84491a.length() + 10);
            sb2.append(strSubstring);
            sb2.append("'");
            if (rawOffset >= 0) {
                sb2.append('+');
            } else {
                rawOffset = -rawOffset;
                sb2.append('-');
            }
            int i10 = rawOffset / 60000;
            int i11 = i10 / 60;
            int i12 = i10 % 60;
            if (i11 < 10) {
                sb2.append('0');
            }
            sb2.append(i11);
            if (i12 < 10) {
                sb2.append('0');
            }
            sb2.append(i12);
            sb2.append('\'');
            sb2.append(strSubstring2);
            this.f84492b = sb2.toString();
        } else {
            this.f84492b = this.f84491a;
        }
        d();
    }
}
