package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.i;

/* JADX INFO: compiled from: Vertices.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000J\u0019\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002ø\u0001\u0000R \u0010\f\u001a\u00020\u000b8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "encodeColorList", "Landroidx/compose/ui/geometry/Offset;", "points", "", "encodePointList", "Landroidx/compose/ui/graphics/VertexMode;", "vertexMode", "I", "getVertexMode-c2xauaI", "()I", "positions", "[F", "getPositions", "()[F", "textureCoordinates", "getTextureCoordinates", "[I", "getColors", "()[I", "", "indices", "[S", "getIndices", "()[S", "", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ltn/i;)V", "ui-graphics_release"}, k = 1, mv = {1, 6, 0})
public final class Vertices {

    @NotNull
    private final int[] colors;

    @NotNull
    private final short[] indices;

    @NotNull
    private final float[] positions;

    @NotNull
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int i10, final List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        boolean z10;
        this.vertexMode = i10;
        l<Integer, Boolean> lVar = new l<Integer, Boolean>() { // from class: androidx.compose.ui.graphics.Vertices$outOfBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean invoke(int i11) {
                return Boolean.valueOf(i11 < 0 || i11 >= list.size());
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z10 = false;
                break;
            } else {
                if (lVar.invoke(list4.get(i11)).booleanValue()) {
                    z10 = true;
                    break;
                }
                i11++;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i12 = 0; i12 < size2; i12++) {
            sArr[i12] = (short) list4.get(i12).intValue();
        }
        this.indices = sArr;
    }

    public /* synthetic */ Vertices(int i10, List list, List list2, List list3, List list4, i iVar) {
        this(i10, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> colors) {
        int size = colors.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ColorKt.m1674toArgb8_81llA(colors.get(i10).m1629unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> points) {
        int size = points.size() * 2;
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long packedValue = points.get(i10 / 2).getPackedValue();
            fArr[i10] = i10 % 2 == 0 ? Offset.m1383getXimpl(packedValue) : Offset.m1384getYimpl(packedValue);
        }
        return fArr;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @NotNull
    public final short[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* JADX INFO: renamed from: getVertexMode-c2xauaI, reason: not valid java name and from getter */
    public final int getVertexMode() {
        return this.vertexMode;
    }
}
