package wo;

import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NoOpEncoder.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class p1 extends vo.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p1 f86584a = new p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final zo.c f86585b = zo.d.a();

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void B(long j10) {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void C() {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void E(char c10) {
    }

    @Override // vo.b
    public void J(@NotNull Object obj) {
        tn.p.k(obj, "value");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    @NotNull
    public zo.c a() {
        return f86585b;
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void e(byte b10) {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void h(@NotNull SerialDescriptor serialDescriptor, int i10) {
        tn.p.k(serialDescriptor, "enumDescriptor");
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void l(short s10) {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void m(boolean z10) {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void n(float f10) {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void t(int i10) {
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void w(@NotNull String str) {
        tn.p.k(str, "value");
    }

    @Override // vo.b, kotlinx.serialization.encoding.Encoder
    public void y(double d10) {
    }
}
