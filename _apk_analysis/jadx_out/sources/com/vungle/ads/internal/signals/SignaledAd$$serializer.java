package com.vungle.ads.internal.signals;

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
import wo.g1;
import wo.g2;
import wo.m0;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: SignaledAd.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/signals/SignaledAd.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/signals/SignaledAd;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SignaledAd$$serializer implements m0<SignaledAd> {

    @NotNull
    public static final SignaledAd$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SignaledAd$$serializer signaledAd$$serializer = new SignaledAd$$serializer();
        INSTANCE = signaledAd$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.signals.SignaledAd", signaledAd$$serializer, 5);
        g2Var.n("500", true);
        g2Var.n("109", false);
        g2Var.n("107", true);
        g2Var.n("110", true);
        g2Var.n("108", true);
        descriptor = g2Var;
    }

    private SignaledAd$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        g1 g1Var = g1.f86515a;
        return new KSerializer[]{a.t(w2Var), g1Var, a.t(w2Var), g1Var, v0.f86626a};
    }

    @Override // so.c
    @NotNull
    public SignaledAd deserialize(@NotNull Decoder decoder) {
        long jF;
        Object objC;
        int iG;
        int i10;
        long j10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Object objC2 = null;
        int i11 = 3;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            Object objC3 = cVarB.C(descriptor2, 0, w2Var, null);
            long jF2 = cVarB.f(descriptor2, 1);
            objC = cVarB.C(descriptor2, 2, w2Var, null);
            long jF3 = cVarB.f(descriptor2, 3);
            iG = cVarB.g(descriptor2, 4);
            i10 = 31;
            objC2 = objC3;
            j10 = jF2;
            jF = jF3;
        } else {
            jF = 0;
            objC = null;
            iG = 0;
            int i12 = 0;
            boolean z10 = true;
            long jF4 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    objC2 = cVarB.C(descriptor2, 0, w2.f86635a, objC2);
                    i12 |= 1;
                } else if (iW == 1) {
                    jF4 = cVarB.f(descriptor2, 1);
                    i12 |= 2;
                } else if (iW == 2) {
                    objC = cVarB.C(descriptor2, 2, w2.f86635a, objC);
                    i12 |= 4;
                } else if (iW == i11) {
                    jF = cVarB.f(descriptor2, i11);
                    i12 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    iG = cVarB.g(descriptor2, 4);
                    i12 |= 16;
                }
                i11 = 3;
            }
            i10 = i12;
            j10 = jF4;
        }
        cVarB.c(descriptor2);
        return new SignaledAd(i10, (String) objC2, j10, (String) objC, jF, iG, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull SignaledAd signaledAd) {
        p.k(encoder, "encoder");
        p.k(signaledAd, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        SignaledAd.write$Self(signaledAd, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
