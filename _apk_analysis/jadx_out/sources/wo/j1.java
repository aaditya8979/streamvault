package wo;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.l;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j1 implements SerialDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f86550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor f86552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86553d;

    public j1(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f86550a = str;
        this.f86551b = serialDescriptor;
        this.f86552c = serialDescriptor2;
        this.f86553d = 2;
    }

    public /* synthetic */ j1(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, tn.i iVar) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(@NotNull String str) {
        tn.p.k(str, "name");
        Integer numR = bo.z.r(str);
        if (numR != null) {
            return numR.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f86551b;
            }
            if (i11 == 1) {
                return this.f86552c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f86553d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return tn.p.f(h(), j1Var.h()) && tn.p.f(this.f86551b, j1Var.f86551b) && tn.p.f(this.f86552c, j1Var.f86552c);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> g(int i10) {
        if (i10 >= 0) {
            return cn.w.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public uo.k getKind() {
        return l.c.f85775a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f86550a;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f86551b.hashCode()) * 31) + this.f86552c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @NotNull
    public String toString() {
        return h() + '(' + this.f86551b + ", " + this.f86552c + ')';
    }
}
