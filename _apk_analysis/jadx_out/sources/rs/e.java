package rs;

import com.ironsource.C3978d4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import ts.f;
import ts.h;
import ts.j;
import ts.l;

/* JADX INFO: compiled from: LoggerFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f78937a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile us.e f78941e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f78938b = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f78939c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f78940d = l.c("slf4j.detectLoggerNameMismatch");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f78942f = {"2.0"};

    public static final void b() {
        try {
            List<us.e> listH = h();
            w(listH);
            if (listH == null || listH.isEmpty()) {
                f78937a = 4;
                l.a("No SLF4J providers were found.");
                l.a("Defaulting to no-operation (NOP) logger implementation");
                l.a("See https://www.slf4j.org/codes.html#noProviders for further details.");
                v(g());
            } else {
                f78941e = listH.get(0);
                f78941e.initialize();
                f78937a = 3;
                u(listH);
            }
            r();
        } catch (Exception e10) {
            f(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    public static void c(ss.c cVar, int i10) {
        if (cVar.c().d()) {
            d(i10);
        } else {
            if (cVar.c().e()) {
                return;
            }
            e();
        }
    }

    public static void d(int i10) {
        l.a("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        l.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        l.a("See also https://www.slf4j.org/codes.html#replay");
    }

    public static void e() {
        l.a("The following set of substitute loggers may have been accessed");
        l.a("during the initialization phase. Logging calls during this");
        l.a("phase were not honored. However, subsequent logging calls to these");
        l.a("loggers will work as normally expected.");
        l.a("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void f(Throwable th2) {
        f78937a = 2;
        l.b("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    public static Set<URL> g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e10) {
            l.b("Error getting resources from path", e10);
        }
        return linkedHashSet;
    }

    public static List<us.e> h() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = e.class.getClassLoader();
        us.e eVarP = p(classLoader);
        if (eVarP != null) {
            arrayList.add(eVarP);
            return arrayList;
        }
        Iterator<us.e> it = m(classLoader).iterator();
        while (it.hasNext()) {
            x(arrayList, it);
        }
        return arrayList;
    }

    public static void i() {
        j jVar = f78938b;
        synchronized (jVar) {
            jVar.c().e();
            for (h hVar : jVar.c().d()) {
                hVar.h(k(hVar.c()));
            }
        }
    }

    public static a j() {
        return l().a();
    }

    public static c k(String str) {
        return j().a(str);
    }

    public static us.e l() {
        if (f78937a == 0) {
            synchronized (e.class) {
                if (f78937a == 0) {
                    f78937a = 1;
                    q();
                }
            }
        }
        int i10 = f78937a;
        if (i10 == 1) {
            return f78938b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return f78941e;
        }
        if (i10 == 4) {
            return f78939c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static ServiceLoader<us.e> m(final ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(us.e.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: rs.d
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return e.o(classLoader);
            }
        });
    }

    public static boolean n(List<us.e> list) {
        return list.size() > 1;
    }

    public static /* synthetic */ ServiceLoader o(ClassLoader classLoader) {
        return ServiceLoader.load(us.e.class, classLoader);
    }

    public static us.e p(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                l.a(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", property, "slf4j.provider"));
                return (us.e) classLoader.loadClass(property).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e10) {
                l.b(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", property), e10);
                return null;
            } catch (ClassNotFoundException e11) {
                e = e11;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (IllegalAccessException e12) {
                e = e12;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InstantiationException e13) {
                e = e13;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (NoSuchMethodException e14) {
                e = e14;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            } catch (InvocationTargetException e15) {
                e = e15;
                l.b(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", property), e);
                return null;
            }
        }
        return null;
    }

    public static final void q() {
        b();
        if (f78937a == 3) {
            y();
        }
    }

    public static void r() {
        i();
        s();
        f78938b.c().b();
    }

    public static void s() {
        LinkedBlockingQueue<ss.c> linkedBlockingQueueC = f78938b.c().c();
        int size = linkedBlockingQueueC.size();
        ArrayList<ss.c> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (ss.c cVar : arrayList) {
                t(cVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    c(cVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    public static void t(ss.c cVar) {
        if (cVar == null) {
            return;
        }
        h hVarC = cVar.c();
        String strC = hVarC.c();
        if (hVarC.f()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (hVarC.e()) {
            return;
        }
        if (!hVarC.d()) {
            l.a(strC);
        } else if (hVarC.isEnabledForLevel(cVar.b())) {
            hVarC.g(cVar);
        }
    }

    public static void u(List<us.e> list) {
        if (list.isEmpty() || !n(list)) {
            return;
        }
        l.a("Actual provider is of type [" + list.get(0) + C3978d4.j.f31385e);
    }

    public static void v(Set<URL> set) {
        if (set.isEmpty()) {
            return;
        }
        l.a("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> it = set.iterator();
        while (it.hasNext()) {
            l.a("Ignoring binding found at [" + it.next() + C3978d4.j.f31385e);
        }
        l.a("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void w(List<us.e> list) {
        if (n(list)) {
            l.a("Class path contains multiple SLF4J providers.");
            Iterator<us.e> it = list.iterator();
            while (it.hasNext()) {
                l.a("Found provider [" + it.next() + C3978d4.j.f31385e);
            }
            l.a("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    public static void x(List<us.e> list, Iterator<us.e> it) {
        try {
            list.add(it.next());
        } catch (ServiceConfigurationError e10) {
            l.a("A SLF4J service provider failed to instantiate:\n" + e10.getMessage());
        }
    }

    public static final void y() {
        try {
            String strB = f78941e.b();
            boolean z10 = false;
            for (String str : f78942f) {
                if (strB.startsWith(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            l.a("The requested version " + strB + " by your slf4j provider is not compatible with " + Arrays.asList(f78942f).toString());
            l.a("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            l.b("Unexpected problem occurred during version sanity check", th2);
        }
    }
}
