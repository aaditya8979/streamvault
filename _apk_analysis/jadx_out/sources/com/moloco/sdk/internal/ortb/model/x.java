package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import com.mbridge.msdk.foundation.entity.CampaignEx;
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

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class x {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46463h = {null, null, t.Companion.serializer(), E.Companion.serializer(), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final t f46466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final E f46467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final bn.k f46469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Color f46470g;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<x> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46473c;

        static {
            a aVar = new a();
            f46471a = aVar;
            f46473c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.Mute", aVar, 7);
            g2Var.n(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
            g2Var.n(VastAttributes.PADDING, false);
            g2Var.n("horizontal_alignment", false);
            g2Var.n("vertical_alignment", false);
            g2Var.n("foreground_color", false);
            g2Var.n("control_size", true);
            g2Var.n("background_color", true);
            f46472b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x deserialize(@NotNull Decoder decoder) {
            int i10;
            Color color;
            bn.k kVar;
            Color color2;
            E e10;
            t tVar;
            bn.k kVar2;
            boolean z10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46472b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = x.f46463h;
            int i11 = 6;
            int i12 = 5;
            if (cVarB.l()) {
                boolean zE = cVarB.E(serialDescriptor, 0);
                j3 j3Var = j3.f86555a;
                bn.k kVar3 = (bn.k) cVarB.i(serialDescriptor, 1, j3Var, null);
                t tVar2 = (t) cVarB.i(serialDescriptor, 2, kSerializerArr[2], null);
                E e11 = (E) cVarB.i(serialDescriptor, 3, kSerializerArr[3], null);
                a0 a0Var = a0.f46310a;
                Color color3 = (Color) cVarB.i(serialDescriptor, 4, a0Var, null);
                bn.k kVar4 = (bn.k) cVarB.C(serialDescriptor, 5, j3Var, null);
                e10 = e11;
                z10 = zE;
                color = (Color) cVarB.C(serialDescriptor, 6, a0Var, null);
                kVar = kVar4;
                color2 = color3;
                i10 = 127;
                kVar2 = kVar3;
                tVar = tVar2;
            } else {
                boolean z11 = true;
                boolean zE2 = false;
                Color color4 = null;
                bn.k kVar5 = null;
                t tVar3 = null;
                E e12 = null;
                Color color5 = null;
                bn.k kVar6 = null;
                i10 = 0;
                while (z11) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z11 = false;
                            i11 = 6;
                            break;
                        case 0:
                            zE2 = cVarB.E(serialDescriptor, 0);
                            i10 |= 1;
                            i11 = 6;
                            i12 = 5;
                            break;
                        case 1:
                            kVar5 = (bn.k) cVarB.i(serialDescriptor, 1, j3.f86555a, kVar5);
                            i10 |= 2;
                            i11 = 6;
                            i12 = 5;
                            break;
                        case 2:
                            tVar3 = (t) cVarB.i(serialDescriptor, 2, kSerializerArr[2], tVar3);
                            i10 |= 4;
                            i11 = 6;
                            break;
                        case 3:
                            e12 = (E) cVarB.i(serialDescriptor, 3, kSerializerArr[3], e12);
                            i10 |= 8;
                            break;
                        case 4:
                            color5 = (Color) cVarB.i(serialDescriptor, 4, a0.f46310a, color5);
                            i10 |= 16;
                            break;
                        case 5:
                            kVar6 = (bn.k) cVarB.C(serialDescriptor, i12, j3.f86555a, kVar6);
                            i10 |= 32;
                            break;
                        case 6:
                            color4 = (Color) cVarB.C(serialDescriptor, i11, a0.f46310a, color4);
                            i10 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                color = color4;
                kVar = kVar6;
                color2 = color5;
                e10 = e12;
                tVar = tVar3;
                kVar2 = kVar5;
                z10 = zE2;
            }
            cVarB.c(serialDescriptor);
            return new x(i10, z10, kVar2, tVar, e10, color2, kVar, color, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull x xVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(xVar, "value");
            SerialDescriptor serialDescriptor = f46472b;
            vo.d dVarB = encoder.b(serialDescriptor);
            x.a(xVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = x.f46463h;
            j3 j3Var = j3.f86555a;
            KSerializer<?> kSerializer = kSerializerArr[2];
            KSerializer<?> kSerializer2 = kSerializerArr[3];
            a0 a0Var = a0.f46310a;
            return new KSerializer[]{wo.i.f86540a, j3Var, kSerializer, kSerializer2, a0Var, to.a.t(j3Var), to.a.t(a0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46472b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<x> serializer() {
            return a.f46471a;
        }
    }

    public /* synthetic */ x(int i10, boolean z10, bn.k kVar, t tVar, E e10, Color color, bn.k kVar2, Color color2, r2 r2Var) {
        if (31 != (i10 & 31)) {
            c2.a(i10, 31, a.f46471a.getDescriptor());
        }
        this.f46464a = z10;
        this.f46465b = kVar.f();
        this.f46466c = tVar;
        this.f46467d = e10;
        this.f46468e = color.m1629unboximpl();
        if ((i10 & 32) == 0) {
            this.f46469f = null;
        } else {
            this.f46469f = kVar2;
        }
        if ((i10 & 64) == 0) {
            this.f46470g = null;
        } else {
            this.f46470g = color2;
        }
    }

    public /* synthetic */ x(int i10, boolean z10, bn.k kVar, t tVar, E e10, Color color, bn.k kVar2, Color color2, r2 r2Var, tn.i iVar) {
        this(i10, z10, kVar, tVar, e10, color, kVar2, color2, r2Var);
    }

    public x(boolean z10, int i10, t tVar, E e10, long j10, bn.k kVar, Color color) {
        tn.p.k(tVar, "horizontalAlignment");
        tn.p.k(e10, "verticalAlignment");
        this.f46464a = z10;
        this.f46465b = i10;
        this.f46466c = tVar;
        this.f46467d = e10;
        this.f46468e = j10;
        this.f46469f = kVar;
        this.f46470g = color;
    }

    public /* synthetic */ x(boolean z10, int i10, t tVar, E e10, long j10, bn.k kVar, Color color, int i11, tn.i iVar) {
        this(z10, i10, tVar, e10, j10, (i11 & 32) != 0 ? null : kVar, (i11 & 64) != 0 ? null : color, null);
    }

    public /* synthetic */ x(boolean z10, int i10, t tVar, E e10, long j10, bn.k kVar, Color color, tn.i iVar) {
        this(z10, i10, tVar, e10, j10, kVar, color);
    }

    public static final /* synthetic */ void a(x xVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46463h;
        dVar.p(serialDescriptor, 0, xVar.f46464a);
        j3 j3Var = j3.f86555a;
        dVar.g(serialDescriptor, 1, j3Var, bn.k.a(xVar.f46465b));
        dVar.g(serialDescriptor, 2, kSerializerArr[2], xVar.f46466c);
        dVar.g(serialDescriptor, 3, kSerializerArr[3], xVar.f46467d);
        a0 a0Var = a0.f46310a;
        dVar.g(serialDescriptor, 4, a0Var, Color.m1609boximpl(xVar.f46468e));
        if (dVar.r(serialDescriptor, 5) || xVar.f46469f != null) {
            dVar.f(serialDescriptor, 5, j3Var, xVar.f46469f);
        }
        if (!dVar.r(serialDescriptor, 6) && xVar.f46470g == null) {
            return;
        }
        dVar.f(serialDescriptor, 6, a0Var, xVar.f46470g);
    }

    @Nullable
    public final Color c() {
        return this.f46470g;
    }

    @Nullable
    public final bn.k d() {
        return this.f46469f;
    }

    public final long e() {
        return this.f46468e;
    }

    @NotNull
    public final t f() {
        return this.f46466c;
    }

    public final boolean g() {
        return this.f46464a;
    }

    public final int h() {
        return this.f46465b;
    }

    @NotNull
    public final E i() {
        return this.f46467d;
    }
}
