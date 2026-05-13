package com.yandex.div.core.util;

import cn.f0;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAbsoluteEdgeInsets;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivFixedSize;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSizeUnitValue;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivTransform;
import fn.b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DivDataExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivDataExtensionsKt {
    public static final boolean equalsToConstant(@Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets, @Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets2) {
        if (divAbsoluteEdgeInsets == null && divAbsoluteEdgeInsets2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f54123b : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f54123b : null)) {
            if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f54125d : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f54125d : null)) {
                if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f54124c : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f54124c : null)) {
                    if (ExpressionsKt.equalsToConstant(divAbsoluteEdgeInsets != null ? divAbsoluteEdgeInsets.f54122a : null, divAbsoluteEdgeInsets2 != null ? divAbsoluteEdgeInsets2.f54122a : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean equalsToConstant(@org.jetbrains.annotations.Nullable com.yandex.div2.DivBackground r7, @org.jetbrains.annotations.Nullable com.yandex.div2.DivBackground r8) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.DivDataExtensionsKt.equalsToConstant(com.yandex.div2.DivBackground, com.yandex.div2.DivBackground):boolean");
    }

    public static final boolean equalsToConstant(@Nullable DivBorder divBorder, @Nullable DivBorder divBorder2) {
        if (divBorder == null && divBorder2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divBorder != null ? divBorder.f54682a : null, divBorder2 != null ? divBorder2.f54682a : null)) {
            if (equalsToConstant(divBorder != null ? divBorder.f54683b : null, divBorder2 != null ? divBorder2.f54683b : null)) {
                if (ExpressionsKt.equalsToConstant(divBorder != null ? divBorder.f54684c : null, divBorder2 != null ? divBorder2.f54684c : null)) {
                    if (equalsToConstant(divBorder != null ? divBorder.f54685d : null, divBorder2 != null ? divBorder2.f54685d : null)) {
                        if (equalsToConstant(divBorder != null ? divBorder.f54686e : null, divBorder2 != null ? divBorder2.f54686e : null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivCornersRadius divCornersRadius, @Nullable DivCornersRadius divCornersRadius2) {
        if (divCornersRadius == null && divCornersRadius2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f54983c : null, divCornersRadius2 != null ? divCornersRadius2.f54983c : null)) {
            if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f54984d : null, divCornersRadius2 != null ? divCornersRadius2.f54984d : null)) {
                if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f54982b : null, divCornersRadius2 != null ? divCornersRadius2.f54982b : null)) {
                    if (ExpressionsKt.equalsToConstant(divCornersRadius != null ? divCornersRadius.f54981a : null, divCornersRadius2 != null ? divCornersRadius2.f54981a : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivDimension divDimension, @Nullable DivDimension divDimension2) {
        if (divDimension == null && divDimension2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divDimension != null ? divDimension.f55127a : null, divDimension2 != null ? divDimension2.f55127a : null)) {
            if (ExpressionsKt.equalsToConstant(divDimension != null ? divDimension.f55128b : null, divDimension2 != null ? divDimension2.f55128b : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivDrawable divDrawable, @Nullable DivDrawable divDrawable2) {
        if (divDrawable == null) {
            if (divDrawable2 == null) {
                return true;
            }
        } else {
            if (!(divDrawable instanceof DivDrawable.b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (divDrawable2 instanceof DivDrawable.b) {
                DivDrawable.b bVar = (DivDrawable.b) divDrawable;
                DivDrawable.b bVar2 = (DivDrawable.b) divDrawable2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f56933a, bVar2.c().f56933a) && equalsToConstant(bVar.c().f56934b, bVar2.c().f56934b) && equalsToConstant(bVar.c().f56935c, bVar2.c().f56935c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivEdgeInsets divEdgeInsets, @Nullable DivEdgeInsets divEdgeInsets2) {
        if (divEdgeInsets == null && divEdgeInsets2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f55201c : null, divEdgeInsets2 != null ? divEdgeInsets2.f55201c : null)) {
            if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f55204f : null, divEdgeInsets2 != null ? divEdgeInsets2.f55204f : null)) {
                if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f55202d : null, divEdgeInsets2 != null ? divEdgeInsets2.f55202d : null)) {
                    if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f55199a : null, divEdgeInsets2 != null ? divEdgeInsets2.f55199a : null)) {
                        if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f55203e : null, divEdgeInsets2 != null ? divEdgeInsets2.f55203e : null)) {
                            if (ExpressionsKt.equalsToConstant(divEdgeInsets != null ? divEdgeInsets.f55200b : null, divEdgeInsets2 != null ? divEdgeInsets2.f55200b : null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivFilter divFilter, @Nullable DivFilter divFilter2) {
        if (divFilter == null) {
            if (divFilter2 == null) {
                return true;
            }
        } else {
            if (divFilter instanceof DivFilter.c) {
                return divFilter2 instanceof DivFilter.c;
            }
            if (!(divFilter instanceof DivFilter.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divFilter2 instanceof DivFilter.a) && ExpressionsKt.equalsToConstant(((DivFilter.a) divFilter).c().f54674a, ((DivFilter.a) divFilter2).c().f54674a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivFixedSize divFixedSize, @Nullable DivFixedSize divFixedSize2) {
        if (divFixedSize == null && divFixedSize2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divFixedSize != null ? divFixedSize.f55333b : null, divFixedSize2 != null ? divFixedSize2.f55333b : null)) {
            if (ExpressionsKt.equalsToConstant(divFixedSize != null ? divFixedSize.f55332a : null, divFixedSize2 != null ? divFixedSize2.f55332a : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivInput.NativeInterface nativeInterface, @Nullable DivInput.NativeInterface nativeInterface2) {
        if (nativeInterface == null && nativeInterface2 == null) {
            return true;
        }
        return ExpressionsKt.equalsToConstant(nativeInterface != null ? nativeInterface.f55999a : null, nativeInterface2 != null ? nativeInterface2.f55999a : null);
    }

    public static final boolean equalsToConstant(@Nullable DivLinearGradient.ColorPoint colorPoint, @Nullable DivLinearGradient.ColorPoint colorPoint2) {
        if (colorPoint == null && colorPoint2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(colorPoint != null ? colorPoint.f56189a : null, colorPoint2 != null ? colorPoint2.f56189a : null)) {
            if (ExpressionsKt.equalsToConstant(colorPoint != null ? colorPoint.f56190b : null, colorPoint2 != null ? colorPoint2.f56190b : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivPivot divPivot, @Nullable DivPivot divPivot2) {
        if (divPivot == null) {
            if (divPivot2 == null) {
                return true;
            }
        } else if (divPivot instanceof DivPivot.b) {
            if (divPivot2 instanceof DivPivot.b) {
                DivPivot.b bVar = (DivPivot.b) divPivot;
                DivPivot.b bVar2 = (DivPivot.b) divPivot2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f56537b, bVar2.c().f56537b) && ExpressionsKt.equalsToConstant(bVar.c().f56536a, bVar2.c().f56536a)) {
                    return true;
                }
            }
        } else {
            if (!(divPivot instanceof DivPivot.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divPivot2 instanceof DivPivot.c) && ExpressionsKt.equalsToConstant(((DivPivot.c) divPivot).c().f56552a, ((DivPivot.c) divPivot2).c().f56552a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivPoint divPoint, @Nullable DivPoint divPoint2) {
        if (divPoint == null && divPoint2 == null) {
            return true;
        }
        if (equalsToConstant(divPoint != null ? divPoint.f56563a : null, divPoint2 != null ? divPoint2.f56563a : null)) {
            if (equalsToConstant(divPoint != null ? divPoint.f56564b : null, divPoint2 != null ? divPoint2.f56564b : null)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivRadialGradientCenter divRadialGradientCenter, @Nullable DivRadialGradientCenter divRadialGradientCenter2) {
        if (divRadialGradientCenter == null) {
            if (divRadialGradientCenter2 == null) {
                return true;
            }
        } else if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            if (divRadialGradientCenter2 instanceof DivRadialGradientCenter.b) {
                DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
                DivRadialGradientCenter.b bVar2 = (DivRadialGradientCenter.b) divRadialGradientCenter2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f56598a, bVar2.c().f56598a) && ExpressionsKt.equalsToConstant(bVar.c().f56599b, bVar2.c().f56599b)) {
                    return true;
                }
            }
        } else {
            if (!(divRadialGradientCenter instanceof DivRadialGradientCenter.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divRadialGradientCenter2 instanceof DivRadialGradientCenter.c) && ExpressionsKt.equalsToConstant(((DivRadialGradientCenter.c) divRadialGradientCenter).c().f56623a, ((DivRadialGradientCenter.c) divRadialGradientCenter2).c().f56623a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivRadialGradientRadius divRadialGradientRadius, @Nullable DivRadialGradientRadius divRadialGradientRadius2) {
        if (divRadialGradientRadius == null) {
            if (divRadialGradientRadius2 == null) {
                return true;
            }
        } else if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            if (divRadialGradientRadius2 instanceof DivRadialGradientRadius.b) {
                DivRadialGradientRadius.b bVar = (DivRadialGradientRadius.b) divRadialGradientRadius;
                DivRadialGradientRadius.b bVar2 = (DivRadialGradientRadius.b) divRadialGradientRadius2;
                if (ExpressionsKt.equalsToConstant(bVar.c().f55332a, bVar2.c().f55332a) && ExpressionsKt.equalsToConstant(bVar.c().f55333b, bVar2.c().f55333b)) {
                    return true;
                }
            }
        } else {
            if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if ((divRadialGradientRadius2 instanceof DivRadialGradientRadius.c) && ExpressionsKt.equalsToConstant(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f56630a, ((DivRadialGradientRadius.c) divRadialGradientRadius2).c().f56630a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivShadow divShadow, @Nullable DivShadow divShadow2) {
        if (divShadow == null && divShadow2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.f56912a : null, divShadow2 != null ? divShadow2.f56912a : null)) {
            if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.f56913b : null, divShadow2 != null ? divShadow2.f56913b : null)) {
                if (ExpressionsKt.equalsToConstant(divShadow != null ? divShadow.f56914c : null, divShadow2 != null ? divShadow2.f56914c : null)) {
                    if (equalsToConstant(divShadow != null ? divShadow.f56915d : null, divShadow2 != null ? divShadow2.f56915d : null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivShape divShape, @Nullable DivShape divShape2) {
        if (divShape == null) {
            if (divShape2 == null) {
                return true;
            }
        } else if (divShape instanceof DivShape.c) {
            if (divShape2 instanceof DivShape.c) {
                DivShape.c cVar = (DivShape.c) divShape;
                DivShape.c cVar2 = (DivShape.c) divShape2;
                if (ExpressionsKt.equalsToConstant(cVar.c().f56660a, cVar2.c().f56660a) && equalsToConstant(cVar.c().f56664e, cVar2.c().f56664e) && equalsToConstant(cVar.c().f56663d, cVar2.c().f56663d) && equalsToConstant(cVar.c().f56662c, cVar2.c().f56662c) && equalsToConstant(cVar.c().f56661b, cVar2.c().f56661b)) {
                    return true;
                }
            }
        } else {
            if (!(divShape instanceof DivShape.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (divShape2 instanceof DivShape.a) {
                DivShape.a aVar = (DivShape.a) divShape;
                DivShape.a aVar2 = (DivShape.a) divShape2;
                if (ExpressionsKt.equalsToConstant(aVar.c().f54743a, aVar2.c().f54743a) && equalsToConstant(aVar.c().f54745c, aVar2.c().f54745c) && equalsToConstant(aVar.c().f54744b, aVar2.c().f54744b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivSize divSize, @Nullable DivSize divSize2) {
        if (divSize == null) {
            if (divSize2 == null) {
                return true;
            }
        } else if (!(divSize instanceof DivSize.b)) {
            if (divSize instanceof DivSize.c) {
                if (divSize2 instanceof DivSize.c) {
                    DivSize.c cVar = (DivSize.c) divSize;
                    DivSize.c cVar2 = (DivSize.c) divSize2;
                    if (ExpressionsKt.equalsToConstant(cVar.c().f56206c, cVar2.c().f56206c)) {
                        DivSizeUnitValue divSizeUnitValue = cVar.c().f56205b;
                        Expression<Long> expression = divSizeUnitValue != null ? divSizeUnitValue.f56962b : null;
                        DivSizeUnitValue divSizeUnitValue2 = cVar2.c().f56205b;
                        if (ExpressionsKt.equalsToConstant(expression, divSizeUnitValue2 != null ? divSizeUnitValue2.f56962b : null)) {
                            DivSizeUnitValue divSizeUnitValue3 = cVar.c().f56205b;
                            Expression<DivSizeUnit> expression2 = divSizeUnitValue3 != null ? divSizeUnitValue3.f56961a : null;
                            DivSizeUnitValue divSizeUnitValue4 = cVar2.c().f56205b;
                            if (ExpressionsKt.equalsToConstant(expression2, divSizeUnitValue4 != null ? divSizeUnitValue4.f56961a : null)) {
                                DivSizeUnitValue divSizeUnitValue5 = cVar.c().f56204a;
                                Expression<Long> expression3 = divSizeUnitValue5 != null ? divSizeUnitValue5.f56962b : null;
                                DivSizeUnitValue divSizeUnitValue6 = cVar2.c().f56204a;
                                if (ExpressionsKt.equalsToConstant(expression3, divSizeUnitValue6 != null ? divSizeUnitValue6.f56962b : null)) {
                                    DivSizeUnitValue divSizeUnitValue7 = cVar.c().f56204a;
                                    Expression<DivSizeUnit> expression4 = divSizeUnitValue7 != null ? divSizeUnitValue7.f56961a : null;
                                    DivSizeUnitValue divSizeUnitValue8 = cVar2.c().f56204a;
                                    if (ExpressionsKt.equalsToConstant(expression4, divSizeUnitValue8 != null ? divSizeUnitValue8.f56961a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (!(divSize instanceof DivSize.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (divSize2 instanceof DivSize.d) {
                    DivSize.d dVar = (DivSize.d) divSize;
                    DivSize.d dVar2 = (DivSize.d) divSize2;
                    if (ExpressionsKt.equalsToConstant(dVar.c().f58270a, dVar2.c().f58270a)) {
                        DivSizeUnitValue divSizeUnitValue9 = dVar.c().f58272c;
                        Expression<Long> expression5 = divSizeUnitValue9 != null ? divSizeUnitValue9.f56962b : null;
                        DivSizeUnitValue divSizeUnitValue10 = dVar2.c().f58272c;
                        if (ExpressionsKt.equalsToConstant(expression5, divSizeUnitValue10 != null ? divSizeUnitValue10.f56962b : null)) {
                            DivSizeUnitValue divSizeUnitValue11 = dVar.c().f58272c;
                            Expression<DivSizeUnit> expression6 = divSizeUnitValue11 != null ? divSizeUnitValue11.f56961a : null;
                            DivSizeUnitValue divSizeUnitValue12 = dVar2.c().f58272c;
                            if (ExpressionsKt.equalsToConstant(expression6, divSizeUnitValue12 != null ? divSizeUnitValue12.f56961a : null)) {
                                DivSizeUnitValue divSizeUnitValue13 = dVar.c().f58271b;
                                Expression<Long> expression7 = divSizeUnitValue13 != null ? divSizeUnitValue13.f56962b : null;
                                DivSizeUnitValue divSizeUnitValue14 = dVar2.c().f58271b;
                                if (ExpressionsKt.equalsToConstant(expression7, divSizeUnitValue14 != null ? divSizeUnitValue14.f56962b : null)) {
                                    DivSizeUnitValue divSizeUnitValue15 = dVar.c().f58271b;
                                    Expression<DivSizeUnit> expression8 = divSizeUnitValue15 != null ? divSizeUnitValue15.f56961a : null;
                                    DivSizeUnitValue divSizeUnitValue16 = dVar2.c().f58271b;
                                    if (ExpressionsKt.equalsToConstant(expression8, divSizeUnitValue16 != null ? divSizeUnitValue16.f56961a : null)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (divSize2 instanceof DivSize.b) {
            DivSize.b bVar = (DivSize.b) divSize;
            DivSize.b bVar2 = (DivSize.b) divSize2;
            if (ExpressionsKt.equalsToConstant(bVar.c().f55333b, bVar2.c().f55333b) && ExpressionsKt.equalsToConstant(bVar.c().f55332a, bVar2.c().f55332a)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivStroke divStroke, @Nullable DivStroke divStroke2) {
        if (divStroke == null && divStroke2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.f57276a : null, divStroke2 != null ? divStroke2.f57276a : null)) {
            if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.f57279d : null, divStroke2 != null ? divStroke2.f57279d : null)) {
                if (ExpressionsKt.equalsToConstant(divStroke != null ? divStroke.f57278c : null, divStroke2 != null ? divStroke2.f57278c : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean equalsToConstant(@Nullable DivTransform divTransform, @Nullable DivTransform divTransform2) {
        if (divTransform == null && divTransform2 == null) {
            return true;
        }
        if (ExpressionsKt.equalsToConstant(divTransform != null ? divTransform.f58046c : null, divTransform2 != null ? divTransform2.f58046c : null)) {
            if (equalsToConstant(divTransform != null ? divTransform.f58044a : null, divTransform2 != null ? divTransform2.f58044a : null)) {
                if (equalsToConstant(divTransform != null ? divTransform.f58045b : null, divTransform2 != null ? divTransform2.f58045b : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean isConstant(@Nullable DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
        if (divAbsoluteEdgeInsets == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f54123b) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f54125d) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f54124c) && ExpressionsKt.isConstant(divAbsoluteEdgeInsets.f54122a);
    }

    public static final boolean isConstant(@Nullable DivBackground divBackground) {
        boolean z10;
        if (divBackground != null) {
            if (divBackground instanceof DivBackground.f) {
                return ExpressionsKt.isConstant(((DivBackground.f) divBackground).c().f57151a);
            }
            if (divBackground instanceof DivBackground.b) {
                DivBackground.b bVar = (DivBackground.b) divBackground;
                if (!ExpressionsKt.isConstant(bVar.c().f55731a) || !ExpressionsKt.isConstant(bVar.c().f55732b) || !ExpressionsKt.isConstant(bVar.c().f55733c)) {
                    return false;
                }
                List<DivFilter> list = bVar.c().f55734d;
                if (list != null && !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (!isConstant((DivFilter) it.next())) {
                            z10 = false;
                            break;
                        }
                    }
                    z10 = true;
                    return z10 ? false : false;
                }
                z10 = true;
                if (z10 || !ExpressionsKt.isConstant(bVar.c().f55735e) || !ExpressionsKt.isConstant(bVar.c().f55736f) || !ExpressionsKt.isConstant(bVar.c().f55737g)) {
                    return false;
                }
            } else if (divBackground instanceof DivBackground.c) {
                DivBackground.c cVar = (DivBackground.c) divBackground;
                if (!ExpressionsKt.isConstant(cVar.c().f56183a) || !ExpressionsKt.isConstantOrNull(cVar.c().f56185c)) {
                    return false;
                }
            } else if (divBackground instanceof DivBackground.e) {
                DivBackground.e eVar = (DivBackground.e) divBackground;
                if (!isConstant(eVar.c().f56575a) || !isConstant(eVar.c().f56576b) || !ExpressionsKt.isConstantOrNull(eVar.c().f56578d) || !isConstant(eVar.c().f56579e)) {
                    return false;
                }
            } else {
                if (!(divBackground instanceof DivBackground.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                DivBackground.d dVar = (DivBackground.d) divBackground;
                if (!ExpressionsKt.isConstant(dVar.c().f56222a) || !isConstant(dVar.c().f56223b)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivBorder divBorder) {
        if (divBorder == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divBorder.f54682a) && isConstant(divBorder.f54683b) && ExpressionsKt.isConstant(divBorder.f54684c) && isConstant(divBorder.f54685d) && isConstant(divBorder.f54686e);
    }

    public static final boolean isConstant(@Nullable DivCornersRadius divCornersRadius) {
        if (divCornersRadius == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divCornersRadius.f54983c) && ExpressionsKt.isConstantOrNull(divCornersRadius.f54984d) && ExpressionsKt.isConstantOrNull(divCornersRadius.f54982b) && ExpressionsKt.isConstantOrNull(divCornersRadius.f54981a);
    }

    public static final boolean isConstant(@Nullable DivDimension divDimension) {
        if (divDimension == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divDimension.f55127a) && ExpressionsKt.isConstant(divDimension.f55128b);
    }

    public static final boolean isConstant(@Nullable DivDrawable divDrawable) {
        if (divDrawable == null) {
            return true;
        }
        if (!(divDrawable instanceof DivDrawable.b)) {
            throw new NoWhenBranchMatchedException();
        }
        DivDrawable.b bVar = (DivDrawable.b) divDrawable;
        return ExpressionsKt.isConstant(bVar.c().f56933a) && isConstant(bVar.c().f56934b) && isConstant(bVar.c().f56935c);
    }

    public static final boolean isConstant(@Nullable DivEdgeInsets divEdgeInsets) {
        if (divEdgeInsets == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divEdgeInsets.f55201c) && ExpressionsKt.isConstant(divEdgeInsets.f55204f) && ExpressionsKt.isConstant(divEdgeInsets.f55202d) && ExpressionsKt.isConstant(divEdgeInsets.f55199a) && ExpressionsKt.isConstantOrNull(divEdgeInsets.f55203e) && ExpressionsKt.isConstantOrNull(divEdgeInsets.f55200b);
    }

    public static final boolean isConstant(@Nullable DivFilter divFilter) {
        if (divFilter == null || (divFilter instanceof DivFilter.c)) {
            return true;
        }
        if (divFilter instanceof DivFilter.a) {
            return ExpressionsKt.isConstant(((DivFilter.a) divFilter).c().f54674a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(@Nullable DivFixedSize divFixedSize) {
        if (divFixedSize == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divFixedSize.f55333b) && ExpressionsKt.isConstant(divFixedSize.f55332a);
    }

    public static final boolean isConstant(@Nullable DivInput.NativeInterface nativeInterface) {
        if (nativeInterface == null) {
            return true;
        }
        return ExpressionsKt.isConstant(nativeInterface.f55999a);
    }

    public static final boolean isConstant(@Nullable DivLinearGradient.ColorPoint colorPoint) {
        if (colorPoint == null) {
            return true;
        }
        return ExpressionsKt.isConstant(colorPoint.f56189a) && ExpressionsKt.isConstant(colorPoint.f56190b);
    }

    public static final boolean isConstant(@Nullable DivPivot divPivot) {
        if (divPivot == null) {
            return true;
        }
        if (divPivot instanceof DivPivot.b) {
            DivPivot.b bVar = (DivPivot.b) divPivot;
            return ExpressionsKt.isConstantOrNull(bVar.c().f56537b) && ExpressionsKt.isConstantOrNull(bVar.c().f56537b);
        }
        if (divPivot instanceof DivPivot.c) {
            return ExpressionsKt.isConstant(((DivPivot.c) divPivot).c().f56552a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(@Nullable DivPoint divPoint) {
        if (divPoint == null) {
            return true;
        }
        return isConstant(divPoint.f56563a) && isConstant(divPoint.f56564b);
    }

    public static final boolean isConstant(@Nullable DivRadialGradientCenter divRadialGradientCenter) {
        if (divRadialGradientCenter == null) {
            return true;
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
            return ExpressionsKt.isConstant(bVar.c().f56598a) && ExpressionsKt.isConstant(bVar.c().f56599b);
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return ExpressionsKt.isConstant(((DivRadialGradientCenter.c) divRadialGradientCenter).c().f56623a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(@Nullable DivRadialGradientRadius divRadialGradientRadius) {
        if (divRadialGradientRadius == null) {
            return true;
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            DivRadialGradientRadius.b bVar = (DivRadialGradientRadius.b) divRadialGradientRadius;
            return ExpressionsKt.isConstant(bVar.c().f55332a) && ExpressionsKt.isConstant(bVar.c().f55333b);
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
            return ExpressionsKt.isConstant(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f56630a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean isConstant(@Nullable DivShadow divShadow) {
        if (divShadow == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divShadow.f56912a) && ExpressionsKt.isConstant(divShadow.f56913b) && ExpressionsKt.isConstant(divShadow.f56914c) && isConstant(divShadow.f56915d);
    }

    public static final boolean isConstant(@Nullable DivShape divShape) {
        if (divShape != null) {
            if (divShape instanceof DivShape.c) {
                DivShape.c cVar = (DivShape.c) divShape;
                if (!ExpressionsKt.isConstantOrNull(cVar.c().f56660a) || !isConstant(cVar.c().f56664e) || !isConstant(cVar.c().f56663d) || !isConstant(cVar.c().f56662c) || !isConstant(cVar.c().f56661b)) {
                    return false;
                }
            } else {
                if (!(divShape instanceof DivShape.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                DivShape.a aVar = (DivShape.a) divShape;
                if (!ExpressionsKt.isConstantOrNull(aVar.c().f54743a)) {
                    return false;
                }
                DivStroke divStroke = aVar.c().f54745c;
                if (((divStroke == null || isConstant(divStroke)) ? false : true) || !isConstant(aVar.c().f54744b)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivSize divSize) {
        if (divSize != null) {
            if (divSize instanceof DivSize.b) {
                DivSize.b bVar = (DivSize.b) divSize;
                if (!ExpressionsKt.isConstant(bVar.c().f55333b) || !ExpressionsKt.isConstant(bVar.c().f55332a)) {
                    return false;
                }
            } else {
                if (divSize instanceof DivSize.c) {
                    DivSize.c cVar = (DivSize.c) divSize;
                    if (!ExpressionsKt.isConstantOrNull(cVar.c().f56206c)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue = cVar.c().f56205b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue != null ? divSizeUnitValue.f56962b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue2 = cVar.c().f56205b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue2 != null ? divSizeUnitValue2.f56961a : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue3 = cVar.c().f56204a;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue3 != null ? divSizeUnitValue3.f56962b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue4 = cVar.c().f56204a;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue4 != null ? divSizeUnitValue4.f56961a : null)) {
                        return false;
                    }
                } else {
                    if (!(divSize instanceof DivSize.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    DivSize.d dVar = (DivSize.d) divSize;
                    if (!ExpressionsKt.isConstantOrNull(dVar.c().f58270a)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue5 = dVar.c().f58272c;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue5 != null ? divSizeUnitValue5.f56962b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue6 = dVar.c().f58272c;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue6 != null ? divSizeUnitValue6.f56961a : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue7 = dVar.c().f58271b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue7 != null ? divSizeUnitValue7.f56962b : null)) {
                        return false;
                    }
                    DivSizeUnitValue divSizeUnitValue8 = dVar.c().f58271b;
                    if (!ExpressionsKt.isConstantOrNull(divSizeUnitValue8 != null ? divSizeUnitValue8.f56961a : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean isConstant(@Nullable DivStroke divStroke) {
        if (divStroke == null) {
            return true;
        }
        return ExpressionsKt.isConstant(divStroke.f57276a) && ExpressionsKt.isConstant(divStroke.f57279d) && ExpressionsKt.isConstant(divStroke.f57278c);
    }

    public static final boolean isConstant(@Nullable DivTransform divTransform) {
        if (divTransform == null) {
            return true;
        }
        return ExpressionsKt.isConstantOrNull(divTransform.f58046c) && isConstant(divTransform.f58044a) && isConstant(divTransform.f58045b);
    }

    @NotNull
    public static final Colormap toColormap(@NotNull DivLinearGradient divLinearGradient, @NotNull final ExpressionResolver expressionResolver) {
        List<DivLinearGradient.ColorPoint> list = divLinearGradient.f56184b;
        List listX0 = list != null ? f0.X0(list, new Comparator() { // from class: com.yandex.div.core.util.DivDataExtensionsKt$toColormap$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return b.d(((DivLinearGradient.ColorPoint) t10).f56190b.evaluate(expressionResolver), ((DivLinearGradient.ColorPoint) t11).f56190b.evaluate(expressionResolver));
            }
        }) : null;
        ExpressionList<Integer> expressionList = divLinearGradient.f56185c;
        if (listX0 == null) {
            return expressionList != null ? new Colormap(f0.f1(expressionList.evaluate(expressionResolver)), null, 2, null) : Colormap.EMPTY;
        }
        int[] iArr = new int[listX0.size()];
        float[] fArr = new float[listX0.size()];
        int size = listX0.size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((DivLinearGradient.ColorPoint) listX0.get(i10)).f56189a.evaluate(expressionResolver).intValue();
            fArr[i10] = (float) ((DivLinearGradient.ColorPoint) listX0.get(i10)).f56190b.evaluate(expressionResolver).doubleValue();
        }
        return new Colormap(iArr, fArr);
    }
}
