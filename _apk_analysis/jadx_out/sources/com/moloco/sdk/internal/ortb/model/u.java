package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
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
import wo.v0;
import wo.w2;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class u {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Boolean f46446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Color f46448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Color f46449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Integer f46450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final Integer f46451g;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46454c;

        static {
            a aVar = new a();
            f46452a = aVar;
            f46454c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.InlineTextButton", aVar, 7);
            g2Var.n("text", true);
            g2Var.n("use_icon", true);
            g2Var.n("text_position", true);
            g2Var.n("foreground_color", true);
            g2Var.n("background_color", true);
            g2Var.n("font_size", true);
            g2Var.n("icon_size", true);
            f46453b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u deserialize(@NotNull Decoder decoder) {
            Integer num;
            Color color;
            Integer num2;
            String str;
            Color color2;
            String str2;
            Boolean bool;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46453b;
            vo.c cVarB = decoder.b(serialDescriptor);
            int i11 = 6;
            String str3 = null;
            if (cVarB.l()) {
                w2 w2Var = w2.f86635a;
                String str4 = (String) cVarB.C(serialDescriptor, 0, w2Var, null);
                Boolean bool2 = (Boolean) cVarB.C(serialDescriptor, 1, wo.i.f86540a, null);
                String str5 = (String) cVarB.C(serialDescriptor, 2, w2Var, null);
                a0 a0Var = a0.f46310a;
                Color color3 = (Color) cVarB.C(serialDescriptor, 3, a0Var, null);
                Color color4 = (Color) cVarB.C(serialDescriptor, 4, a0Var, null);
                v0 v0Var = v0.f86626a;
                Integer num3 = (Integer) cVarB.C(serialDescriptor, 5, v0Var, null);
                str = str5;
                num = (Integer) cVarB.C(serialDescriptor, 6, v0Var, null);
                num2 = num3;
                color2 = color3;
                color = color4;
                i10 = 127;
                str2 = str4;
                bool = bool2;
            } else {
                int i12 = 0;
                boolean z10 = true;
                Integer num4 = null;
                Boolean bool3 = null;
                String str6 = null;
                Color color5 = null;
                Color color6 = null;
                Integer num5 = null;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                            break;
                        case 0:
                            str3 = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str3);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            bool3 = (Boolean) cVarB.C(serialDescriptor, 1, wo.i.f86540a, bool3);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            str6 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str6);
                            i12 |= 4;
                            break;
                        case 3:
                            color5 = (Color) cVarB.C(serialDescriptor, 3, a0.f46310a, color5);
                            i12 |= 8;
                            break;
                        case 4:
                            color6 = (Color) cVarB.C(serialDescriptor, 4, a0.f46310a, color6);
                            i12 |= 16;
                            break;
                        case 5:
                            num5 = (Integer) cVarB.C(serialDescriptor, 5, v0.f86626a, num5);
                            i12 |= 32;
                            break;
                        case 6:
                            num4 = (Integer) cVarB.C(serialDescriptor, i11, v0.f86626a, num4);
                            i12 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                num = num4;
                color = color6;
                num2 = num5;
                str = str6;
                color2 = color5;
                str2 = str3;
                bool = bool3;
                i10 = i12;
            }
            cVarB.c(serialDescriptor);
            return new u(i10, str2, bool, str, color2, color, num2, num, null, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull u uVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(uVar, "value");
            SerialDescriptor serialDescriptor = f46453b;
            vo.d dVarB = encoder.b(serialDescriptor);
            u.b(uVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            w2 w2Var = w2.f86635a;
            KSerializer<?> kSerializerT = to.a.t(w2Var);
            KSerializer<?> kSerializerT2 = to.a.t(wo.i.f86540a);
            KSerializer<?> kSerializerT3 = to.a.t(w2Var);
            a0 a0Var = a0.f46310a;
            KSerializer<?> kSerializerT4 = to.a.t(a0Var);
            KSerializer<?> kSerializerT5 = to.a.t(a0Var);
            v0 v0Var = v0.f86626a;
            return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, kSerializerT4, kSerializerT5, to.a.t(v0Var), to.a.t(v0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46453b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<u> serializer() {
            return a.f46452a;
        }
    }

    public /* synthetic */ u(int i10, String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46445a = null;
        } else {
            this.f46445a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46446b = null;
        } else {
            this.f46446b = bool;
        }
        if ((i10 & 4) == 0) {
            this.f46447c = null;
        } else {
            this.f46447c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f46448d = null;
        } else {
            this.f46448d = color;
        }
        if ((i10 & 16) == 0) {
            this.f46449e = null;
        } else {
            this.f46449e = color2;
        }
        if ((i10 & 32) == 0) {
            this.f46450f = null;
        } else {
            this.f46450f = num;
        }
        if ((i10 & 64) == 0) {
            this.f46451g = null;
        } else {
            this.f46451g = num2;
        }
    }

    public /* synthetic */ u(int i10, String str, Boolean bool, String str2, Color color, Color color2, Integer num, Integer num2, r2 r2Var, tn.i iVar) {
        this(i10, str, bool, str2, color, color2, num, num2, r2Var);
    }

    public static final /* synthetic */ void b(u uVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || uVar.f46445a != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, uVar.f46445a);
        }
        if (dVar.r(serialDescriptor, 1) || uVar.f46446b != null) {
            dVar.f(serialDescriptor, 1, wo.i.f86540a, uVar.f46446b);
        }
        if (dVar.r(serialDescriptor, 2) || uVar.f46447c != null) {
            dVar.f(serialDescriptor, 2, w2.f86635a, uVar.f46447c);
        }
        if (dVar.r(serialDescriptor, 3) || uVar.f46448d != null) {
            dVar.f(serialDescriptor, 3, a0.f46310a, uVar.f46448d);
        }
        if (dVar.r(serialDescriptor, 4) || uVar.f46449e != null) {
            dVar.f(serialDescriptor, 4, a0.f46310a, uVar.f46449e);
        }
        if (dVar.r(serialDescriptor, 5) || uVar.f46450f != null) {
            dVar.f(serialDescriptor, 5, v0.f86626a, uVar.f46450f);
        }
        if (!dVar.r(serialDescriptor, 6) && uVar.f46451g == null) {
            return;
        }
        dVar.f(serialDescriptor, 6, v0.f86626a, uVar.f46451g);
    }

    @Nullable
    public final Color a() {
        return this.f46449e;
    }

    @Nullable
    public final Integer c() {
        return this.f46450f;
    }

    @Nullable
    public final Color d() {
        return this.f46448d;
    }

    @Nullable
    public final Integer e() {
        return this.f46451g;
    }

    @Nullable
    public final String f() {
        return this.f46445a;
    }

    @Nullable
    public final String g() {
        return this.f46447c;
    }

    @Nullable
    public final Boolean h() {
        return this.f46446b;
    }
}
