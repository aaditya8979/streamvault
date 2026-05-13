package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.g2;
import wo.j3;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class k {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46366i = {null, null, null, null, t.Companion.serializer(), E.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final t f46371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final E f46372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f46373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f46374h;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<k> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46377c;

        static {
            a aVar = new a();
            f46375a = aVar;
            f46377c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.CountDownTimer", aVar, 8);
            g2Var.n("custom_timer_desc", true);
            g2Var.n("is_default_timer", true);
            g2Var.n("control_size", true);
            g2Var.n(VastAttributes.PADDING, true);
            g2Var.n("horizontal_alignment", true);
            g2Var.n("vertical_alignment", true);
            g2Var.n("foreground_color", true);
            g2Var.n("background_color", true);
            f46376b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final k deserialize(@NotNull Decoder decoder) {
            String str;
            Color color;
            Color color2;
            E e10;
            t tVar;
            Integer num;
            bn.k kVar;
            boolean z10;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46376b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = k.f46366i;
            int i11 = 7;
            int i12 = 6;
            if (cVarB.l()) {
                String str2 = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, null);
                boolean zE = cVarB.E(serialDescriptor, 1);
                bn.k kVar2 = (bn.k) cVarB.i(serialDescriptor, 2, j3.f86555a, null);
                Integer num2 = (Integer) cVarB.C(serialDescriptor, 3, v0.f86626a, null);
                t tVar2 = (t) cVarB.i(serialDescriptor, 4, kSerializerArr[4], null);
                E e11 = (E) cVarB.i(serialDescriptor, 5, kSerializerArr[5], null);
                a0 a0Var = a0.f46310a;
                Color color3 = (Color) cVarB.i(serialDescriptor, 6, a0Var, null);
                e10 = e11;
                str = str2;
                color = (Color) cVarB.i(serialDescriptor, 7, a0Var, null);
                color2 = color3;
                num = num2;
                kVar = kVar2;
                i10 = 255;
                z10 = zE;
                tVar = tVar2;
            } else {
                boolean z11 = true;
                int i13 = 0;
                Color color4 = null;
                Color color5 = null;
                E e12 = null;
                str = null;
                bn.k kVar3 = null;
                Integer num3 = null;
                t tVar3 = null;
                boolean zE2 = false;
                while (z11) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z11 = false;
                            i12 = 6;
                            break;
                        case 0:
                            str = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str);
                            i13 |= 1;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 1:
                            zE2 = cVarB.E(serialDescriptor, 1);
                            i13 |= 2;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 2:
                            kVar3 = (bn.k) cVarB.i(serialDescriptor, 2, j3.f86555a, kVar3);
                            i13 |= 4;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 3:
                            num3 = (Integer) cVarB.C(serialDescriptor, 3, v0.f86626a, num3);
                            i13 |= 8;
                            i11 = 7;
                            i12 = 6;
                            break;
                        case 4:
                            tVar3 = (t) cVarB.i(serialDescriptor, 4, kSerializerArr[4], tVar3);
                            i13 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            e12 = (E) cVarB.i(serialDescriptor, 5, kSerializerArr[5], e12);
                            i13 |= 32;
                            break;
                        case 6:
                            color5 = (Color) cVarB.i(serialDescriptor, i12, a0.f46310a, color5);
                            i13 |= 64;
                            break;
                        case 7:
                            color4 = (Color) cVarB.i(serialDescriptor, i11, a0.f46310a, color4);
                            i13 |= 128;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                color = color4;
                color2 = color5;
                e10 = e12;
                tVar = tVar3;
                num = num3;
                kVar = kVar3;
                z10 = zE2;
                i10 = i13;
            }
            cVarB.c(serialDescriptor);
            return new k(i10, str, z10, kVar, num, tVar, e10, color2, color, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull k kVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(kVar, "value");
            SerialDescriptor serialDescriptor = f46376b;
            vo.d dVarB = encoder.b(serialDescriptor);
            k.a(kVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = k.f46366i;
            KSerializer<?> kSerializerT = to.a.t(w2.f86635a);
            KSerializer<?> kSerializerT2 = to.a.t(v0.f86626a);
            KSerializer<?> kSerializer = kSerializerArr[4];
            KSerializer<?> kSerializer2 = kSerializerArr[5];
            a0 a0Var = a0.f46310a;
            return new KSerializer[]{kSerializerT, wo.i.f86540a, j3.f86555a, kSerializerT2, kSerializer, kSerializer2, a0Var, a0Var};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46376b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<k> serializer() {
            return a.f46375a;
        }
    }

    public /* synthetic */ k(int i10, String str, boolean z10, bn.k kVar, Integer num, t tVar, E e10, Color color, Color color2, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46367a = null;
        } else {
            this.f46367a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46368b = true;
        } else {
            this.f46368b = z10;
        }
        this.f46369c = (i10 & 4) == 0 ? 30 : kVar.f();
        if ((i10 & 8) == 0) {
            this.f46370d = null;
        } else {
            this.f46370d = num;
        }
        if ((i10 & 16) == 0) {
            this.f46371e = t.f46442f;
        } else {
            this.f46371e = tVar;
        }
        if ((i10 & 32) == 0) {
            this.f46372f = E.f46300b;
        } else {
            this.f46372f = e10;
        }
        this.f46373g = (i10 & 64) == 0 ? ColorKt.Color(android.graphics.Color.parseColor("#FF4285f4")) : color.m1629unboximpl();
        this.f46374h = (i10 & 128) == 0 ? ColorKt.Color(android.graphics.Color.parseColor("#FFFFFFFF")) : color2.m1629unboximpl();
    }

    public /* synthetic */ k(int i10, String str, boolean z10, bn.k kVar, Integer num, t tVar, E e10, Color color, Color color2, r2 r2Var, tn.i iVar) {
        this(i10, str, z10, kVar, num, tVar, e10, color, color2, r2Var);
    }

    public static final /* synthetic */ void a(k kVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46366i;
        if (dVar.r(serialDescriptor, 0) || kVar.f46367a != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, kVar.f46367a);
        }
        if (dVar.r(serialDescriptor, 1) || !kVar.f46368b) {
            dVar.p(serialDescriptor, 1, kVar.f46368b);
        }
        if (dVar.r(serialDescriptor, 2) || kVar.f46369c != 30) {
            dVar.g(serialDescriptor, 2, j3.f86555a, bn.k.a(kVar.f46369c));
        }
        if (dVar.r(serialDescriptor, 3) || kVar.f46370d != null) {
            dVar.f(serialDescriptor, 3, v0.f86626a, kVar.f46370d);
        }
        if (dVar.r(serialDescriptor, 4) || kVar.f46371e != t.f46442f) {
            dVar.g(serialDescriptor, 4, kSerializerArr[4], kVar.f46371e);
        }
        if (dVar.r(serialDescriptor, 5) || kVar.f46372f != E.f46300b) {
            dVar.g(serialDescriptor, 5, kSerializerArr[5], kVar.f46372f);
        }
        if (dVar.r(serialDescriptor, 6) || !Color.m1620equalsimpl0(kVar.f46373g, ColorKt.Color(android.graphics.Color.parseColor("#FF4285f4")))) {
            dVar.g(serialDescriptor, 6, a0.f46310a, Color.m1609boximpl(kVar.f46373g));
        }
        if (!dVar.r(serialDescriptor, 7) && Color.m1620equalsimpl0(kVar.f46374h, ColorKt.Color(android.graphics.Color.parseColor("#FFFFFFFF")))) {
            return;
        }
        dVar.g(serialDescriptor, 7, a0.f46310a, Color.m1609boximpl(kVar.f46374h));
    }

    public final long c() {
        return this.f46374h;
    }

    public final int d() {
        return this.f46369c;
    }

    @Nullable
    public final String e() {
        return this.f46367a;
    }

    public final long f() {
        return this.f46373g;
    }

    @NotNull
    public final t g() {
        return this.f46371e;
    }

    @NotNull
    public final E h() {
        return this.f46372f;
    }

    public final boolean i() {
        return this.f46368b;
    }
}
