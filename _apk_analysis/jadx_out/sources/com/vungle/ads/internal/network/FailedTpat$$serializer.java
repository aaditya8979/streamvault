package com.vungle.ads.internal.network;

import java.util.Map;
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
import wo.a1;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: TpatSender.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/network/FailedTpat.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/network/FailedTpat;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class FailedTpat$$serializer implements m0<FailedTpat> {

    @NotNull
    public static final FailedTpat$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        FailedTpat$$serializer failedTpat$$serializer = new FailedTpat$$serializer();
        INSTANCE = failedTpat$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.network.FailedTpat", failedTpat$$serializer, 6);
        g2Var.n("method", true);
        g2Var.n("headers", true);
        g2Var.n("body", true);
        g2Var.n("retryAttempt", true);
        g2Var.n("retryCount", false);
        g2Var.n("tpatKey", true);
        descriptor = g2Var;
    }

    private FailedTpat$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        w2 w2Var = w2.f86635a;
        v0 v0Var = v0.f86626a;
        return new KSerializer[]{HttpMethod$$serializer.INSTANCE, to.a.t(new a1(w2Var, w2Var)), to.a.t(w2Var), v0Var, v0Var, to.a.t(w2Var)};
    }

    @Override // so.c
    @NotNull
    public FailedTpat deserialize(@NotNull Decoder decoder) {
        int i10;
        int i11;
        Object objI;
        Object objC;
        Object objC2;
        Object objC3;
        int i12;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i13 = 5;
        if (cVarB.l()) {
            objI = cVarB.i(descriptor2, 0, HttpMethod$$serializer.INSTANCE, null);
            w2 w2Var = w2.f86635a;
            objC = cVarB.C(descriptor2, 1, new a1(w2Var, w2Var), null);
            objC2 = cVarB.C(descriptor2, 2, w2Var, null);
            int iG = cVarB.g(descriptor2, 3);
            int iG2 = cVarB.g(descriptor2, 4);
            objC3 = cVarB.C(descriptor2, 5, w2Var, null);
            i10 = iG;
            i12 = iG2;
            i11 = 63;
        } else {
            Object objI2 = null;
            Object objC4 = null;
            Object objC5 = null;
            Object objC6 = null;
            boolean z10 = true;
            int iG3 = 0;
            int iG4 = 0;
            int i14 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        objI2 = cVarB.i(descriptor2, 0, HttpMethod$$serializer.INSTANCE, objI2);
                        i14 |= 1;
                        i13 = 5;
                        continue;
                    case 1:
                        w2 w2Var2 = w2.f86635a;
                        objC4 = cVarB.C(descriptor2, 1, new a1(w2Var2, w2Var2), objC4);
                        i14 |= 2;
                        i13 = 5;
                        break;
                    case 2:
                        objC5 = cVarB.C(descriptor2, 2, w2.f86635a, objC5);
                        i14 |= 4;
                        break;
                    case 3:
                        iG3 = cVarB.g(descriptor2, 3);
                        i14 |= 8;
                        break;
                    case 4:
                        iG4 = cVarB.g(descriptor2, 4);
                        i14 |= 16;
                        break;
                    case 5:
                        objC6 = cVarB.C(descriptor2, i13, w2.f86635a, objC6);
                        i14 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = iG3;
            i11 = i14;
            objI = objI2;
            objC = objC4;
            objC2 = objC5;
            objC3 = objC6;
            i12 = iG4;
        }
        cVarB.c(descriptor2);
        return new FailedTpat(i11, (HttpMethod) objI, (Map) objC, (String) objC2, i10, i12, (String) objC3, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull FailedTpat failedTpat) {
        p.k(encoder, "encoder");
        p.k(failedTpat, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        FailedTpat.write$Self(failedTpat, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
