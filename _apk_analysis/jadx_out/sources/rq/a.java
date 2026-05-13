package rq;

import java.io.IOException;
import javax.servlet.DispatcherType;
import org.eclipse.jetty.http.PathMap;
import sq.p;
import uq.e;

/* JADX INFO: compiled from: FilterMapping.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78925b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient org.eclipse.jetty.servlet.a f78927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String[] f78928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f78929f;

    /* JADX INFO: renamed from: rq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FilterMapping.java */
    public static /* synthetic */ class C0948a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78930a;

        static {
            int[] iArr = new int[DispatcherType.values().length];
            f78930a = iArr;
            try {
                iArr[DispatcherType.REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78930a[DispatcherType.ASYNC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78930a[DispatcherType.FORWARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78930a[DispatcherType.INCLUDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78930a[DispatcherType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int c(DispatcherType dispatcherType) {
        int i10 = C0948a.f78930a[dispatcherType.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        int i11 = 2;
        if (i10 == 2) {
            return 16;
        }
        if (i10 != 3) {
            i11 = 4;
            if (i10 != 4) {
                if (i10 == 5) {
                    return 8;
                }
                throw new IllegalArgumentException(dispatcherType.toString());
            }
        }
        return i11;
    }

    public boolean a(int i10) {
        int i11 = this.f78925b;
        return i11 == 0 ? i10 == 1 || (i10 == 16 && this.f78927d.r0()) : (i10 & i11) != 0;
    }

    public boolean b(String str, int i10) {
        if (a(i10)) {
            int i11 = 0;
            while (true) {
                String[] strArr = this.f78928e;
                if (i11 >= strArr.length) {
                    break;
                }
                String str2 = strArr[i11];
                if (str2 != null && PathMap.match(str2, str, true)) {
                    return true;
                }
                i11++;
            }
        }
        return false;
    }

    public org.eclipse.jetty.servlet.a d() {
        return this.f78927d;
    }

    public String e() {
        return this.f78926c;
    }

    public String[] f() {
        return this.f78928e;
    }

    public String[] g() {
        return this.f78929f;
    }

    public void h(org.eclipse.jetty.servlet.a aVar) {
        this.f78927d = aVar;
        i(aVar.getName());
    }

    public void i(String str) {
        this.f78926c = str;
    }

    public String toString() {
        return p.a(this.f78928e) + "/" + p.a(this.f78929f) + "==" + this.f78925b + "=>" + this.f78926c;
    }

    @Override // uq.e
    public void w(Appendable appendable, String str) throws IOException {
        appendable.append(String.valueOf(this)).append("\n");
    }
}
