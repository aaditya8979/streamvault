package com.vungle.ads.internal.model;

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
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/Placement.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/Placement;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class Placement$$serializer implements m0<Placement> {

    @NotNull
    public static final Placement$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        Placement$$serializer placement$$serializer = new Placement$$serializer();
        INSTANCE = placement$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.Placement", placement$$serializer, 3);
        g2Var.n("placement_ref_id", false);
        g2Var.n("is_hb", true);
        g2Var.n("type", true);
        descriptor = g2Var;
    }

    private Placement$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, i.f86540a, a.t(w2Var)};
    }

    @Override // so.c
    @NotNull
    public Placement deserialize(@NotNull Decoder decoder) {
        String str;
        int i10;
        boolean z10;
        Object objC;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        String strK = null;
        if (cVarB.l()) {
            String strK2 = cVarB.k(descriptor2, 0);
            boolean zE = cVarB.E(descriptor2, 1);
            objC = cVarB.C(descriptor2, 2, w2.f86635a, null);
            str = strK2;
            i10 = 7;
            z10 = zE;
        } else {
            Object objC2 = null;
            int i11 = 0;
            boolean zE2 = false;
            boolean z11 = true;
            while (z11) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z11 = false;
                } else if (iW == 0) {
                    strK = cVarB.k(descriptor2, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    zE2 = cVarB.E(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    objC2 = cVarB.C(descriptor2, 2, w2.f86635a, objC2);
                    i11 |= 4;
                }
            }
            str = strK;
            i10 = i11;
            z10 = zE2;
            objC = objC2;
        }
        cVarB.c(descriptor2);
        return new Placement(i10, str, z10, (String) objC, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull Placement placement) {
        p.k(encoder, "encoder");
        p.k(placement, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        Placement.write$Self(placement, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
