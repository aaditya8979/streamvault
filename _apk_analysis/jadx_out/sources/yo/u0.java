package yo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes4.dex */
public class u0 extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final JsonObject f97995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final SerialDescriptor f97996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f97997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97998k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@NotNull xo.a aVar, @NotNull JsonObject jsonObject, @Nullable String str, @Nullable SerialDescriptor serialDescriptor) {
        super(aVar, jsonObject, str, null);
        tn.p.k(aVar, "json");
        tn.p.k(jsonObject, "value");
        this.f97995h = jsonObject;
        this.f97996i = serialDescriptor;
    }

    public /* synthetic */ u0(xo.a aVar, JsonObject jsonObject, String str, SerialDescriptor serialDescriptor, int i10, tn.i iVar) {
        this(aVar, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : serialDescriptor);
    }

    @Nullable
    public final JsonElement D0(@NotNull String str) {
        tn.p.k(str, "tag");
        return (JsonElement) A0().get(str);
    }

    @Override // yo.c
    @NotNull
    /* JADX INFO: renamed from: E0 */
    public JsonObject A0() {
        return this.f97995h;
    }

    @Override // yo.c, kotlinx.serialization.encoding.Decoder
    public boolean F() {
        return !this.f97998k && super.F();
    }

    public final boolean F0(SerialDescriptor serialDescriptor, int i10) {
        boolean z10 = (d().e().j() || serialDescriptor.i(i10) || !serialDescriptor.d(i10).b()) ? false : true;
        this.f97998k = z10;
        return z10;
    }

    @Override // yo.c, kotlinx.serialization.encoding.Decoder
    @NotNull
    public vo.c b(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        if (serialDescriptor != this.f97996i) {
            return super.b(serialDescriptor);
        }
        xo.a aVarD = d();
        JsonElement jsonElementN0 = n0();
        String strH = this.f97996i.h();
        if (jsonElementN0 instanceof JsonObject) {
            return new u0(aVarD, (JsonObject) jsonElementN0, z0(), this.f97996i);
        }
        throw j0.f(-1, "Expected " + tn.t.b(JsonObject.class).getSimpleName() + ", but had " + tn.t.b(jsonElementN0.getClass()).getSimpleName() + " as the serialized body of " + strH + " at element: " + j0(), jsonElementN0.toString());
    }

    @Override // yo.c, vo.c
    public void c(@NotNull SerialDescriptor serialDescriptor) {
        Set<String> setM;
        tn.p.k(serialDescriptor, "descriptor");
        if (m0.n(serialDescriptor, d()) || (serialDescriptor.getKind() instanceof uo.d)) {
            return;
        }
        xo.y yVarO = m0.o(serialDescriptor, d());
        if (yVarO == null && !this.f97910g.o()) {
            setM = wo.w0.a(serialDescriptor);
        } else if (yVarO != null) {
            setM = m0.f(d(), serialDescriptor).keySet();
        } else {
            Set<String> setA = wo.w0.a(serialDescriptor);
            Map map = (Map) xo.e0.a(d()).a(serialDescriptor, m0.h());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = cn.w0.f();
            }
            setM = cn.x0.m(setA, setKeySet);
        }
        for (String str : A0().keySet()) {
            if (!setM.contains(str) && !tn.p.f(str, z0())) {
                throw j0.e(-1, "Encountered an unknown key '" + str + "' at element: " + j0() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) j0.j(A0().toString(), 0, 1, null)));
            }
        }
    }

    @Override // wo.n1
    @NotNull
    public String g0(@NotNull SerialDescriptor serialDescriptor, int i10) {
        Object next;
        tn.p.k(serialDescriptor, "descriptor");
        xo.y yVarO = m0.o(serialDescriptor, d());
        String strF = serialDescriptor.f(i10);
        if (yVarO == null && (!this.f97910g.o() || A0().keySet().contains(strF))) {
            return strF;
        }
        Map<String, Integer> mapF = m0.f(d(), serialDescriptor);
        Iterator<T> it = A0().keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Integer num = mapF.get((String) next);
            if (num != null && num.intValue() == i10) {
                break;
            }
        }
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strA = yVarO != null ? yVarO.a(serialDescriptor, i10, strF) : null;
        return strA == null ? strF : strA;
    }

    @Override // yo.c
    @NotNull
    public JsonElement m0(@NotNull String str) {
        tn.p.k(str, "tag");
        return (JsonElement) kotlin.collections.a.k(A0(), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00aa  */
    @Override // vo.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(@org.jetbrains.annotations.NotNull kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r9 = this;
            java.lang.String r0 = "descriptor"
            tn.p.k(r10, r0)
        L5:
            int r0 = r9.f97997j
            int r1 = r10.e()
            if (r0 >= r1) goto Lb0
            int r0 = r9.f97997j
            int r1 = r0 + 1
            r9.f97997j = r1
            java.lang.String r0 = r9.a0(r10, r0)
            int r1 = r9.f97997j
            r2 = 1
            int r1 = r1 - r2
            r3 = 0
            r9.f97998k = r3
            kotlinx.serialization.json.JsonObject r4 = r9.A0()
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2e
            boolean r4 = r9.F0(r10, r1)
            if (r4 == 0) goto L5
        L2e:
            xo.f r4 = r9.f97910g
            boolean r4 = r4.g()
            if (r4 != 0) goto L37
            return r1
        L37:
            xo.a r4 = r9.d()
            boolean r5 = r10.i(r1)
            kotlinx.serialization.descriptors.SerialDescriptor r6 = r10.d(r1)
            if (r5 == 0) goto L54
            boolean r7 = r6.b()
            if (r7 != 0) goto L54
            kotlinx.serialization.json.JsonElement r7 = r9.D0(r0)
            boolean r7 = r7 instanceof kotlinx.serialization.json.JsonNull
            if (r7 == 0) goto L54
            goto Lab
        L54:
            uo.k r7 = r6.getKind()
            uo.k$b r8 = uo.k.b.f85772a
            boolean r7 = tn.p.f(r7, r8)
            if (r7 == 0) goto Laa
            boolean r7 = r6.b()
            if (r7 == 0) goto L6f
            kotlinx.serialization.json.JsonElement r7 = r9.D0(r0)
            boolean r7 = r7 instanceof kotlinx.serialization.json.JsonNull
            if (r7 == 0) goto L6f
            goto Laa
        L6f:
            kotlinx.serialization.json.JsonElement r0 = r9.D0(r0)
            boolean r7 = r0 instanceof kotlinx.serialization.json.JsonPrimitive
            r8 = 0
            if (r7 == 0) goto L7b
            kotlinx.serialization.json.JsonPrimitive r0 = (kotlinx.serialization.json.JsonPrimitive) r0
            goto L7c
        L7b:
            r0 = r8
        L7c:
            if (r0 == 0) goto L82
            java.lang.String r8 = xo.i.f(r0)
        L82:
            if (r8 != 0) goto L85
            goto Laa
        L85:
            int r0 = yo.m0.j(r6, r4, r8)
            xo.f r4 = r4.e()
            boolean r4 = r4.j()
            if (r4 != 0) goto L9b
            boolean r4 = r6.b()
            if (r4 == 0) goto L9b
            r4 = r2
            goto L9c
        L9b:
            r4 = r3
        L9c:
            r6 = -3
            if (r0 != r6) goto Laa
            if (r5 != 0) goto La3
            if (r4 == 0) goto Laa
        La3:
            boolean r0 = r9.F0(r10, r1)
            if (r0 == 0) goto Lab
            return r1
        Laa:
            r2 = r3
        Lab:
            if (r2 == 0) goto Laf
            goto L5
        Laf:
            return r1
        Lb0:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.u0.w(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }
}
