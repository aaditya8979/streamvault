package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.s;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.v0;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class o {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f46403c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46404d = {null, new wo.f(s.a.f46434a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f46405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final List<s> f46406b;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46409c;

        static {
            a aVar = new a();
            f46407a = aVar;
            f46409c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DECBorderSerializable", aVar, 2);
            g2Var.n("border_width", true);
            g2Var.n("gradient", true);
            f46408b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o deserialize(@NotNull Decoder decoder) {
            List list;
            Integer num;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46408b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = o.f46404d;
            r2 r2Var = null;
            if (cVarB.l()) {
                num = (Integer) cVarB.C(serialDescriptor, 0, v0.f86626a, null);
                list = (List) cVarB.C(serialDescriptor, 1, kSerializerArr[1], null);
                i10 = 3;
            } else {
                List list2 = null;
                Integer num2 = null;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        num2 = (Integer) cVarB.C(serialDescriptor, 0, v0.f86626a, num2);
                        i11 |= 1;
                    } else {
                        if (iW != 1) {
                            throw new UnknownFieldException(iW);
                        }
                        list2 = (List) cVarB.C(serialDescriptor, 1, kSerializerArr[1], list2);
                        i11 |= 2;
                    }
                }
                list = list2;
                num = num2;
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new o(i10, num, list, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull o oVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(oVar, "value");
            SerialDescriptor serialDescriptor = f46408b;
            vo.d dVarB = encoder.b(serialDescriptor);
            o.a(oVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(v0.f86626a), to.a.t(o.f46404d[1])};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46408b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<o> serializer() {
            return a.f46407a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this((Integer) null, (List) (0 == true ? 1 : 0), 3, (tn.i) (0 == true ? 1 : 0));
    }

    public /* synthetic */ o(int i10, Integer num, List list, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46405a = null;
        } else {
            this.f46405a = num;
        }
        if ((i10 & 2) == 0) {
            this.f46406b = null;
        } else {
            this.f46406b = list;
        }
    }

    public o(@Nullable Integer num, @Nullable List<s> list) {
        this.f46405a = num;
        this.f46406b = list;
    }

    public /* synthetic */ o(Integer num, List list, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : list);
    }

    public static final /* synthetic */ void a(o oVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46404d;
        if (dVar.r(serialDescriptor, 0) || oVar.f46405a != null) {
            dVar.f(serialDescriptor, 0, v0.f86626a, oVar.f46405a);
        }
        if (!dVar.r(serialDescriptor, 1) && oVar.f46406b == null) {
            return;
        }
        dVar.f(serialDescriptor, 1, kSerializerArr[1], oVar.f46406b);
    }

    @Nullable
    public final Integer c() {
        return this.f46405a;
    }

    @Nullable
    public final List<s> d() {
        return this.f46406b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return tn.p.f(this.f46405a, oVar.f46405a) && tn.p.f(this.f46406b, oVar.f46406b);
    }

    public int hashCode() {
        Integer num = this.f46405a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<s> list = this.f46406b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECBorderSerializable(borderWidth=" + this.f46405a + ", gradient=" + this.f46406b + ')';
    }
}
