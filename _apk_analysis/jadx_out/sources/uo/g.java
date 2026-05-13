package uo;

import cn.f0;
import cn.h0;
import cn.r;
import cn.x;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;
import wo.b2;
import wo.i2;
import wo.n;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f85753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final k f85754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<Annotation> f85756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Set<String> f85757e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String[] f85758f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor[] f85759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final List<Annotation>[] f85760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final boolean[] f85761i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Map<String, Integer> f85762j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final SerialDescriptor[] f85763k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final bn.g f85764l;

    public g(@NotNull String str, @NotNull k kVar, int i10, @NotNull List<? extends SerialDescriptor> list, @NotNull a aVar) {
        p.k(str, "serialName");
        p.k(kVar, "kind");
        p.k(list, "typeParameters");
        p.k(aVar, "builder");
        this.f85753a = str;
        this.f85754b = kVar;
        this.f85755c = i10;
        this.f85756d = aVar.c();
        this.f85757e = f0.e1(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.f85758f = strArr;
        this.f85759g = b2.b(aVar.e());
        this.f85760h = (List[]) aVar.d().toArray(new List[0]);
        this.f85761i = f0.a1(aVar.g());
        Iterable<h0> iterableK0 = r.K0(strArr);
        ArrayList arrayList = new ArrayList(x.x(iterableK0, 10));
        for (h0 h0Var : iterableK0) {
            arrayList.add(bn.h.a(h0Var.b(), Integer.valueOf(h0Var.a())));
        }
        this.f85762j = kotlin.collections.a.x(arrayList);
        this.f85763k = b2.b(list);
        this.f85764l = kotlin.b.b(new sn.a() { // from class: uo.f
            @Override // sn.a
            public final Object invoke() {
                return Integer.valueOf(g.k(this.f85752b));
            }
        });
    }

    public static final int k(g gVar) {
        return i2.b(gVar, gVar.f85763k);
    }

    @Override // wo.n
    @NotNull
    public Set<String> a() {
        return this.f85757e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(@NotNull String str) {
        p.k(str, "name");
        Integer num = this.f85762j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        return this.f85759g[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int e() {
        return this.f85755c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (p.f(h(), serialDescriptor.h()) && Arrays.equals(this.f85763k, ((g) obj).f85763k) && e() == serialDescriptor.e()) {
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    if (p.f(d(i10).h(), serialDescriptor.d(i10).h()) && p.f(d(i10).getKind(), serialDescriptor.d(i10).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String f(int i10) {
        return this.f85758f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> g(int i10) {
        return this.f85760h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f85756d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public k getKind() {
        return this.f85754b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f85753a;
    }

    public int hashCode() {
        return l();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f85761i[i10];
    }

    public final int l() {
        return ((Number) this.f85764l.getValue()).intValue();
    }

    @NotNull
    public String toString() {
        return i2.c(this);
    }
}
