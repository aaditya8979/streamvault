package vq;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import sq.j;
import sq.k;

/* JADX INFO: compiled from: Log.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f86129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f86130c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static c f86132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f86133f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentMap<String, c> f86131d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Properties f86128a = new Properties();

    /* JADX INFO: compiled from: Log.java */
    public static class a implements PrivilegedAction<Object> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.io.InputStream] */
        @Override // java.security.PrivilegedAction
        public Object run() throws Throwable {
            InputStream inputStreamOpenStream;
            ?? r22 = 1;
            URL urlB = k.b(b.class, "jetty-logging.properties", true);
            ?? r12 = 0;
            try {
                if (urlB != null) {
                    try {
                        inputStreamOpenStream = urlB.openStream();
                        try {
                            b.f86128a.load(inputStreamOpenStream);
                            r22 = inputStreamOpenStream;
                        } catch (IOException e10) {
                            e = e10;
                            System.err.println("Unable to load " + urlB);
                            e.printStackTrace(System.err);
                            r22 = inputStreamOpenStream;
                        }
                    } catch (IOException e11) {
                        e = e11;
                        inputStreamOpenStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        j.a(r12);
                        throw th;
                    }
                    j.a(r22);
                }
                Enumeration<?> enumerationPropertyNames = System.getProperties().propertyNames();
                while (enumerationPropertyNames.hasMoreElements()) {
                    String str = (String) enumerationPropertyNames.nextElement();
                    String property = System.getProperty(str);
                    if (property != null) {
                        b.f86128a.setProperty(str, property);
                    }
                }
                b.f86129b = b.f86128a.getProperty("org.eclipse.jetty.util.log.class", "org.eclipse.jetty.util.log.Slf4jLog");
                b.f86130c = Boolean.parseBoolean(b.f86128a.getProperty("org.eclipse.jetty.util.log.IGNORED", com.ironsource.mediationsdk.metadata.a.f32683h));
                return null;
            } catch (Throwable th3) {
                th = th3;
                r12 = r22;
            }
        }
    }

    static {
        AccessController.doPrivileged(new a());
    }

    public static c a(Class<?> cls) {
        return b(cls.getName());
    }

    public static c b(String str) {
        if (!g()) {
            return null;
        }
        if (str == null) {
            return f86132e;
        }
        c cVar = f86131d.get(str);
        return cVar == null ? f86132e.a(str) : cVar;
    }

    public static Map<String, c> c() {
        return Collections.unmodifiableMap(f86131d);
    }

    public static ConcurrentMap<String, c> d() {
        return f86131d;
    }

    public static c e() {
        g();
        return f86132e;
    }

    public static void f(Throwable th2) {
        if (th2 != null && f86130c) {
            th2.printStackTrace();
        }
        if (f86132e == null) {
            d dVar = new d();
            f86132e = dVar;
            dVar.h("Logging to {} via {}", dVar, d.class.getName());
        }
    }

    public static boolean g() {
        boolean z10 = true;
        if (f86132e != null) {
            return true;
        }
        synchronized (b.class) {
            if (f86133f) {
                if (f86132e == null) {
                    z10 = false;
                }
                return z10;
            }
            f86133f = true;
            try {
                Class clsC = k.c(b.class, f86129b);
                c cVar = f86132e;
                if (cVar == null || !cVar.getClass().equals(clsC)) {
                    c cVar2 = (c) clsC.newInstance();
                    f86132e = cVar2;
                    cVar2.h("Logging to {} via {}", cVar2, clsC.getName());
                }
            } catch (Throwable th2) {
                f(th2);
            }
            return f86132e != null;
        }
    }
}
