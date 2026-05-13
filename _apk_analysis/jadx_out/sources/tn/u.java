package tn;

import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: ReflectionFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class u {
    public KFunction a(FunctionReference functionReference) {
        return functionReference;
    }

    public KClass b(Class cls) {
        return new g(cls);
    }

    public KDeclarationContainer c(Class cls, String str) {
        return new s(cls, str);
    }

    public KType d(KType kType) {
        b0 b0Var = (b0) kType;
        return new b0(kType.getClassifier(), kType.getArguments(), b0Var.h(), b0Var.g() | 2);
    }

    public KMutableProperty0 e(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public KMutableProperty1 f(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public KProperty0 g(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public KProperty1 h(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public String i(Lambda lambda) {
        return j(lambda);
    }

    public String j(m mVar) {
        String string = mVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public void k(KTypeParameter kTypeParameter, List<KType> list) {
        ((z) kTypeParameter).a(list);
    }

    public KType l(KClassifier kClassifier, List<KTypeProjection> list, boolean z10) {
        return new b0(kClassifier, list, z10);
    }

    public KTypeParameter m(Object obj, String str, KVariance kVariance, boolean z10) {
        return new z(obj, str, kVariance, z10);
    }
}
