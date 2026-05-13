package com.vungle.ads.fpd;

import java.util.Map;
import kotlin.Metadata;
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
import wo.a1;
import wo.g2;
import wo.m0;
import wo.w2;

/* JADX INFO: compiled from: FirstPartyData.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/FirstPartyData.$serializer", "Lwo/m0;", "Lcom/vungle/ads/fpd/FirstPartyData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FirstPartyData$$serializer implements m0<FirstPartyData> {

    @NotNull
    public static final FirstPartyData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FirstPartyData$$serializer firstPartyData$$serializer = new FirstPartyData$$serializer();
        INSTANCE = firstPartyData$$serializer;
        g2 g2Var = new g2("com.vungle.ads.fpd.FirstPartyData", firstPartyData$$serializer, 6);
        g2Var.n("model_version", true);
        g2Var.n("session_context", true);
        g2Var.n("demographic", true);
        g2Var.n("location", true);
        g2Var.n("revenue", true);
        g2Var.n("custom_data", true);
        descriptor = g2Var;
    }

    private FirstPartyData$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, a.t(SessionContext$$serializer.INSTANCE), a.t(Demographic$$serializer.INSTANCE), a.t(Location$$serializer.INSTANCE), a.t(Revenue$$serializer.INSTANCE), a.t(new a1(w2Var, w2Var))};
    }

    @Override // so.c
    @NotNull
    public FirstPartyData deserialize(@NotNull Decoder decoder) {
        Object objC;
        Object objC2;
        Object objC3;
        Object objC4;
        Object objC5;
        String str;
        int i10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strK = null;
        if (cVarB.l()) {
            String strK2 = cVarB.k(descriptor2, 0);
            objC = cVarB.C(descriptor2, 1, SessionContext$$serializer.INSTANCE, null);
            objC2 = cVarB.C(descriptor2, 2, Demographic$$serializer.INSTANCE, null);
            objC3 = cVarB.C(descriptor2, 3, Location$$serializer.INSTANCE, null);
            objC4 = cVarB.C(descriptor2, 4, Revenue$$serializer.INSTANCE, null);
            w2 w2Var = w2.f86635a;
            objC5 = cVarB.C(descriptor2, 5, new a1(w2Var, w2Var), null);
            str = strK2;
            i10 = 63;
        } else {
            int i11 = 0;
            boolean z10 = true;
            Object objC6 = null;
            Object objC7 = null;
            Object objC8 = null;
            Object objC9 = null;
            Object objC10 = null;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strK = cVarB.k(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        objC6 = cVarB.C(descriptor2, 1, SessionContext$$serializer.INSTANCE, objC6);
                        i11 |= 2;
                        continue;
                    case 2:
                        objC7 = cVarB.C(descriptor2, 2, Demographic$$serializer.INSTANCE, objC7);
                        i11 |= 4;
                        break;
                    case 3:
                        objC8 = cVarB.C(descriptor2, 3, Location$$serializer.INSTANCE, objC8);
                        i11 |= 8;
                        break;
                    case 4:
                        objC9 = cVarB.C(descriptor2, 4, Revenue$$serializer.INSTANCE, objC9);
                        i11 |= 16;
                        break;
                    case 5:
                        w2 w2Var2 = w2.f86635a;
                        objC10 = cVarB.C(descriptor2, 5, new a1(w2Var2, w2Var2), objC10);
                        i11 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            objC = objC6;
            objC2 = objC7;
            objC3 = objC8;
            objC4 = objC9;
            objC5 = objC10;
            str = strK;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new FirstPartyData(i10, str, (SessionContext) objC, (Demographic) objC2, (Location) objC3, (Revenue) objC4, (Map) objC5, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull FirstPartyData firstPartyData) {
        p.k(encoder, "encoder");
        p.k(firstPartyData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        FirstPartyData.write$Self(firstPartyData, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
