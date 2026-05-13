package yo;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uo.k;
import uo.l;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c extends wo.n1 implements xo.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final xo.a f97907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final JsonElement f97908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f97909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final xo.f f97910g;

    public c(xo.a aVar, JsonElement jsonElement, String str) {
        this.f97907d = aVar;
        this.f97908e = jsonElement;
        this.f97909f = str;
        this.f97910g = d().e();
    }

    public /* synthetic */ c(xo.a aVar, JsonElement jsonElement, String str, int i10, tn.i iVar) {
        this(aVar, jsonElement, (i10 & 4) != 0 ? null : str, null);
    }

    public /* synthetic */ c(xo.a aVar, JsonElement jsonElement, String str, tn.i iVar) {
        this(aVar, jsonElement, str);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public <T> T A(@NotNull so.c<? extends T> cVar) {
        JsonPrimitive jsonPrimitiveJ;
        tn.p.k(cVar, "deserializer");
        if (!(cVar instanceof wo.b) || d().e().p()) {
            return cVar.deserialize(this);
        }
        wo.b bVar = (wo.b) cVar;
        String strC = a1.c(bVar.getDescriptor(), d());
        JsonElement jsonElementT = t();
        String strH = bVar.getDescriptor().h();
        if (jsonElementT instanceof JsonObject) {
            JsonObject jsonObject = (JsonObject) jsonElementT;
            JsonElement jsonElement = (JsonElement) jsonObject.get(strC);
            try {
                so.c cVarA = so.h.a((wo.b) cVar, this, (jsonElement == null || (jsonPrimitiveJ = xo.i.j(jsonElement)) == null) ? null : xo.i.f(jsonPrimitiveJ));
                tn.p.i(cVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) l1.b(d(), strC, jsonObject, cVarA);
            } catch (SerializationException e10) {
                String message = e10.getMessage();
                tn.p.h(message);
                throw j0.f(-1, message, jsonObject.toString());
            }
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonObject.class).getSimpleName() + ", but had " + tn.t.b(jsonElementT.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + j0(), jsonElementT.toString());
    }

    @NotNull
    public abstract JsonElement A0();

    @NotNull
    public final String B0(@NotNull String str) {
        tn.p.k(str, "currentTag");
        return j0() + '.' + str;
    }

    public final Void C0(JsonPrimitive jsonPrimitive, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (bo.a0.W(str, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw j0.f(-1, "Failed to parse literal '" + jsonPrimitive + "' as " + sb2.toString() + " value at element: " + B0(str2), n0().toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean F() {
        return !(n0() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder, vo.c
    @NotNull
    public zo.c a() {
        return d().a();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    @NotNull
    public vo.c b(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        JsonElement jsonElementN0 = n0();
        uo.k kind = serialDescriptor.getKind();
        if (tn.p.f(kind, l.b.f85774a) || (kind instanceof uo.d)) {
            xo.a aVarD = d();
            String strH = serialDescriptor.h();
            if (jsonElementN0 instanceof JsonArray) {
                return new w0(aVarD, (JsonArray) jsonElementN0);
            }
            throw j0.f(-1, "Expected " + tn.t.b(JsonArray.class).getSimpleName() + ", but had " + tn.t.b(jsonElementN0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + j0(), jsonElementN0.toString());
        }
        if (!tn.p.f(kind, l.c.f85775a)) {
            xo.a aVarD2 = d();
            String strH2 = serialDescriptor.h();
            if (jsonElementN0 instanceof JsonObject) {
                return new u0(aVarD2, (JsonObject) jsonElementN0, this.f97909f, null, 8, null);
            }
            throw j0.f(-1, "Expected " + tn.t.b(JsonObject.class).getSimpleName() + ", but had " + tn.t.b(jsonElementN0.getClass()).getSimpleName() + " as the serialized body of " + strH2 + " at element: " + j0(), jsonElementN0.toString());
        }
        xo.a aVarD3 = d();
        SerialDescriptor serialDescriptorA = o1.a(serialDescriptor.d(0), aVarD3.a());
        uo.k kind2 = serialDescriptorA.getKind();
        if ((kind2 instanceof uo.e) || tn.p.f(kind2, k.b.f85772a)) {
            xo.a aVarD4 = d();
            String strH3 = serialDescriptor.h();
            if (jsonElementN0 instanceof JsonObject) {
                return new y0(aVarD4, (JsonObject) jsonElementN0);
            }
            throw j0.f(-1, "Expected " + tn.t.b(JsonObject.class).getSimpleName() + ", but had " + tn.t.b(jsonElementN0.getClass()).getSimpleName() + " as the serialized body of " + strH3 + " at element: " + j0(), jsonElementN0.toString());
        }
        if (!aVarD3.e().c()) {
            throw j0.d(serialDescriptorA);
        }
        xo.a aVarD5 = d();
        String strH4 = serialDescriptor.h();
        if (jsonElementN0 instanceof JsonArray) {
            return new w0(aVarD5, (JsonArray) jsonElementN0);
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonArray.class).getSimpleName() + ", but had " + tn.t.b(jsonElementN0.getClass()).getSimpleName() + " as the serialized body of " + strH4 + " at element: " + j0(), jsonElementN0.toString());
    }

    @Override // vo.c
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
    }

    @Override // xo.g
    @NotNull
    public xo.a d() {
        return this.f97907d;
    }

    @Override // wo.n1
    @NotNull
    public String f0(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "parentName");
        tn.p.k(str2, "childName");
        return str2;
    }

    @NotNull
    public abstract JsonElement m0(@NotNull String str);

    @NotNull
    public final JsonElement n0() {
        JsonElement jsonElementM0;
        String strZ = Z();
        return (strZ == null || (jsonElementM0 = m0(strZ)) == null) ? A0() : jsonElementM0;
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public boolean O(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (jsonElementM0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
            try {
                Boolean boolE = xo.i.e(jsonPrimitive);
                if (boolE != null) {
                    return boolE.booleanValue();
                }
                C0(jsonPrimitive, TypedValues.Custom.S_BOOLEAN, str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, TypedValues.Custom.S_BOOLEAN, str);
                throw new KotlinNothingValueException();
            }
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_BOOLEAN + " at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public byte P(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of byte at element: " + B0(str), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            long jL = xo.i.l(jsonPrimitive);
            boolean z10 = false;
            if (-128 <= jL && jL <= 127) {
                z10 = true;
            }
            Byte bValueOf = z10 ? Byte.valueOf((byte) jL) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            C0(jsonPrimitive, "byte", str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            C0(jsonPrimitive, "byte", str);
            throw new KotlinNothingValueException();
        }
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public char Q(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (jsonElementM0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
            try {
                return bo.f0.E1(jsonPrimitive.f());
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "char", str);
                throw new KotlinNothingValueException();
            }
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of char at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public double R(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (jsonElementM0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
            try {
                double dG = xo.i.g(jsonPrimitive);
                if (!d().e().b()) {
                    if (!(Math.abs(dG) <= Double.MAX_VALUE)) {
                        throw j0.a(Double.valueOf(dG), str, n0().toString());
                    }
                }
                return dG;
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "double", str);
                throw new KotlinNothingValueException();
            }
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of double at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public int S(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(str, "tag");
        tn.p.k(serialDescriptor, "enumDescriptor");
        xo.a aVarD = d();
        JsonElement jsonElementM0 = m0(str);
        String strH = serialDescriptor.h();
        if (jsonElementM0 instanceof JsonPrimitive) {
            return m0.l(serialDescriptor, aVarD, ((JsonPrimitive) jsonElementM0).f(), null, 4, null);
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // xo.g
    @NotNull
    public JsonElement t() {
        return n0();
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public float T(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (jsonElementM0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
            try {
                float fH = xo.i.h(jsonPrimitive);
                if (!d().e().b()) {
                    if (!(Math.abs(fH) <= Float.MAX_VALUE)) {
                        throw j0.a(Float.valueOf(fH), str, n0().toString());
                    }
                }
                return fH;
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, TypedValues.Custom.S_FLOAT, str);
                throw new KotlinNothingValueException();
            }
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_FLOAT + " at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // wo.z2
    @NotNull
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public Decoder U(@NotNull String str, @NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(str, "tag");
        tn.p.k(serialDescriptor, "inlineDescriptor");
        if (!g1.b(serialDescriptor)) {
            return super.U(str, serialDescriptor);
        }
        xo.a aVarD = d();
        JsonElement jsonElementM0 = m0(str);
        String strH = serialDescriptor.h();
        if (jsonElementM0 instanceof JsonPrimitive) {
            return new i0(i1.a(aVarD, ((JsonPrimitive) jsonElementM0).f()), d());
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public int V(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + ImpressionLog.f51753w + " at element: " + B0(str), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            long jL = xo.i.l(jsonPrimitive);
            boolean z10 = false;
            if (-2147483648L <= jL && jL <= 2147483647L) {
                z10 = true;
            }
            Integer numValueOf = z10 ? Integer.valueOf((int) jL) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            C0(jsonPrimitive, ImpressionLog.f51753w, str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            C0(jsonPrimitive, ImpressionLog.f51753w, str);
            throw new KotlinNothingValueException();
        }
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public long W(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (jsonElementM0 instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
            try {
                return xo.i.l(jsonPrimitive);
            } catch (IllegalArgumentException unused) {
                C0(jsonPrimitive, "long", str);
                throw new KotlinNothingValueException();
            }
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of long at element: " + B0(str), jsonElementM0.toString());
    }

    @Override // wo.z2, kotlinx.serialization.encoding.Decoder
    @NotNull
    public Decoder x(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        return Z() != null ? super.x(serialDescriptor) : new o0(d(), A0(), this.f97909f).x(serialDescriptor);
    }

    @Override // wo.z2
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public short X(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of short at element: " + B0(str), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        try {
            long jL = xo.i.l(jsonPrimitive);
            boolean z10 = false;
            if (-32768 <= jL && jL <= 32767) {
                z10 = true;
            }
            Short shValueOf = z10 ? Short.valueOf((short) jL) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            C0(jsonPrimitive, "short", str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            C0(jsonPrimitive, "short", str);
            throw new KotlinNothingValueException();
        }
    }

    @Override // wo.z2
    @NotNull
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public String Y(@NotNull String str) {
        tn.p.k(str, "tag");
        JsonElement jsonElementM0 = m0(str);
        if (!(jsonElementM0 instanceof JsonPrimitive)) {
            throw j0.f(-1, "Expected " + tn.t.b(JsonPrimitive.class).getSimpleName() + ", but had " + tn.t.b(jsonElementM0.getClass()).getSimpleName() + " as the serialized body of " + TypedValues.Custom.S_STRING + " at element: " + B0(str), jsonElementM0.toString());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementM0;
        if (!(jsonPrimitive instanceof xo.v)) {
            throw j0.f(-1, "Expected string value for a non-null key '" + str + "', got null literal instead at element: " + B0(str), n0().toString());
        }
        xo.v vVar = (xo.v) jsonPrimitive;
        if (vVar.h() || d().e().q()) {
            return vVar.f();
        }
        throw j0.f(-1, "String literal for key '" + str + "' should be quoted at element: " + B0(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", n0().toString());
    }

    @Nullable
    public final String z0() {
        return this.f97909f;
    }
}
