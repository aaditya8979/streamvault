package yo;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;
import uo.l;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends wo.o1 implements xo.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final xo.a f97912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final sn.l<JsonElement, bn.r> f97913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final xo.f f97914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public String f97915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f97916f;

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    public static final class a extends vo.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f97918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SerialDescriptor f97919c;

        public a(String str, SerialDescriptor serialDescriptor) {
            this.f97918b = str;
            this.f97919c = serialDescriptor;
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public zo.c a() {
            return e.this.d().a();
        }

        @Override // vo.b, kotlinx.serialization.encoding.Encoder
        public void w(String str) {
            tn.p.k(str, "value");
            e.this.w0(this.f97918b, new xo.v(str, false, this.f97919c));
        }
    }

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    public static final class b extends vo.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zo.c f97920a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f97922c;

        public b(String str) {
            this.f97922c = str;
            this.f97920a = e.this.d().a();
        }

        @Override // vo.b, kotlinx.serialization.encoding.Encoder
        public void B(long j10) {
            K(h.a(bn.m.b(j10), 10));
        }

        public final void K(String str) {
            tn.p.k(str, "s");
            e.this.w0(this.f97922c, new xo.v(str, false, null, 4, null));
        }

        @Override // kotlinx.serialization.encoding.Encoder
        public zo.c a() {
            return this.f97920a;
        }

        @Override // vo.b, kotlinx.serialization.encoding.Encoder
        public void e(byte b10) {
            K(bn.i.e(bn.i.b(b10)));
        }

        @Override // vo.b, kotlinx.serialization.encoding.Encoder
        public void l(short s10) {
            K(bn.p.e(bn.p.b(s10)));
        }

        @Override // vo.b, kotlinx.serialization.encoding.Encoder
        public void t(int i10) {
            K(Long.toString(((long) bn.k.b(i10)) & 4294967295L, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(xo.a aVar, sn.l<? super JsonElement, bn.r> lVar) {
        this.f97912b = aVar;
        this.f97913c = lVar;
        this.f97914d = aVar.e();
    }

    public /* synthetic */ e(xo.a aVar, sn.l lVar, tn.i iVar) {
        this(aVar, lVar);
    }

    public static final bn.r f0(e eVar, JsonElement jsonElement) {
        tn.p.k(jsonElement, "node");
        eVar.w0(eVar.V(), jsonElement);
        return bn.r.f5635a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void C() {
        String strW = W();
        if (strW == null) {
            this.f97913c.invoke(JsonNull.INSTANCE);
        } else {
            p0(strW);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public void F() {
    }

    @Override // wo.a3
    public void U(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        this.f97913c.invoke(s0());
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public final zo.c a() {
        return this.f97912b.a();
    }

    @Override // wo.o1
    @NotNull
    public String a0(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "parentName");
        tn.p.k(str2, "childName");
        return str2;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public vo.d b(@NotNull SerialDescriptor serialDescriptor) {
        e x0Var;
        tn.p.k(serialDescriptor, "descriptor");
        sn.l<JsonElement, bn.r> lVar = W() == null ? this.f97913c : new sn.l() { // from class: yo.d
            @Override // sn.l
            public final Object invoke(Object obj) {
                return e.f0(this.f97911b, (JsonElement) obj);
            }
        };
        uo.k kind = serialDescriptor.getKind();
        if (tn.p.f(kind, l.b.f85774a) || (kind instanceof uo.d)) {
            x0Var = new x0(this.f97912b, lVar);
        } else if (tn.p.f(kind, l.c.f85775a)) {
            xo.a aVar = this.f97912b;
            SerialDescriptor serialDescriptorA = o1.a(serialDescriptor.d(0), aVar.a());
            uo.k kind2 = serialDescriptorA.getKind();
            if ((kind2 instanceof uo.e) || tn.p.f(kind2, k.b.f85772a)) {
                x0Var = new z0(this.f97912b, lVar);
            } else {
                if (!aVar.e().c()) {
                    throw j0.d(serialDescriptorA);
                }
                x0Var = new x0(this.f97912b, lVar);
            }
        } else {
            x0Var = new v0(this.f97912b, lVar);
        }
        String str = this.f97915e;
        if (str != null) {
            if (x0Var instanceof z0) {
                z0 z0Var = (z0) x0Var;
                z0Var.w0("key", xo.i.c(str));
                String strH = this.f97916f;
                if (strH == null) {
                    strH = serialDescriptor.h();
                }
                z0Var.w0("value", xo.i.c(strH));
            } else {
                String strH2 = this.f97916f;
                if (strH2 == null) {
                    strH2 = serialDescriptor.h();
                }
                x0Var.w0(str, xo.i.c(strH2));
            }
            this.f97915e = null;
            this.f97916f = null;
        }
        return x0Var;
    }

    @Override // wo.o1
    @NotNull
    public String b0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return m0.i(serialDescriptor, this.f97912b, i10);
    }

    @Override // xo.r
    @NotNull
    public final xo.a d() {
        return this.f97912b;
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void J(@NotNull String str, boolean z10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.a(Boolean.valueOf(z10)));
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void K(@NotNull String str, byte b10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.b(Byte.valueOf(b10)));
    }

    @Override // wo.a3, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder i(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        if (W() == null) {
            return new p0(this.f97912b, this.f97913c).i(serialDescriptor);
        }
        if (this.f97915e != null) {
            this.f97916f = serialDescriptor.h();
        }
        return super.i(serialDescriptor);
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void L(@NotNull String str, char c10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.c(String.valueOf(c10)));
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void M(@NotNull String str, double d10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.b(Double.valueOf(d10)));
        if (this.f97914d.b()) {
            return;
        }
        if (!(Math.abs(d10) <= Double.MAX_VALUE)) {
            throw j0.c(Double.valueOf(d10), str, s0().toString());
        }
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void N(@NotNull String str, @NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(str, "tag");
        tn.p.k(serialDescriptor, "enumDescriptor");
        w0(str, xo.i.c(serialDescriptor.f(i10)));
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void O(@NotNull String str, float f10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.b(Float.valueOf(f10)));
        if (this.f97914d.b()) {
            return;
        }
        if (!(Math.abs(f10) <= Float.MAX_VALUE)) {
            throw j0.c(Float.valueOf(f10), str, s0().toString());
        }
    }

    @Override // wo.a3
    @NotNull
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public Encoder P(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(str, "tag");
        tn.p.k(serialDescriptor, "inlineDescriptor");
        return g1.b(serialDescriptor) ? v0(str) : g1.a(serialDescriptor) ? u0(str, serialDescriptor) : super.P(str, serialDescriptor);
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void Q(@NotNull String str, int i10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.b(Integer.valueOf(i10)));
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public void R(@NotNull String str, long j10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.b(Long.valueOf(j10)));
    }

    public void p0(@NotNull String str) {
        tn.p.k(str, "tag");
        w0(str, JsonNull.INSTANCE);
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void S(@NotNull String str, short s10) {
        tn.p.k(str, "tag");
        w0(str, xo.i.b(Short.valueOf(s10)));
    }

    @Override // vo.d
    public boolean r(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return this.f97914d.i();
    }

    @Override // wo.a3
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void T(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "value");
        w0(str, xo.i.c(str2));
    }

    @Override // xo.r
    public void s(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "element");
        if (this.f97915e == null || (jsonElement instanceof JsonObject)) {
            z(xo.p.f87062a, jsonElement);
        } else {
            a1.d(this.f97916f, jsonElement);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public abstract JsonElement s0();

    @NotNull
    public final sn.l<JsonElement, bn.r> t0() {
        return this.f97913c;
    }

    public final a u0(String str, SerialDescriptor serialDescriptor) {
        return new a(str, serialDescriptor);
    }

    public final b v0(String str) {
        return new b(str);
    }

    public abstract void w0(@NotNull String str, @NotNull JsonElement jsonElement);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void z(@org.jetbrains.annotations.NotNull so.l<? super T> r6, T r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.e.z(so.l, java.lang.Object):void");
    }
}
