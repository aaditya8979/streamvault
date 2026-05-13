package com.vungle.ads.fpd;

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
import wo.l0;
import wo.m0;

/* JADX INFO: compiled from: Revenue.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/fpd/Revenue.$serializer", "Lwo/m0;", "Lcom/vungle/ads/fpd/Revenue;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Revenue$$serializer implements m0<Revenue> {

    @NotNull
    public static final Revenue$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Revenue$$serializer revenue$$serializer = new Revenue$$serializer();
        INSTANCE = revenue$$serializer;
        g2 g2Var = new g2("com.vungle.ads.fpd.Revenue", revenue$$serializer, 4);
        g2Var.n("iaa_revenue_usd", true);
        g2Var.n("iap_revenue_usd", true);
        g2Var.n("total_revenue_usd", true);
        g2Var.n("is_user_a_purchaser", true);
        descriptor = g2Var;
    }

    private Revenue$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        l0 l0Var = l0.f86565a;
        return new KSerializer[]{a.t(l0Var), a.t(l0Var), a.t(l0Var), a.t(i.f86540a)};
    }

    @Override // so.c
    @NotNull
    public Revenue deserialize(@NotNull Decoder decoder) {
        Object objC;
        Object objC2;
        Object objC3;
        int i10;
        Object objC4;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objC5 = null;
        if (cVarB.l()) {
            l0 l0Var = l0.f86565a;
            objC = cVarB.C(descriptor2, 0, l0Var, null);
            objC2 = cVarB.C(descriptor2, 1, l0Var, null);
            objC4 = cVarB.C(descriptor2, 2, l0Var, null);
            objC3 = cVarB.C(descriptor2, 3, i.f86540a, null);
            i10 = 15;
        } else {
            Object objC6 = null;
            Object objC7 = null;
            Object objC8 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objC5 = cVarB.C(descriptor2, 0, l0.f86565a, objC5);
                    i11 |= 1;
                } else if (iW == 1) {
                    objC6 = cVarB.C(descriptor2, 1, l0.f86565a, objC6);
                    i11 |= 2;
                } else if (iW == 2) {
                    objC7 = cVarB.C(descriptor2, 2, l0.f86565a, objC7);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    objC8 = cVarB.C(descriptor2, 3, i.f86540a, objC8);
                    i11 |= 8;
                }
            }
            objC = objC5;
            objC2 = objC6;
            objC3 = objC8;
            i10 = i11;
            objC4 = objC7;
        }
        cVarB.c(descriptor2);
        return new Revenue(i10, (Float) objC, (Float) objC2, (Float) objC4, (Boolean) objC3, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull Revenue revenue) {
        p.k(encoder, "encoder");
        p.k(revenue, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        Revenue.write$Self(revenue, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
