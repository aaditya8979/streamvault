package s1;

/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f78993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f2.b f78994b;

    public d(a aVar, f2.b bVar) {
        this.f78993a = aVar;
        this.f78994b = bVar;
    }

    public void a(String str) {
        g(3, str);
    }

    public void b(String str) {
        g(6, str);
    }

    public void c(String str, Throwable th2) {
        h(6, str, th2);
    }

    public void d(String str, Object... objArr) {
        i(6, str, objArr);
    }

    public final String e(String str, Object... objArr) {
        if (str != null) {
            return String.format(str, objArr);
        }
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(objArr[i10]);
        }
        return sb2.toString();
    }

    public void f(String str) {
        g(4, str);
    }

    public void g(int i10, String str) {
        if (i10 < this.f78993a.f78958a) {
            return;
        }
        j(i10, str);
    }

    public final void h(int i10, String str, Throwable th2) {
        String str2;
        if (i10 < this.f78993a.f78958a) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null || str.length() == 0) {
            str2 = "";
        } else {
            str2 = str + d2.c.f59553a;
        }
        sb2.append(str2);
        sb2.append(this.f78993a.f78967j.a(th2));
        j(i10, sb2.toString());
    }

    public final void i(int i10, String str, Object... objArr) {
        if (i10 < this.f78993a.f78958a) {
            return;
        }
        j(i10, e(str, objArr));
    }

    public final void j(int i10, String str) {
        String strA;
        String string;
        a aVar = this.f78993a;
        String str2 = aVar.f78959b;
        String strA2 = aVar.f78960c ? aVar.f78968k.a(Thread.currentThread()) : null;
        a aVar2 = this.f78993a;
        if (aVar2.f78961d) {
            a2.b bVar = aVar2.f78969l;
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            a aVar3 = this.f78993a;
            strA = bVar.a(e2.a.b(stackTrace, aVar3.f78962e, aVar3.f78963f));
        } else {
            strA = null;
        }
        if (this.f78993a.f78972o != null) {
            b bVar2 = new b(i10, str2, strA2, strA, str);
            for (c2.a aVar4 : this.f78993a.f78972o) {
                bVar2 = aVar4.a(bVar2);
                if (bVar2 == null) {
                    return;
                }
                if (bVar2.f78989b == null || bVar2.f78990c == null) {
                    throw new IllegalStateException("Interceptor " + aVar4 + " should not remove the tag or message of a log, if you don't want to print this log, just return a null when intercept.");
                }
            }
            i10 = bVar2.f78988a;
            str2 = bVar2.f78989b;
            strA2 = bVar2.f78991d;
            strA = bVar2.f78992e;
            str = bVar2.f78990c;
        }
        f2.b bVar3 = this.f78994b;
        a aVar5 = this.f78993a;
        if (aVar5.f78964g) {
            string = aVar5.f78970m.a(new String[]{strA2, strA, str});
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strA2 != null ? strA2 + d2.c.f59553a : "");
            sb2.append(strA != null ? strA + d2.c.f59553a : "");
            sb2.append(str);
            string = sb2.toString();
        }
        bVar3.a(i10, str2, string);
    }

    public void k(String str) {
        g(5, str);
    }
}
