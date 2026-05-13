package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.AdPayload;
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
import wo.r2;
import wo.w2;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/AdPayload.TemplateSettings.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/AdPayload$TemplateSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AdPayload$TemplateSettings$$serializer implements m0<AdPayload.TemplateSettings> {

    @NotNull
    public static final AdPayload$TemplateSettings$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$TemplateSettings$$serializer adPayload$TemplateSettings$$serializer = new AdPayload$TemplateSettings$$serializer();
        INSTANCE = adPayload$TemplateSettings$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload.TemplateSettings", adPayload$TemplateSettings$$serializer, 2);
        g2Var.n("normal_replacements", true);
        g2Var.n("cacheable_replacements", true);
        descriptor = g2Var;
    }

    private AdPayload$TemplateSettings$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{a.t(new a1(w2Var, w2Var)), a.t(new a1(w2Var, AdPayload$CacheableReplacement$$serializer.INSTANCE))};
    }

    @Override // so.c
    @NotNull
    public AdPayload.TemplateSettings deserialize(@NotNull Decoder decoder) {
        Object objC;
        Object objC2;
        int i10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            objC = cVarB.C(descriptor2, 0, new a1(w2Var, w2Var), null);
            objC2 = cVarB.C(descriptor2, 1, new a1(w2Var, AdPayload$CacheableReplacement$$serializer.INSTANCE), null);
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
                    w2 w2Var2 = w2.f86635a;
                    objC = cVarB.C(descriptor2, 0, new a1(w2Var2, w2Var2), objC);
                    i11 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    objC3 = cVarB.C(descriptor2, 1, new a1(w2.f86635a, AdPayload$CacheableReplacement$$serializer.INSTANCE), objC3);
                    i11 |= 2;
                }
            }
            objC2 = objC3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new AdPayload.TemplateSettings(i10, (Map) objC, (Map) objC2, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull AdPayload.TemplateSettings templateSettings) {
        p.k(encoder, "encoder");
        p.k(templateSettings, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        AdPayload.TemplateSettings.write$Self(templateSettings, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
