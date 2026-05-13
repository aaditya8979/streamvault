package com.vungle.ads.internal.model;

import com.mbridge.msdk.foundation.entity.b;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import tn.p;
import tn.t;
import to.a;
import vo.c;
import vo.d;
import wo.a1;
import wo.f;
import wo.g1;
import wo.g2;
import wo.i;
import wo.m0;
import wo.w2;

/* JADX INFO: compiled from: AdPayload.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"com/vungle/ads/internal/model/AdPayload.$serializer", "Lwo/m0;", "Lcom/vungle/ads/internal/model/AdPayload;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lbn/r;", "serialize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class AdPayload$$serializer implements m0<AdPayload> {

    @NotNull
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ SerialDescriptor descriptor;

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        g2 g2Var = new g2("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 7);
        g2Var.n(b.JSON_KEY_ADS, true);
        g2Var.n("config", true);
        g2Var.n("expiryWindowStart", true);
        g2Var.n("mraidFiles", true);
        g2Var.n("incentivizedTextSettings", true);
        g2Var.n("assetsFullyDownloaded", true);
        g2Var.n("indexFilePath", true);
        descriptor = g2Var;
    }

    private AdPayload$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        KClass kClassB = t.b(ConcurrentHashMap.class);
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{a.t(new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE)), a.t(ConfigPayload$$serializer.INSTANCE), a.t(g1.f86515a), new so.b(kClassB, null, new KSerializer[]{w2Var, w2Var}), new a1(w2Var, w2Var), i.f86540a, a.t(w2Var)};
    }

    @Override // so.c
    @NotNull
    public AdPayload deserialize(@NotNull Decoder decoder) {
        Object objC;
        Object objI;
        Object obj;
        Object objC2;
        boolean z10;
        Object objI2;
        Object objC3;
        int i10;
        char c10;
        p.k(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 6;
        int i12 = 5;
        int i13 = 4;
        if (cVarB.l()) {
            objC = cVarB.C(descriptor2, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), null);
            Object objC4 = cVarB.C(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, null);
            objC3 = cVarB.C(descriptor2, 2, g1.f86515a, null);
            KClass kClassB = t.b(ConcurrentHashMap.class);
            w2 w2Var = w2.f86635a;
            Object objI3 = cVarB.i(descriptor2, 3, new so.b(kClassB, null, new KSerializer[]{w2Var, w2Var}), null);
            objI2 = cVarB.i(descriptor2, 4, new a1(w2Var, w2Var), null);
            boolean zE = cVarB.E(descriptor2, 5);
            objC2 = cVarB.C(descriptor2, 6, w2Var, null);
            objI = objI3;
            i10 = 127;
            z10 = zE;
            obj = objC4;
        } else {
            boolean z11 = true;
            boolean zE2 = false;
            int i14 = 0;
            objC = null;
            Object objC5 = null;
            objI = null;
            Object objI4 = null;
            Object objC6 = null;
            Object objC7 = null;
            while (z11) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        z11 = false;
                        i12 = 5;
                        break;
                    case 0:
                        objC = cVarB.C(descriptor2, 0, new f(AdPayload$PlacementAdUnit$$serializer.INSTANCE), objC);
                        i14 |= 1;
                        i11 = 6;
                        i12 = 5;
                        i13 = 4;
                        break;
                    case 1:
                        objC6 = cVarB.C(descriptor2, 1, ConfigPayload$$serializer.INSTANCE, objC6);
                        i14 |= 2;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 2:
                        c10 = 3;
                        objC7 = cVarB.C(descriptor2, 2, g1.f86515a, objC7);
                        i14 |= 4;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 3:
                        KClass kClassB2 = t.b(ConcurrentHashMap.class);
                        w2 w2Var2 = w2.f86635a;
                        c10 = 3;
                        objI = cVarB.i(descriptor2, 3, new so.b(kClassB2, null, new KSerializer[]{w2Var2, w2Var2}), objI);
                        i14 |= 8;
                        i11 = 6;
                        i12 = 5;
                        break;
                    case 4:
                        w2 w2Var3 = w2.f86635a;
                        objI4 = cVarB.i(descriptor2, i13, new a1(w2Var3, w2Var3), objI4);
                        i14 |= 16;
                        i11 = 6;
                        break;
                    case 5:
                        zE2 = cVarB.E(descriptor2, i12);
                        i14 |= 32;
                        break;
                    case 6:
                        objC5 = cVarB.C(descriptor2, i11, w2.f86635a, objC5);
                        i14 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            obj = objC6;
            objC2 = objC5;
            z10 = zE2;
            objI2 = objI4;
            objC3 = objC7;
            i10 = i14;
        }
        cVarB.c(descriptor2);
        return new AdPayload(i10, (List) objC, (ConfigPayload) obj, (Long) objC3, (ConcurrentHashMap) objI, (Map) objI2, z10, (String) objC2, null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull AdPayload adPayload) {
        p.k(encoder, "encoder");
        p.k(adPayload, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        AdPayload.write$Self(adPayload, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
