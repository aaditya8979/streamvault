package com.vungle.ads.internal.model;

import com.ironsource.C3978d4;
import com.mbridge.msdk.MBridgeConstans;
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

/* JADX INFO: compiled from: CommonRequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/CommonRequestBody.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRequestBody$$serializer implements m0<CommonRequestBody> {

    @NotNull
    public static final CommonRequestBody$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        CommonRequestBody$$serializer commonRequestBody$$serializer = new CommonRequestBody$$serializer();
        INSTANCE = commonRequestBody$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.CommonRequestBody", commonRequestBody$$serializer, 5);
        g2Var.n(C3978d4.i.G, false);
        g2Var.n(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
        g2Var.n("user", true);
        g2Var.n("ext", true);
        g2Var.n(AdActivity.REQUEST_KEY_EXTRA, true);
        descriptor = g2Var;
    }

    private CommonRequestBody$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{DeviceNode$$serializer.INSTANCE, a.t(AppNode$$serializer.INSTANCE), a.t(CommonRequestBody$User$$serializer.INSTANCE), a.t(CommonRequestBody$RequestExt$$serializer.INSTANCE), a.t(CommonRequestBody$RequestParam$$serializer.INSTANCE)};
    }

    @Override // so.c
    @NotNull
    public CommonRequestBody deserialize(@NotNull Decoder decoder) {
        Object objI;
        int i10;
        Object objC;
        Object objC2;
        Object objC3;
        Object objC4;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            objI = cVarB.i(descriptor2, 0, DeviceNode$$serializer.INSTANCE, null);
            objC = cVarB.C(descriptor2, 1, AppNode$$serializer.INSTANCE, null);
            objC2 = cVarB.C(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, null);
            objC3 = cVarB.C(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, null);
            objC4 = cVarB.C(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, null);
            i10 = 31;
        } else {
            objI = null;
            Object objC5 = null;
            Object objC6 = null;
            Object objC7 = null;
            Object objC8 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objI = cVarB.i(descriptor2, 0, DeviceNode$$serializer.INSTANCE, objI);
                    i11 |= 1;
                } else if (iW == 1) {
                    objC5 = cVarB.C(descriptor2, 1, AppNode$$serializer.INSTANCE, objC5);
                    i11 |= 2;
                } else if (iW == 2) {
                    objC6 = cVarB.C(descriptor2, 2, CommonRequestBody$User$$serializer.INSTANCE, objC6);
                    i11 |= 4;
                } else if (iW == 3) {
                    objC7 = cVarB.C(descriptor2, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, objC7);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    objC8 = cVarB.C(descriptor2, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, objC8);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objC = objC5;
            objC2 = objC6;
            objC3 = objC7;
            objC4 = objC8;
        }
        cVarB.c(descriptor2);
        return new CommonRequestBody(i10, (DeviceNode) objI, (AppNode) objC, (CommonRequestBody.User) objC2, (CommonRequestBody.RequestExt) objC3, (CommonRequestBody.RequestParam) objC4, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull CommonRequestBody commonRequestBody) {
        p.k(encoder, "encoder");
        p.k(commonRequestBody, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CommonRequestBody.write$Self(commonRequestBody, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
