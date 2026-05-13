package com.yandex.div.internal.viewpool;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import to.a;
import vo.c;
import vo.d;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: compiled from: ViewPreCreationProfile.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewPreCreationProfile$$serializer implements m0<ViewPreCreationProfile> {

    @NotNull
    public static final ViewPreCreationProfile$$serializer INSTANCE;
    private static final /* synthetic */ g2 descriptor;

    static {
        ViewPreCreationProfile$$serializer viewPreCreationProfile$$serializer = new ViewPreCreationProfile$$serializer();
        INSTANCE = viewPreCreationProfile$$serializer;
        g2 g2Var = new g2("com.yandex.div.internal.viewpool.ViewPreCreationProfile", viewPreCreationProfile$$serializer, 19);
        g2Var.n("id", true);
        g2Var.n("text", true);
        g2Var.n("image", true);
        g2Var.n("gifImage", true);
        g2Var.n("overlapContainer", true);
        g2Var.n("linearContainer", true);
        g2Var.n("wrapContainer", true);
        g2Var.n("grid", true);
        g2Var.n("gallery", true);
        g2Var.n("pager", true);
        g2Var.n("tab", true);
        g2Var.n("state", true);
        g2Var.n("custom", true);
        g2Var.n("indicator", true);
        g2Var.n("slider", true);
        g2Var.n("input", true);
        g2Var.n("select", true);
        g2Var.n("video", true);
        g2Var.n("switch", true);
        descriptor = g2Var;
    }

    private ViewPreCreationProfile$$serializer() {
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] childSerializers() {
        PreCreationModel$$serializer preCreationModel$$serializer = PreCreationModel$$serializer.INSTANCE;
        return new KSerializer[]{a.t(w2.f86635a), preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer, preCreationModel$$serializer};
    }

    @Override // so.c
    @NotNull
    public ViewPreCreationProfile deserialize(@NotNull Decoder decoder) {
        Object objI;
        Object obj;
        Object objI2;
        Object objI3;
        Object objI4;
        Object obj2;
        Object objI5;
        Object objI6;
        Object objI7;
        Object obj3;
        Object objI8;
        Object objI9;
        int i10;
        Object objI10;
        Object objI11;
        Object objI12;
        Object objI13;
        Object obj4;
        Object objI14;
        Object objI15;
        Object obj5;
        Object objC;
        Object obj6;
        Object obj7;
        SerialDescriptor descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.l()) {
            Object objC2 = cVarB.C(descriptor2, 0, w2.f86635a, null);
            PreCreationModel$$serializer preCreationModel$$serializer = PreCreationModel$$serializer.INSTANCE;
            Object objI16 = cVarB.i(descriptor2, 1, preCreationModel$$serializer, null);
            objI14 = cVarB.i(descriptor2, 2, preCreationModel$$serializer, null);
            Object objI17 = cVarB.i(descriptor2, 3, preCreationModel$$serializer, null);
            Object objI18 = cVarB.i(descriptor2, 4, preCreationModel$$serializer, null);
            objI13 = cVarB.i(descriptor2, 5, preCreationModel$$serializer, null);
            objI12 = cVarB.i(descriptor2, 6, preCreationModel$$serializer, null);
            objI11 = cVarB.i(descriptor2, 7, preCreationModel$$serializer, null);
            objI10 = cVarB.i(descriptor2, 8, preCreationModel$$serializer, null);
            objI9 = cVarB.i(descriptor2, 9, preCreationModel$$serializer, null);
            objI4 = cVarB.i(descriptor2, 10, preCreationModel$$serializer, null);
            objI3 = cVarB.i(descriptor2, 11, preCreationModel$$serializer, null);
            objI2 = cVarB.i(descriptor2, 12, preCreationModel$$serializer, null);
            objI8 = cVarB.i(descriptor2, 13, preCreationModel$$serializer, null);
            objI7 = cVarB.i(descriptor2, 14, preCreationModel$$serializer, null);
            objI6 = cVarB.i(descriptor2, 15, preCreationModel$$serializer, null);
            objI5 = cVarB.i(descriptor2, 16, preCreationModel$$serializer, null);
            Object objI19 = cVarB.i(descriptor2, 17, preCreationModel$$serializer, null);
            objI15 = cVarB.i(descriptor2, 18, preCreationModel$$serializer, null);
            i10 = 524287;
            obj4 = objI17;
            obj3 = objI16;
            objI = objI18;
            obj2 = objI19;
            obj = objC2;
        } else {
            boolean z10 = true;
            Object objI20 = null;
            Object objI21 = null;
            Object objI22 = null;
            Object objI23 = null;
            Object objI24 = null;
            Object objI25 = null;
            Object objI26 = null;
            Object objI27 = null;
            Object objI28 = null;
            Object objI29 = null;
            objI = null;
            Object obj8 = null;
            Object objI30 = null;
            Object objI31 = null;
            Object objI32 = null;
            Object objI33 = null;
            Object objI34 = null;
            Object objI35 = null;
            int i11 = 0;
            Object objI36 = null;
            while (z10) {
                int iW = cVarB.w(descriptor2);
                switch (iW) {
                    case -1:
                        obj5 = objI21;
                        objC = obj8;
                        z10 = false;
                        objI20 = objI20;
                        objI36 = objI36;
                        obj8 = objC;
                        objI21 = obj5;
                        break;
                    case 0:
                        obj5 = objI21;
                        objC = cVarB.C(descriptor2, 0, w2.f86635a, obj8);
                        i11 |= 1;
                        objI20 = objI20;
                        objI36 = objI36;
                        objI35 = objI35;
                        obj8 = objC;
                        objI21 = obj5;
                        break;
                    case 1:
                        objI35 = cVarB.i(descriptor2, 1, PreCreationModel$$serializer.INSTANCE, objI35);
                        i11 |= 2;
                        objI20 = objI20;
                        objI36 = objI36;
                        objI21 = objI21;
                        break;
                    case 2:
                        i11 |= 4;
                        objI20 = cVarB.i(descriptor2, 2, PreCreationModel$$serializer.INSTANCE, objI20);
                        objI36 = objI36;
                        objI30 = objI30;
                        break;
                    case 3:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI23 = cVarB.i(descriptor2, 3, PreCreationModel$$serializer.INSTANCE, objI23);
                        i11 |= 8;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 4:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI = cVarB.i(descriptor2, 4, PreCreationModel$$serializer.INSTANCE, objI);
                        i11 |= 16;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 5:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI21 = cVarB.i(descriptor2, 5, PreCreationModel$$serializer.INSTANCE, objI21);
                        i11 |= 32;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 6:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI29 = cVarB.i(descriptor2, 6, PreCreationModel$$serializer.INSTANCE, objI29);
                        i11 |= 64;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 7:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI28 = cVarB.i(descriptor2, 7, PreCreationModel$$serializer.INSTANCE, objI28);
                        i11 |= 128;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 8:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI27 = cVarB.i(descriptor2, 8, PreCreationModel$$serializer.INSTANCE, objI27);
                        i11 |= 256;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 9:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI22 = cVarB.i(descriptor2, 9, PreCreationModel$$serializer.INSTANCE, objI22);
                        i11 |= 512;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 10:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI26 = cVarB.i(descriptor2, 10, PreCreationModel$$serializer.INSTANCE, objI26);
                        i11 |= 1024;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 11:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI25 = cVarB.i(descriptor2, 11, PreCreationModel$$serializer.INSTANCE, objI25);
                        i11 |= 2048;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 12:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI24 = cVarB.i(descriptor2, 12, PreCreationModel$$serializer.INSTANCE, objI24);
                        i11 |= 4096;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 13:
                        obj6 = objI20;
                        objI30 = cVarB.i(descriptor2, 13, PreCreationModel$$serializer.INSTANCE, objI30);
                        i11 |= 8192;
                        objI36 = objI36;
                        objI31 = objI31;
                        objI20 = obj6;
                        break;
                    case 14:
                        obj6 = objI20;
                        objI31 = cVarB.i(descriptor2, 14, PreCreationModel$$serializer.INSTANCE, objI31);
                        i11 |= 16384;
                        objI36 = objI36;
                        objI32 = objI32;
                        objI20 = obj6;
                        break;
                    case 15:
                        obj6 = objI20;
                        objI32 = cVarB.i(descriptor2, 15, PreCreationModel$$serializer.INSTANCE, objI32);
                        i11 |= 32768;
                        objI36 = objI36;
                        objI33 = objI33;
                        objI20 = obj6;
                        break;
                    case 16:
                        obj6 = objI20;
                        objI33 = cVarB.i(descriptor2, 16, PreCreationModel$$serializer.INSTANCE, objI33);
                        i11 |= 65536;
                        objI36 = objI36;
                        objI34 = objI34;
                        objI20 = obj6;
                        break;
                    case 17:
                        obj6 = objI20;
                        obj7 = objI36;
                        objI34 = cVarB.i(descriptor2, 17, PreCreationModel$$serializer.INSTANCE, objI34);
                        i11 |= 131072;
                        objI36 = obj7;
                        objI20 = obj6;
                        break;
                    case 18:
                        objI36 = cVarB.i(descriptor2, 18, PreCreationModel$$serializer.INSTANCE, objI36);
                        i11 |= 262144;
                        objI20 = objI20;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            Object obj9 = objI21;
            Object obj10 = objI36;
            Object obj11 = objI20;
            obj = obj8;
            objI2 = objI24;
            objI3 = objI25;
            objI4 = objI26;
            obj2 = objI34;
            objI5 = objI33;
            objI6 = objI32;
            objI7 = objI31;
            obj3 = objI35;
            objI8 = objI30;
            objI9 = objI22;
            i10 = i11;
            objI10 = objI27;
            objI11 = objI28;
            objI12 = objI29;
            objI13 = obj9;
            obj4 = objI23;
            objI14 = obj11;
            objI15 = obj10;
        }
        cVarB.c(descriptor2);
        return new ViewPreCreationProfile(i10, (String) obj, (PreCreationModel) obj3, (PreCreationModel) objI14, (PreCreationModel) obj4, (PreCreationModel) objI, (PreCreationModel) objI13, (PreCreationModel) objI12, (PreCreationModel) objI11, (PreCreationModel) objI10, (PreCreationModel) objI9, (PreCreationModel) objI4, (PreCreationModel) objI3, (PreCreationModel) objI2, (PreCreationModel) objI8, (PreCreationModel) objI7, (PreCreationModel) objI6, (PreCreationModel) objI5, (PreCreationModel) obj2, (PreCreationModel) objI15, (r2) null);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // so.l
    public void serialize(@NotNull Encoder encoder, @NotNull ViewPreCreationProfile viewPreCreationProfile) {
        SerialDescriptor descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ViewPreCreationProfile.write$Self(viewPreCreationProfile, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // wo.m0
    @NotNull
    public KSerializer<?>[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
