package com.moloco.sdk.publisher.bidrequest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import tn.p;
import to.a;
import vo.c;
import vo.d;
import wo.g2;
import wo.l0;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
public /* synthetic */ class Geo$$serializer implements m0<Geo> {
    public static final int $stable;

    @NotNull
    public static final Geo$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Geo$$serializer geo$$serializer = new Geo$$serializer();
        INSTANCE = geo$$serializer;
        $stable = 8;
        g2 g2Var = new g2("com.moloco.sdk.publisher.bidrequest.Geo", geo$$serializer, 6);
        g2Var.n("city", false);
        g2Var.n("country", false);
        g2Var.n("region", false);
        g2Var.n(InneractiveMediationDefs.KEY_ZIPCODE, false);
        g2Var.n("latitude", false);
        g2Var.n("longitude", false);
        descriptor = g2Var;
    }

    private Geo$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public final KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        KSerializer<?> kSerializerT = a.t(w2Var);
        KSerializer<?> kSerializerT2 = a.t(w2Var);
        KSerializer<?> kSerializerT3 = a.t(w2Var);
        KSerializer<?> kSerializerT4 = a.t(w2Var);
        l0 l0Var = l0.f86565a;
        return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, kSerializerT4, a.t(l0Var), a.t(l0Var)};
    }

    @Override // so.c
    @NotNull
    public final Geo deserialize(@NotNull Decoder decoder) {
        Float f10;
        Float f11;
        String str;
        String str2;
        String str3;
        String str4;
        int i10;
        p.k(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        c cVarB = decoder.b(serialDescriptor);
        int i11 = 5;
        String str5 = null;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            String str6 = (String) cVarB.C(serialDescriptor, 0, w2Var, null);
            String str7 = (String) cVarB.C(serialDescriptor, 1, w2Var, null);
            String str8 = (String) cVarB.C(serialDescriptor, 2, w2Var, null);
            String str9 = (String) cVarB.C(serialDescriptor, 3, w2Var, null);
            l0 l0Var = l0.f86565a;
            Float f12 = (Float) cVarB.C(serialDescriptor, 4, l0Var, null);
            str = str9;
            f10 = (Float) cVarB.C(serialDescriptor, 5, l0Var, null);
            i10 = 63;
            f11 = f12;
            str2 = str8;
            str4 = str6;
            str3 = str7;
        } else {
            int i12 = 0;
            boolean z10 = true;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            Float f13 = null;
            Float f14 = null;
            while (z10) {
                int iW = cVarB.w(serialDescriptor);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str5 = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str5);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        str10 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str10);
                        i12 |= 2;
                        break;
                    case 2:
                        str11 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str11);
                        i12 |= 4;
                        break;
                    case 3:
                        str12 = (String) cVarB.C(serialDescriptor, 3, w2.f86635a, str12);
                        i12 |= 8;
                        break;
                    case 4:
                        f13 = (Float) cVarB.C(serialDescriptor, 4, l0.f86565a, f13);
                        i12 |= 16;
                        break;
                    case 5:
                        f14 = (Float) cVarB.C(serialDescriptor, i11, l0.f86565a, f14);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            f10 = f14;
            f11 = f13;
            str = str12;
            str2 = str11;
            str3 = str10;
            str4 = str5;
            i10 = i12;
        }
        cVarB.c(serialDescriptor);
        return new Geo(i10, str4, str3, str2, str, f11, f10, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public final void serialize(@NotNull Encoder encoder, @NotNull Geo geo) {
        p.k(encoder, "encoder");
        p.k(geo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d dVarB = encoder.b(serialDescriptor);
        Geo.write$Self$moloco_sdk_release(geo, dVarB, serialDescriptor);
        dVarB.c(serialDescriptor);
    }

    @Override // wo.m0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return super.typeParametersSerializers();
    }
}
