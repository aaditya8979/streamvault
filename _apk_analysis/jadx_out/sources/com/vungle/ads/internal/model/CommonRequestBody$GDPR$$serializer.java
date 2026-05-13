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
import wo.g1;
import wo.g2;
import wo.m0;
import wo.w2;

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.GDPR.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$GDPR;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$GDPR$$serializer implements m0<CommonRequestBody.GDPR> {

    @NotNull
    public static final CommonRequestBody$GDPR$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$GDPR$$serializer commonRequestBody$GDPR$$serializer = new CommonRequestBody$GDPR$$serializer();
        INSTANCE = commonRequestBody$GDPR$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.GDPR", commonRequestBody$GDPR$$serializer, 4);
        g2Var.n("consent_status", false);
        g2Var.n("consent_source", false);
        g2Var.n("consent_timestamp", false);
        g2Var.n("consent_message_version", false);
        descriptor = g2Var;
    }

    private CommonRequestBody$GDPR$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, w2Var, g1.f86515a, w2Var};
    }

    @Override // so.c
    @NotNull
    public CommonRequestBody.GDPR deserialize(@NotNull Decoder decoder) {
        String str;
        String strK;
        int i10;
        String str2;
        long j10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            String strK2 = cVarB.k(descriptor2, 0);
            String strK3 = cVarB.k(descriptor2, 1);
            long jF = cVarB.f(descriptor2, 2);
            str = strK2;
            strK = cVarB.k(descriptor2, 3);
            i10 = 15;
            str2 = strK3;
            j10 = jF;
        } else {
            String strK4 = null;
            String strK5 = null;
            boolean z10 = true;
            long jF2 = 0;
            String strK6 = null;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK4 = cVarB.k(descriptor2, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK5 = cVarB.k(descriptor2, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    jF2 = cVarB.f(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    strK6 = cVarB.k(descriptor2, 3);
                    i11 |= 8;
                }
            }
            str = strK4;
            strK = strK6;
            i10 = i11;
            str2 = strK5;
            j10 = jF2;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.GDPR(i10, str, str2, j10, strK, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody.GDPR gdpr) {
        p.k(encoder, "encoder");
        p.k(gdpr, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CommonRequestBody.GDPR.write$Self(gdpr, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
