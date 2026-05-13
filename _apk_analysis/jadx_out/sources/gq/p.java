package gq;

import androidx.browser.trusted.sharing.ShareTarget;
import androidx.webkit.internal.AssetHelper;
import com.ironsource.G5;
import hq.e;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vq.c f62898a = vq.b.a(p.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f62899b = 15;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hq.e f62900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e.a f62901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e.a f62902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e.a f62903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e.a f62904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e.a f62905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e.a f62906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e.a f62907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e.a f62908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final e.a f62909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final e.a f62910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final e.a f62911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final e.a f62912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final e.a f62913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final e.a f62914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e.a f62915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e.a f62916s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e.a f62917t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e.a f62918u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e.a f62919v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e.a f62920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e.a f62921x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Map f62922y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Map f62923z;

    static {
        hq.e eVar = new hq.e();
        f62900c = eVar;
        f62901d = eVar.a(ShareTarget.ENCODING_TYPE_URL_ENCODED, 1);
        f62902e = eVar.a("message/http", 2);
        f62903f = eVar.a("multipart/byteranges", 3);
        f62904g = eVar.a("text/html", 4);
        f62905h = eVar.a(AssetHelper.DEFAULT_MIME_TYPE, 5);
        f62906i = eVar.a("text/xml", 6);
        f62907j = eVar.a("text/json", 7);
        f62908k = eVar.a("text/html;charset=ISO-8859-1", 8);
        f62909l = eVar.a("text/plain;charset=ISO-8859-1", 9);
        f62910m = eVar.a("text/xml;charset=ISO-8859-1", 10);
        f62911n = eVar.a("text/html;charset=UTF-8", 11);
        f62912o = eVar.a("text/plain;charset=UTF-8", 12);
        f62913p = eVar.a("text/xml;charset=UTF-8", 13);
        f62914q = eVar.a("text/json;charset=UTF-8", 14);
        f62915r = eVar.a("text/html; charset=ISO-8859-1", 8);
        f62916s = eVar.a("text/plain; charset=ISO-8859-1", 9);
        f62917t = eVar.a("text/xml; charset=ISO-8859-1", 10);
        f62918u = eVar.a("text/html; charset=UTF-8", 11);
        f62919v = eVar.a("text/plain; charset=UTF-8", 12);
        f62920w = eVar.a("text/xml; charset=UTF-8", 13);
        f62921x = eVar.a("text/json; charset=UTF-8", 14);
        f62922y = new HashMap();
        f62923z = new HashMap();
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("org/eclipse/jetty/http/mime");
            Enumeration<String> keys = bundle.getKeys();
            while (keys.hasMoreElements()) {
                String strNextElement = keys.nextElement();
                f62922y.put(sq.o.b(strNextElement), b(bundle.getString(strNextElement)));
            }
        } catch (MissingResourceException e10) {
            vq.c cVar = f62898a;
            cVar.f(e10.toString(), new Object[0]);
            cVar.b(e10);
        }
        try {
            ResourceBundle bundle2 = ResourceBundle.getBundle("org/eclipse/jetty/http/encoding");
            Enumeration<String> keys2 = bundle2.getKeys();
            while (keys2.hasMoreElements()) {
                hq.d dVarB = b(keys2.nextElement());
                f62923z.put(dVarB, bundle2.getString(dVarB.toString()));
            }
        } catch (MissingResourceException e11) {
            vq.c cVar2 = f62898a;
            cVar2.f(e11.toString(), new Object[0]);
            cVar2.b(e11);
        }
        e.a aVar = f62904g;
        e.a aVar2 = f62908k;
        aVar.f("ISO-8859-1", aVar2);
        aVar.f("ISO_8859_1", aVar2);
        aVar.f("iso-8859-1", aVar2);
        e.a aVar3 = f62905h;
        e.a aVar4 = f62909l;
        aVar3.f("ISO-8859-1", aVar4);
        aVar3.f("ISO_8859_1", aVar4);
        aVar3.f("iso-8859-1", aVar4);
        e.a aVar5 = f62906i;
        e.a aVar6 = f62910m;
        aVar5.f("ISO-8859-1", aVar6);
        aVar5.f("ISO_8859_1", aVar6);
        aVar5.f("iso-8859-1", aVar6);
        e.a aVar7 = f62911n;
        aVar.f("UTF-8", aVar7);
        aVar.f("UTF8", aVar7);
        aVar.f("utf8", aVar7);
        aVar.f(G5.N, aVar7);
        e.a aVar8 = f62912o;
        aVar3.f("UTF-8", aVar8);
        aVar3.f("UTF8", aVar8);
        aVar3.f("utf8", aVar8);
        aVar3.f(G5.N, aVar8);
        e.a aVar9 = f62913p;
        aVar5.f("UTF-8", aVar9);
        aVar5.f("UTF8", aVar9);
        aVar5.f("utf8", aVar9);
        aVar5.f(G5.N, aVar9);
        e.a aVar10 = f62907j;
        e.a aVar11 = f62914q;
        aVar10.f("UTF-8", aVar11);
        aVar10.f("UTF8", aVar11);
        aVar10.f("utf8", aVar11);
        aVar10.f(G5.N, aVar11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00a6, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(hq.d r13) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq.p.a(hq.d):java.lang.String");
    }

    public static synchronized hq.d b(String str) {
        e.a aVarC;
        hq.e eVar = f62900c;
        aVarC = eVar.c(str);
        if (aVarC == null) {
            int i10 = f62899b;
            f62899b = i10 + 1;
            aVarC = eVar.a(str, i10);
        }
        return aVarC;
    }
}
