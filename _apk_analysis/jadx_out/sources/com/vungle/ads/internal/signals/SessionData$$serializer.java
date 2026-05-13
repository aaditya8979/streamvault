package com.vungle.ads.internal.signals;

import com.bykv.vk.openvk.preload.falconx.statistic.StatisticData;
import com.vungle.ads.internal.model.UnclosedAd$$serializer;
import java.util.List;
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
import wo.f;
import wo.g1;
import wo.g2;
import wo.m0;
import wo.v0;
import wo.w2;

/* JADX INFO: compiled from: SessionData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/signals/SessionData.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/signals/SessionData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SessionData$$serializer implements m0<SessionData> {

    @NotNull
    public static final SessionData$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        SessionData$$serializer sessionData$$serializer = new SessionData$$serializer();
        INSTANCE = sessionData$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.signals.SessionData", sessionData$$serializer, 12);
        g2Var.n("103", false);
        g2Var.n(StatisticData.ERROR_CODE_IO_ERROR, true);
        g2Var.n(StatisticData.ERROR_CODE_NOT_FOUND, true);
        g2Var.n("106", true);
        g2Var.n("102", true);
        g2Var.n("104", true);
        g2Var.n("105", true);
        g2Var.n("112", true);
        g2Var.n("113", true);
        g2Var.n("114", true);
        g2Var.n("115", true);
        g2Var.n("116", true);
        descriptor = g2Var;
    }

    private SessionData$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        v0 v0Var = v0.f86626a;
        g1 g1Var = g1.f86515a;
        return new KSerializer[]{v0Var, w2.f86635a, g1Var, new f(SignaledAd$$serializer.INSTANCE), g1Var, v0Var, new f(UnclosedAd$$serializer.INSTANCE), v0Var, v0Var, v0Var, v0Var, v0Var};
    }

    @Override // so.c
    @NotNull
    public SessionData deserialize(@NotNull Decoder decoder) {
        int i10;
        int iG;
        int iG2;
        int i11;
        long j10;
        int i12;
        int i13;
        String str;
        int iG3;
        Object objI;
        int i14;
        Object objI2;
        long j11;
        char c10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i15 = 9;
        int i16 = 0;
        if (cVarB.l()) {
            int iG4 = cVarB.g(descriptor2, 0);
            String strK = cVarB.k(descriptor2, 1);
            long jF = cVarB.f(descriptor2, 2);
            objI2 = cVarB.i(descriptor2, 3, new f(SignaledAd$$serializer.INSTANCE), null);
            long jF2 = cVarB.f(descriptor2, 4);
            int iG5 = cVarB.g(descriptor2, 5);
            objI = cVarB.i(descriptor2, 6, new f(UnclosedAd$$serializer.INSTANCE), null);
            int iG6 = cVarB.g(descriptor2, 7);
            int iG7 = cVarB.g(descriptor2, 8);
            iG3 = cVarB.g(descriptor2, 9);
            i12 = iG6;
            i13 = iG7;
            i11 = iG5;
            iG = cVarB.g(descriptor2, 10);
            iG2 = cVarB.g(descriptor2, 11);
            j10 = jF2;
            i10 = 4095;
            str = strK;
            j11 = jF;
            i14 = iG4;
        } else {
            int i17 = 11;
            long jF3 = 0;
            long jF4 = 0;
            Object objI3 = null;
            String strK2 = null;
            boolean z10 = true;
            int iG8 = 0;
            int iG9 = 0;
            int iG10 = 0;
            int iG11 = 0;
            int iG12 = 0;
            int iG13 = 0;
            Object objI4 = null;
            int iG14 = 0;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i17 = 11;
                        break;
                    case 0:
                        i16 |= 1;
                        iG8 = cVarB.g(descriptor2, 0);
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 1:
                        c10 = 3;
                        strK2 = cVarB.k(descriptor2, 1);
                        i16 |= 2;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 2:
                        c10 = 3;
                        jF4 = cVarB.f(descriptor2, 2);
                        i16 |= 4;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 3:
                        c10 = 3;
                        objI4 = cVarB.i(descriptor2, 3, new f(SignaledAd$$serializer.INSTANCE), objI4);
                        i16 |= 8;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 4:
                        jF3 = cVarB.f(descriptor2, 4);
                        i16 |= 16;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 5:
                        iG11 = cVarB.g(descriptor2, 5);
                        i16 |= 32;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 6:
                        objI3 = cVarB.i(descriptor2, 6, new f(UnclosedAd$$serializer.INSTANCE), objI3);
                        i16 |= 64;
                        i17 = 11;
                        i15 = 9;
                        break;
                    case 7:
                        iG14 = cVarB.g(descriptor2, 7);
                        i16 |= 128;
                        break;
                    case 8:
                        iG10 = cVarB.g(descriptor2, 8);
                        i16 |= 256;
                        break;
                    case 9:
                        iG9 = cVarB.g(descriptor2, i15);
                        i16 |= 512;
                        break;
                    case 10:
                        iG12 = cVarB.g(descriptor2, 10);
                        i16 |= 1024;
                        break;
                    case 11:
                        iG13 = cVarB.g(descriptor2, i17);
                        i16 |= 2048;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = i16;
            iG = iG12;
            iG2 = iG13;
            i11 = iG11;
            j10 = jF3;
            i12 = iG14;
            i13 = iG10;
            str = strK2;
            iG3 = iG9;
            objI = objI3;
            i14 = iG8;
            objI2 = objI4;
            j11 = jF4;
        }
        cVarB.c(descriptor2);
        return new SessionData(i10, i14, str, j11, (List) objI2, j10, i11, (List) objI, i12, i13, iG3, iG, iG2, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull SessionData sessionData) {
        p.k(encoder, "encoder");
        p.k(sessionData, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        SessionData.write$Self(sessionData, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
