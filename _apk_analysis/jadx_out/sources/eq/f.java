package eq;

import com.ironsource.Z7;
import dq.h;
import dq.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.eclipse.jetty.client.HttpDestination;
import sq.o;

/* JADX INFO: compiled from: SecurityListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends h {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final vq.c f61309n = vq.b.a(f.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HttpDestination f61310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f61311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f61312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f61313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f61314l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f61315m;

    public f(HttpDestination httpDestination, i iVar) {
        super(iVar.k(), true);
        this.f61315m = 0;
        this.f61310h = httpDestination;
        this.f61311i = iVar;
    }

    @Override // dq.h, dq.g
    public void b() {
        this.f61315m++;
        l(true);
        m(true);
        this.f61312j = false;
        this.f61313k = false;
        this.f61314l = false;
        super.b();
    }

    @Override // dq.h, dq.g
    public void c(hq.d dVar, hq.d dVar2) throws IOException {
        vq.c cVar = f61309n;
        if (cVar.isDebugEnabled()) {
            cVar.h("SecurityListener:Header: " + dVar.toString() + " / " + dVar2.toString(), new Object[0]);
        }
        if (!k() && gq.i.f62809d.e(dVar) == 51) {
            String string = dVar2.toString();
            String strO = o(string);
            Map<String, String> mapN = n(string);
            e eVarG0 = this.f61310h.h().G0();
            if (eVarG0 != null) {
                d dVarA = eVarG0.a(mapN.get("realm"), this.f61310h, "/");
                if (dVarA == null) {
                    cVar.f("Unknown Security Realm: " + mapN.get("realm"), new Object[0]);
                } else if ("digest".equalsIgnoreCase(strO)) {
                    this.f61310h.b("/", new c(dVarA, mapN));
                } else if ("basic".equalsIgnoreCase(strO)) {
                    this.f61310h.b("/", new b(dVarA));
                }
            }
        }
        super.c(dVar, dVar2);
    }

    @Override // dq.h, dq.g
    public void e(hq.d dVar, int i10, hq.d dVar2) throws IOException {
        vq.c cVar = f61309n;
        if (cVar.isDebugEnabled()) {
            cVar.h("SecurityListener:Response Status: " + i10, new Object[0]);
        }
        if (i10 != 401 || this.f61315m >= this.f61310h.h().O0()) {
            m(true);
            l(true);
            this.f61314l = false;
        } else {
            m(false);
            this.f61314l = true;
        }
        super.e(dVar, i10, dVar2);
    }

    @Override // dq.h, dq.g
    public void j() throws IOException {
        this.f61313k = true;
        if (!this.f61314l) {
            vq.c cVar = f61309n;
            if (cVar.isDebugEnabled()) {
                cVar.h("OnResponseComplete, delegating to super with Request complete=" + this.f61312j + ", response complete=" + this.f61313k + Z7.f30794r + this.f61311i, new Object[0]);
            }
            super.j();
            return;
        }
        if (!this.f61312j) {
            vq.c cVar2 = f61309n;
            if (cVar2.isDebugEnabled()) {
                cVar2.h("onResponseComplete, Request not yet complete from onResponseComplete,  calling super " + this.f61311i, new Object[0]);
            }
            super.j();
            return;
        }
        vq.c cVar3 = f61309n;
        if (cVar3.isDebugEnabled()) {
            cVar3.h("onResponseComplete, Both complete: Resending from onResponseComplete" + this.f61311i, new Object[0]);
        }
        this.f61313k = false;
        this.f61312j = false;
        m(true);
        l(true);
        this.f61310h.r(this.f61311i);
    }

    public Map<String, String> n(String str) {
        HashMap map = new HashMap();
        StringTokenizer stringTokenizer = new StringTokenizer(str.substring(str.indexOf(Z7.f30794r) + 1, str.length()), StringUtils.COMMA);
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            String[] strArrSplit = strNextToken.split("=");
            if (strArrSplit.length == 2) {
                map.put(strArrSplit[0].trim(), o.i(strArrSplit[1].trim()));
            } else {
                f61309n.h("SecurityListener: missed scraping authentication details - " + strNextToken, new Object[0]);
            }
        }
        return map;
    }

    public String o(String str) {
        return str.indexOf(Z7.f30794r) == -1 ? str.trim() : str.substring(0, str.indexOf(Z7.f30794r)).trim();
    }

    @Override // dq.h, dq.g
    public void onRequestComplete() throws IOException {
        this.f61312j = true;
        if (!this.f61314l) {
            vq.c cVar = f61309n;
            if (cVar.isDebugEnabled()) {
                cVar.h("onRequestComplete, delegating to super with Request complete=" + this.f61312j + ", response complete=" + this.f61313k + Z7.f30794r + this.f61311i, new Object[0]);
            }
            super.onRequestComplete();
            return;
        }
        if (!this.f61313k) {
            vq.c cVar2 = f61309n;
            if (cVar2.isDebugEnabled()) {
                cVar2.h("onRequestComplete, Response not yet complete onRequestComplete, calling super for " + this.f61311i, new Object[0]);
            }
            super.onRequestComplete();
            return;
        }
        vq.c cVar3 = f61309n;
        if (cVar3.isDebugEnabled()) {
            cVar3.h("onRequestComplete, Both complete: Resending from onResponseComplete " + this.f61311i, new Object[0]);
        }
        this.f61313k = false;
        this.f61312j = false;
        l(true);
        m(true);
        this.f61310h.r(this.f61311i);
    }
}
