package wo;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a<Element, Collection, Builder> implements KSerializer<Collection> {
    public a() {
    }

    public /* synthetic */ a(tn.i iVar) {
        this();
    }

    public static /* synthetic */ void j(a aVar, vo.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.i(cVar, i10, obj, z10);
    }

    public abstract Builder b();

    public abstract int c(Builder builder);

    public abstract void d(Builder builder, int i10);

    @Override // so.c
    public Collection deserialize(@NotNull Decoder decoder) {
        tn.p.k(decoder, "decoder");
        return g(decoder, null);
    }

    @NotNull
    public abstract Iterator<Element> e(Collection collection);

    public abstract int f(Collection collection);

    public final Collection g(@NotNull Decoder decoder, @Nullable Collection collection) {
        Builder builderB;
        tn.p.k(decoder, "decoder");
        if (collection == null || (builderB = l(collection)) == null) {
            builderB = b();
        }
        int iC = c(builderB);
        vo.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.l()) {
            while (true) {
                int iW = cVarB.w(getDescriptor());
                if (iW == -1) {
                    break;
                }
                j(this, cVarB, iC + iW, builderB, false, 8, null);
            }
        } else {
            h(cVarB, builderB, iC, k(cVarB, builderB));
        }
        cVarB.c(getDescriptor());
        return m(builderB);
    }

    public abstract void h(@NotNull vo.c cVar, Builder builder, int i10, int i11);

    public abstract void i(@NotNull vo.c cVar, int i10, Builder builder, boolean z10);

    public final int k(vo.c cVar, Builder builder) {
        int iV = cVar.v(getDescriptor());
        d(builder, iV);
        return iV;
    }

    public abstract Builder l(Collection collection);

    public abstract Collection m(Builder builder);
}
