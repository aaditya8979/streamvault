package com.yandex.div.svg;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: SvgDecoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder(boolean z10) {
        this.useViewBoundsAsIntrinsicSize = z10;
    }

    public /* synthetic */ SvgDecoder(boolean z10, int i10, i iVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @Nullable
    public final PictureDrawable decode(@NotNull InputStream inputStream) {
        float fH;
        float f10;
        try {
            SVG svgL = SVG.l(inputStream);
            RectF rectFG = svgL.g();
            if (!this.useViewBoundsAsIntrinsicSize || rectFG == null) {
                fH = svgL.h();
                f10 = svgL.f();
            } else {
                fH = rectFG.width();
                f10 = rectFG.height();
            }
            if (rectFG == null && fH > 0.0f && f10 > 0.0f) {
                svgL.w(0.0f, 0.0f, fH, f10);
            }
            return new PictureDrawable(svgL.r());
        } catch (SVGParseException unused) {
            return null;
        }
    }
}
