package com.yandex.div.internal.graphics;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: Colormap.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class Colormap {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final Colormap EMPTY = new Colormap(new int[0], 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    @NotNull
    private final int[] colors;

    @Nullable
    private final float[] positions;

    /* JADX INFO: compiled from: Colormap.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public Colormap(@NotNull int[] iArr, @Nullable float[] fArr) {
        this.colors = iArr;
        this.positions = fArr;
        if (!(iArr.length == (fArr != null ? fArr.length : iArr.length))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ Colormap(int[] iArr, float[] fArr, int i10, i iVar) {
        this(iArr, (i10 & 2) != 0 ? null : fArr);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p.f(Colormap.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p.i(obj, "null cannot be cast to non-null type com.yandex.div.internal.graphics.Colormap");
        Colormap colormap = (Colormap) obj;
        return Arrays.equals(this.colors, colormap.colors) && Arrays.equals(this.positions, colormap.positions);
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @Nullable
    public final float[] getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.colors) * 31;
        float[] fArr = this.positions;
        return iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }
}
