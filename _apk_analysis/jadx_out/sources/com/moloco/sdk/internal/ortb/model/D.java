package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
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

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class D {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final KSerializer<Object>[] f46292d = {null, t.Companion.serializer(), E.Companion.serializer()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final t f46294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final E f46295c;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46298c;

        static {
            a aVar = new a();
            f46296a = aVar;
            f46298c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.VastPrivacyIcon", aVar, 3);
            g2Var.n(VastAttributes.PADDING, false);
            g2Var.n("horizontal_alignment", false);
            g2Var.n("vertical_alignment", false);
            f46297b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final D deserialize(@NotNull Decoder decoder) {
            bn.k kVar;
            int i10;
            t tVar;
            E e10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46297b;
            vo.c cVarB = decoder.b(serialDescriptor);
            KSerializer[] kSerializerArr = D.f46292d;
            if (cVarB.l()) {
                bn.k kVar2 = (bn.k) cVarB.i(serialDescriptor, 0, j3.f86555a, null);
                t tVar2 = (t) cVarB.i(serialDescriptor, 1, kSerializerArr[1], null);
                e10 = (E) cVarB.i(serialDescriptor, 2, kSerializerArr[2], null);
                kVar = kVar2;
                i10 = 7;
                tVar = tVar2;
            } else {
                bn.k kVar3 = null;
                t tVar3 = null;
                E e11 = null;
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
                    } else {
                        if (iW != 2) {
                            throw new UnknownFieldException(iW);
                        }
                        e11 = (E) cVarB.i(serialDescriptor, 2, kSerializerArr[2], e11);
                        i11 |= 4;
                    }
                }
                kVar = kVar3;
                i10 = i11;
                tVar = tVar3;
                e10 = e11;
            }
            cVarB.c(serialDescriptor);
            return new D(i10, kVar, tVar, e10, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull D d10) {
            tn.p.k(encoder, "encoder");
            tn.p.k(d10, "value");
            SerialDescriptor serialDescriptor = f46297b;
            vo.d dVarB = encoder.b(serialDescriptor);
            D.a(d10, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?>[] kSerializerArr = D.f46292d;
            return new KSerializer[]{j3.f86555a, kSerializerArr[1], kSerializerArr[2]};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46297b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<D> serializer() {
            return a.f46296a;
        }
    }

    public /* synthetic */ D(int i10, bn.k kVar, t tVar, E e10, r2 r2Var) {
        if (7 != (i10 & 7)) {
            c2.a(i10, 7, a.f46296a.getDescriptor());
        }
        this.f46293a = kVar.f();
        this.f46294b = tVar;
        this.f46295c = e10;
    }

    public /* synthetic */ D(int i10, bn.k kVar, t tVar, E e10, r2 r2Var, tn.i iVar) {
        this(i10, kVar, tVar, e10, r2Var);
    }

    public static final /* synthetic */ void a(D d10, vo.d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f46292d;
        dVar.g(serialDescriptor, 0, j3.f86555a, bn.k.a(d10.f46293a));
        dVar.g(serialDescriptor, 1, kSerializerArr[1], d10.f46294b);
        dVar.g(serialDescriptor, 2, kSerializerArr[2], d10.f46295c);
    }

    @NotNull
    public final t c() {
        return this.f46294b;
    }

    public final int d() {
        return this.f46293a;
    }

    @NotNull
    public final E e() {
        return this.f46295c;
    }
}
