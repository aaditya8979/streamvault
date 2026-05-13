package kotlin.reflect;

import kotlin.jvm.internal.FunctionReferenceImpl;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends FunctionReferenceImpl implements l<Class<?>, Class<?>> {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // sn.l
    public final Class<?> invoke(Class<?> cls) {
        p.k(cls, "p0");
        return cls.getComponentType();
    }
}
