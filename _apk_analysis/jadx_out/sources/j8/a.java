package j8;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: TypeToken.java */
/* JADX INFO: loaded from: classes11.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? super T> f72350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f72351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f72352c;

    public a() {
        Type typeD = d(getClass());
        this.f72351b = typeD;
        this.f72350a = (Class<? super T>) C$Gson$Types.k(typeD);
        this.f72352c = typeD.hashCode();
    }

    public a(Type type) {
        Type typeB = C$Gson$Types.b((Type) g8.a.b(type));
        this.f72351b = typeB;
        this.f72350a = (Class<? super T>) C$Gson$Types.k(typeB);
        this.f72352c = typeB.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    public static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        return C$Gson$Types.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
    }

    public final Class<? super T> c() {
        return this.f72350a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && C$Gson$Types.f(this.f72351b, ((a) obj).f72351b);
    }

    public final Type getType() {
        return this.f72351b;
    }

    public final int hashCode() {
        return this.f72352c;
    }

    public final String toString() {
        return C$Gson$Types.u(this.f72351b);
    }
}
