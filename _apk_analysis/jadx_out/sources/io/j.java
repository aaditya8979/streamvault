package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f71045a = new j();

    public final <S> S a(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    public final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            return cn.f0.g1(ServiceLoader.load(cls, classLoader));
        }
    }

    @NotNull
    public final List<s> c() {
        s sVar;
        if (!k.a()) {
            return b(s.class, s.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            s sVar2 = null;
            try {
                sVar = (s) s.class.cast(Class.forName("eo.a", true, s.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                sVar = null;
            }
            if (sVar == null) {
                return b(s.class, s.class.getClassLoader());
            }
            arrayList.add(sVar);
            try {
                sVar2 = (s) s.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, s.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (sVar2 == null) {
                return arrayList;
            }
            arrayList.add(sVar2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(s.class, s.class.getClassLoader());
        }
    }

    @NotNull
    public final <S> List<S> d(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources("META-INF/services/" + cls.getName()));
        tn.p.j(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cn.b0.F(arrayList, f71045a.e((URL) it.next()));
        }
        Set setL1 = cn.f0.l1(arrayList);
        if (!(!setL1.isEmpty())) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
        }
        ArrayList arrayList2 = new ArrayList(cn.x.x(setL1, 10));
        Iterator it2 = setL1.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f71045a.a((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    public final List<String> e(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!bo.a0.W(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> listF = f71045a.f(bufferedReader);
                on.b.a(bufferedReader, null);
                return listF;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        String strL1 = bo.d0.l1(bo.d0.e1(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strE1 = bo.d0.e1(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strL1, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strE1)), "UTF-8"));
            try {
                List<String> listF2 = f71045a.f(bufferedReader);
                on.b.a(bufferedReader, null);
                jarFile.close();
                return listF2;
            } finally {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    bn.d.a(th3, th5);
                    throw th3;
                }
            }
        }
    }

    public final List<String> f(BufferedReader bufferedReader) throws IOException {
        boolean z10;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return cn.f0.g1(linkedHashSet);
            }
            String string = bo.d0.s1(bo.d0.m1(line, "#", null, 2, null)).toString();
            int i10 = 0;
            while (true) {
                if (i10 >= string.length()) {
                    z10 = true;
                    break;
                }
                char cCharAt = string.charAt(i10);
                if (!(cCharAt == '.' || Character.isJavaIdentifierPart(cCharAt))) {
                    z10 = false;
                    break;
                }
                i10++;
            }
            if (!z10) {
                throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }
}
