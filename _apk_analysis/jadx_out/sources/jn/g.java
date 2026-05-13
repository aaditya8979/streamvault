package jn;

import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f72506a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f72507b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static a f72508c;

    /* JADX INFO: compiled from: DebugMetadata.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Method f72509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Method f72510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Method f72511c;

        public a(@Nullable Method method, @Nullable Method method2, @Nullable Method method3) {
            this.f72509a = method;
            this.f72510b = method2;
            this.f72511c = method3;
        }
    }

    public final a a(BaseContinuationImpl baseContinuationImpl) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f72508c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f72507b;
            f72508c = aVar2;
            return aVar2;
        }
    }

    @Nullable
    public final String b(@NotNull BaseContinuationImpl baseContinuationImpl) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        p.k(baseContinuationImpl, "continuation");
        a aVarA = f72508c;
        if (aVarA == null) {
            aVarA = a(baseContinuationImpl);
        }
        if (aVarA == f72507b || (method = aVarA.f72509a) == null || (objInvoke = method.invoke(baseContinuationImpl.getClass(), new Object[0])) == null || (method2 = aVarA.f72510b) == null || (objInvoke2 = method2.invoke(objInvoke, new Object[0])) == null) {
            return null;
        }
        Method method3 = aVarA.f72511c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
