package com.vungle.ads.internal.model;

import com.mbridge.msdk.foundation.entity.b;
import com.vungle.ads.internal.model.ConfigPayload;
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
import wo.g2;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.Endpoints.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$Endpoints$$serializer implements m0<ConfigPayload.Endpoints> {

    @NotNull
    public static final ConfigPayload$Endpoints$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$Endpoints$$serializer configPayload$Endpoints$$serializer = new ConfigPayload$Endpoints$$serializer();
        INSTANCE = configPayload$Endpoints$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.Endpoints", configPayload$Endpoints$$serializer, 4);
        g2Var.n(b.JSON_KEY_ADS, true);
        g2Var.n("ri", true);
        g2Var.n("error_logs", true);
        g2Var.n("metrics", true);
        descriptor = g2Var;
    }

    private ConfigPayload$Endpoints$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{a.t(w2Var), a.t(w2Var), a.t(w2Var), a.t(w2Var)};
    }

    @Override // so.c
    @NotNull
    public ConfigPayload.Endpoints deserialize(@NotNull Decoder decoder) {
        Object objC;
        int i10;
        Object objC2;
        Object objC3;
        Object objC4;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objC5 = null;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            objC2 = cVarB.C(descriptor2, 0, w2Var, null);
            objC3 = cVarB.C(descriptor2, 1, w2Var, null);
            Object objC6 = cVarB.C(descriptor2, 2, w2Var, null);
            objC4 = cVarB.C(descriptor2, 3, w2Var, null);
            objC = objC6;
            i10 = 15;
        } else {
            Object objC7 = null;
            objC = null;
            Object objC8 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objC5 = cVarB.C(descriptor2, 0, w2.f86635a, objC5);
                    i11 |= 1;
                } else if (iW == 1) {
                    objC7 = cVarB.C(descriptor2, 1, w2.f86635a, objC7);
                    i11 |= 2;
                } else if (iW == 2) {
                    objC = cVarB.C(descriptor2, 2, w2.f86635a, objC);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    objC8 = cVarB.C(descriptor2, 3, w2.f86635a, objC8);
                    i11 |= 8;
                }
            }
            i10 = i11;
            objC2 = objC5;
            objC3 = objC7;
            objC4 = objC8;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.Endpoints(i10, (String) objC2, (String) objC3, (String) objC, (String) objC4, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload.Endpoints endpoints) {
        p.k(encoder, "encoder");
        p.k(endpoints, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ConfigPayload.Endpoints.write$Self(endpoints, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
