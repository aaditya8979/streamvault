package mq;

import javax.servlet.http.Cookie;
import org.eclipse.jetty.util.LazyList;

/* JADX INFO: compiled from: CookieCutter.java */
/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final vq.c f74909e = vq.b.a(g.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cookie[] f74910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Cookie[] f74911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f74912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f74913d;

    public void a(String str) {
        if (str == null) {
            return;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return;
        }
        int size = LazyList.size(this.f74912c);
        int i10 = this.f74913d;
        if (size > i10) {
            if (!strTrim.equals(LazyList.get(this.f74912c, i10))) {
                while (true) {
                    int size2 = LazyList.size(this.f74912c);
                    int i11 = this.f74913d;
                    if (size2 <= i11) {
                        break;
                    } else {
                        this.f74912c = LazyList.remove(this.f74912c, i11);
                    }
                }
            } else {
                this.f74913d++;
                return;
            }
        }
        this.f74910a = null;
        this.f74911b = null;
        Object obj = this.f74912c;
        int i12 = this.f74913d;
        this.f74913d = i12 + 1;
        this.f74912c = LazyList.add(obj, i12, strTrim);
    }

    public Cookie[] b() {
        Object obj;
        Cookie[] cookieArr = this.f74910a;
        if (cookieArr != null) {
            return cookieArr;
        }
        if (this.f74911b == null || (obj = this.f74912c) == null || this.f74913d != LazyList.size(obj)) {
            c();
        } else {
            this.f74910a = this.f74911b;
        }
        Cookie[] cookieArr2 = this.f74910a;
        this.f74911b = cookieArr2;
        return cookieArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v28 */
    /* JADX WARN: Type inference failed for: r16v29 */
    /* JADX WARN: Type inference failed for: r16v30 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v28 */
    /* JADX WARN: Type inference failed for: r17v29 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.g.c():void");
    }

    public void d() {
        this.f74910a = null;
        this.f74913d = 0;
    }
}
