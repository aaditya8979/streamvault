package tn;

import cn.f0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b0 implements KType {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f85342f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final KClassifier f85343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<KTypeProjection> f85344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final KType f85345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85346e;

    /* JADX INFO: compiled from: TypeReference.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b0(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, @Nullable KType kType, int i10) {
        p.k(kClassifier, "classifier");
        p.k(list, "arguments");
        this.f85343b = kClassifier;
        this.f85344c = list;
        this.f85345d = kType;
        this.f85346e = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b0(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, boolean z10) {
        this(kClassifier, list, null, z10 ? 1 : 0);
        p.k(kClassifier, "classifier");
        p.k(list, "arguments");
    }

    public static final CharSequence e(b0 b0Var, KTypeProjection kTypeProjection) {
        p.k(kTypeProjection, "it");
        return b0Var.b(kTypeProjection);
    }

    public final String b(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.getVariance() == null) {
            return "*";
        }
        KType type = kTypeProjection.getType();
        b0 b0Var = type instanceof b0 ? (b0) type : null;
        if (b0Var == null || (strValueOf = b0Var.c(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.getType());
        }
        KVariance variance = kTypeProjection.getVariance();
        int i10 = variance == null ? -1 : b.$EnumSwitchMapping$0[variance.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    public final String c(boolean z10) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class<?> clsA = kClass != null ? rn.a.a(kClass) : null;
        if (clsA == null) {
            name = getClassifier().toString();
        } else if ((this.f85346e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = f(clsA);
        } else if (z10 && clsA.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            p.i(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = rn.a.b((KClass) classifier2).getName();
        } else {
            name = clsA.getName();
        }
        String str = name + (getArguments().isEmpty() ? "" : f0.D0(getArguments(), ", ", "<", ">", 0, null, new sn.l() { // from class: tn.a0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return b0.e(this.f85341b, (KTypeProjection) obj);
            }
        }, 24, null)) + (isMarkedNullable() ? "?" : "");
        KType kType = this.f85345d;
        if (!(kType instanceof b0)) {
            return str;
        }
        String strC = ((b0) kType).c(true);
        if (p.f(strC, str)) {
            return str;
        }
        if (p.f(strC, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strC + ')';
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (p.f(getClassifier(), b0Var.getClassifier()) && p.f(getArguments(), b0Var.getArguments()) && p.f(this.f85345d, b0Var.f85345d) && this.f85346e == b0Var.f85346e) {
                return true;
            }
        }
        return false;
    }

    public final String f(Class<?> cls) {
        return p.f(cls, boolean[].class) ? "kotlin.BooleanArray" : p.f(cls, char[].class) ? "kotlin.CharArray" : p.f(cls, byte[].class) ? "kotlin.ByteArray" : p.f(cls, short[].class) ? "kotlin.ShortArray" : p.f(cls, int[].class) ? "kotlin.IntArray" : p.f(cls, float[].class) ? "kotlin.FloatArray" : p.f(cls, long[].class) ? "kotlin.LongArray" : p.f(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public final int g() {
        return this.f85346e;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return cn.w.m();
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.f85344c;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public KClassifier getClassifier() {
        return this.f85343b;
    }

    @Nullable
    public final KType h() {
        return this.f85345d;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.f85346e);
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.f85346e & 1) != 0;
    }

    @NotNull
    public String toString() {
        return c(false) + " (Kotlin reflection is not available)";
    }
}
