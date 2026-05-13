package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.CommonRequestBody;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import tn.p;
import vo.c;
import vo.d;
import wo.g2;
import wo.m0;
import wo.v0;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.AdSizeParam.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$AdSizeParam;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$AdSizeParam$$serializer implements m0<CommonRequestBody.AdSizeParam> {

    @NotNull
    public static final CommonRequestBody$AdSizeParam$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$AdSizeParam$$serializer commonRequestBody$AdSizeParam$$serializer = new CommonRequestBody$AdSizeParam$$serializer();
        INSTANCE = commonRequestBody$AdSizeParam$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", commonRequestBody$AdSizeParam$$serializer, 2);
        g2Var.n("w", false);
        g2Var.n("h", false);
        descriptor = g2Var;
    }

    private CommonRequestBody$AdSizeParam$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        v0 v0Var = v0.f86626a;
        return new KSerializer[]{v0Var, v0Var};
    }

    @Override // so.c
    @NotNull
    public CommonRequestBody.AdSizeParam deserialize(@NotNull Decoder decoder) {
        int iG;
        int iG2;
        int i10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            iG = cVarB.g(descriptor2, 0);
            iG2 = cVarB.g(descriptor2, 1);
            i10 = 3;
        } else {
            boolean z10 = true;
            iG = 0;
            int iG3 = 0;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    iG = cVarB.g(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    iG3 = cVarB.g(descriptor2, 1);
                    i11 |= 2;
                }
            }
            iG2 = iG3;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.AdSizeParam(i10, iG, iG2, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody.AdSizeParam adSizeParam) {
        p.k(encoder, "encoder");
        p.k(adSizeParam, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CommonRequestBody.AdSizeParam.write$Self(adSizeParam, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
