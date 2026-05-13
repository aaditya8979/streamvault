package er;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.fourthline.cling.binding.LocalServiceBindingException;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.Datatype;
import qr.m;

/* JADX INFO: compiled from: AnnotationActionBinder.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Logger f61316e = Logger.getLogger(b.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f61317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Method f61318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<m, tr.c> f61319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set<Class> f61320d;

    public a(Method method, Map<m, tr.c> map, Set<Class> set) {
        this.f61317a = (d) method.getAnnotation(d.class);
        this.f61319c = map;
        this.f61318b = method;
        this.f61320d = set;
    }

    public org.fourthline.cling.model.meta.a a(Map<org.fourthline.cling.model.meta.a, jr.c> map) throws LocalServiceBindingException {
        String strName = g().name().length() != 0 ? g().name() : b.h(h().getName());
        f61316e.fine("Creating action and executor: " + strName);
        List<ActionArgument> listC = c();
        Map<ActionArgument<qr.f>, tr.c> mapD = d();
        listC.addAll(mapD.keySet());
        org.fourthline.cling.model.meta.a aVar = new org.fourthline.cling.model.meta.a(strName, (ActionArgument[]) listC.toArray(new ActionArgument[listC.size()]));
        map.put(aVar, b(mapD));
        return aVar;
    }

    public jr.c b(Map<ActionArgument<qr.f>, tr.c> map) {
        return new jr.e(map, h());
    }

    public List<ActionArgument> c() throws LocalServiceBindingException {
        ArrayList arrayList = new ArrayList();
        Annotation[][] parameterAnnotations = h().getParameterAnnotations();
        int i10 = 0;
        for (int i11 = 0; i11 < parameterAnnotations.length; i11++) {
            for (Annotation annotation : parameterAnnotations[i11]) {
                if (annotation instanceof e) {
                    e eVar = (e) annotation;
                    i10++;
                    String strName = eVar.name();
                    m mVarF = f(eVar.stateVariable(), strName, h().getName());
                    if (mVarF == null) {
                        throw new LocalServiceBindingException("Could not detected related state variable of argument: " + strName);
                    }
                    l(mVarF, h().getParameterTypes()[i11]);
                    arrayList.add(new ActionArgument(strName, eVar.aliases(), mVarF.b(), ActionArgument.Direction.IN));
                }
            }
        }
        if (i10 >= h().getParameterTypes().length || rr.c.class.isAssignableFrom(this.f61318b.getParameterTypes()[this.f61318b.getParameterTypes().length - 1])) {
            return arrayList;
        }
        throw new LocalServiceBindingException("Method has parameters that are not input arguments: " + h().getName());
    }

    public Map<ActionArgument<qr.f>, tr.c> d() throws LocalServiceBindingException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d dVar = (d) h().getAnnotation(d.class);
        if (dVar.out().length == 0) {
            return linkedHashMap;
        }
        boolean z10 = dVar.out().length > 1;
        for (f fVar : dVar.out()) {
            String strName = fVar.name();
            m mVarF = f(fVar.stateVariable(), strName, h().getName());
            if (mVarF == null && fVar.getterName().length() > 0) {
                mVarF = f(null, null, fVar.getterName());
            }
            if (mVarF == null) {
                throw new LocalServiceBindingException("Related state variable not found for output argument: " + strName);
            }
            tr.c cVarE = e(mVarF, fVar.getterName(), z10);
            f61316e.finer("Found related state variable for output argument '" + strName + "': " + mVarF);
            linkedHashMap.put(new ActionArgument(strName, mVarF.b(), ActionArgument.Direction.OUT, z10 ^ true), cVarE);
        }
        return linkedHashMap;
    }

    public tr.c e(m mVar, String str, boolean z10) throws LocalServiceBindingException {
        if (h().getReturnType().equals(Void.TYPE)) {
            if (str == null || str.length() <= 0) {
                f61316e.finer("Action method is void, trying to find existing accessor of related: " + mVar);
                return j().get(mVar);
            }
            f61316e.finer("Action method is void, will use getter method named: " + str);
            Method methodG = os.d.g(h().getDeclaringClass(), str);
            if (methodG != null) {
                l(mVar, methodG.getReturnType());
                return new tr.b(methodG);
            }
            throw new LocalServiceBindingException("Declared getter method '" + str + "' not found on: " + h().getDeclaringClass());
        }
        if (str == null || str.length() <= 0) {
            if (z10) {
                return null;
            }
            f61316e.finer("Action method is not void, will use the returned instance: " + h().getReturnType());
            l(mVar, h().getReturnType());
            return null;
        }
        f61316e.finer("Action method is not void, will use getter method on returned instance: " + str);
        Method methodG2 = os.d.g(h().getReturnType(), str);
        if (methodG2 != null) {
            l(mVar, methodG2.getReturnType());
            return new tr.b(methodG2);
        }
        throw new LocalServiceBindingException("Declared getter method '" + str + "' not found on return type: " + h().getReturnType());
    }

    public m f(String str, String str2, String str3) throws LocalServiceBindingException {
        String strH;
        m mVarI = (str == null || str.length() <= 0) ? null : i(str);
        if (mVarI == null && str2 != null && str2.length() > 0) {
            String strI = b.i(str2);
            f61316e.finer("Finding related state variable with argument name (converted to UPnP name): " + strI);
            mVarI = i(str2);
        }
        if (mVarI == null && str2 != null && str2.length() > 0) {
            String str4 = "A_ARG_TYPE_" + b.i(str2);
            f61316e.finer("Finding related state variable with prefixed argument name (converted to UPnP name): " + str4);
            mVarI = i(str4);
        }
        if (mVarI != null || str3 == null || str3.length() <= 0 || (strH = os.d.h(str3)) == null) {
            return mVarI;
        }
        f61316e.finer("Finding related state variable with method property name: " + strH);
        return i(b.i(strH));
    }

    public d g() {
        return this.f61317a;
    }

    public Method h() {
        return this.f61318b;
    }

    public m i(String str) {
        for (m mVar : j().keySet()) {
            if (mVar.b().equals(str)) {
                return mVar;
            }
        }
        return null;
    }

    public Map<m, tr.c> j() {
        return this.f61319c;
    }

    public Set<Class> k() {
        return this.f61320d;
    }

    public void l(m mVar, Class cls) throws LocalServiceBindingException {
        Datatype.Default byJavaType = ir.f.e(k(), cls) ? Datatype.Default.STRING : Datatype.Default.getByJavaType(cls);
        f61316e.finer("Expecting '" + mVar + "' to match default mapping: " + byJavaType);
        if (byJavaType != null && !mVar.d().d().d(byJavaType.getJavaType())) {
            throw new LocalServiceBindingException("State variable '" + mVar + "' datatype can't handle action argument's Java type (change one): " + byJavaType.getJavaType());
        }
        if (byJavaType != null || mVar.d().d().b() == null) {
            f61316e.finer("State variable matches required argument datatype (or can't be validated because it is custom)");
            return;
        }
        throw new LocalServiceBindingException("State variable '" + mVar + "' should be custom datatype (action argument type is unknown Java type): " + cls.getSimpleName());
    }
}
