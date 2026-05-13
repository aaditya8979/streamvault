package com.vungle.ads.internal.model;

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
import wo.i;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.GDPRSettings.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/ConfigPayload$GDPRSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$GDPRSettings$$serializer implements m0<ConfigPayload.GDPRSettings> {

    @NotNull
    public static final ConfigPayload$GDPRSettings$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$GDPRSettings$$serializer configPayload$GDPRSettings$$serializer = new ConfigPayload$GDPRSettings$$serializer();
        INSTANCE = configPayload$GDPRSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", configPayload$GDPRSettings$$serializer, 6);
        g2Var.n("is_country_data_protected", true);
        g2Var.n("consent_title", true);
        g2Var.n("consent_message", true);
        g2Var.n("consent_message_version", true);
        g2Var.n("button_accept", true);
        g2Var.n("button_deny", true);
        descriptor = g2Var;
    }

    private ConfigPayload$GDPRSettings$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{a.t(i.f86540a), a.t(w2Var), a.t(w2Var), a.t(w2Var), a.t(w2Var), a.t(w2Var)};
    }

    @Override // so.c
    @NotNull
    public ConfigPayload.GDPRSettings deserialize(@NotNull Decoder decoder) {
        Object objC;
        int i10;
        Object objC2;
        Object objC3;
        Object objC4;
        Object objC5;
        Object objC6;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 5;
        Object objC7 = null;
        if (cVarB.l()) {
            objC2 = cVarB.C(descriptor2, 0, i.f86540a, null);
            w2 w2Var = w2.f86635a;
            Object objC8 = cVarB.C(descriptor2, 1, w2Var, null);
            objC3 = cVarB.C(descriptor2, 2, w2Var, null);
            objC4 = cVarB.C(descriptor2, 3, w2Var, null);
            objC5 = cVarB.C(descriptor2, 4, w2Var, null);
            objC6 = cVarB.C(descriptor2, 5, w2Var, null);
            objC = objC8;
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            objC = null;
            Object objC9 = null;
            Object objC10 = null;
            Object objC11 = null;
            Object objC12 = null;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        objC7 = cVarB.C(descriptor2, 0, i.f86540a, objC7);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        objC = cVarB.C(descriptor2, 1, w2.f86635a, objC);
                        i12 |= 2;
                        break;
                    case 2:
                        objC9 = cVarB.C(descriptor2, 2, w2.f86635a, objC9);
                        i12 |= 4;
                        break;
                    case 3:
                        objC10 = cVarB.C(descriptor2, 3, w2.f86635a, objC10);
                        i12 |= 8;
                        break;
                    case 4:
                        objC11 = cVarB.C(descriptor2, 4, w2.f86635a, objC11);
                        i12 |= 16;
                        break;
                    case 5:
                        objC12 = cVarB.C(descriptor2, i11, w2.f86635a, objC12);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = i12;
            objC2 = objC7;
            objC3 = objC9;
            objC4 = objC10;
            objC5 = objC11;
            objC6 = objC12;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.GDPRSettings(i10, (Boolean) objC2, (String) objC, (String) objC3, (String) objC4, (String) objC5, (String) objC6, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload.GDPRSettings gDPRSettings) {
        p.k(encoder, "encoder");
        p.k(gDPRSettings, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ConfigPayload.GDPRSettings.write$Self(gDPRSettings, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
