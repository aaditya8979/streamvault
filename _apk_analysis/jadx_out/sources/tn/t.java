package tn;

import java.util.Arrays;
import java.util.Collections;
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

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f85364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KClass[] f85365b;

    static {
        u uVar = null;
        try {
            uVar = (u) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (uVar == null) {
            uVar = new u();
        }
        f85364a = uVar;
        f85365b = new KClass[0];
    }

    public static KFunction a(FunctionReference functionReference) {
        return f85364a.a(functionReference);
    }

    public static KClass b(Class cls) {
        return f85364a.b(cls);
    }

    public static KDeclarationContainer c(Class cls) {
        return f85364a.c(cls, "");
    }

    public static KType d(KType kType) {
        return f85364a.d(kType);
    }

    public static KMutableProperty0 e(MutablePropertyReference0 mutablePropertyReference0) {
        return f85364a.e(mutablePropertyReference0);
    }

    public static KMutableProperty1 f(MutablePropertyReference1 mutablePropertyReference1) {
        return f85364a.f(mutablePropertyReference1);
    }

    public static KType g(Class cls) {
        return f85364a.l(b(cls), Collections.emptyList(), true);
    }

    public static KProperty0 h(PropertyReference0 propertyReference0) {
        return f85364a.g(propertyReference0);
    }

    public static KProperty1 i(PropertyReference1 propertyReference1) {
        return f85364a.h(propertyReference1);
    }

    public static String j(Lambda lambda) {
        return f85364a.i(lambda);
    }

    public static String k(m mVar) {
        return f85364a.j(mVar);
    }

    public static void l(KTypeParameter kTypeParameter, KType kType) {
        f85364a.k(kTypeParameter, Collections.singletonList(kType));
    }

    public static KType m(Class cls) {
        return f85364a.l(b(cls), Collections.emptyList(), false);
    }

    public static KType n(Class cls, KTypeProjection kTypeProjection) {
        return f85364a.l(b(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType o(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f85364a.l(b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static KType p(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f85364a.l(b(cls), cn.r.G0(kTypeProjectionArr), false);
    }

    public static KType q(KClassifier kClassifier) {
        return f85364a.l(kClassifier, Collections.emptyList(), false);
    }

    public static KTypeParameter r(Object obj, String str, KVariance kVariance, boolean z10) {
        return f85364a.m(obj, str, kVariance, z10);
    }
}
