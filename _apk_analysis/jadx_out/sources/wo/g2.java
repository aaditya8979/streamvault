package wo;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.l;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: classes4.dex */
public class g2 implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f86517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final m0<?> f86518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String[] f86521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final List<Annotation>[] f86522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public List<Annotation> f86523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final boolean[] f86524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public Map<String, Integer> f86525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final bn.g f86526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final bn.g f86527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final bn.g f86528l;

    public g2(@NotNull String str, @Nullable m0<?> m0Var, int i10) {
        tn.p.k(str, "serialName");
        this.f86517a = str;
        this.f86518b = m0Var;
        this.f86519c = i10;
        this.f86520d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f86521e = strArr;
        int i12 = this.f86519c;
        this.f86522f = new List[i12];
        this.f86524h = new boolean[i12];
        this.f86525i = kotlin.collections.a.j();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f86526j = kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: wo.d2
            @Override // sn.a
            public final Object invoke() {
                return g2.q(this.f86495b);
            }
        });
        this.f86527k = kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: wo.e2
            @Override // sn.a
            public final Object invoke() {
                return g2.w(this.f86502b);
            }
        });
        this.f86528l = kotlin.b.a(lazyThreadSafetyMode, new sn.a() { // from class: wo.f2
            @Override // sn.a
            public final Object invoke() {
                return Integer.valueOf(g2.m(this.f86509b));
            }
        });
    }

    public /* synthetic */ g2(String str, m0 m0Var, int i10, int i11, tn.i iVar) {
        this(str, (i11 & 2) != 0 ? null : m0Var, i10);
    }

    public static final int m(g2 g2Var) {
        return i2.b(g2Var, g2Var.s());
    }

    public static /* synthetic */ void o(g2 g2Var, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        g2Var.n(str, z10);
    }

    public static final KSerializer[] q(g2 g2Var) {
        KSerializer<?>[] kSerializerArrChildSerializers;
        m0<?> m0Var = g2Var.f86518b;
        return (m0Var == null || (kSerializerArrChildSerializers = m0Var.childSerializers()) == null) ? j2.f86554a : kSerializerArrChildSerializers;
    }

    public static final SerialDescriptor[] w(g2 g2Var) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        m0<?> m0Var = g2Var.f86518b;
        if (m0Var == null || (kSerializerArrTypeParametersSerializers = m0Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return b2.b(arrayList);
    }

    @Override // wo.n
    @NotNull
    public Set<String> a() {
        return this.f86525i.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int c(@NotNull String str) {
        tn.p.k(str, "name");
        Integer num = this.f86525i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor d(int i10) {
        return r()[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.f86519c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g2) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (tn.p.f(h(), serialDescriptor.h()) && Arrays.equals(s(), ((g2) obj).s()) && e() == serialDescriptor.e()) {
                int iE = e();
                for (int i10 = 0; i10 < iE; i10++) {
                    if (tn.p.f(d(i10).h(), serialDescriptor.d(i10).h()) && tn.p.f(d(i10).getKind(), serialDescriptor.d(i10).getKind())) {
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
        return this.f86521e[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> g(int i10) {
        List<Annotation> list = this.f86522f[i10];
        return list == null ? cn.w.m() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> list = this.f86523g;
        return list == null ? cn.w.m() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public uo.k getKind() {
        return l.a.f85773a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String h() {
        return this.f86517a;
    }

    public int hashCode() {
        return t();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean i(int i10) {
        return this.f86524h[i10];
    }

    public final void n(@NotNull String str, boolean z10) {
        tn.p.k(str, "name");
        String[] strArr = this.f86521e;
        int i10 = this.f86520d + 1;
        this.f86520d = i10;
        strArr[i10] = str;
        this.f86524h[i10] = z10;
        this.f86522f[i10] = null;
        if (i10 == this.f86519c - 1) {
            this.f86525i = p();
        }
    }

    public final Map<String, Integer> p() {
        HashMap map = new HashMap();
        int length = this.f86521e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f86521e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    public final KSerializer<?>[] r() {
        return (KSerializer[]) this.f86526j.getValue();
    }

    @NotNull
    public final SerialDescriptor[] s() {
        return (SerialDescriptor[]) this.f86527k.getValue();
    }

    public final int t() {
        return ((Number) this.f86528l.getValue()).intValue();
    }

    @NotNull
    public String toString() {
        return i2.c(this);
    }

    public final void u(@NotNull Annotation annotation) {
        tn.p.k(annotation, "annotation");
        List<Annotation> arrayList = this.f86522f[this.f86520d];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f86522f[this.f86520d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void v(@NotNull Annotation annotation) {
        tn.p.k(annotation, "a");
        if (this.f86523g == null) {
            this.f86523g = new ArrayList(1);
        }
        List<Annotation> list = this.f86523g;
        tn.p.h(list);
        list.add(annotation);
    }
}
