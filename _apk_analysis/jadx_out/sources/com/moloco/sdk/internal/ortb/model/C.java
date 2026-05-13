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

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class C {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46281h = {null, null, null, t.Companion.serializer(), E.Companion.serializer(), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f46284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final t f46285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final E f46286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f46287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Color f46288g;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46291c;

        static {
            a aVar = new a();
            f46289a = aVar;
            f46291c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.SkipClose", aVar, 7);
            g2Var.n("delay_seconds", false);
            g2Var.n(VastAttributes.PADDING, false);
            g2Var.n("control_size", false);
            g2Var.n("horizontal_alignment", false);
            g2Var.n("vertical_alignment", false);
            g2Var.n("foreground_color", false);
            g2Var.n("background_color", true);
            f46290b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C deserialize(@NotNull Decoder decoder) {
            bn.k kVar;
            t tVar;
            Color color;
            int i10;
            Color color2;
            bn.k kVar2;
            bn.k kVar3;
            E e10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46290b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = C.f46281h;
            int i11 = 6;
            bn.k kVar4 = null;
            if (cVarB.l()) {
                j3 j3Var = j3.f86555a;
                bn.k kVar5 = (bn.k) cVarB.i(serialDescriptor, 0, j3Var, null);
                bn.k kVar6 = (bn.k) cVarB.i(serialDescriptor, 1, j3Var, null);
                bn.k kVar7 = (bn.k) cVarB.i(serialDescriptor, 2, j3Var, null);
                t tVar2 = (t) cVarB.i(serialDescriptor, 3, kSerializerArr[3], null);
                E e11 = (E) cVarB.i(serialDescriptor, 4, kSerializerArr[4], null);
                a0 a0Var = a0.f46310a;
                Color color3 = (Color) cVarB.i(serialDescriptor, 5, a0Var, null);
                e10 = e11;
                kVar3 = kVar7;
                color2 = (Color) cVarB.C(serialDescriptor, 6, a0Var, null);
                color = color3;
                tVar = tVar2;
                kVar = kVar6;
                kVar2 = kVar5;
                i10 = 127;
            } else {
                int i12 = 0;
                boolean z10 = true;
                Color color4 = null;
                Color color5 = null;
                bn.k kVar8 = null;
                bn.k kVar9 = null;
                t tVar3 = null;
                E e12 = null;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                            break;
                        case 0:
                            kVar4 = (bn.k) cVarB.i(serialDescriptor, 0, j3.f86555a, kVar4);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            kVar8 = (bn.k) cVarB.i(serialDescriptor, 1, j3.f86555a, kVar8);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            kVar9 = (bn.k) cVarB.i(serialDescriptor, 2, j3.f86555a, kVar9);
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
                kVar = kVar8;
                tVar = tVar3;
                color = color4;
                i10 = i12;
                E e13 = e12;
                color2 = color5;
                kVar2 = kVar4;
                kVar3 = kVar9;
                e10 = e13;
            }
            cVarB.c(serialDescriptor);
            return new C(i10, kVar2, kVar, kVar3, tVar, e10, color, color2, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull C c10) {
            tn.p.k(encoder, "encoder");
            tn.p.k(c10, "value");
            SerialDescriptor serialDescriptor = f46290b;
            vo.d dVarB = encoder.b(serialDescriptor);
            C.a(c10, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = C.f46281h;
            KSerializer<?> kSerializer = kSerializerArr[3];
            KSerializer<?> kSerializer2 = kSerializerArr[4];
            a0 a0Var = a0.f46310a;
            KSerializer<?> kSerializerT = to.a.t(a0Var);
            j3 j3Var = j3.f86555a;
            return new KSerializer[]{j3Var, j3Var, j3Var, kSerializer, kSerializer2, a0Var, kSerializerT};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46290b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<C> serializer() {
            return a.f46289a;
        }
    }

    public C(int i10, int i11, int i12, t tVar, E e10, long j10, Color color) {
        tn.p.k(tVar, "horizontalAlignment");
        tn.p.k(e10, "verticalAlignment");
        this.f46282a = i10;
        this.f46283b = i11;
        this.f46284c = i12;
        this.f46285d = tVar;
        this.f46286e = e10;
        this.f46287f = j10;
        this.f46288g = color;
    }

    public /* synthetic */ C(int i10, int i11, int i12, t tVar, E e10, long j10, Color color, int i13, tn.i iVar) {
        this(i10, i11, i12, tVar, e10, j10, (i13 & 64) != 0 ? null : color, null);
    }

    public /* synthetic */ C(int i10, int i11, int i12, t tVar, E e10, long j10, Color color, tn.i iVar) {
        this(i10, i11, i12, tVar, e10, j10, color);
    }

    public /* synthetic */ C(int i10, bn.k kVar, bn.k kVar2, bn.k kVar3, t tVar, E e10, Color color, Color color2, r2 r2Var) {
        if (63 != (i10 & 63)) {
            c2.a(i10, 63, a.f46289a.getDescriptor());
        }
        this.f46282a = kVar.f();
        this.f46283b = kVar2.f();
        this.f46284c = kVar3.f();
        this.f46285d = tVar;
        this.f46286e = e10;
        this.f46287f = color.m1629unboximpl();
        if ((i10 & 64) == 0) {
            this.f46288g = null;
        } else {
            this.f46288g = color2;
        }
    }

    public /* synthetic */ C(int i10, bn.k kVar, bn.k kVar2, bn.k kVar3, t tVar, E e10, Color color, Color color2, r2 r2Var, tn.i iVar) {
        this(i10, kVar, kVar2, kVar3, tVar, e10, color, color2, r2Var);
    }

    public static final /* synthetic */ void a(C c10, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46281h;
        j3 j3Var = j3.f86555a;
        dVar.g(serialDescriptor, 0, j3Var, bn.k.a(c10.f46282a));
        dVar.g(serialDescriptor, 1, j3Var, bn.k.a(c10.f46283b));
        dVar.g(serialDescriptor, 2, j3Var, bn.k.a(c10.f46284c));
        dVar.g(serialDescriptor, 3, kSerializerArr[3], c10.f46285d);
        dVar.g(serialDescriptor, 4, kSerializerArr[4], c10.f46286e);
        a0 a0Var = a0.f46310a;
        dVar.g(serialDescriptor, 5, a0Var, Color.m1609boximpl(c10.f46287f));
        if (!dVar.r(serialDescriptor, 6) && c10.f46288g == null) {
            return;
        }
        dVar.f(serialDescriptor, 6, a0Var, c10.f46288g);
    }

    @Nullable
    public final Color c() {
        return this.f46288g;
    }

    public final int d() {
        return this.f46284c;
    }

    public final int e() {
        return this.f46282a;
    }

    public final long f() {
        return this.f46287f;
    }

    @NotNull
    public final t g() {
        return this.f46285d;
    }

    public final int h() {
        return this.f46283b;
    }

    @NotNull
    public final E i() {
        return this.f46286e;
    }
}
