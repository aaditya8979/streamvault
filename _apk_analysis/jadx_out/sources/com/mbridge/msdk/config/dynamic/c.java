package com.mbridge.msdk.config.dynamic;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.Key;
import com.mbridge.msdk.dycreator.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import io.appmetrica.analytics.impl.A2;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: compiled from: ComponentResource.java */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f36671d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> f36672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f36673b = com.mbridge.msdk.foundation.controller.c.n().d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> f36674c;

    private c() {
        d();
    }

    public static c a() {
        if (f36671d == null) {
            synchronized (c.class) {
                if (f36671d == null) {
                    f36671d = new c();
                }
            }
        }
        return f36671d;
    }

    private void d() {
        HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> map = new HashMap<>();
        this.f36674c = map;
        map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
        this.f36674c.put(A2.f64965g, com.mbridge.msdk.config.dynamic.utils.c.background);
        this.f36674c.put("visibility", com.mbridge.msdk.config.dynamic.utils.c.visibility);
        this.f36674c.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
        this.f36674c.put(VastAttributes.PADDING, com.mbridge.msdk.config.dynamic.utils.c.padding);
        this.f36674c.put("paddingTop", com.mbridge.msdk.config.dynamic.utils.c.paddingTop);
        this.f36674c.put("paddingBottom", com.mbridge.msdk.config.dynamic.utils.c.paddingBottom);
        this.f36674c.put("paddingLeft", com.mbridge.msdk.config.dynamic.utils.c.paddingLeft);
        this.f36674c.put("paddingRight", com.mbridge.msdk.config.dynamic.utils.c.paddingRight);
        this.f36674c.put("paddingStart", com.mbridge.msdk.config.dynamic.utils.c.paddingStart);
        this.f36674c.put("paddingEnd", com.mbridge.msdk.config.dynamic.utils.c.paddingEnd);
        this.f36674c.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
        this.f36674c.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
        this.f36674c.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
        this.f36674c.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
        this.f36674c.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
        this.f36674c.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
        this.f36674c.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
        this.f36674c.put("alpha", com.mbridge.msdk.config.dynamic.utils.c.alpha);
        this.f36674c.put(Key.ROTATION, com.mbridge.msdk.config.dynamic.utils.c.rotation);
        this.f36674c.put("scaleX", com.mbridge.msdk.config.dynamic.utils.c.scaleX);
        this.f36674c.put("scaleY", com.mbridge.msdk.config.dynamic.utils.c.scaleY);
        this.f36674c.put("translationX", com.mbridge.msdk.config.dynamic.utils.c.translationX);
        this.f36674c.put("translationY", com.mbridge.msdk.config.dynamic.utils.c.translationY);
        this.f36674c.put("tag", com.mbridge.msdk.config.dynamic.utils.c.tag);
        this.f36674c.put("text", com.mbridge.msdk.config.dynamic.utils.c.text);
        this.f36674c.put("textColor", com.mbridge.msdk.config.dynamic.utils.c.textColor);
        this.f36674c.put("textSize", com.mbridge.msdk.config.dynamic.utils.c.textSize);
        this.f36674c.put("textStyle", com.mbridge.msdk.config.dynamic.utils.c.textStyle);
        this.f36674c.put("maxLines", com.mbridge.msdk.config.dynamic.utils.c.maxLines);
        this.f36674c.put("minLines", com.mbridge.msdk.config.dynamic.utils.c.minLines);
        this.f36674c.put(com.safedk.android.analytics.reporters.b.f52847d, com.mbridge.msdk.config.dynamic.utils.c.lines);
        this.f36674c.put("ellipsize", com.mbridge.msdk.config.dynamic.utils.c.ellipsize);
        this.f36674c.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
        this.f36674c.put("drawablePadding", com.mbridge.msdk.config.dynamic.utils.c.drawablePadding);
        this.f36674c.put("drawableStart", com.mbridge.msdk.config.dynamic.utils.c.drawableStart);
        this.f36674c.put("drawableEnd", com.mbridge.msdk.config.dynamic.utils.c.drawableEnd);
        this.f36674c.put("drawableTop", com.mbridge.msdk.config.dynamic.utils.c.drawableTop);
        this.f36674c.put("drawableBottom", com.mbridge.msdk.config.dynamic.utils.c.drawableBottom);
        this.f36674c.put("singleLine", com.mbridge.msdk.config.dynamic.utils.c.singleLine);
        this.f36674c.put("marqueeRepeatLimit", com.mbridge.msdk.config.dynamic.utils.c.marqueeRepeatLimit);
        this.f36674c.put("includeFontPadding", com.mbridge.msdk.config.dynamic.utils.c.includeFontPadding);
        this.f36674c.put("lineSpacingExtra", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingExtra);
        this.f36674c.put("lineSpacingMultiplier", com.mbridge.msdk.config.dynamic.utils.c.lineSpacingMultiplier);
        this.f36674c.put("hint", com.mbridge.msdk.config.dynamic.utils.c.hint);
        this.f36674c.put("inputType", com.mbridge.msdk.config.dynamic.utils.c.inputType);
        this.f36674c.put("maxLength", com.mbridge.msdk.config.dynamic.utils.c.maxLength);
        this.f36674c.put("textIsSelectable", com.mbridge.msdk.config.dynamic.utils.c.textIsSelectable);
        this.f36674c.put("cursorVisible", com.mbridge.msdk.config.dynamic.utils.c.cursorVisible);
        this.f36674c.put("backgroundTint", com.mbridge.msdk.config.dynamic.utils.c.backgroundTint);
        this.f36674c.put("allCaps", com.mbridge.msdk.config.dynamic.utils.c.allCaps);
        this.f36674c.put("src", com.mbridge.msdk.config.dynamic.utils.c.src);
        this.f36674c.put("scaleType", com.mbridge.msdk.config.dynamic.utils.c.scaleType);
        this.f36674c.put("adjustViewBounds", com.mbridge.msdk.config.dynamic.utils.c.adjustViewBounds);
        this.f36674c.put("maxWidth", com.mbridge.msdk.config.dynamic.utils.c.maxWidth);
        this.f36674c.put("maxHeight", com.mbridge.msdk.config.dynamic.utils.c.maxHeight);
        this.f36674c.put("tint", com.mbridge.msdk.config.dynamic.utils.c.tint);
        this.f36674c.put("divider", com.mbridge.msdk.config.dynamic.utils.c.divider);
        this.f36674c.put("dividerHeight", com.mbridge.msdk.config.dynamic.utils.c.dividerHeight);
        this.f36674c.put("scrollbars", com.mbridge.msdk.config.dynamic.utils.c.scrollbars);
        this.f36674c.put("listSelector", com.mbridge.msdk.config.dynamic.utils.c.listSelector);
        this.f36674c.put("stackFromBottom", com.mbridge.msdk.config.dynamic.utils.c.stackFromBottom);
        this.f36674c.put("transcriptMode", com.mbridge.msdk.config.dynamic.utils.c.transcriptMode);
        this.f36674c.put("numColumns", com.mbridge.msdk.config.dynamic.utils.c.numColumns);
        this.f36674c.put("verticalSpacing", com.mbridge.msdk.config.dynamic.utils.c.verticalSpacing);
        this.f36674c.put("horizontalSpacing", com.mbridge.msdk.config.dynamic.utils.c.horizontalSpacing);
        this.f36674c.put("stretchMode", com.mbridge.msdk.config.dynamic.utils.c.stretchMode);
        this.f36674c.put("columnWidth", com.mbridge.msdk.config.dynamic.utils.c.columnWidth);
        this.f36674c.put("fillViewport", com.mbridge.msdk.config.dynamic.utils.c.fillViewport);
        this.f36674c.put("scrollbarStyle", com.mbridge.msdk.config.dynamic.utils.c.scrollbarStyle);
        this.f36674c.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
        this.f36674c.put("weightSum", com.mbridge.msdk.config.dynamic.utils.c.weightSum);
        this.f36674c.put("baselineAligned", com.mbridge.msdk.config.dynamic.utils.c.baselineAligned);
        this.f36674c.put("measureWithLargestChild", com.mbridge.msdk.config.dynamic.utils.c.measureWithLargestChild);
        this.f36674c.put("ignoreGravity", com.mbridge.msdk.config.dynamic.utils.c.ignoreGravity);
        this.f36674c.put("foreground", com.mbridge.msdk.config.dynamic.utils.c.foreground);
        this.f36674c.put("foregroundGravity", com.mbridge.msdk.config.dynamic.utils.c.foregroundGravity);
        this.f36674c.put("measureAllChildren", com.mbridge.msdk.config.dynamic.utils.c.measureAllChildren);
        this.f36674c.put("style", com.mbridge.msdk.config.dynamic.utils.c.style);
        this.f36674c.put("progress", com.mbridge.msdk.config.dynamic.utils.c.progress);
        this.f36674c.put("max", com.mbridge.msdk.config.dynamic.utils.c.max);
        this.f36674c.put("progressDrawable", com.mbridge.msdk.config.dynamic.utils.c.progressDrawable);
    }

    public int a(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int iIndexOf = str.indexOf("d");
            int iIndexOf2 = str.indexOf("s");
            if (iIndexOf == -1) {
                iIndexOf = iIndexOf2;
            }
            int i10 = Integer.parseInt(str.substring(0, iIndexOf));
            if (str.contains("d")) {
                return e.a(this.f36673b, i10);
            }
            str.contains("s");
            return i10;
        }
    }

    public int a(String str, String str2) {
        if (this.f36673b != null) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                String strI = com.mbridge.msdk.foundation.controller.c.n().i();
                if (TextUtils.isEmpty(strI)) {
                    strI = this.f36673b.getPackageName();
                }
                return contextD.getResources().getIdentifier(str2, str, strI);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (this.f36673b != null) {
            try {
                return new b(this.f36673b, aVar).a(str, viewGroup);
            } catch (Exception e10) {
                q0.b("ComponentResource", e10.getMessage());
            }
        }
        return null;
    }

    public int b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("@color/")) {
            return 0;
        }
        return this.f36673b.getResources().getColor(a("color", str.substring(7)));
    }

    public HashMap b() {
        SoftReference<HashMap<String, com.mbridge.msdk.config.dynamic.utils.c>> softReference = this.f36672a;
        if (softReference == null || softReference.get() == null) {
            HashMap map = new HashMap(45);
            map.put("layout_width", com.mbridge.msdk.config.dynamic.utils.c.layout_width);
            map.put("layout_height", com.mbridge.msdk.config.dynamic.utils.c.layout_height);
            map.put("orientation", com.mbridge.msdk.config.dynamic.utils.c.orientation);
            map.put("layout_centerHorizontal", com.mbridge.msdk.config.dynamic.utils.c.layout_centerHorizontal);
            map.put("layout_centerVertical", com.mbridge.msdk.config.dynamic.utils.c.layout_centerVertical);
            map.put("layout_marginLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_marginLeft);
            map.put("layout_marginRight", com.mbridge.msdk.config.dynamic.utils.c.layout_marginRight);
            map.put("layout_margin", com.mbridge.msdk.config.dynamic.utils.c.layout_margin);
            map.put("layout_gravity", com.mbridge.msdk.config.dynamic.utils.c.layout_gravity);
            map.put("layout_alignParentRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentRight);
            map.put("layout_weight", com.mbridge.msdk.config.dynamic.utils.c.layout_weight);
            map.put("contentDescription", com.mbridge.msdk.config.dynamic.utils.c.contentDescription);
            map.put("gravity", com.mbridge.msdk.config.dynamic.utils.c.gravity);
            map.put("id", com.mbridge.msdk.config.dynamic.utils.c.id);
            map.put("layout_below", com.mbridge.msdk.config.dynamic.utils.c.layout_below);
            map.put("layout_above", com.mbridge.msdk.config.dynamic.utils.c.layout_above);
            map.put("layout_toLeftOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toLeftOf);
            map.put("layout_toRightOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toRightOf);
            map.put("layout_toEndOf", com.mbridge.msdk.config.dynamic.utils.c.layout_toEndOf);
            map.put(A2.f64965g, com.mbridge.msdk.config.dynamic.utils.c.background);
            map.put("layout_marginTop", com.mbridge.msdk.config.dynamic.utils.c.layout_marginTop);
            map.put("layout_marginBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_marginBottom);
            map.put("layout_marginStart", com.mbridge.msdk.config.dynamic.utils.c.layout_marginStart);
            map.put("layout_marginEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_marginEnd);
            map.put("layout_alignParentBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentBottom);
            map.put("layout_alignParentTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentTop);
            map.put("layout_alignParentLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentLeft);
            map.put("layout_alignWithParentIfMissing", com.mbridge.msdk.config.dynamic.utils.c.layout_alignWithParentIfMissing);
            map.put("layout_alignTop", com.mbridge.msdk.config.dynamic.utils.c.layout_alignTop);
            map.put("layout_alignBottom", com.mbridge.msdk.config.dynamic.utils.c.layout_alignBottom);
            map.put("layout_alignLeft", com.mbridge.msdk.config.dynamic.utils.c.layout_alignLeft);
            map.put("layout_alignRight", com.mbridge.msdk.config.dynamic.utils.c.layout_alignRight);
            map.put("layout_centerInParent", com.mbridge.msdk.config.dynamic.utils.c.layout_centerInParent);
            map.put("layout_alignParentEnd", com.mbridge.msdk.config.dynamic.utils.c.layout_alignParentEnd);
            this.f36672a = new SoftReference<>(map);
        }
        return this.f36672a.get();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7 A[PHI: r7
      0x00c7: PHI (r7v1 int) = 
      (r7v0 int)
      (r7v2 int)
      (r7v3 int)
      (r7v4 int)
      (r7v5 int)
      (r7v6 int)
      (r7v7 int)
      (r7v8 int)
      (r7v9 int)
      (r7v10 int)
      (r7v11 int)
      (r7v12 int)
     binds: [B:47:0x00a4, B:59:0x00c5, B:58:0x00c2, B:57:0x00c0, B:56:0x00be, B:55:0x00bb, B:54:0x00b9, B:53:0x00b6, B:52:0x00b2, B:51:0x00ae, B:50:0x00ab, B:49:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.dynamic.c.c(java.lang.String):int");
    }

    public HashMap<String, com.mbridge.msdk.config.dynamic.utils.c> c() {
        return this.f36674c;
    }

    public int d(String str) {
        if (this.f36673b != null) {
            String strI = com.mbridge.msdk.foundation.controller.c.n().i();
            if (TextUtils.isEmpty(strI)) {
                strI = this.f36673b.getPackageName();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strI);
            sb2.append(".R$");
            String[] strArrSplit = str.split("\\.");
            sb2.append(strArrSplit[1]);
            try {
                Class<?> cls = Class.forName(sb2.toString());
                Object objNewInstance = cls.newInstance();
                Field declaredField = cls.getDeclaredField(strArrSplit[2]);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(objNewInstance)).intValue();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return 0;
    }

    public int e(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.startsWith("#")) {
                return Color.parseColor(str);
            }
            return 0;
        } catch (Exception e10) {
            q0.b("ComponentResource", e10.getMessage());
            return 0;
        }
    }
}
