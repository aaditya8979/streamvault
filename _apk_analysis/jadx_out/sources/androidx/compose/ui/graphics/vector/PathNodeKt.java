package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import cn.k0;
import cn.p;
import cn.v;
import cn.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import zn.g;
import zn.i;
import zn.n;

/* JADX INFO: compiled from: PathNode.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\bH\u0082\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\f\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\f\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\f\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\f\"\u0014\u0010\u0014\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\f\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\f\"\u0014\u0010\u0016\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\f\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\f\"\u0014\u0010\u0018\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\f\"\u0014\u0010\u0019\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\f\"\u0014\u0010\u001a\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\f\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\f\"\u0014\u0010\u001c\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\f\"\u0014\u0010\u001d\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\f\"\u0014\u0010\u001e\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\f\"\u0014\u0010\u001f\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\f\"\u0014\u0010 \u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!\"\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!\"\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!\"\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010!\"\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010!\"\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010!\"\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010!\"\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010!¨\u0006*"}, d2 = {"", "", "args", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "toPathNodes", "", "numArgs", "Lkotlin/Function1;", "nodeFor", "pathNodesFromArgs", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", "I", "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 6, 0})
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i10, l<? super float[], ? extends PathNode> lVar) {
        g gVarU = n.u(new i(0, fArr.length - i10), i10);
        ArrayList arrayList = new ArrayList(x.x(gVarU, 10));
        Iterator<Integer> it = gVarU.iterator();
        while (it.hasNext()) {
            int iNextInt = ((k0) it).nextInt();
            ?? R = p.r(fArr, iNextInt, iNextInt + i10);
            Object relativeLineTo = (PathNode) lVar.invoke(R);
            if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.LineTo(R[0], R[1]);
            } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.RelativeLineTo(R[0], R[1]);
            }
            arrayList.add(relativeLineTo);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PathNode> toPathNodes(char c10, @NotNull float[] fArr) {
        ArrayList arrayList;
        tn.p.k(fArr, "args");
        if (c10 == 'z' || c10 == 'Z') {
            return v.e(PathNode.Close.INSTANCE);
        }
        if (c10 == 'm') {
            g gVarU = n.u(new i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(x.x(gVarU, 10));
            Iterator<Integer> it = gVarU.iterator();
            while (it.hasNext()) {
                int iNextInt = ((k0) it).nextInt();
                float[] fArrR = p.r(fArr, iNextInt, iNextInt + 2);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArrR[0], fArrR[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(fArrR[0], fArrR[1]);
                } else if (iNextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArrR[0], fArrR[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c10 == 'M') {
            g gVarU2 = n.u(new i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(x.x(gVarU2, 10));
            Iterator<Integer> it2 = gVarU2.iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((k0) it2).nextInt();
                float[] fArrR2 = p.r(fArr, iNextInt2, iNextInt2 + 2);
                PathNode moveTo = new PathNode.MoveTo(fArrR2[0], fArrR2[1]);
                if (iNextInt2 > 0) {
                    moveTo = new PathNode.LineTo(fArrR2[0], fArrR2[1]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && iNextInt2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(fArrR2[0], fArrR2[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c10 == 'l') {
            g gVarU3 = n.u(new i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(x.x(gVarU3, 10));
            Iterator<Integer> it3 = gVarU3.iterator();
            while (it3.hasNext()) {
                int iNextInt3 = ((k0) it3).nextInt();
                float[] fArrR3 = p.r(fArr, iNextInt3, iNextInt3 + 2);
                PathNode relativeLineTo = new PathNode.RelativeLineTo(fArrR3[0], fArrR3[1]);
                if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt3 > 0) {
                    relativeLineTo = new PathNode.LineTo(fArrR3[0], fArrR3[1]);
                } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt3 > 0) {
                    relativeLineTo = new PathNode.RelativeLineTo(fArrR3[0], fArrR3[1]);
                }
                arrayList.add(relativeLineTo);
            }
        } else if (c10 == 'L') {
            g gVarU4 = n.u(new i(0, fArr.length - 2), 2);
            arrayList = new ArrayList(x.x(gVarU4, 10));
            Iterator<Integer> it4 = gVarU4.iterator();
            while (it4.hasNext()) {
                int iNextInt4 = ((k0) it4).nextInt();
                float[] fArrR4 = p.r(fArr, iNextInt4, iNextInt4 + 2);
                PathNode lineTo = new PathNode.LineTo(fArrR4[0], fArrR4[1]);
                if ((lineTo instanceof PathNode.MoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.LineTo(fArrR4[0], fArrR4[1]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.RelativeLineTo(fArrR4[0], fArrR4[1]);
                }
                arrayList.add(lineTo);
            }
        } else if (c10 == 'h') {
            g gVarU5 = n.u(new i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(x.x(gVarU5, 10));
            Iterator<Integer> it5 = gVarU5.iterator();
            while (it5.hasNext()) {
                int iNextInt5 = ((k0) it5).nextInt();
                float[] fArrR5 = p.r(fArr, iNextInt5, iNextInt5 + 1);
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(fArrR5[0]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(fArrR5[0], fArrR5[1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(fArrR5[0], fArrR5[1]);
                }
                arrayList.add(relativeHorizontalTo);
            }
        } else if (c10 == 'H') {
            g gVarU6 = n.u(new i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(x.x(gVarU6, 10));
            Iterator<Integer> it6 = gVarU6.iterator();
            while (it6.hasNext()) {
                int iNextInt6 = ((k0) it6).nextInt();
                float[] fArrR6 = p.r(fArr, iNextInt6, iNextInt6 + 1);
                PathNode horizontalTo = new PathNode.HorizontalTo(fArrR6[0]);
                if ((horizontalTo instanceof PathNode.MoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.LineTo(fArrR6[0], fArrR6[1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(fArrR6[0], fArrR6[1]);
                }
                arrayList.add(horizontalTo);
            }
        } else if (c10 == 'v') {
            g gVarU7 = n.u(new i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(x.x(gVarU7, 10));
            Iterator<Integer> it7 = gVarU7.iterator();
            while (it7.hasNext()) {
                int iNextInt7 = ((k0) it7).nextInt();
                float[] fArrR7 = p.r(fArr, iNextInt7, iNextInt7 + 1);
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(fArrR7[0]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(fArrR7[0], fArrR7[1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(fArrR7[0], fArrR7[1]);
                }
                arrayList.add(relativeVerticalTo);
            }
        } else if (c10 == 'V') {
            g gVarU8 = n.u(new i(0, fArr.length - 1), 1);
            arrayList = new ArrayList(x.x(gVarU8, 10));
            Iterator<Integer> it8 = gVarU8.iterator();
            while (it8.hasNext()) {
                int iNextInt8 = ((k0) it8).nextInt();
                float[] fArrR8 = p.r(fArr, iNextInt8, iNextInt8 + 1);
                PathNode verticalTo = new PathNode.VerticalTo(fArrR8[0]);
                if ((verticalTo instanceof PathNode.MoveTo) && iNextInt8 > 0) {
                    verticalTo = new PathNode.LineTo(fArrR8[0], fArrR8[1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && iNextInt8 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(fArrR8[0], fArrR8[1]);
                }
                arrayList.add(verticalTo);
            }
        } else {
            char c11 = 5;
            if (c10 == 'c') {
                g gVarU9 = n.u(new i(0, fArr.length - 6), 6);
                arrayList = new ArrayList(x.x(gVarU9, 10));
                Iterator<Integer> it9 = gVarU9.iterator();
                while (it9.hasNext()) {
                    int iNextInt9 = ((k0) it9).nextInt();
                    float[] fArrR9 = p.r(fArr, iNextInt9, iNextInt9 + 6);
                    PathNode relativeCurveTo = new PathNode.RelativeCurveTo(fArrR9[0], fArrR9[1], fArrR9[2], fArrR9[3], fArrR9[4], fArrR9[c11]);
                    arrayList.add((!(relativeCurveTo instanceof PathNode.MoveTo) || iNextInt9 <= 0) ? (!(relativeCurveTo instanceof PathNode.RelativeMoveTo) || iNextInt9 <= 0) ? relativeCurveTo : new PathNode.RelativeLineTo(fArrR9[0], fArrR9[1]) : new PathNode.LineTo(fArrR9[0], fArrR9[1]));
                    c11 = 5;
                }
            } else if (c10 == 'C') {
                g gVarU10 = n.u(new i(0, fArr.length - 6), 6);
                arrayList = new ArrayList(x.x(gVarU10, 10));
                Iterator<Integer> it10 = gVarU10.iterator();
                while (it10.hasNext()) {
                    int iNextInt10 = ((k0) it10).nextInt();
                    float[] fArrR10 = p.r(fArr, iNextInt10, iNextInt10 + 6);
                    PathNode curveTo = new PathNode.CurveTo(fArrR10[0], fArrR10[1], fArrR10[2], fArrR10[3], fArrR10[4], fArrR10[5]);
                    if ((curveTo instanceof PathNode.MoveTo) && iNextInt10 > 0) {
                        curveTo = new PathNode.LineTo(fArrR10[0], fArrR10[1]);
                    } else if ((curveTo instanceof PathNode.RelativeMoveTo) && iNextInt10 > 0) {
                        curveTo = new PathNode.RelativeLineTo(fArrR10[0], fArrR10[1]);
                    }
                    arrayList.add(curveTo);
                }
            } else if (c10 == 's') {
                g gVarU11 = n.u(new i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(x.x(gVarU11, 10));
                Iterator<Integer> it11 = gVarU11.iterator();
                while (it11.hasNext()) {
                    int iNextInt11 = ((k0) it11).nextInt();
                    float[] fArrR11 = p.r(fArr, iNextInt11, iNextInt11 + 4);
                    PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(fArrR11[0], fArrR11[1], fArrR11[2], fArrR11[3]);
                    if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.LineTo(fArrR11[0], fArrR11[1]);
                    } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.RelativeLineTo(fArrR11[0], fArrR11[1]);
                    }
                    arrayList.add(relativeReflectiveCurveTo);
                }
            } else if (c10 == 'S') {
                g gVarU12 = n.u(new i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(x.x(gVarU12, 10));
                Iterator<Integer> it12 = gVarU12.iterator();
                while (it12.hasNext()) {
                    int iNextInt12 = ((k0) it12).nextInt();
                    float[] fArrR12 = p.r(fArr, iNextInt12, iNextInt12 + 4);
                    PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(fArrR12[0], fArrR12[1], fArrR12[2], fArrR12[3]);
                    if ((reflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.LineTo(fArrR12[0], fArrR12[1]);
                    } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.RelativeLineTo(fArrR12[0], fArrR12[1]);
                    }
                    arrayList.add(reflectiveCurveTo);
                }
            } else if (c10 == 'q') {
                g gVarU13 = n.u(new i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(x.x(gVarU13, 10));
                Iterator<Integer> it13 = gVarU13.iterator();
                while (it13.hasNext()) {
                    int iNextInt13 = ((k0) it13).nextInt();
                    float[] fArrR13 = p.r(fArr, iNextInt13, iNextInt13 + 4);
                    PathNode relativeQuadTo = new PathNode.RelativeQuadTo(fArrR13[0], fArrR13[1], fArrR13[2], fArrR13[3]);
                    if ((relativeQuadTo instanceof PathNode.MoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new PathNode.LineTo(fArrR13[0], fArrR13[1]);
                    } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new PathNode.RelativeLineTo(fArrR13[0], fArrR13[1]);
                    }
                    arrayList.add(relativeQuadTo);
                }
            } else if (c10 == 'Q') {
                g gVarU14 = n.u(new i(0, fArr.length - 4), 4);
                arrayList = new ArrayList(x.x(gVarU14, 10));
                Iterator<Integer> it14 = gVarU14.iterator();
                while (it14.hasNext()) {
                    int iNextInt14 = ((k0) it14).nextInt();
                    float[] fArrR14 = p.r(fArr, iNextInt14, iNextInt14 + 4);
                    PathNode quadTo = new PathNode.QuadTo(fArrR14[0], fArrR14[1], fArrR14[2], fArrR14[3]);
                    if ((quadTo instanceof PathNode.MoveTo) && iNextInt14 > 0) {
                        quadTo = new PathNode.LineTo(fArrR14[0], fArrR14[1]);
                    } else if ((quadTo instanceof PathNode.RelativeMoveTo) && iNextInt14 > 0) {
                        quadTo = new PathNode.RelativeLineTo(fArrR14[0], fArrR14[1]);
                    }
                    arrayList.add(quadTo);
                }
            } else if (c10 == 't') {
                g gVarU15 = n.u(new i(0, fArr.length - 2), 2);
                arrayList = new ArrayList(x.x(gVarU15, 10));
                Iterator<Integer> it15 = gVarU15.iterator();
                while (it15.hasNext()) {
                    int iNextInt15 = ((k0) it15).nextInt();
                    float[] fArrR15 = p.r(fArr, iNextInt15, iNextInt15 + 2);
                    PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(fArrR15[0], fArrR15[1]);
                    if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.LineTo(fArrR15[0], fArrR15[1]);
                    } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.RelativeLineTo(fArrR15[0], fArrR15[1]);
                    }
                    arrayList.add(relativeReflectiveQuadTo);
                }
            } else if (c10 == 'T') {
                g gVarU16 = n.u(new i(0, fArr.length - 2), 2);
                arrayList = new ArrayList(x.x(gVarU16, 10));
                Iterator<Integer> it16 = gVarU16.iterator();
                while (it16.hasNext()) {
                    int iNextInt16 = ((k0) it16).nextInt();
                    float[] fArrR16 = p.r(fArr, iNextInt16, iNextInt16 + 2);
                    PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(fArrR16[0], fArrR16[1]);
                    if ((reflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.LineTo(fArrR16[0], fArrR16[1]);
                    } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.RelativeLineTo(fArrR16[0], fArrR16[1]);
                    }
                    arrayList.add(reflectiveQuadTo);
                }
            } else if (c10 == 'a') {
                g gVarU17 = n.u(new i(0, fArr.length - 7), 7);
                arrayList = new ArrayList(x.x(gVarU17, 10));
                Iterator<Integer> it17 = gVarU17.iterator();
                while (it17.hasNext()) {
                    int iNextInt17 = ((k0) it17).nextInt();
                    float[] fArrR17 = p.r(fArr, iNextInt17, iNextInt17 + 7);
                    PathNode relativeArcTo = new PathNode.RelativeArcTo(fArrR17[0], fArrR17[1], fArrR17[2], Float.compare(fArrR17[3], 0.0f) != 0, Float.compare(fArrR17[4], 0.0f) != 0, fArrR17[5], fArrR17[6]);
                    if ((relativeArcTo instanceof PathNode.MoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new PathNode.LineTo(fArrR17[0], fArrR17[1]);
                    } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new PathNode.RelativeLineTo(fArrR17[0], fArrR17[1]);
                    }
                    arrayList.add(relativeArcTo);
                }
            } else {
                if (c10 != 'A') {
                    throw new IllegalArgumentException("Unknown command for: " + c10);
                }
                g gVarU18 = n.u(new i(0, fArr.length - 7), 7);
                arrayList = new ArrayList(x.x(gVarU18, 10));
                Iterator<Integer> it18 = gVarU18.iterator();
                while (it18.hasNext()) {
                    int iNextInt18 = ((k0) it18).nextInt();
                    float[] fArrR18 = p.r(fArr, iNextInt18, iNextInt18 + 7);
                    PathNode arcTo = new PathNode.ArcTo(fArrR18[0], fArrR18[1], fArrR18[2], Float.compare(fArrR18[3], 0.0f) != 0, Float.compare(fArrR18[4], 0.0f) != 0, fArrR18[5], fArrR18[6]);
                    if ((arcTo instanceof PathNode.MoveTo) && iNextInt18 > 0) {
                        arcTo = new PathNode.LineTo(fArrR18[0], fArrR18[1]);
                    } else if ((arcTo instanceof PathNode.RelativeMoveTo) && iNextInt18 > 0) {
                        arcTo = new PathNode.RelativeLineTo(fArrR18[0], fArrR18[1]);
                    }
                    arrayList.add(arcTo);
                }
            }
        }
        return arrayList;
    }
}
