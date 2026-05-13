package yo;

import com.ironsource.C3978d4;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.WriteMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f1 extends vo.b implements xo.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final s f97933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final xo.a f97934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WriteMode f97935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final xo.r[] f97936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final zo.c f97937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final xo.f f97938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f97939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public String f97940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f97941i;

    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f1(@NotNull g0 g0Var, @NotNull xo.a aVar, @NotNull WriteMode writeMode, @NotNull xo.r[] rVarArr) {
        this(c0.a(g0Var, aVar), aVar, writeMode, rVarArr);
        tn.p.k(g0Var, "output");
        tn.p.k(aVar, "json");
        tn.p.k(writeMode, C3978d4.a.f31224t);
        tn.p.k(rVarArr, "modeReuseCache");
    }

    public f1(@NotNull s sVar, @NotNull xo.a aVar, @NotNull WriteMode writeMode, @Nullable xo.r[] rVarArr) {
        tn.p.k(sVar, "composer");
        tn.p.k(aVar, "json");
        tn.p.k(writeMode, C3978d4.a.f31224t);
        this.f97933a = sVar;
        this.f97934b = aVar;
        this.f97935c = writeMode;
        this.f97936d = rVarArr;
        this.f97937e = d().a();
        this.f97938f = d().e();
        int iOrdinal = writeMode.ordinal();
        if (rVarArr != null) {
            xo.r rVar = rVarArr[iOrdinal];
            if (rVar == null && rVar == this) {
                return;
            }
            rVarArr[iOrdinal] = this;
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void B(long j10) {
        if (this.f97939g) {
            w(String.valueOf(j10));
        } else {
            this.f97933a.j(j10);
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void C() {
        this.f97933a.k("null");
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void E(char c10) {
        w(String.valueOf(c10));
    }

    @Override // vo.b
    public boolean I(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        int i11 = a.$EnumSwitchMapping$0[this.f97935c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f97933a.a()) {
                        this.f97933a.f(',');
                    }
                    this.f97933a.c();
                    w(m0.i(serialDescriptor, d(), i10));
                    this.f97933a.f(':');
                    this.f97933a.p();
                } else {
                    if (i10 == 0) {
                        this.f97939g = true;
                    }
                    if (i10 == 1) {
                        this.f97933a.f(',');
                        this.f97933a.p();
                        this.f97939g = false;
                    }
                }
            } else if (this.f97933a.a()) {
                this.f97939g = true;
                this.f97933a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f97933a.f(',');
                    this.f97933a.c();
                    z10 = true;
                } else {
                    this.f97933a.f(':');
                    this.f97933a.p();
                }
                this.f97939g = z10;
            }
        } else {
            if (!this.f97933a.a()) {
                this.f97933a.f(',');
            }
            this.f97933a.c();
        }
        return true;
    }

    public final void K(String str, String str2) {
        this.f97933a.c();
        w(str);
        this.f97933a.f(':');
        this.f97933a.p();
        w(str2);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public zo.c a() {
        return this.f97937e;
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public vo.d b(@NotNull SerialDescriptor serialDescriptor) {
        xo.r rVar;
        tn.p.k(serialDescriptor, "descriptor");
        WriteMode writeModeB = o1.b(d(), serialDescriptor);
        char c10 = writeModeB.begin;
        if (c10 != 0) {
            this.f97933a.f(c10);
            this.f97933a.b();
        }
        String str = this.f97940h;
        if (str != null) {
            String strH = this.f97941i;
            if (strH == null) {
                strH = serialDescriptor.h();
            }
            K(str, strH);
            this.f97940h = null;
            this.f97941i = null;
        }
        if (this.f97935c == writeModeB) {
            return this;
        }
        xo.r[] rVarArr = this.f97936d;
        return (rVarArr == null || (rVar = rVarArr[writeModeB.ordinal()]) == null) ? new f1(this.f97933a, d(), writeModeB, this.f97936d) : rVar;
    }

    @Override // vo.b, vo.d
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        if (this.f97935c.end != 0) {
            this.f97933a.q();
            this.f97933a.d();
            this.f97933a.f(this.f97935c.end);
        }
    }

    @Override // xo.r
    @NotNull
    public xo.a d() {
        return this.f97934b;
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void e(byte b10) {
        if (this.f97939g) {
            w(String.valueOf((int) b10));
        } else {
            this.f97933a.e(b10);
        }
    }

    @Override // vo.b, vo.d
    public <T> void f(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.l<? super T> lVar, @Nullable T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(lVar, "serializer");
        if (t10 != null || this.f97938f.j()) {
            super.f(serialDescriptor, i10, lVar, t10);
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void h(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "enumDescriptor");
        w(serialDescriptor.f(i10));
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder i(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        if (g1.b(serialDescriptor)) {
            s a0Var = this.f97933a;
            if (!(a0Var instanceof a0)) {
                a0Var = new a0(a0Var.f97986a, this.f97939g);
            }
            return new f1(a0Var, d(), this.f97935c, (xo.r[]) null);
        }
        if (g1.a(serialDescriptor)) {
            s tVar = this.f97933a;
            if (!(tVar instanceof t)) {
                tVar = new t(tVar.f97986a, this.f97939g);
            }
            return new f1(tVar, d(), this.f97935c, (xo.r[]) null);
        }
        if (this.f97940h == null) {
            return super.i(serialDescriptor);
        }
        this.f97941i = serialDescriptor.h();
        return this;
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void l(short s10) {
        if (this.f97939g) {
            w(String.valueOf((int) s10));
        } else {
            this.f97933a.l(s10);
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void m(boolean z10) {
        if (this.f97939g) {
            w(String.valueOf(z10));
        } else {
            this.f97933a.m(z10);
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void n(float f10) {
        if (this.f97939g) {
            w(String.valueOf(f10));
        } else {
            this.f97933a.h(f10);
        }
        if (this.f97938f.b()) {
            return;
        }
        if (!(Math.abs(f10) <= Float.MAX_VALUE)) {
            throw j0.b(Float.valueOf(f10), this.f97933a.f97986a.toString());
        }
    }

    @Override // vo.d
    public boolean r(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "descriptor");
        return this.f97938f.i();
    }

    @Override // xo.r
    public void s(@NotNull JsonElement jsonElement) {
        tn.p.k(jsonElement, "element");
        if (this.f97940h == null || (jsonElement instanceof JsonObject)) {
            z(xo.p.f87062a, jsonElement);
        } else {
            a1.d(this.f97941i, jsonElement);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void t(int i10) {
        if (this.f97939g) {
            w(String.valueOf(i10));
        } else {
            this.f97933a.i(i10);
        }
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void w(@NotNull String str) {
        tn.p.k(str, "value");
        this.f97933a.n(str);
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void y(double d10) {
        if (this.f97939g) {
            w(String.valueOf(d10));
        } else {
            this.f97933a.g(d10);
        }
        if (this.f97938f.b()) {
            return;
        }
        if (!(Math.abs(d10) <= Double.MAX_VALUE)) {
            throw j0.b(Double.valueOf(d10), this.f97933a.f97986a.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // kotlinx.serialization.encoding.Encoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void z(@org.jetbrains.annotations.NotNull so.l<? super T> r6, T r7) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.f1.z(so.l, java.lang.Object):void");
    }
}
