package com.vungle.ads.internal.model;

import java.util.List;
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
import wo.f;
import wo.g2;
import wo.m0;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: BidPayload.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/BidPayload.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/BidPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class BidPayload$$serializer implements m0<BidPayload> {

    @NotNull
    public static final BidPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        BidPayload$$serializer bidPayload$$serializer = new BidPayload$$serializer();
        INSTANCE = bidPayload$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.BidPayload", bidPayload$$serializer, 4);
        g2Var.n("version", true);
        g2Var.n("adunit", true);
        g2Var.n("impression", true);
        g2Var.n("ad", true);
        descriptor = g2Var;
    }

    private BidPayload$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{a.t(v0.f86626a), a.t(w2Var), a.t(new f(w2Var)), a.t(AdPayload$$serializer.INSTANCE)};
    }

    @Override // so.c
    @NotNull
    public BidPayload deserialize(@NotNull Decoder decoder) {
        Object objC;
        int i10;
        Object objC2;
        Object objC3;
        Object objC4;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            objC = cVarB.C(descriptor2, 0, v0.f86626a, null);
            w2 w2Var = w2.f86635a;
            objC2 = cVarB.C(descriptor2, 1, w2Var, null);
            objC3 = cVarB.C(descriptor2, 2, new f(w2Var), null);
            objC4 = cVarB.C(descriptor2, 3, AdPayload$$serializer.INSTANCE, null);
            i10 = 15;
        } else {
            objC = null;
            Object objC5 = null;
            Object objC6 = null;
            Object objC7 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objC = cVarB.C(descriptor2, 0, v0.f86626a, objC);
                    i11 |= 1;
                } else if (iW == 1) {
                    objC5 = cVarB.C(descriptor2, 1, w2.f86635a, objC5);
                    i11 |= 2;
                } else if (iW == 2) {
                    objC6 = cVarB.C(descriptor2, 2, new f(w2.f86635a), objC6);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    objC7 = cVarB.C(descriptor2, 3, AdPayload$$serializer.INSTANCE, objC7);
                    i11 |= 8;
                }
            }
            i10 = i11;
            objC2 = objC5;
            objC3 = objC6;
            objC4 = objC7;
        }
        cVarB.c(descriptor2);
        return new BidPayload(i10, (Integer) objC, (String) objC2, (List) objC3, (AdPayload) objC4, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull BidPayload bidPayload) {
        p.k(encoder, "encoder");
        p.k(bidPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        BidPayload.write$Self(bidPayload, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
