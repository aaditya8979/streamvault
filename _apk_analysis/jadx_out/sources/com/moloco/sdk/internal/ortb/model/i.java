package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.c2;
import wo.g2;
import wo.j3;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class i {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46355h = {null, null, null, t.Companion.serializer(), E.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final t f46359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final E f46360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Color f46362g;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46365c;

        static {
            a aVar = new a();
            f46363a = aVar;
            f46365c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.CTA", aVar, 7);
            g2Var.n("text", false);
            g2Var.n("image_url", true);
            g2Var.n(VastAttributes.PADDING, false);
            g2Var.n("horizontal_alignment", false);
            g2Var.n("vertical_alignment", false);
            g2Var.n("foreground_color", false);
            g2Var.n("background_color", true);
            f46364b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final i deserialize(@NotNull Decoder decoder) {
            String str;
            t tVar;
            Color color;
            int i10;
            Color color2;
            String str2;
            bn.k kVar;
            E e10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46364b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = i.f46355h;
            int i11 = 6;
            String strK = null;
            if (cVarB.l()) {
                String strK2 = cVarB.k(serialDescriptor, 0);
                String str3 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, null);
                bn.k kVar2 = (bn.k) cVarB.i(serialDescriptor, 2, j3.f86555a, null);
                t tVar2 = (t) cVarB.i(serialDescriptor, 3, kSerializerArr[3], null);
                E e11 = (E) cVarB.i(serialDescriptor, 4, kSerializerArr[4], null);
                a0 a0Var = a0.f46310a;
                Color color3 = (Color) cVarB.i(serialDescriptor, 5, a0Var, null);
                e10 = e11;
                color2 = (Color) cVarB.C(serialDescriptor, 6, a0Var, null);
                color = color3;
                kVar = kVar2;
                tVar = tVar2;
                str = str3;
                i10 = 127;
                str2 = strK2;
            } else {
                int i12 = 0;
                boolean z10 = true;
                Color color4 = null;
                Color color5 = null;
                String str4 = null;
                bn.k kVar3 = null;
                t tVar3 = null;
                E e12 = null;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            strK = cVarB.k(serialDescriptor, 0);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            str4 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str4);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            kVar3 = (bn.k) cVarB.i(serialDescriptor, 2, j3.f86555a, kVar3);
                            i12 |= 4;
                            i11 = 6;
                            break;
                        case 3:
                            tVar3 = (t) cVarB.i(serialDescriptor, 3, kSerializerArr[3], tVar3);
                            i12 |= 8;
                            break;
                        case 4:
                            e12 = (E) cVarB.i(serialDescriptor, 4, kSerializerArr[4], e12);
                            i12 |= 16;
                            break;
                        case 5:
                            color4 = (Color) cVarB.i(serialDescriptor, 5, a0.f46310a, color4);
                            i12 |= 32;
                            break;
                        case 6:
                            color5 = (Color) cVarB.C(serialDescriptor, i11, a0.f46310a, color5);
                            i12 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                str = str4;
                tVar = tVar3;
                color = color4;
                i10 = i12;
                E e13 = e12;
                color2 = color5;
                str2 = strK;
                kVar = kVar3;
                e10 = e13;
            }
            cVarB.c(serialDescriptor);
            return new i(i10, str2, str, kVar, tVar, e10, color, color2, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull i iVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(iVar, "value");
            SerialDescriptor serialDescriptor = f46364b;
            vo.d dVarB = encoder.b(serialDescriptor);
            i.a(iVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = i.f46355h;
            w2 w2Var = w2.f86635a;
            KSerializer<?> kSerializerT = to.a.t(w2Var);
            KSerializer<?> kSerializer = kSerializerArr[3];
            KSerializer<?> kSerializer2 = kSerializerArr[4];
            a0 a0Var = a0.f46310a;
            return new KSerializer[]{w2Var, kSerializerT, j3.f86555a, kSerializer, kSerializer2, a0Var, to.a.t(a0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46364b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<i> serializer() {
            return a.f46363a;
        }
    }

    public /* synthetic */ i(int i10, String str, String str2, bn.k kVar, t tVar, E e10, Color color, Color color2, r2 r2Var) {
        if (61 != (i10 & 61)) {
            c2.a(i10, 61, a.f46363a.getDescriptor());
        }
        this.f46356a = str;
        if ((i10 & 2) == 0) {
            this.f46357b = null;
        } else {
            this.f46357b = str2;
        }
        this.f46358c = kVar.f();
        this.f46359d = tVar;
        this.f46360e = e10;
        this.f46361f = color.m1629unboximpl();
        if ((i10 & 64) == 0) {
            this.f46362g = null;
        } else {
            this.f46362g = color2;
        }
    }

    public /* synthetic */ i(int i10, String str, String str2, bn.k kVar, t tVar, E e10, Color color, Color color2, r2 r2Var, tn.i iVar) {
        this(i10, str, str2, kVar, tVar, e10, color, color2, r2Var);
    }

    public static final /* synthetic */ void a(i iVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46355h;
        dVar.q(serialDescriptor, 0, iVar.f46356a);
        if (dVar.r(serialDescriptor, 1) || iVar.f46357b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, iVar.f46357b);
        }
        dVar.g(serialDescriptor, 2, j3.f86555a, bn.k.a(iVar.f46358c));
        dVar.g(serialDescriptor, 3, kSerializerArr[3], iVar.f46359d);
        dVar.g(serialDescriptor, 4, kSerializerArr[4], iVar.f46360e);
        a0 a0Var = a0.f46310a;
        dVar.g(serialDescriptor, 5, a0Var, Color.m1609boximpl(iVar.f46361f));
        if (!dVar.r(serialDescriptor, 6) && iVar.f46362g == null) {
            return;
        }
        dVar.f(serialDescriptor, 6, a0Var, iVar.f46362g);
    }

    @Nullable
    public final Color c() {
        return this.f46362g;
    }

    public final long d() {
        return this.f46361f;
    }

    @NotNull
    public final t e() {
        return this.f46359d;
    }

    @Nullable
    public final String f() {
        return this.f46357b;
    }

    public final int g() {
        return this.f46358c;
    }

    @NotNull
    public final String h() {
        return this.f46356a;
    }

    @NotNull
    public final E i() {
        return this.f46360e;
    }
}
