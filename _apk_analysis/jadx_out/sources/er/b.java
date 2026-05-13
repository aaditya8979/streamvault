package er;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.types.csv.CSV;
import qr.m;
import ur.r;
import ur.s;
import ur.x;
import ur.y;

/* JADX INFO: compiled from: AnnotationLocalServiceBinder.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Logger f61321a = Logger.getLogger(b.class.getName());

    public static String g(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Variable name must be at least 1 character long");
        }
        return str.substring(0, 1).toLowerCase(Locale.ROOT) + str.substring(1);
    }

    public static String h(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Action name must be at least 1 character long");
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }

    public static String i(String str) {
        if (str.length() < 1) {
            throw new IllegalArgumentException("Variable name must be at least 1 character long");
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }

    public boolean a(org.fourthline.cling.model.meta.a aVar) {
        return false;
    }

    public qr.f b(Class<?> cls) throws LocalServiceBindingException {
        f61321a.fine("Reading and binding annotations of service implementation class: " + cls);
        if (!cls.isAnnotationPresent(g.class)) {
            throw new LocalServiceBindingException("Given class is not an @UpnpService");
        }
        g gVar = (g) cls.getAnnotation(g.class);
        h hVarServiceId = gVar.serviceId();
        i iVarServiceType = gVar.serviceType();
        return c(cls, hVarServiceId.namespace().equals("upnp-org") ? new x(hVarServiceId.value()) : new r(hVarServiceId.namespace(), hVarServiceId.value()), iVarServiceType.namespace().equals("schemas-upnp-org") ? new y(iVarServiceType.value(), iVarServiceType.version()) : new s(iVarServiceType.namespace(), iVarServiceType.value(), iVarServiceType.version()), gVar.supportsQueryStateVariables(), f(gVar.stringConvertibleTypes()));
    }

    public qr.f c(Class<?> cls, r rVar, s sVar, boolean z10, Set<Class> set) throws LocalServiceBindingException {
        Map<m, tr.c> mapE = e(cls, set);
        Map<org.fourthline.cling.model.meta.a, jr.c> mapD = d(cls, mapE, set);
        if (z10) {
            mapD.put(new org.fourthline.cling.model.meta.b(), new jr.f());
        }
        try {
            return new qr.f(sVar, rVar, mapD, mapE, set, z10);
        } catch (ValidationException e10) {
            f61321a.severe("Could not validate device model: " + e10.toString());
            Iterator<ir.k> it = e10.getErrors().iterator();
            while (it.hasNext()) {
                f61321a.severe(it.next().toString());
            }
            throw new LocalServiceBindingException("Validation of model failed, check the log");
        }
    }

    public Map<org.fourthline.cling.model.meta.a, jr.c> d(Class<?> cls, Map<m, tr.c> map, Set<Class> set) throws LocalServiceBindingException {
        HashMap map2 = new HashMap();
        Iterator<Method> it = os.d.i(cls, d.class).iterator();
        while (it.hasNext()) {
            org.fourthline.cling.model.meta.a aVarA = new a(it.next(), map, set).a(map2);
            if (a(aVarA)) {
                map2.remove(aVarA);
            }
        }
        return map2;
    }

    public Map<m, tr.c> e(Class<?> cls, Set<Class> set) throws LocalServiceBindingException {
        HashMap map = new HashMap();
        if (cls.isAnnotationPresent(k.class)) {
            k kVar = (k) cls.getAnnotation(k.class);
            for (j jVar : kVar.value()) {
                if (jVar.name().length() == 0) {
                    throw new LocalServiceBindingException("Class-level @UpnpStateVariable name attribute value required");
                }
                String strG = g(jVar.name());
                Method methodF = os.d.f(cls, strG);
                Field fieldD = os.d.d(cls, strG);
                tr.c bVar = null;
                if (methodF != null && fieldD != null) {
                    bVar = kVar.preferFields() ? new tr.a(fieldD) : new tr.b(methodF);
                } else if (fieldD != null) {
                    bVar = new tr.a(fieldD);
                } else if (methodF != null) {
                    bVar = new tr.b(methodF);
                } else {
                    f61321a.finer("No field or getter found for state variable, skipping accessor: " + jVar.name());
                }
                map.put(new c(jVar, jVar.name(), bVar, set).c(), bVar);
            }
        }
        for (Field field : os.d.e(cls, j.class)) {
            j jVar2 = (j) field.getAnnotation(j.class);
            tr.a aVar = new tr.a(field);
            map.put(new c(jVar2, jVar2.name().length() == 0 ? i(field.getName()) : jVar2.name(), aVar, set).c(), aVar);
        }
        for (Method method : os.d.i(cls, j.class)) {
            String strH = os.d.h(method.getName());
            if (strH == null) {
                throw new LocalServiceBindingException("Annotated method is not a getter method (: " + method);
            }
            if (method.getParameterTypes().length > 0) {
                throw new LocalServiceBindingException("Getter method defined as @UpnpStateVariable can not have parameters: " + method);
            }
            j jVar3 = (j) method.getAnnotation(j.class);
            tr.b bVar2 = new tr.b(method);
            map.put(new c(jVar3, jVar3.name().length() == 0 ? i(strH) : jVar3.name(), bVar2, set).c(), bVar2);
        }
        return map;
    }

    public Set<Class> f(Class[] clsArr) throws LocalServiceBindingException {
        for (Class cls : clsArr) {
            if (!Modifier.isPublic(cls.getModifiers())) {
                throw new LocalServiceBindingException("Declared string-convertible type must be public: " + cls);
            }
            try {
                cls.getConstructor(String.class);
            } catch (NoSuchMethodException unused) {
                throw new LocalServiceBindingException("Declared string-convertible type needs a public single-argument String constructor: " + cls);
            }
        }
        HashSet hashSet = new HashSet(Arrays.asList(clsArr));
        hashSet.add(URI.class);
        hashSet.add(URL.class);
        hashSet.add(CSV.class);
        return hashSet;
    }
}
