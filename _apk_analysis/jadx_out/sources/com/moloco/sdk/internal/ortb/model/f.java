package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.internal.ortb.model.v;
import com.moloco.sdk.internal.ortb.model.w;
import com.moloco.sdk.internal.ortb.model.y;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class f {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f46340f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final y f46341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final w f46343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final A f46344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final v f46345e;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46348c;

        static {
            a aVar = new a();
            f46346a = aVar;
            f46348c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.BidExt", aVar, 5);
            g2Var.n("player", true);
            g2Var.n("mtid", true);
            g2Var.n("moloco_sdk_configs", true);
            g2Var.n("moloco_sdk_events", true);
            g2Var.n("moloco_sdk_click_metadata", true);
            f46347b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f deserialize(@NotNull Decoder decoder) {
            y yVar;
            int i10;
            String str;
            w wVar;
            A a10;
            v vVar;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46347b;
            vo.c cVarB = decoder.b(serialDescriptor);
            if (cVarB.l()) {
                y yVar2 = (y) cVarB.C(serialDescriptor, 0, y.a.f46488a, null);
                String str2 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, null);
                w wVar2 = (w) cVarB.C(serialDescriptor, 2, w.a.f46460a, null);
                yVar = yVar2;
                a10 = (A) cVarB.C(serialDescriptor, 3, A.a.f46272a, null);
                vVar = (v) cVarB.C(serialDescriptor, 4, v.a.f46456a, null);
                wVar = wVar2;
                str = str2;
                i10 = 31;
            } else {
                y yVar3 = null;
                String str3 = null;
                w wVar3 = null;
                A a11 = null;
                v vVar2 = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        yVar3 = (y) cVarB.C(serialDescriptor, 0, y.a.f46488a, yVar3);
                        i11 |= 1;
                    } else if (iW == 1) {
                        str3 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str3);
                        i11 |= 2;
                    } else if (iW == 2) {
                        wVar3 = (w) cVarB.C(serialDescriptor, 2, w.a.f46460a, wVar3);
                        i11 |= 4;
                    } else if (iW == 3) {
                        a11 = (A) cVarB.C(serialDescriptor, 3, A.a.f46272a, a11);
                        i11 |= 8;
                    } else {
                        if (iW != 4) {
                            throw new UnknownFieldException(iW);
                        }
                        vVar2 = (v) cVarB.C(serialDescriptor, 4, v.a.f46456a, vVar2);
                        i11 |= 16;
                    }
                }
                yVar = yVar3;
                i10 = i11;
                str = str3;
                wVar = wVar3;
                a10 = a11;
                vVar = vVar2;
            }
            cVarB.c(serialDescriptor);
            return new f(i10, yVar, str, wVar, a10, vVar, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull f fVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(fVar, "value");
            SerialDescriptor serialDescriptor = f46347b;
            vo.d dVarB = encoder.b(serialDescriptor);
            f.b(fVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(y.a.f46488a), to.a.t(w2.f86635a), to.a.t(w.a.f46460a), to.a.t(A.a.f46272a), to.a.t(v.a.f46456a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46347b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<f> serializer() {
            return a.f46346a;
        }
    }

    public f() {
        this((y) null, (String) null, (w) null, (A) null, (v) null, 31, (tn.i) null);
    }

    public /* synthetic */ f(int i10, y yVar, String str, w wVar, A a10, v vVar, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46341a = null;
        } else {
            this.f46341a = yVar;
        }
        if ((i10 & 2) == 0) {
            this.f46342b = null;
        } else {
            this.f46342b = str;
        }
        if ((i10 & 4) == 0) {
            this.f46343c = null;
        } else {
            this.f46343c = wVar;
        }
        if ((i10 & 8) == 0) {
            this.f46344d = null;
        } else {
            this.f46344d = a10;
        }
        if ((i10 & 16) == 0) {
            this.f46345e = null;
        } else {
            this.f46345e = vVar;
        }
    }

    public f(@Nullable y yVar, @Nullable String str, @Nullable w wVar, @Nullable A a10, @Nullable v vVar) {
        this.f46341a = yVar;
        this.f46342b = str;
        this.f46343c = wVar;
        this.f46344d = a10;
        this.f46345e = vVar;
    }

    public /* synthetic */ f(y yVar, String str, w wVar, A a10, v vVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : yVar, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? null : a10, (i10 & 16) != 0 ? null : vVar);
    }

    public static final /* synthetic */ void b(f fVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || fVar.f46341a != null) {
            dVar.f(serialDescriptor, 0, y.a.f46488a, fVar.f46341a);
        }
        if (dVar.r(serialDescriptor, 1) || fVar.f46342b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, fVar.f46342b);
        }
        if (dVar.r(serialDescriptor, 2) || fVar.f46343c != null) {
            dVar.f(serialDescriptor, 2, w.a.f46460a, fVar.f46343c);
        }
        if (dVar.r(serialDescriptor, 3) || fVar.f46344d != null) {
            dVar.f(serialDescriptor, 3, A.a.f46272a, fVar.f46344d);
        }
        if (!dVar.r(serialDescriptor, 4) && fVar.f46345e == null) {
            return;
        }
        dVar.f(serialDescriptor, 4, v.a.f46456a, fVar.f46345e);
    }

    @Nullable
    public final w a() {
        return this.f46343c;
    }

    @Nullable
    public final v c() {
        return this.f46345e;
    }

    @Nullable
    public final String d() {
        return this.f46342b;
    }

    @Nullable
    public final y e() {
        return this.f46341a;
    }

    @Nullable
    public final A f() {
        return this.f46344d;
    }
}
