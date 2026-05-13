package qq;

import an.h;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import qq.c;

/* JADX INFO: compiled from: AbstractSession.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class a implements c.InterfaceC0940c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final vq.c f78369o = g.f78415u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f78370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f78373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f78374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f78375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f78378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f78379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f78380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f78382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f78383n;

    public a(c cVar, long j10, long j11, String str) {
        this.f78373d = new HashMap();
        this.f78370a = cVar;
        this.f78375f = j10;
        this.f78371b = str;
        String strF = cVar.f78394p.F(str, null);
        this.f78372c = strF;
        this.f78377h = j11;
        this.f78378i = j11;
        this.f78383n = 1;
        int i10 = cVar.f78391m;
        this.f78381l = i10 > 0 ? ((long) i10) * 1000 : -1L;
        vq.c cVar2 = f78369o;
        if (cVar2.isDebugEnabled()) {
            cVar2.h("new session " + strF + Z7.f30794r + str, new Object[0]);
        }
    }

    public a(c cVar, an.a aVar) {
        this.f78373d = new HashMap();
        this.f78370a = cVar;
        this.f78382m = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f78375f = jCurrentTimeMillis;
        String strV = cVar.f78394p.v(aVar, jCurrentTimeMillis);
        this.f78371b = strV;
        String strF = cVar.f78394p.F(strV, aVar);
        this.f78372c = strF;
        this.f78377h = jCurrentTimeMillis;
        this.f78378i = jCurrentTimeMillis;
        this.f78383n = 1;
        int i10 = cVar.f78391m;
        this.f78381l = i10 > 0 ? ((long) i10) * 1000 : -1L;
        vq.c cVar2 = f78369o;
        if (cVar2.isDebugEnabled()) {
            cVar2.h("new session & id " + strF + Z7.f30794r + strV, new Object[0]);
        }
    }

    public void A(String str, Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return;
        }
        ((h) obj).valueUnbound(new HttpSessionBindingEvent(this, str));
    }

    public void B() {
        synchronized (this) {
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
            for (Object obj : this.f78373d.values()) {
                if (obj instanceof an.f) {
                    ((an.f) obj).sessionWillPassivate(httpSessionEvent);
                }
            }
        }
    }

    @Override // an.e
    public void a(String str, Object obj) {
        Object objL;
        synchronized (this) {
            e();
            objL = l(str, obj);
        }
        if (obj == null || !obj.equals(objL)) {
            if (objL != null) {
                A(str, objL);
            }
            if (obj != null) {
                d(str, obj);
            }
            this.f78370a.o0(this, str, objL, obj);
        }
    }

    @Override // an.e
    public Enumeration<String> b() {
        Enumeration<String> enumeration;
        synchronized (this) {
            e();
            enumeration = Collections.enumeration(this.f78373d == null ? Collections.EMPTY_LIST : new ArrayList(this.f78373d.keySet()));
        }
        return enumeration;
    }

    public boolean c(long j10) {
        synchronized (this) {
            if (this.f78379j) {
                return false;
            }
            this.f78382m = false;
            long j11 = this.f78377h;
            this.f78378i = j11;
            this.f78377h = j10;
            long j12 = this.f78381l;
            if (j12 <= 0 || j11 <= 0 || j11 + j12 >= j10) {
                this.f78383n++;
                return true;
            }
            invalidate();
            return false;
        }
    }

    public void d(String str, Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return;
        }
        ((h) obj).valueBound(new HttpSessionBindingEvent(this, str));
    }

    public void e() throws IllegalStateException {
        if (this.f78379j) {
            throw new IllegalStateException();
        }
    }

    public void f() {
        ArrayList<String> arrayList;
        Object objL;
        while (true) {
            Map<String, Object> map = this.f78373d;
            if (map == null || map.size() <= 0) {
                break;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.f78373d.keySet());
            }
            for (String str : arrayList) {
                synchronized (this) {
                    objL = l(str, null);
                }
                A(str, objL);
                this.f78370a.o0(this, str, objL, null);
            }
        }
        Map<String, Object> map2 = this.f78373d;
        if (map2 != null) {
            map2.clear();
        }
    }

    public void g() {
        synchronized (this) {
            int i10 = this.f78383n - 1;
            this.f78383n = i10;
            if (this.f78380k && i10 <= 0) {
                k();
            }
        }
    }

    @Override // an.e
    public Object getAttribute(String str) {
        Object obj;
        synchronized (this) {
            e();
            obj = this.f78373d.get(str);
        }
        return obj;
    }

    @Override // an.e
    public String getId() throws IllegalStateException {
        return this.f78370a.D ? this.f78372c : this.f78371b;
    }

    @Override // qq.c.InterfaceC0940c
    public a getSession() {
        return this;
    }

    public void h() {
        synchronized (this) {
            this.f78376g = this.f78377h;
        }
    }

    public void i() {
        synchronized (this) {
            HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
            for (Object obj : this.f78373d.values()) {
                if (obj instanceof an.f) {
                    ((an.f) obj).sessionDidActivate(httpSessionEvent);
                }
            }
        }
    }

    @Override // an.e
    public void invalidate() throws IllegalStateException {
        this.f78370a.w0(this, true);
        k();
    }

    public Object j(String str) {
        return this.f78373d.get(str);
    }

    public void k() throws IllegalStateException {
        try {
            f78369o.h("invalidate {}", this.f78371b);
            if (v()) {
                f();
            }
            synchronized (this) {
                this.f78379j = true;
            }
        } catch (Throwable th2) {
            synchronized (this) {
                this.f78379j = true;
                throw th2;
            }
        }
    }

    public Object l(String str, Object obj) {
        return obj == null ? this.f78373d.remove(str) : this.f78373d.put(str, obj);
    }

    public long m() {
        long j10;
        synchronized (this) {
            j10 = this.f78377h;
        }
        return j10;
    }

    public int n() {
        int size;
        synchronized (this) {
            e();
            size = this.f78373d.size();
        }
        return size;
    }

    public String o() {
        return this.f78371b;
    }

    public long p() {
        return this.f78376g;
    }

    public long q() throws IllegalStateException {
        return this.f78375f;
    }

    public int r() {
        return (int) (this.f78381l / 1000);
    }

    @Override // an.e
    public void removeAttribute(String str) {
        a(str, null);
    }

    public String s() {
        return this.f78372c;
    }

    public int t() {
        int i10;
        synchronized (this) {
            i10 = this.f78383n;
        }
        return i10;
    }

    public String toString() {
        return getClass().getName() + StringUtils.PROCESS_POSTFIX_DELIMITER + getId() + "@" + hashCode();
    }

    public boolean u() {
        return this.f78374e;
    }

    public boolean v() {
        return !this.f78379j;
    }

    public void w(boolean z10) {
        this.f78374e = z10;
    }

    public void x(int i10) {
        this.f78381l = ((long) i10) * 1000;
    }

    public void y(int i10) {
        synchronized (this) {
            this.f78383n = i10;
        }
    }

    public void z() throws IllegalStateException {
        boolean z10 = true;
        this.f78370a.w0(this, true);
        synchronized (this) {
            if (this.f78379j) {
                z10 = false;
            } else if (this.f78383n > 0) {
                this.f78380k = true;
                z10 = false;
            }
        }
        if (z10) {
            k();
        }
    }
}
