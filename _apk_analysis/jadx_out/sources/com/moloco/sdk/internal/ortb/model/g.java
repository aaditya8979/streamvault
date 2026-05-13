package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.B;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import wo.c2;
import wo.g2;
import wo.m0;
import wo.r2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class g {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f46349b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46350c = {new wo.f(B.a.f46278a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<B> f46351a;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46354c;

        static {
            a aVar = new a();
            f46352a = aVar;
            f46354c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.BidResponse", aVar, 1);
            g2Var.n("seatbid", false);
            f46353b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g deserialize(@NotNull Decoder decoder) {
            List list;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46353b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = g.f46350c;
            r2 r2Var = null;
            int i10 = 1;
            if (cVarB.l()) {
                list = (List) cVarB.i(serialDescriptor, 0, kSerializerArr[0], null);
            } else {
                List list2 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else {
                        if (iW != 0) {
                            throw new UnknownFieldException(iW);
                        }
                        list2 = (List) cVarB.i(serialDescriptor, 0, kSerializerArr[0], list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new g(i10, list, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull g gVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(gVar, "value");
            SerialDescriptor serialDescriptor = f46353b;
            vo.d dVarB = encoder.b(serialDescriptor);
            g.a(gVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{g.f46350c[0]};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46353b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<g> serializer() {
            return a.f46352a;
        }
    }

    public /* synthetic */ g(int i10, List list, r2 r2Var) {
        if (1 != (i10 & 1)) {
            c2.a(i10, 1, a.f46352a.getDescriptor());
        }
        this.f46351a = list;
    }

    public g(@NotNull List<B> list) {
        tn.p.k(list, "seatBid");
        this.f46351a = list;
    }

    public static final /* synthetic */ void a(g gVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        dVar.g(serialDescriptor, 0, f46350c[0], gVar.f46351a);
    }

    @NotNull
    public final List<B> c() {
        return this.f46351a;
    }
}
