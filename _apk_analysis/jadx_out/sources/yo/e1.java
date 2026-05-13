package yo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3978d4;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonElementMarker;
import kotlinx.serialization.json.internal.JsonTreeReader;
import kotlinx.serialization.json.internal.WriteMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes12.dex */
public class e1 extends vo.a implements xo.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final xo.a f97924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final WriteMode f97925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final yo.a f97926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final zo.c f97927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f97928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public a f97929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final xo.f f97930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final JsonElementMarker f97931i;

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f97932a;

        public a(@Nullable String str) {
            this.f97932a = str;
        }
    }

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public /* synthetic */ class b {
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
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e1(@NotNull xo.a aVar, @NotNull WriteMode writeMode, @NotNull yo.a aVar2, @NotNull SerialDescriptor serialDescriptor, @Nullable a aVar3) {
        tn.p.k(aVar, "json");
        tn.p.k(writeMode, C3978d4.a.f31224t);
        tn.p.k(aVar2, "lexer");
        tn.p.k(serialDescriptor, "descriptor");
        this.f97924b = aVar;
        this.f97925c = writeMode;
        this.f97926d = aVar2;
        this.f97927e = aVar.a();
        this.f97928f = -1;
        this.f97929g = aVar3;
        xo.f fVarE = aVar.e();
        this.f97930h = fVarE;
        this.f97931i = fVarE.j() ? null : new JsonElementMarker(serialDescriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    @Override // kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T A(@org.jetbrains.annotations.NotNull so.c<? extends T> r12) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.e1.A(so.c):java.lang.Object");
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public boolean B() {
        return this.f97926d.h();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public boolean F() {
        JsonElementMarker jsonElementMarker = this.f97931i;
        return ((jsonElementMarker != null ? jsonElementMarker.b() : false) || yo.a.P(this.f97926d, false, 1, null)) ? false : true;
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public byte I() {
        long jN = this.f97926d.n();
        byte b10 = (byte) jN;
        if (jN == b10) {
            return b10;
        }
        yo.a.z(this.f97926d, "Failed to parse byte for input '" + jN + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void L() {
        if (this.f97926d.G() != 4) {
            return;
        }
        yo.a.z(this.f97926d, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean M(SerialDescriptor serialDescriptor, int i10) {
        String strH;
        xo.a aVar = this.f97924b;
        boolean zI = serialDescriptor.i(i10);
        SerialDescriptor serialDescriptorD = serialDescriptor.d(i10);
        if (zI && !serialDescriptorD.b() && this.f97926d.O(true)) {
            return true;
        }
        if (tn.p.f(serialDescriptorD.getKind(), k.b.f85772a) && ((!serialDescriptorD.b() || !this.f97926d.O(false)) && (strH = this.f97926d.H(this.f97930h.q())) != null)) {
            int iJ = m0.j(serialDescriptorD, aVar, strH);
            boolean z10 = !aVar.e().j() && serialDescriptorD.b();
            if (iJ == -3 && (zI || z10)) {
                this.f97926d.q();
                return true;
            }
        }
        return false;
    }

    public final int N() {
        boolean zN = this.f97926d.N();
        if (!this.f97926d.f()) {
            if (!zN || this.f97924b.e().d()) {
                return -1;
            }
            j0.g(this.f97926d, "array");
            throw new KotlinNothingValueException();
        }
        int i10 = this.f97928f;
        if (i10 != -1 && !zN) {
            yo.a.z(this.f97926d, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f97928f = i11;
        return i11;
    }

    public final int O() {
        int i10 = this.f97928f;
        boolean zN = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f97926d.m(':');
        } else if (i10 != -1) {
            zN = this.f97926d.N();
        }
        if (!this.f97926d.f()) {
            if (!zN || this.f97924b.e().d()) {
                return -1;
            }
            j0.h(this.f97926d, null, 1, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.f97928f == -1) {
                yo.a aVar = this.f97926d;
                boolean z11 = !zN;
                int i11 = aVar.f97896a;
                if (!z11) {
                    yo.a.z(aVar, "Unexpected leading comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                yo.a aVar2 = this.f97926d;
                int i12 = aVar2.f97896a;
                if (!zN) {
                    yo.a.z(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f97928f + 1;
        this.f97928f = i13;
        return i13;
    }

    public final int P(SerialDescriptor serialDescriptor) {
        int iJ;
        boolean zN;
        boolean zN2 = this.f97926d.N();
        while (true) {
            boolean z10 = true;
            if (!this.f97926d.f()) {
                if (zN2 && !this.f97924b.e().d()) {
                    j0.h(this.f97926d, null, 1, null);
                    throw new KotlinNothingValueException();
                }
                JsonElementMarker jsonElementMarker = this.f97931i;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.d();
                }
                return -1;
            }
            String strQ = Q();
            this.f97926d.m(':');
            iJ = m0.j(serialDescriptor, this.f97924b, strQ);
            if (iJ == -3) {
                zN = false;
            } else {
                if (!this.f97930h.g() || !M(serialDescriptor, iJ)) {
                    break;
                }
                zN = this.f97926d.N();
                z10 = false;
            }
            zN2 = z10 ? R(serialDescriptor, strQ) : zN;
        }
        JsonElementMarker jsonElementMarker2 = this.f97931i;
        if (jsonElementMarker2 != null) {
            jsonElementMarker2.c(iJ);
        }
        return iJ;
    }

    public final String Q() {
        return this.f97930h.q() ? this.f97926d.t() : this.f97926d.j();
    }

    public final boolean R(SerialDescriptor serialDescriptor, String str) {
        if (m0.n(serialDescriptor, this.f97924b) || T(this.f97929g, str)) {
            this.f97926d.J(this.f97930h.q());
        } else {
            this.f97926d.f97897b.b();
            this.f97926d.A(str);
        }
        return this.f97926d.N();
    }

    public final void S(SerialDescriptor serialDescriptor) {
        while (w(serialDescriptor) != -1) {
        }
    }

    public final boolean T(a aVar, String str) {
        if (aVar == null || !tn.p.f(aVar.f97932a, str)) {
            return false;
        }
        aVar.f97932a = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.Decoder, vo.c
    @NotNull
    public zo.c a() {
        return this.f97927e;
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public vo.c b(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        WriteMode writeModeB = o1.b(this.f97924b, serialDescriptor);
        this.f97926d.f97897b.c(serialDescriptor);
        this.f97926d.m(writeModeB.begin);
        L();
        int i10 = b.$EnumSwitchMapping$0[writeModeB.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new e1(this.f97924b, writeModeB, this.f97926d, serialDescriptor, this.f97929g) : (this.f97925c == writeModeB && this.f97924b.e().j()) ? this : new e1(this.f97924b, writeModeB, this.f97926d, serialDescriptor, this.f97929g);
    }

    @Override // vo.a, vo.c
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        if (serialDescriptor.e() == 0 && m0.n(serialDescriptor, this.f97924b)) {
            S(serialDescriptor);
        }
        if (this.f97926d.N() && !this.f97924b.e().d()) {
            j0.g(this.f97926d, "");
            throw new KotlinNothingValueException();
        }
        this.f97926d.m(this.f97925c.end);
        this.f97926d.f97897b.b();
    }

    @Override // xo.g
    @NotNull
    public final xo.a d() {
        return this.f97924b;
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    @Nullable
    public Void h() {
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // vo.a, vo.c
    public <T> T i(@NotNull SerialDescriptor serialDescriptor, int i10, @NotNull so.c<? extends T> cVar, @Nullable T t10) {
        tn.p.k(serialDescriptor, "descriptor");
        tn.p.k(cVar, "deserializer");
        boolean z10 = this.f97925c == WriteMode.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f97926d.f97897b.d();
        }
        T t11 = (T) super.i(serialDescriptor, i10, cVar, t10);
        if (z10) {
            this.f97926d.f97897b.f(t11);
        }
        return t11;
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public long j() {
        return this.f97926d.n();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public short n() {
        long jN = this.f97926d.n();
        short s10 = (short) jN;
        if (jN == s10) {
            return s10;
        }
        yo.a.z(this.f97926d, "Failed to parse short for input '" + jN + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public double o() {
        yo.a aVar = this.f97926d;
        String strS = aVar.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (!this.f97924b.e().b()) {
                if (!(Math.abs(d10) <= Double.MAX_VALUE)) {
                    j0.k(this.f97926d, Double.valueOf(d10));
                    throw new KotlinNothingValueException();
                }
            }
            return d10;
        } catch (IllegalArgumentException unused) {
            yo.a.z(aVar, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public char p() {
        String strS = this.f97926d.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        yo.a.z(this.f97926d, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public String q() {
        return this.f97930h.q() ? this.f97926d.t() : this.f97926d.q();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public int s(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "enumDescriptor");
        return m0.k(serialDescriptor, this.f97924b, q(), " at path " + this.f97926d.f97897b.a());
    }

    @Override // xo.g
    @NotNull
    public JsonElement t() {
        return new JsonTreeReader(this.f97924b.e(), this.f97926d).e();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public int u() {
        long jN = this.f97926d.n();
        int i10 = (int) jN;
        if (jN == i10) {
            return i10;
        }
        yo.a.z(this.f97926d, "Failed to parse int for input '" + jN + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // vo.c
    public int w(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.f97925c.ordinal()];
        int iN = i10 != 2 ? i10 != 4 ? N() : P(serialDescriptor) : O();
        if (this.f97925c != WriteMode.MAP) {
            this.f97926d.f97897b.g(iN);
        }
        return iN;
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        return g1.b(serialDescriptor) ? new i0(this.f97926d, this.f97924b) : super.x(serialDescriptor);
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public float y() {
        yo.a aVar = this.f97926d;
        String strS = aVar.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (!this.f97924b.e().b()) {
                if (!(Math.abs(f10) <= Float.MAX_VALUE)) {
                    j0.k(this.f97926d, Float.valueOf(f10));
                    throw new KotlinNothingValueException();
                }
            }
            return f10;
        } catch (IllegalArgumentException unused) {
            yo.a.z(aVar, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}
