package yo;

import kotlin.KotlinNothingValueException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends vo.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final a f97948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final zo.c f97949c;

    public i0(@NotNull a aVar, @NotNull xo.a aVar2) {
        tn.p.k(aVar, "lexer");
        tn.p.k(aVar2, "json");
        this.f97948b = aVar;
        this.f97949c = aVar2.a();
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public byte I() {
        a aVar = this.f97948b;
        String strS = aVar.s();
        try {
            return bo.j0.a(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, vo.c
    @NotNull
    public zo.c a() {
        return this.f97949c;
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public long j() {
        a aVar = this.f97948b;
        String strS = aVar.s();
        try {
            return bo.j0.g(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public short n() {
        a aVar = this.f97948b;
        String strS = aVar.s();
        try {
            return bo.j0.j(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vo.a, kotlinx.serialization.encoding.Decoder
    public int u() {
        a aVar = this.f97948b;
        String strS = aVar.s();
        try {
            return bo.j0.d(strS);
        } catch (IllegalArgumentException unused) {
            a.z(aVar, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // vo.c
    public int w(@NotNull SerialDescriptor serialDescriptor) {
        tn.p.k(serialDescriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
