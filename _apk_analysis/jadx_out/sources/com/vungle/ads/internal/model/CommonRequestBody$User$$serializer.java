package com.vungle.ads.internal.model;

import com.inmobi.sdk.InMobiSdk;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import com.vungle.ads.internal.model.CommonRequestBody;
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

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.User.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$User$$serializer implements m0<CommonRequestBody.User> {

    @NotNull
    public static final CommonRequestBody$User$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$User$$serializer commonRequestBody$User$$serializer = new CommonRequestBody$User$$serializer();
        INSTANCE = commonRequestBody$User$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody.User", commonRequestBody$User$$serializer, 5);
        g2Var.n(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, true);
        g2Var.n("ccpa", true);
        g2Var.n("coppa", true);
        g2Var.n("fpd", true);
        g2Var.n("iab", true);
        descriptor = g2Var;
    }

    private CommonRequestBody$User$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.t(CommonRequestBody$GDPR$$serializer.INSTANCE), a.t(CommonRequestBody$CCPA$$serializer.INSTANCE), a.t(CommonRequestBody$COPPA$$serializer.INSTANCE), a.t(FirstPartyData$$serializer.INSTANCE), a.t(CommonRequestBody$IAB$$serializer.INSTANCE)};
    }

    @Override // so.c
    @NotNull
    public CommonRequestBody.User deserialize(@NotNull Decoder decoder) {
        Object objC;
        int i10;
        Object objC2;
        Object objC3;
        Object objC4;
        Object objC5;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            objC = cVarB.C(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, null);
            objC2 = cVarB.C(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, null);
            objC3 = cVarB.C(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, null);
            objC4 = cVarB.C(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, null);
            objC5 = cVarB.C(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            objC = null;
            Object objC6 = null;
            Object objC7 = null;
            Object objC8 = null;
            Object objC9 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objC = cVarB.C(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, objC);
                    i11 |= 1;
                } else if (iW == 1) {
                    objC6 = cVarB.C(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, objC6);
                    i11 |= 2;
                } else if (iW == 2) {
                    objC7 = cVarB.C(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, objC7);
                    i11 |= 4;
                } else if (iW == 3) {
                    objC8 = cVarB.C(descriptor2, 3, FirstPartyData$$serializer.INSTANCE, objC8);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    objC9 = cVarB.C(descriptor2, 4, CommonRequestBody$IAB$$serializer.INSTANCE, objC9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objC2 = objC6;
            objC3 = objC7;
            objC4 = objC8;
            objC5 = objC9;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody.User(i10, (CommonRequestBody.GDPR) objC, (CommonRequestBody.CCPA) objC2, (CommonRequestBody.COPPA) objC3, (FirstPartyData) objC4, (CommonRequestBody.IAB) objC5, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody.User user) {
        p.k(encoder, "encoder");
        p.k(user, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CommonRequestBody.User.write$Self(user, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
