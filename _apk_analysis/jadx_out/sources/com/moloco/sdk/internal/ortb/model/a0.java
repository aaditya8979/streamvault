package com.moloco.sdk.internal.ortb.model;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.NotImplementedError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import uo.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements KSerializer<Color> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f46310a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f46311b = uo.j.b("Color", e.i.f85751a);

    public long b(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return ColorKt.Color(android.graphics.Color.parseColor(decoder.q()));
    }

    public void c(@NotNull Encoder encoder, long j10) {
        tn.p.k(encoder, "encoder");
        throw new NotImplementedError("Color encoding is not supported");
    }

    @Override // so.c
    public /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return Color.m1609boximpl(b(decoder));
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f46311b;
    }

    @Override // so.l
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        c(encoder, ((Color) obj).m1629unboximpl());
    }
}
