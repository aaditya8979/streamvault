package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import bn.r;
import com.ironsource.C4157n2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: Vector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\"\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\f\u0010\u000f\u001a\u00020\u0002*\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R!\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R:\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00100\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00107\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010=\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R*\u0010@\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00108\u001a\u0004\bA\u0010:\"\u0004\bB\u0010<R*\u0010C\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00108\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<R*\u0010F\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00108\u001a\u0004\bG\u0010:\"\u0004\bH\u0010<R*\u0010I\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:\"\u0004\bK\u0010<R*\u0010L\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u00108\u001a\u0004\bM\u0010:\"\u0004\bN\u0010<R\u0016\u0010O\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010\"R\u0014\u0010R\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0011\u0010U\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bS\u0010T\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Lbn/r;", "updateClipPath", "updateMatrix", "", "index", C4157n2.f33007p, "insertAt", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "count", "move", "remove", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "draw", "", "toString", "Landroidx/compose/ui/graphics/Matrix;", "groupMatrix", "[F", "", "children", "Ljava/util/List;", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "value", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "", "isClipPathDirty", "Z", "Landroidx/compose/ui/graphics/Path;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/graphics/vector/PathParser;", "parser", "Landroidx/compose/ui/graphics/vector/PathParser;", "Lkotlin/Function0;", "invalidateListener", "Lsn/a;", "getInvalidateListener$ui_release", "()Lsn/a;", "setInvalidateListener$ui_release", "(Lsn/a;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", Key.ROTATION, "F", "getRotation", "()F", "setRotation", "(F)V", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "isMatrixDirty", "getWillClipPath", "()Z", "willClipPath", "getNumChildren", "()I", "numChildren", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class GroupComponent extends VNode {

    @NotNull
    private final List<VNode> children;

    @Nullable
    private Path clipPath;

    @NotNull
    private List<? extends PathNode> clipPathData;

    @Nullable
    private float[] groupMatrix;

    @Nullable
    private a<r> invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;

    @NotNull
    private String name;

    @Nullable
    private PathParser parser;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private float translationX;
    private float translationY;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    private final void updateClipPath() {
        if (getWillClipPath()) {
            PathParser pathParser = this.parser;
            if (pathParser == null) {
                pathParser = new PathParser();
                this.parser = pathParser;
            } else {
                pathParser.clear();
            }
            Path Path = this.clipPath;
            if (Path == null) {
                Path = AndroidPath_androidKt.Path();
                this.clipPath = Path;
            } else {
                Path.reset();
            }
            pathParser.addPathNodes(this.clipPathData).toPath(Path);
        }
    }

    private final void updateMatrix() {
        float[] fArrM1813constructorimpl$default = this.groupMatrix;
        if (fArrM1813constructorimpl$default == null) {
            fArrM1813constructorimpl$default = Matrix.m1813constructorimpl$default(null, 1, null);
            this.groupMatrix = fArrM1813constructorimpl$default;
        } else {
            Matrix.m1822resetimpl(fArrM1813constructorimpl$default);
        }
        Matrix.m1833translateimpl$default(fArrM1813constructorimpl$default, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.m1825rotateZimpl(fArrM1813constructorimpl$default, this.rotation);
        Matrix.m1826scaleimpl(fArrM1813constructorimpl$default, this.scaleX, this.scaleY, 1.0f);
        Matrix.m1833translateimpl$default(fArrM1813constructorimpl$default, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        p.k(drawScope, "<this>");
        if (this.isMatrixDirty) {
            updateMatrix();
            this.isMatrixDirty = false;
        }
        if (this.isClipPathDirty) {
            updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2038getSizeNHjbRc = drawContext.mo2038getSizeNHjbRc();
        drawContext.getCanvas().save();
        DrawTransform transform = drawContext.getTransform();
        float[] fArr = this.groupMatrix;
        if (fArr != null) {
            transform.mo2046transform58bKbWc(Matrix.m1811boximpl(fArr).m1834unboximpl());
        }
        Path path = this.clipPath;
        if (getWillClipPath() && path != null) {
            DrawTransform.m2163clipPathmtrdDE$default(transform, path, 0, 2, null);
        }
        List<VNode> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).draw(drawScope);
        }
        drawContext.getCanvas().restore();
        drawContext.mo2039setSizeuvyYCjk(jMo2038getSizeNHjbRc);
    }

    @NotNull
    public final List<PathNode> getClipPathData() {
        return this.clipPathData;
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    @Nullable
    public a<r> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNumChildren() {
        return this.children.size();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final void insertAt(int i10, @NotNull VNode vNode) {
        p.k(vNode, C4157n2.f33007p);
        if (i10 < getNumChildren()) {
            this.children.set(i10, vNode);
        } else {
            this.children.add(vNode);
        }
        vNode.setInvalidateListener$ui_release(getInvalidateListener$ui_release());
        invalidate();
    }

    public final void move(int i10, int i11, int i12) {
        int i13 = 0;
        if (i10 > i11) {
            while (i13 < i12) {
                VNode vNode = this.children.get(i10);
                this.children.remove(i10);
                this.children.add(i11, vNode);
                i11++;
                i13++;
            }
        } else {
            while (i13 < i12) {
                VNode vNode2 = this.children.get(i10);
                this.children.remove(i10);
                this.children.add(i11 - 1, vNode2);
                i13++;
            }
        }
        invalidate();
    }

    public final void remove(int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (i10 < this.children.size()) {
                this.children.get(i10).setInvalidateListener$ui_release(null);
                this.children.remove(i10);
            }
        }
        invalidate();
    }

    public final void setClipPathData(@NotNull List<? extends PathNode> list) {
        p.k(list, "value");
        this.clipPathData = list;
        this.isClipPathDirty = true;
        invalidate();
    }

    @Override // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(@Nullable a<r> aVar) {
        this.invalidateListener = aVar;
        List<VNode> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).setInvalidateListener$ui_release(aVar);
        }
    }

    public final void setName(@NotNull String str) {
        p.k(str, "value");
        this.name = str;
        invalidate();
    }

    public final void setPivotX(float f10) {
        this.pivotX = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setPivotY(float f10) {
        this.pivotY = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setRotation(float f10) {
        this.rotation = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleX(float f10) {
        this.scaleX = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setScaleY(float f10) {
        this.scaleY = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationX(float f10) {
        this.translationX = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    public final void setTranslationY(float f10) {
        this.translationY = f10;
        this.isMatrixDirty = true;
        invalidate();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VGroup: ");
        sb2.append(this.name);
        List<VNode> list = this.children;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            VNode vNode = list.get(i10);
            sb2.append("\t");
            sb2.append(vNode.toString());
            sb2.append("\n");
        }
        String string = sb2.toString();
        p.j(string, "sb.toString()");
        return string;
    }
}
