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
import wo.c2;
import wo.g2;
import wo.j3;
import wo.m0;
import wo.r2;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class z {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46491e = {null, t.Companion.serializer(), E.Companion.serializer(), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final t f46493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final E f46494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46495d;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46498c;

        static {
            a aVar = new a();
            f46496a = aVar;
            f46498c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.ProgressBar", aVar, 4);
            g2Var.n(VastAttributes.PADDING, false);
            g2Var.n("horizontal_alignment", false);
            g2Var.n("vertical_alignment", false);
            g2Var.n("foreground_color", false);
            f46497b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final z deserialize(@NotNull Decoder decoder) {
            bn.k kVar;
            int i10;
            t tVar;
            E e10;
            Color color;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46497b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = z.f46491e;
            if (cVarB.l()) {
                bn.k kVar2 = (bn.k) cVarB.i(serialDescriptor, 0, j3.f86555a, null);
                t tVar2 = (t) cVarB.i(serialDescriptor, 1, kSerializerArr[1], null);
                e10 = (E) cVarB.i(serialDescriptor, 2, kSerializerArr[2], null);
                kVar = kVar2;
                color = (Color) cVarB.i(serialDescriptor, 3, a0.f46310a, null);
                i10 = 15;
                tVar = tVar2;
            } else {
                bn.k kVar3 = null;
                t tVar3 = null;
                E e11 = null;
                Color color2 = null;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        kVar3 = (bn.k) cVarB.i(serialDescriptor, 0, j3.f86555a, kVar3);
                        i11 |= 1;
                    } else if (iW == 1) {
                        tVar3 = (t) cVarB.i(serialDescriptor, 1, kSerializerArr[1], tVar3);
                        i11 |= 2;
                    } else if (iW == 2) {
                        e11 = (E) cVarB.i(serialDescriptor, 2, kSerializerArr[2], e11);
                        i11 |= 4;
                    } else {
                        if (iW != 3) {
                            throw new UnknownFieldException(iW);
                        }
                        color2 = (Color) cVarB.i(serialDescriptor, 3, a0.f46310a, color2);
                        i11 |= 8;
                    }
                }
                kVar = kVar3;
                i10 = i11;
                tVar = tVar3;
                e10 = e11;
                color = color2;
            }
            cVarB.c(serialDescriptor);
            return new z(i10, kVar, tVar, e10, color, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull z zVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(zVar, "value");
            SerialDescriptor serialDescriptor = f46497b;
            vo.d dVarB = encoder.b(serialDescriptor);
            z.a(zVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = z.f46491e;
            return new KSerializer[]{j3.f86555a, kSerializerArr[1], kSerializerArr[2], a0.f46310a};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46497b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<z> serializer() {
            return a.f46496a;
        }
    }

    public /* synthetic */ z(int i10, bn.k kVar, t tVar, E e10, Color color, r2 r2Var) {
        if (15 != (i10 & 15)) {
            c2.a(i10, 15, a.f46496a.getDescriptor());
        }
        this.f46492a = kVar.f();
        this.f46493b = tVar;
        this.f46494c = e10;
        this.f46495d = color.m1629unboximpl();
    }

    public /* synthetic */ z(int i10, bn.k kVar, t tVar, E e10, Color color, r2 r2Var, tn.i iVar) {
        this(i10, kVar, tVar, e10, color, r2Var);
    }

    public z(int i10, t tVar, E e10, long j10) {
        tn.p.k(tVar, "horizontalAlignment");
        tn.p.k(e10, "verticalAlignment");
        this.f46492a = i10;
        this.f46493b = tVar;
        this.f46494c = e10;
        this.f46495d = j10;
    }

    public /* synthetic */ z(int i10, t tVar, E e10, long j10, tn.i iVar) {
        this(i10, tVar, e10, j10);
    }

    public static final /* synthetic */ void a(z zVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46491e;
        dVar.g(serialDescriptor, 0, j3.f86555a, bn.k.a(zVar.f46492a));
        dVar.g(serialDescriptor, 1, kSerializerArr[1], zVar.f46493b);
        dVar.g(serialDescriptor, 2, kSerializerArr[2], zVar.f46494c);
        dVar.g(serialDescriptor, 3, a0.f46310a, Color.m1609boximpl(zVar.f46495d));
    }

    public final long c() {
        return this.f46495d;
    }

    @NotNull
    public final t d() {
        return this.f46493b;
    }

    public final int e() {
        return this.f46492a;
    }

    @NotNull
    public final E f() {
        return this.f46494c;
    }
}
