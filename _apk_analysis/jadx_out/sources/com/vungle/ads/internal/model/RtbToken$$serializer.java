package com.vungle.ads.internal.model;

import com.ironsource.C3978d4;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.ui.AdActivity;
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
import wo.v0;

/* JADX INFO: compiled from: RtbToken.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/RtbToken.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/RtbToken;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class RtbToken$$serializer implements m0<RtbToken> {

    @NotNull
    public static final RtbToken$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        RtbToken$$serializer rtbToken$$serializer = new RtbToken$$serializer();
        INSTANCE = rtbToken$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.RtbToken", rtbToken$$serializer, 5);
        g2Var.n(C3978d4.i.G, false);
        g2Var.n("user", true);
        g2Var.n("ext", true);
        g2Var.n(AdActivity.REQUEST_KEY_EXTRA, true);
        g2Var.n("ordinal_view", false);
        descriptor = g2Var;
    }

    private RtbToken$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DeviceNode$$serializer.INSTANCE, a.t(CommonRequestBody$User$$serializer.INSTANCE), a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), a.t(RtbRequest$$serializer.INSTANCE), v0.f86626a};
    }

    @Override // so.c
    @NotNull
    public RtbToken deserialize(@NotNull Decoder decoder) {
        Object objC;
        int i10;
        Object objC2;
        Object objC3;
        int iG;
        Object objI;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            objI = cVarB.i(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objC2 = cVarB.C(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, null);
            Object objC4 = cVarB.C(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objC3 = cVarB.C(descriptor2, 3, RtbRequest$$serializer.INSTANCE, null);
            iG = cVarB.g(descriptor2, 4);
            objC = objC4;
            i10 = 31;
        } else {
            Object objI2 = null;
            Object objC5 = null;
            objC = null;
            Object objC6 = null;
            int iG2 = 0;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objI2 = cVarB.i(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objI2);
                    i11 |= 1;
                } else if (iW == 1) {
                    objC5 = cVarB.C(descriptor2, 1, CommonRequestBody$User$$serializer.INSTANCE, objC5);
                    i11 |= 2;
                } else if (iW == 2) {
                    objC = cVarB.C(descriptor2, 2, CommonRequestBody$RequestExt$$serializer.INSTANCE, objC);
                    i11 |= 4;
                } else if (iW == 3) {
                    objC6 = cVarB.C(descriptor2, 3, RtbRequest$$serializer.INSTANCE, objC6);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    iG2 = cVarB.g(descriptor2, 4);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objC2 = objC5;
            objC3 = objC6;
            iG = iG2;
            objI = objI2;
        }
        cVarB.c(descriptor2);
        return new RtbToken(i10, (DeviceNode) objI, (CommonRequestBody.User) objC2, (CommonRequestBody.RequestExt) objC, (RtbRequest) objC3, iG, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull RtbToken rtbToken) {
        p.k(encoder, "encoder");
        p.k(rtbToken, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        RtbToken.write$Self(rtbToken, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
