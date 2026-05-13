package tn;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeParameterReference.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class z implements KTypeParameter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f85369g = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Object f85370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f85371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final KVariance f85372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f85373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public volatile List<? extends KType> f85374f;

    /* JADX INFO: compiled from: TypeParameterReference.kt */
    public static final class a {

        /* JADX INFO: renamed from: tn.z$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: TypeParameterReference.kt */
        public /* synthetic */ class C1064a {
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

        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        @NotNull
        public final String a(@NotNull KTypeParameter kTypeParameter) {
            p.k(kTypeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = C1064a.$EnumSwitchMapping$0[kTypeParameter.getVariance().ordinal()];
            if (i10 == 1) {
                bn.r rVar = bn.r.f5635a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sb2.append("out ");
            }
            sb2.append(kTypeParameter.getName());
            return sb2.toString();
        }
    }

    public z(@Nullable Object obj, @NotNull String str, @NotNull KVariance kVariance, boolean z10) {
        p.k(str, "name");
        p.k(kVariance, "variance");
        this.f85370b = obj;
        this.f85371c = str;
        this.f85372d = kVariance;
        this.f85373e = z10;
    }

    public final void a(@NotNull List<? extends KType> list) {
        p.k(list, "upperBounds");
        if (this.f85374f == null) {
            this.f85374f = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (p.f(this.f85370b, zVar.f85370b) && p.f(getName(), zVar.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        return this.f85371c;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        List list = this.f85374f;
        if (list != null) {
            return list;
        }
        List<KType> listE = cn.v.e(t.g(Object.class));
        this.f85374f = listE;
        return listE;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public KVariance getVariance() {
        return this.f85372d;
    }

    public int hashCode() {
        Object obj = this.f85370b;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.f85373e;
    }

    @NotNull
    public String toString() {
        return f85369g.a(this);
    }
}
