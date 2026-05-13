package qr;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: StateVariableAllowedValueRange.java */
/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f78477d = Logger.getLogger(n.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f78478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78480c;

    public n(long j10, long j11, long j12) {
        if (j10 > j11) {
            f78477d.warning("UPnP specification violation, allowed value range minimum '" + j10 + "' is greater than maximum '" + j11 + "', switching values.");
            this.f78478a = j11;
            this.f78479b = j10;
        } else {
            this.f78478a = j10;
            this.f78479b = j11;
        }
        this.f78480c = j12;
    }

    public long a() {
        return this.f78479b;
    }

    public long b() {
        return this.f78478a;
    }

    public long c() {
        return this.f78480c;
    }

    public boolean d(long j10) {
        return j10 >= b() && j10 <= a() && j10 % this.f78480c == 0;
    }

    public List<ir.k> e() {
        return new ArrayList();
    }

    public String toString() {
        return "Range Min: " + b() + " Max: " + a() + " Step: " + c();
    }
}
