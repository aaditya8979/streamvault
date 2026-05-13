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
import wo.v0;

/* JADX INFO: compiled from: ConfigPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/ConfigPayload.LogMetricsSettings.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/ConfigPayload$LogMetricsSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class ConfigPayload$LogMetricsSettings$$serializer implements m0<ConfigPayload.LogMetricsSettings> {

    @NotNull
    public static final ConfigPayload$LogMetricsSettings$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        ConfigPayload$LogMetricsSettings$$serializer configPayload$LogMetricsSettings$$serializer = new ConfigPayload$LogMetricsSettings$$serializer();
        INSTANCE = configPayload$LogMetricsSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", configPayload$LogMetricsSettings$$serializer, 2);
        g2Var.n("error_log_level", true);
        g2Var.n("metrics_is_enabled", true);
        descriptor = g2Var;
    }

    private ConfigPayload$LogMetricsSettings$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.t(v0.f86626a), a.t(i.f86540a)};
    }

    @Override // so.c
    @NotNull
    public ConfigPayload.LogMetricsSettings deserialize(@NotNull Decoder decoder) {
        Object objC;
        Object objC2;
        int i10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            objC = cVarB.C(descriptor2, 0, v0.f86626a, null);
            objC2 = cVarB.C(descriptor2, 1, i.f86540a, null);
            i10 = 3;
        } else {
            objC = null;
            Object objC3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objC = cVarB.C(descriptor2, 0, v0.f86626a, objC);
                    i11 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    objC3 = cVarB.C(descriptor2, 1, i.f86540a, objC3);
                    i11 |= 2;
                }
            }
            objC2 = objC3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new ConfigPayload.LogMetricsSettings(i10, (Integer) objC, (Boolean) objC2, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull ConfigPayload.LogMetricsSettings logMetricsSettings) {
        p.k(encoder, "encoder");
        p.k(logMetricsSettings, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ConfigPayload.LogMetricsSettings.write$Self(logMetricsSettings, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
